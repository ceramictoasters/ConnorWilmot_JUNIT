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
	@Test
	public void testGetStartTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStartTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDuration() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDuration() {
		fail("Not yet implemented");
	}

	@Test
	public void testComputeCharge() {
		fail("Not yet implemented");
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTime() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();	
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidDuration() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
		
		
	} 
	@Test
	public void testDiscounted_St_D() {
		ntc.setStartTime(500);
		ntc.setDuration(100);
		double result = ntc.computeCharge();
		double expResult = 1768.0;
		assertTrue("Charge should be " + expResult,expResult == result);
		
	}
	@Test
	public void testDiscounted_St() {
		ntc.setStartTime(0);
		ntc.setDuration(60);
		double result = ntc.computeCharge();
		double expResult = 1248;
		assertTrue("Charge should be " + expResult,expResult == result);
	}

	@Test
	public void testDiscounted_D() {
		ntc.setStartTime(800);
		ntc.setDuration(65);
		double result = ntc.computeCharge();
		double expResult = 2298.4;
		assertTrue("Charge should be " + expResult,expResult == result);
	} 
	@Test
	public void testNoDiscount() {
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		double result = ntc.computeCharge();
		double expResult = 1664.0;
		assertTrue("Charge should be " + expResult,expResult == result);
	}
}
