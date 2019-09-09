package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class POMUNF_043 {
	
private WebDriver driver; 
	
	public POMUNF_043(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//i[@class='fa fa-tags fa-fw']")
	private WebElement clickOnCategories;
	@FindBy(xpath="//li[@id='catalog']/ul/li[2]/a")
	private WebElement ClickOnProductLinks;
	
	@FindBy(xpath="//*[@class='fa fa-pencil']")
	private WebElement ClickOnEditIcon;
	
	@FindBy(xpath="//a[@href='#tab-data']")
	private WebElement selectDataTab;
	
	@FindBy(xpath="//input[@name='quantity']")
	private WebElement quantity;
	
	@FindBy(xpath="//input[@name='quantity']")
	private WebElement enterCredential;

	
	
	public void clickCategories()
	{
		clickOnCategories.click();
	}
	
	public void ProductLinks() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(ClickOnProductLinks).build().perform();
		ClickOnProductLinks.click();
		Thread.sleep(3000);
					
		}
	
    public void EditIcon() throws InterruptedException
    {
    	ClickOnEditIcon.click();
    	Thread.sleep(3000);
    }
    
    public void dataTab() throws InterruptedException
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(selectDataTab).click().perform();
    	Thread.sleep(3000);
    	System.out.println("data tab selected");
    }
    
    public void clearExistingText() throws InterruptedException {
        quantity.clear();
        Thread.sleep(3000);
        
      }
    
    public void enterValidCredentials() throws InterruptedException
    {
    	enterCredential.sendKeys(String.valueOf(100));
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    	//Thread.sleep(3000);
    	
    }
    
    public void displayDefaultValues() throws InterruptedException
    {
    	/*WebElement link = driver.findElement(By.xpath("//a[@href='#tab-links']"));
    	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    	Actions act = new Actions(driver);
		act.click(link).build().perform();*/
    	
	
		WebElement link = driver.findElement(By.xpath("//a[@href='#tab-links']"));
    	//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		Thread.sleep(3000);
    	Actions action = new Actions(driver);
		action.sendKeys(link,Keys.TAB).build().perform();
		
			}
    	
    	}



