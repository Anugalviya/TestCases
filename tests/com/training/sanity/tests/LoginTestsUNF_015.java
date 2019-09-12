package com.training.sanity.tests;

import java.text.ParseException;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOMUNF_015;

public class LoginTestsUNF_015 extends LoginTests {
	
	
	public LoginPOMUNF_015 POMUNF_015;
	private ScreenShot screenShot;
	
  @Test
  public void testMethod_UNF015() throws InterruptedException, ParseException
  {
	  System.out.println("I am in LoginTestsUNF_015 Class");
	  POMUNF_015 = new LoginPOMUNF_015(driver);
	  POMUNF_015.clickSalesReport();
	  POMUNF_015.clickSalesIcon();
	  System.out.println("clicked on Sales icon");
	  POMUNF_015.clickOrders();
	  POMUNF_015.startDateSelected();
	  POMUNF_015.clickDatePicker();
	  POMUNF_015.endDateSel();
	  POMUNF_015.clickOnEndDatePicker();
	  POMUNF_015.endDatePicked();
	  POMUNF_015.GroupBy();
	  POMUNF_015.orderStatus();
	  POMUNF_015.clickOnFilter();
	  screenShot = new ScreenShot(driver); 
	  screenShot.captureScreenShot();
  }
}
