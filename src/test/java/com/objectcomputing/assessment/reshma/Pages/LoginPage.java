package com.objectcomputing.assessment.reshma.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author tajr
 * 
 * This class will store all the locators and methods of login page.
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath="//div[@id='app']//div[1]//input[1]") 
	WebElement emailaddress;
	
	@FindBy(xpath="//div[2]//input[1]") 
	WebElement name;
	
	@FindBy(xpath="//div[3]//input[1]") 
	WebElement companyname;
	
	@FindBy(xpath="//button[@class='submit']") 
	WebElement getstartedButton;
	
	public void registerInSurveyApp(String emailid, String username, String usercompanyname) throws InterruptedException
	{
		emailaddress.sendKeys(emailid);
		name.sendKeys(username); 
		companyname.sendKeys(usercompanyname); 
		Thread.sleep(3000);
		getstartedButton.click();
		Thread.sleep(3000);
	}
	
	public void typeEmailAddress(String emailid)
	{
		emailaddress.sendKeys(emailid); 
	}
	
	public void typeName(String username)
	{
		name.sendKeys(username); 
	}
	
	public void typeCompanyName(String usercompanyname)
	{
		companyname.sendKeys(usercompanyname); 
	}

}
