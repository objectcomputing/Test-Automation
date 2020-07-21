/**
 * 
 */
package com.objectcomputing.assessment.reshma.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectcomputing.assessment.reshma.Pages.LoginPage;
import com.objectcomputing.assessment.reshma.utility.BrowserFactory;

/**
 * @author tajr
 *
 */
public class TC02_Verify_SurveyApp_Registration 
{
	WebDriver driver;
	LoginPage loginPage;
	
	
	@BeforeMethod
	public void beforeMethod()
	{
	
	//This will launch the browser and specify URL
	driver=BrowserFactory.startApplication(driver, "Chrome", "https://assessment.objectcomputing.com/");
	
	//Created Page Object using Page Factory
	loginPage = PageFactory.initElements(driver, LoginPage.class);
	
	}
	
	@Test
	public void verifyValidRegistration() throws InterruptedException
	{
	
	loginPage.registerInSurveyApp("tajr@objectcomputing.com", "Reshma Taj", "OCI");
	
	}
	
	@AfterMethod

	  public void afterMethod() {

		BrowserFactory.quitBrowser(driver);

	  }
}
