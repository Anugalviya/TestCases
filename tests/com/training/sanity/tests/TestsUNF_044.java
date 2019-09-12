package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.POMUNF_044;

public class TestsUNF_044 extends LoginTests
{
	private POMUNF_044 POMUNF_044;
	private ScreenShot screenShot;	
	
  @Test
  public void testMethod() throws InterruptedException 
  {
	  POMUNF_044 = new POMUNF_044(driver);
	  System.out.println("This is TestsUNF_044 class");
	  POMUNF_044.clickCategories();
	  POMUNF_044.ProductLinks();
	  POMUNF_044.selectMultipleChkbox();
	  POMUNF_044.ClickDelete();
	  POMUNF_044.alert();
	  screenShot = new ScreenShot(driver); 
	  screenShot.captureScreenShot();
	  
  }
}
