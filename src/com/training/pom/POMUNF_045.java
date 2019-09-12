package com.training.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMUNF_045 
{
     private WebDriver driver; 
	
	public POMUNF_045(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//*[contains(@class, 'fa fa-shopping-cart fa-fw')]")
	private WebElement clickOnCart;
	
	@FindBy(xpath="//*[@id=\"sale\"]/ul/li[1]/a")
	private WebElement Orders;
	
	@FindBy(xpath="//*[@class='fa fa-eye']")
	private WebElement viewIcon;
	
	@FindBy(xpath="//*[@class='fa fa-cog']")
	private WebElement generateIcon;
	
	public void Catelog()
	{
		clickOnCart.click();
	}
	
	public void clickOnOrders()
	{
		Orders.click();
	}
	
	public void view()
	{
		viewIcon.click();
	}
	
	//To verify if view icon is enabled or not
	
	
	public void invoice()
	{
		generateIcon.click();
	}
}
