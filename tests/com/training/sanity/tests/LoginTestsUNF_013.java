package com.training.sanity.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMUNF_013;


public class LoginTestsUNF_013 extends LoginTests {
	
	
	public LoginPOMUNF_013 POMUNF_013;
	private ScreenShot screenShot;
	//Logger to display the information
	Logger log = Logger.getLogger("TestLogger");
	
	
	@Test
	public void testMethod_UNF013()
	{
		System.out.println("I am in Login Test Class");
		POMUNF_013 = new LoginPOMUNF_013(driver);
		POMUNF_013.clickCategories();
		POMUNF_013.ProductLinks();
		POMUNF_013.EnterValueProductToTextBox();
		POMUNF_013.clickOnFilter();
		POMUNF_013.verifyFilterByProductName();
		screenShot = new ScreenShot(driver); 
	    screenShot.captureScreenShot("Product is entered successfully");
	    log.info("ProductName displayed successfully");
		
	}

}
