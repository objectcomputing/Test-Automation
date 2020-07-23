package com.objectcomputing.assessment.prasad.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectcomputing.assessment.prasad.pages.EngineeringPage;
import com.objectcomputing.assessment.prasad.pages.SurveyLoginPage;
import com.objectcomputing.assessment.prasad.util.CallClick;
import com.objectcomputing.assessment.prasad.util.DropDownList;

public class TC08_PercentChecEng {

	@Test

	public void totalValidationEng() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malamelp\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://assessment.objectcomputing.com/");

		SurveyLoginPage login = new SurveyLoginPage();
		login.surveyLogin(driver);

		CallClick click = new CallClick();
		EngineeringPage fromEngPage = new EngineeringPage();
		
		DropDownList selections = new DropDownList(driver);

		System.out.println();
		System.out.println("   *******    TESTCASE NAME : TC08_PercentChecEng  ******* ");
		System.out.println();

		System.out.println("   *****  Value/Values selected on the HOSTING page are  *** ");
		selections.selectDropDown("50%", "50%");
		click.clickToNext(driver);

		System.out.println("   *****  Value/Values selected on the ENGINEERING page are  *** ");
		selections.selectDropDown("20%");
		click.clickToNext(driver);
		
		fromEngPage.verifyDialougeEng(driver);
		driver.quit();

	}

}
