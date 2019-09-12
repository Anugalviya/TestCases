package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;

import com.training.pom.POMUNF_045;

public class TestsUNF_045 extends LoginTests 
{
	private POMUNF_045 POMUNF_045;
	private ScreenShot screenShot;	
	
  @Test
  public void testMethod ()
  {
	  POMUNF_045 = new POMUNF_045(driver);
	  System.out.println("This is TestsUNF_045 class");
	  POMUNF_045.Catelog();
	  POMUNF_045.clickOnOrders();
	  POMUNF_045.view();
	  POMUNF_045.invoice();
	  screenShot = new ScreenShot(driver); 
	  screenShot.captureScreenShot();
	  
  }
}
