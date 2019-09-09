package com.training.pom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOMUNF_015 {
	
	private WebDriver driver; 

	
	public LoginPOMUNF_015(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"reports\"]/a/i")
	private WebElement clickOnSalesReport;
	
	@FindBy(xpath="//*[@id=\"reports\"]/ul/li[1]/a")
	private WebElement clickOnSalesIcon;
	
	@FindBy(xpath="//*[@id=\"reports\"]/ul/li[1]/ul/li[1]/a")
	private WebElement clickOnOrders;
	
	@FindBy(xpath="//*[@id='input-date-start']")
	private WebElement StartDate;
	
	@FindBy(xpath="//*[@class='fa fa-calendar']")
	private WebElement clickOnDatePicker;
	
	@FindBy(xpath="//input[@name='filter_date_end']")
	private WebElement EndDate;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div/span/button/i")
	private WebElement clickOnDatePicker1;
	
	@FindBy(xpath="//*[@id=\"input-group\"]")
	private WebElement SelectGroupBy;
	
	@FindBy(xpath="//*[@id=\"input-status\"]")
	private WebElement OrderStat;
	
	
	@FindBy(id="button-filter")
	private WebElement clickOnFilterbutton;
	
	public void clickSalesReport()
	{
		clickOnSalesReport.click();
				
	}
	
	public void clickSalesIcon()
	{
		clickOnSalesIcon.click();
	}
	
	public void clickOrders()
	{
		clickOnOrders.click();
	}
	
	
	public void startDateSelected()
	{
		StartDate.click();
	}
	
	
	public void clickDatePicker() throws ParseException, InterruptedException
	{
		clickOnDatePicker.click();
		
		// tried using specific date using datepicker, a simple entry of date is working need to enhance it more.
		String setDateStr = "2019-06-30";
		String currDateStr = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/table/thead/tr[1]/th[2]")).getText();
		
		System.out.println(currDateStr);
		
		Date setDate = new SimpleDateFormat("yyyy-mm-dd").parse(setDateStr);
		Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currDateStr);
		
		System.out.println("setDate : " + setDate);
		
		System.out.println("currDate : " + currDate);
		
		int monthDiff = Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1), new DateTime(setDate).withDayOfMonth(1)).getMonths();
		
		System.out.println("first date : " + new DateTime(currDate).withDayOfMonth(1));
		
		System.out.println("second date : " + new DateTime(setDate).withDayOfMonth(1));
		
		
		System.out.println("Calculated month difference --- > " + monthDiff);
		boolean isFuture = true;
		
		if(monthDiff<0)
		{
			isFuture = false;
			monthDiff = -1 * monthDiff;
		}
		
		Thread.sleep(3000);
		for (int i=0;i<2;i++)
		{
			if(isFuture)
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/table/thead/tr[1]/th[3]")).click();
				
		
		else
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/table/thead/tr[1]/th[1]")).click();
			System.out.println("selecting future month");
		}
		
		driver.findElement(By.xpath("//div/div/table/tbody/tr/td[@class='day old']")).click();
}
	
	public void endDateSelected()
	{
		EndDate.click();
		System.out.println("Date End selected");
	}
	
	public void clickDatePicker1() throws ParseException, InterruptedException
	{
		clickOnDatePicker1.click();
		System.out.println("date picker selected for Date End");
	}
	

	public void GroupBy() throws InterruptedException
	{
		SelectGroupBy.click();
		WebElement groupBy = driver.findElement(By.name("filter_group"));
		Select sel = new Select(groupBy);
		Thread.sleep(2000);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		sel.selectByIndex(1);
		
	}
	
	
	public void orderStatus() throws InterruptedException
	{
		OrderStat.click();
		System.out.println("Order status selected");
		WebElement orderStat = driver.findElement(By.name("filter_order_status_id"));
		Select sel = new Select(orderStat);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		/*for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}*/
		sel.selectByIndex(8);
		Thread.sleep(2000);
	}
		
	public void clickOnFilter() throws InterruptedException
	{
		clickOnFilterbutton.click();
	    System.out.println("fliter button clicked");
	    Thread.sleep(3000);
}
	
}