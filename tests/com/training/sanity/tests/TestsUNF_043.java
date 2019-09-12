package com.training.sanity.tests;

import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.POMUNF_043;


public class TestsUNF_043 extends LoginTests
{
	private POMUNF_043 POMUNF_043;
	private ScreenShot screenShot;
	
  @Test
  public void testMethod() throws InterruptedException 
  {
	  System.out.println("TestUNF_043 called");
	  POMUNF_043 = new POMUNF_043(driver);
	  POMUNF_043.clickCategories();
	  POMUNF_043.ProductLinks();
	  POMUNF_043.EditIcon();
	  POMUNF_043.dataTab();
	  POMUNF_043.clearExistingText();
	  POMUNF_043.enterValidCredentials();
	  POMUNF_043.displayDefaultValues();
	  POMUNF_043.save();
	  screenShot = new ScreenShot(driver); 
	  screenShot.captureScreenShot();

  }
}
