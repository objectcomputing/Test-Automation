package com.objectcomputing.assessment.prasad.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectcomputing.assessment.prasad.pages.HostingPage;
import com.objectcomputing.assessment.prasad.pages.SurveyLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03_HostingLabelAndDescription {

	@Test
	public void verifyLabelDesEngPage() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://assessment.objectcomputing.com/");
		driver.manage().window().maximize();

		SurveyLoginPage login = new SurveyLoginPage();
		login.surveyLogin(driver);

		HostingPage fromhostPage = new HostingPage();
		System.out.println();
		System.out.println("*******    TESTCASE NAME : TC03_HostingLabelAndDescription  ******* ");
		
		fromhostPage.valHostHeader(driver);
		fromhostPage.valHostLabel(driver);
		fromhostPage.valHostLabDes(driver);
		driver.quit();

	}
}
