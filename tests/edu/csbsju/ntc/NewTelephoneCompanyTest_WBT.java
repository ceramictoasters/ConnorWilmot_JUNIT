package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	  private NewTelephoneCompany ntc;

	  @Before
	  public void setUp() throws Exception {
	    ntc = new NewTelephoneCompany();
	  }
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeNegOne() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();	
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeNegTwo() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();	
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOverOne() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();	
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOverTwo() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();	
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOverThree() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();	
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimePastSixtyOne() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();	
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeAtSixty() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();	
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimePastSixtyTwo() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();	
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimePastSixtyThree() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();	
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidDurationZero() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	} 
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidDurationNegOne() {
		ntc.setStartTime(1800);
		ntc.setDuration(-1);
		ntc.computeCharge();
	} 
	
	@Test
	public void testDiscountedST_D_FiveAMOneH() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double result = ntc.computeCharge();
		double expResult = 1768.0;
		assertTrue("Charge should be " + expResult,expResult == result);	
	}
	
	@Test
	public void testDiscountedST_D_EightAMSix() {
		ntc.setStartTime(759);
		ntc.setDuration(61);
		double result = ntc.computeCharge();
		double expResult = 1078.48;
		assertTrue("Charge should be " + expResult,expResult == result);	
	}
	
	@Test
	public void testDiscountedST_D_EightPMSix() {
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		double result = ntc.computeCharge();
		double expResult = 1078.48;
		assertTrue("Charge should be " + expResult,expResult == result);	
	}
	
	@Test
	public void testDiscountedST_D_ElevenPMSix() {
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		double result = ntc.computeCharge();
		double expResult = 1149.2;
		assertTrue("Charge should be " + expResult,expResult == result);	
	}
	
	@Test
	public void testDiscountedST_MidnightSix() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double result = ntc.computeCharge();
		double expResult = 1248;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
	
	@Test
	public void testDiscountedST_FourAMFive() {
		ntc.setStartTime(400);
		ntc.setDuration(59);
		double result = ntc.computeCharge();
		double expResult = 1227.2;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
	
	@Test
	public void testDiscountedST_SevenAMOne() {
		ntc.setStartTime(759);
		ntc.setDuration(1);
		double result = ntc.computeCharge();
		double expResult = 20.8;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
	
	@Test
	public void testDiscountedST_SixPMTen() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		double result = ntc.computeCharge();
		double expResult = 208;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
	
	@Test
	public void testDiscountedST_SixPMTenTwo() {
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		double result = ntc.computeCharge();
		double expResult = 208;
		assertTrue("Charge should be " + expResult,expResult == result);
	}

	
	@Test
	public void testDiscountedST_ElevenPMTen() {
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		double result = ntc.computeCharge();
		double expResult = 208;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
	
	@Test
	public void testDiscountedD_EightAMSixty() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double result = ntc.computeCharge();
		double expResult = 2298.4;
		assertTrue("Charge should be " + expResult,expResult == result);
	} 
	
	@Test
	public void testDiscountedD_NineAMSixty() {
		ntc.setStartTime(900);
		ntc.setDuration(61);
		double result = ntc.computeCharge();
		double expResult = 2156.96;
		assertTrue("Charge should be " + expResult,expResult == result);
	} 
	
	@Test
	public void testNoDiscount_TenAMForty() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double result = ntc.computeCharge();
		double expResult = 1664.0;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
	
	@Test
	public void testNoDiscount_EightAMOne() {
		ntc.setStartTime(800);
		ntc.setDuration(1);
		double result = ntc.computeCharge();
		double expResult = 41.6;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
	
	@Test
	public void testNoDiscount_EightAMFifty() {
		ntc.setStartTime(800);
		ntc.setDuration(59);
		double result = ntc.computeCharge();
		double expResult = 2454.4;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
	
	@Test
	public void testNoDiscount_SixPMSixty() {
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		double result = ntc.computeCharge();
		double expResult = 2496.0;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
}
