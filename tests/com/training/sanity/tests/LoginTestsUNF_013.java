package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMUNF_013;

public class LoginTestsUNF_013 extends LoginTests {
	
	
	public LoginPOMUNF_013 POMUNF_013;
	private ScreenShot screenShot;
	
	@Test
	public void testMethod() {
		System.out.println("I am in Login Test Class");
		POMUNF_013 = new LoginPOMUNF_013(driver);
		POMUNF_013.clickCategories();
		POMUNF_013.ProductLinks();
		POMUNF_013.EnterValueProductToTextBox();
		POMUNF_013.clickOnFilter();
	}

}
