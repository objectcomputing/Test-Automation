package com.objectcomputing.assessment.prasad.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectcomputing.assessment.prasad.pages.HostingPage;
import com.objectcomputing.assessment.prasad.pages.SurveyLoginPage;
import com.objectcomputing.assessment.prasad.util.CallClick;
import com.objectcomputing.assessment.prasad.util.DropDownList;

public class TC07_PercentChecHost {

	@Test

	public static void totalValidationHost() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malamelp\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://assessment.objectcomputing.com/");

		SurveyLoginPage login = new SurveyLoginPage();
		login.surveyLogin(driver);

		CallClick click = new CallClick();
		DropDownList selections = new DropDownList(driver);
		HostingPage fromHostingPage = new HostingPage();
		
		System.out.println();
		System.out.println("   *******    TESTCASE NAME : TC07_PercentChecHost  ******* ");
		System.out.println();

		System.out.println("   *****  Value/Values selected on the HOSTING page are  *** ");
		selections.selectDropDown("50%");
		click.clickToNext(driver);
		fromHostingPage.verifyDialougeHost(driver);
		driver.quit();

	}
}
