package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMUNF_014;

public class LoginTestsUNF_014 extends LoginTests {
	
	
	private LoginPOMUNF_014 POMUNF_014;
	private ScreenShot screenShot;
	
	
	@Test
	public void testMethod() throws InterruptedException {
		System.out.println("I am in LoginTestsUNF_014 Test Class");
		POMUNF_014 = new LoginPOMUNF_014(driver);
		POMUNF_014.clickCategories();
		POMUNF_014.ProductLinks();
		POMUNF_014.ClickCheckbox();
		POMUNF_014.ClickDelete();
		try {
			POMUNF_014.alert();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
