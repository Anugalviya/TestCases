package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMUNF_013
{
	
		private WebDriver driver; 
		
		public LoginPOMUNF_013(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//i[@class='fa fa-tags fa-fw']")
		private WebElement clickOnCategories;
		@FindBy(xpath="//li[@id='catalog']/ul/li[2]/a")
		private WebElement ClickOnProductLinks;
		@FindBy(id="input-name")
		private WebElement EnterValueProductTextBox;
		@FindBy(id="button-filter")
		private WebElement clickOnFilterbutton;
		
		public void clickCategories()
		{
			clickOnCategories.click();
		}
		
		public void ProductLinks()
		{
			Actions action = new Actions(driver);
			action.moveToElement(ClickOnProductLinks).build().perform();
			ClickOnProductLinks.click();
						
			}
						
		public void EnterValueProductToTextBox()
		{
			EnterValueProductTextBox.sendKeys("Blazer");
			System.out.println("Value entered");
			
		}
		
		public void clickOnFilter()
		{
		
			clickOnFilterbutton.click();
		    System.out.println("fliter button clicked");
	}

}


