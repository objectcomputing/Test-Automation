package com.objectcomputing.assessment.prasad.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectcomputing.assessment.prasad.pages.EngineeringPage;
import com.objectcomputing.assessment.prasad.pages.SurveyLoginPage;
import com.objectcomputing.assessment.prasad.util.CallClick;
import com.objectcomputing.assessment.prasad.util.DropDownList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04_EngineeringLabelAndDescription {

	@Test
	public void verifyLabelDesEngPage() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://assessment.objectcomputing.com/");
		driver.manage().window().maximize();

		SurveyLoginPage login = new SurveyLoginPage();
		login.surveyLogin(driver);

		CallClick click = new CallClick();
		DropDownList selections = new DropDownList(driver);
		EngineeringPage fromEngPage = new EngineeringPage();

		System.out.println("   *****  Value/Values selected on the HOSTING page are  *** ");
		selections.selectDropDown("100%");
		click.clickToNext(driver);
		
		System.out.println();
		System.out.println("*******    TESTCASE NAME : TC04_EngineeringLabelAndDescription  ******* ");
		
		fromEngPage.valEngHeader(driver);
		fromEngPage.valEngLabel(driver);
		fromEngPage.valEngLabDes(driver);
		driver.quit();

	}
}
