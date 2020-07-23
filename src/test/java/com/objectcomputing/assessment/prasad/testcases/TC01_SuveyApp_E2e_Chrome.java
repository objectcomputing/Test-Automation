package com.objectcomputing.assessment.prasad.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectcomputing.assessment.prasad.pages.EngineeringPage;
import com.objectcomputing.assessment.prasad.pages.HostingPage;
import com.objectcomputing.assessment.prasad.pages.PracticesPage;
import com.objectcomputing.assessment.prasad.pages.SourcingPage;
import com.objectcomputing.assessment.prasad.pages.SummaryPage;
import com.objectcomputing.assessment.prasad.pages.SurveyLoginPage;
import com.objectcomputing.assessment.prasad.util.CallClick;
import com.objectcomputing.assessment.prasad.util.DropDownList;

import java.util.concurrent.TimeUnit;

public class TC01_SuveyApp_E2e_Chrome {

	@Test
	public void verifyHappyPathChrome() throws InterruptedException {
		
		// TODO Auto-generated method stub

		// Create drive object for the Chrome Browser
		// class name = ChromeDriver

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://assessment.objectcomputing.com/");
		driver.manage().window().maximize();

		CallClick click = new CallClick();
		DropDownList selections = new DropDownList(driver);


		/// *************************************************************************************************///
		/// *** Enter All the valid values on the Log in Page and successfully completes
		/// the login ***///
		/// *************************************************************************************************///

		SurveyLoginPage login = new SurveyLoginPage();

		login.surveyLogin(driver);

		HostingPage fromHostPage = new HostingPage();
		EngineeringPage fromEngPage = new EngineeringPage();
		SourcingPage fromSourcingPage = new SourcingPage();
		PracticesPage fromPracticesPage = new PracticesPage();
		SummaryPage fromSummaryPage = new SummaryPage();
		
		System.out.println();
		System.out.println("*******    TESTCASE NAME : TC01_SuveyApp_E2e_Chrome  ******* ");
		System.out.println();

		fromHostPage.valHostHeader(driver);

		System.out.println("   *****  Value/Values selected on the HOSTING page are  *** ");
		selections.selectDropDown("10%", "40%", "30%", "10%", "10%");

		click.clickToNext(driver);		

		fromEngPage.valEngHeader(driver);		

		System.out.println("   *****  Value/Values selected on the ENGINEERING page are  *** ");
		selections.selectDropDown("50%", "50%");

		// *************************************************************************************************///
		/// *** ENGINEERING PAGE Select value = 100 % , Navigate to SOURCING PAGE ***///
		/// ************************************************************************************************///

		click.clickToNext(driver);

		/// *************************************************************************************************///
		/// *** Verifying the Page header as "Sourcing" ***///
		/// *************************************************************************************************///

		fromSourcingPage.valSourcHeader(driver);

		/// *************************************************************************************************///
		/// **** Sourcing Page - Select multiple values from 5 different drop down
		/// validate it to 100% ***///
		/// **** To navigate to Sourcing Page. ***///
		/// *************************************************************************************************///

		System.out.println("   *****  Value/Values selected on the SOURCING page are  *** ");
		selections.selectDropDown("70%", "20%", "10%");

		// *************************************************************************************************///
		/// *** SOURCING PAGE Select value = 100 % , Navigate to PRACTICES PAGE ***///
		/// ************************************************************************************************///

		click.clickToNext(driver);

		fromPracticesPage.valPracticesHeader(driver);
		fromPracticesPage.selectPractPageItems(driver);
		click.clickToNext(driver);

		/// *************************************************************************************************///
		/// *** Verify the current assessment of IT Maturity ***///
		/// *************************************************************************************************///

		fromSummaryPage.suggestItMaturity(driver);	

		/// *************************************************************************************************///
		/// *** Verify the current assessment of IT Goals ***///
		/// *************************************************************************************************///

		fromSummaryPage.verifyCurrentGoals(driver);

		/// *************************************************************************************************///
		/// *** Verify the current Levers ***///
		/// *************************************************************************************************///

		System.out.println(" *****************  LEVERS   STATUS befor user drag the Circles *****************");
		System.out.println();

		fromSummaryPage.setCurrentLevel("level current");
		fromSummaryPage.findCurrentLevers(driver);
		TimeUnit.SECONDS.sleep(3);

		/// *************************************************************************************************///
		/// *** Drag the Goal horizontally ***///
		/// *************************************************************************************************///


		fromSummaryPage.dragGoalsHorizontally(driver);
		System.out.println(" *****************  LEVERS   STATUS after user drag the Circles *****************");
		System.out.println();

		fromSummaryPage.setCurrentLevel("level goal");
		fromSummaryPage.findCurrentLevers(driver);

		/// *************************************************************************************************///
		/// *** Getting There ***///
		/// *************************************************************************************************///

		fromSummaryPage.verifyGettingThereE2e(driver);

		/// *************************************************************************************************///
		/// *** Complete the Process on Final Page ***///
		/// *************************************************************************************************///

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[6]/button[2]")).click();

		/// *************************************************************************************************///
		/// *** To close all the child windows (Web browsers) ***///
		/// *************************************************************************************************///

		driver.quit();

	}

}