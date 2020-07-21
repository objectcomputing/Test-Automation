/**
 * 
 */
package com.objectcomputing.assessment.reshma.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * @author tajr
 * 
 * This class will store all the locators and methods of login page.
 *
 */
public class SummaryPage {
	
	WebDriver driver;
	
	public SummaryPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//body/div[@id='app']/div/div/div[1]/div[4]") 
	WebElement costMaintainability;
	
	
	@FindBy(xpath="//body/div[@id='app']/div/div/div[2]/div[4]") 
	WebElement functionalRangeFutureProof;
	
	@FindBy(xpath="//body/div[@id='app']/div/div/div[3]/div[4]") 
	WebElement availability;
	
	@FindBy(xpath="//body/div[@id='app']/div/div/div[4]/div[4]") 
	WebElement security;
	
	@FindBy(xpath="//body//div[@id='app']//div//div//div[5]//div[4]") 
	WebElement innovationTimeToMarket;
	
	@FindBy(xpath="//div[@class='getting-there']") 
	WebElement summaryReport;
	
	@FindBy(xpath="//button[contains(text(),'Done')]")
	WebElement SummaryPageDoneButton;
	
	
	public void selectOptionsInSummaryPage() throws InterruptedException 
	{
		String Before_Result = summaryReport.getText();
		System.out.println(Before_Result);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions dragger = new Actions(driver);
		
		dragger.dragAndDropBy(costMaintainability, 81, 0).build().perform();
		dragger.dragAndDropBy(functionalRangeFutureProof, 81, 0).build().perform();
		dragger.dragAndDropBy(availability, 81, 0).build().perform();
		dragger.dragAndDropBy(security, 81, 0).build().perform();
		dragger.dragAndDropBy(innovationTimeToMarket, 81, 0).build().perform();
		Thread.sleep(5000);
		String After_Result = summaryReport.getText();
		System.out.println(After_Result);
		Thread.sleep(5000);
		
	}
	
	public void scrollUpPage() throws InterruptedException 
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, 500)");
		Thread.sleep(5000);
		SummaryPageDoneButton.click();
		Thread.sleep(5000);
	}
	
	}



