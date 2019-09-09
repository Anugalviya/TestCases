package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPOMUNF_014 {
	
	private WebDriver driver; 
	
	public LoginPOMUNF_014(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//i[@class='fa fa-tags fa-fw']")
	private WebElement clickOnCategories;
	@FindBy(xpath="//li[@id='catalog']/ul/li[2]/a")
	private WebElement ClickOnProductLinks;
	
	@FindBy(xpath="//input[@type='checkbox' and@name=\"selected[]\"]")
	private WebElement clickOnCheckbox;
	
	@FindBy(xpath="//*[@class='btn btn-danger']")
	private WebElement clickOnDelete;
	
	
	public void clickCategories()
	{
		clickOnCategories.click();
	}
	
	public void ProductLinks()
	{
		// enter the product name as 'Blazers'
		Actions action = new Actions(driver);
		action.moveToElement(ClickOnProductLinks).build().perform();
		ClickOnProductLinks.click();
					
		}
	
	public void ClickCheckbox() throws InterruptedException
	{
		clickOnCheckbox.click();
		System.out.println("product selected");
		Thread.sleep(3000);
	}

	public void ClickDelete()
	{
		clickOnDelete.click();
	}
	
	public void alert() throws InterruptedException
	{
		  try {
		        Alert alert = driver.switchTo().alert();
		        String alertText = alert.getText();
		        Thread.sleep(3000);
		        System.out.println("Alert data: " + alertText);
		        alert.accept();
		    } catch (NoAlertPresentException e)
		       {
		        e.printStackTrace();
		       }
		}
	}
	

