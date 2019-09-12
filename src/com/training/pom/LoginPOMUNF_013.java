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
		
		//This function clicks on Categories icon
		public void clickCategories()
		{
			clickOnCategories.click();
		}
		
		//This function clicks on Products icon
		public void ProductLinks()
		{
			// Used actions and used moveToElement to mouse over on the link 
			Actions action = new Actions(driver);
			action.moveToElement(ClickOnProductLinks).build().perform();
			ClickOnProductLinks.click();
						
			}
				
		// This function enters the value onto Product textbox
		public void EnterValueProductToTextBox()
		{
			EnterValueProductTextBox.sendKeys("Blazer");
			// Compared expected with actual to see if the value entered in correct value or not.
			String expected = "Blazer";
	        String actual = driver.findElement(By.xpath("//input[@id='input-name']")).getAttribute("value");
	        System.out.println(actual);
	        if(expected.equals(actual))
	        {
	        System.out.println("Correct Value");
	        }
	        else 
	        {
	            System.out.println("Wrong Value");
	        }
			
		}
		
		public void clickOnFilter()
		{
			clickOnFilterbutton.click();
		    System.out.println("filter button clicked");
	    }
		
		
       // This function verifies that filter button displays only the products related to ProductName with Blazer
		 public void verifyFilterByProductName()
		 {
		  boolean prodOtherThenBlazer = driver.findElements(By.xpath("//a[@href='http://uniform.upskills.in/admin/index.php?route=catalog/product&token=ThF9QtllFMFQtfevg2I1UjTD8ASnu0FS&sort=pd.name&order=DESC']")).stream().filter(element -> !element.getAttribute("value").trim().equals("Blazer")).findFirst().isPresent();
			 if (prodOtherThenBlazer) 
			 {
			   System.out.println("Products displayed are other then blazer");
			 }
			 else 
			 {
			   System.out.println("All products related to correct productname are displayed");
			 }
		 }
}


