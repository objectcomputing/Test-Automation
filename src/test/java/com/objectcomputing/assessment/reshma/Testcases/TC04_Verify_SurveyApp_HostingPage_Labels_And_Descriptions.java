/**
 * 
 */
package com.objectcomputing.assessment.reshma.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectcomputing.assessment.reshma.Pages.HostingPage;
import com.objectcomputing.assessment.reshma.Pages.LoginPage;
import com.objectcomputing.assessment.reshma.utility.BrowserFactory;

/**
 * @author tajr
 *
 */
public class TC04_Verify_SurveyApp_HostingPage_Labels_And_Descriptions 
{
	WebDriver driver;
	LoginPage loginPage;
	HostingPage hostingPage;
	
	@BeforeMethod
	public void beforeMethod()
	{
	
	//This will launch the browser and specify URL
	driver=BrowserFactory.startApplication(driver, "Chrome", "https://assessment.objectcomputing.com/");
	
	//Created Page Object using Page Factory
	loginPage = PageFactory.initElements(driver, LoginPage.class);
	hostingPage = PageFactory.initElements(driver, HostingPage.class);
	}
	
	@Test
	public void test() throws InterruptedException
	{
	//Call the method
	loginPage.registerInSurveyApp("tajr123@objectcomputing.com", "Reshma Taj", "OCI");
	hostingPage.verifyHostingPageLabelsAndDescriptions();
	}
	
	@AfterMethod

	  public void afterMethod() {

		  driver.quit();

	  }
}
