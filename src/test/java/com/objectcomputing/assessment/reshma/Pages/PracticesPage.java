/**
 * 
 */
package com.objectcomputing.assessment.reshma.Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author tajr
 * 
 * This class will store all the locators and methods of login page.
 *
 */
public class PracticesPage {
	
	WebDriver driver;
	
	public PracticesPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//body//div[@id='app']//div//div//div//div//div//div[2]") 
	WebElement range;
	
	
	@FindBy(xpath="//body//div[@id='app']//div//div//div//div//div[2]//input[1]") 
	WebElement apiServices;
	
	@FindBy(xpath="//div[3]//input[1]") 
	WebElement RESTApi;
	
	@FindBy(xpath="//div[4]//input[1]") 
	WebElement SOAPApi;
	
	@FindBy(xpath="//div[5]//input[1]") 
	WebElement otherField;
	
	@FindBy(xpath="//div[6]//input[1]") 
	WebElement apiCatalog;
	
	@FindBy(xpath="//div[7]//input[1]") 
	WebElement noOfReleasesPerYear;
	
	@FindBy(xpath="//div[8]//input[1]") 
	WebElement alternateApproaches;
	
	@FindBy(xpath="//ul[@class='vs__dropdown-menu']//li")
	List<WebElement> selectValue;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement PracticesPageNextButton;
	
	
	public void selectOptionsInPracticePage(String selectRange) 
	{
		range.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> dd_menu = selectValue;
		
		for(WebElement element:dd_menu)
		{
			String innerhtml= element.getAttribute("innerHTML");
			if(innerhtml.contains(selectRange))
			{
				element.click();
				break;
			}
			
			System.out.println("Values from dropdown is: ======= "+innerhtml);
		}
		
	}
	
	public void apiSelection()
	{
		apiServices.click(); 
		RESTApi.click();
		SOAPApi.click();
		RESTApi.click();
		apiCatalog.click();
		alternateApproaches.click();
	}
		
		public void enterTextAndValue(String otherFieldtext, String noOfReleasesPerYearValueß) throws InterruptedException
		{
			otherField.sendKeys(otherFieldtext); 
			noOfReleasesPerYear.sendKeys(noOfReleasesPerYearValueß);
			Thread.sleep(5000);
			PracticesPageNextButton.click();
			Thread.sleep(5000);
		}
		
	}



