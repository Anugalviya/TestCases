package com.training.pom;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	
	
	@FindBy(xpath="//*[@class='fa fa-save']")
	private WebElement saveChanges;
	
	
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
    
    public void dataTab() 
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(selectDataTab).click().perform();
    	//Thread.sleep(3000);
    	System.out.println("data tab selected");
    }
    
    public void clearExistingText() throws InterruptedException 
    {
    	
    	//To verify if textbox is enabled
    	WebElement ele =  driver.findElement(By.xpath("//input[@name='quantity']"));
    	if( ele.isEnabled())
    	{
    		System.out.println("Textbox is Enabled");
    		ele.clear();
    		}
    	else
    		{
    		System.out.println("Textbox is Disabled");
    		Thread.sleep(3000);	
           
    	}  
        
    	
      }
    
    
    public void enterValidCredentials() throws InterruptedException
    {   
    	enterCredential.sendKeys(String.valueOf(134));
       	Thread.sleep(1000);
    	/*enterCredential.sendKeys(String.valueOf(100));
    	Assert.assertEquals(driver.findElement(By.xpath("//input[@name='quantity']")).getText(),"1");*/
    }
    
    
    public void displayDefaultValues() throws InterruptedException
    {
    	WebElement link = driver.findElement(By.xpath("//a[@href='#tab-links']"));
    	Thread.sleep(3000);
    	//Used Actions to pass through multiple tabs
    	Actions action = new Actions(driver);
		action.sendKeys(link,Keys.TAB).build().perform();
		action.sendKeys(driver.findElement(By.xpath("//a[@href='#tab-option']")), Keys.TAB).build().perform();
		Thread.sleep(3000);
		action.sendKeys(driver.findElement(By.xpath("//a[@href='#tab-discount']")), Keys.TAB).build().perform();
		Thread.sleep(3000);
		action.sendKeys(driver.findElement(By.xpath("//a[@href='#tab-image']")), Keys.TAB).build().perform();
		Thread.sleep(3000);
		action.sendKeys(driver.findElement(By.xpath("//a[@href='#tab-design']")), Keys.TAB).build().perform();
		}
    	
    	

     public void save()
     {
    	 saveChanges.click();
    	 //Applied asserts to verify if success message is correct or not
    	 
    	 String expectedMessage = "Success: You have modified products!";
    	 String message = driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText();
    	 String [] arr = message.split("\n");
    	 String ActualValue = arr[0];
    	 System.out.println(ActualValue);
         Assert.assertEquals(ActualValue, expectedMessage);
     	
     }

}