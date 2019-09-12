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

public class POMUNF_044 {
	
private WebDriver driver; 
	
	public POMUNF_044(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//i[@class='fa fa-tags fa-fw']")
	private WebElement clickOnCategories;
	@FindBy(xpath="//li[@id='catalog']/ul/li[2]/a")
	private WebElement ClickOnProductLinks;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement selProducts;
	
	@FindBy(xpath="//*[@class='btn btn-danger']")
	private WebElement clickOnDelete;
	
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
	
	public void selectMultipleChkbox() throws InterruptedException
	{
		
		List<WebElement> selProducts = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(int i=0; i<selProducts.size(); i=i+2)
        {
        	selProducts.get(i).click();
        }
        Thread.sleep(3000);
        int checkedCount=0, uncheckedCount=0;
        
        for(int i=0; i<selProducts.size(); i++)
        {
            System.out.println(i+" checkbox is selected "+selProducts.get(i).isSelected());
            Thread.sleep(3000);
            if(selProducts.get(i).isSelected())
            {
                checkedCount++;
            }
            else
            {
                uncheckedCount++;
            }
        }
        
        System.out.println("number of selected checkbox: "+checkedCount);
        System.out.println("number of unselected checkbox: "+uncheckedCount);
    }
	
	public void ClickDelete() throws InterruptedException
	{
		clickOnDelete.click();
		Thread.sleep(3000);
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
	
