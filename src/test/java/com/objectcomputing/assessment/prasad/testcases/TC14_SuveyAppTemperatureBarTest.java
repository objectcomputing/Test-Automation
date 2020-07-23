package com.objectcomputing.assessment.prasad.testcases;

	
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

	public class TC14_SuveyAppTemperatureBarTest {

		// public WebDriver driver;
		// static String baseurl = "https://assessment.objectcomputing.com/";

		@Test

		public void verifTemperatrueBar() throws InterruptedException {

			// System.setProperty("webdriver.gecko.driver",
			// "C:\\Users\\malamelp\\geckodriver.exe");

			// WebDriver driver = new FirefoxDriver();

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\malamelp\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			DropDownList fromUtil = new DropDownList(driver);
			CallClick click = new CallClick();
			HostingPage fromhostPage = new HostingPage();
			EngineeringPage fromEngPage = new EngineeringPage();
			SourcingPage fromSourcingPage = new SourcingPage();
			PracticesPage fromPracticesPage = new PracticesPage();
			SummaryPage fromSummaryPage = new SummaryPage();

			// Launch the Survey Application URL

			driver.get("https://assessment.objectcomputing.com/");

			// Log in Page

			SurveyLoginPage fromLogInPage = new SurveyLoginPage();
			fromLogInPage.surveyLogin(driver);

			// Verifying the Hosting Page header
			
			System.out.println();
			System.out.println("   *******    TESTCASE NAME : TC14_SuveyAppTemperatureBarTest  ******* ");
			
			fromhostPage.valHostHeader(driver);

			// Hosting Page - drop down selection validate to 100%

			System.out.println("   *****  Value/Values selected on the HOSTING page are  *** ");
			fromUtil.selectDropDownTempBar("100%");

			// Current State of Temperature-bar Hosting Page

			fromhostPage.verifyTemBarHost(driver);

			click.clickToNext(driver);

			// Verifying the Page header as "Engineering"

			fromEngPage.valEngHeader(driver);

			// Engineering Page - drop down selection validate to 100%

			System.out.println("   *****  Value/Values selected on the Engineering page are  *** ");
			fromUtil.selectDropDownTempBar("100%");

			// Current State of Temperature-bar Hosting Page

			fromEngPage.verifyTemBarEng(driver);

			click.clickToNext(driver);

			// Verifying the Page header as "Sourcing"

			fromSourcingPage.valSourcHeader(driver);

			// Sourcing Page - drop down selection validate to 100%

			System.out.println("   *****  Value/Values selected on the Sourcing page are  *** ");
			fromUtil.selectDropDownTempBar("100%");

			fromSourcingPage.verifyTemBarSourc(driver);

			click.clickToNext(driver);

			/// **** Practices Page - Select different items on the Practices Page ***///

			fromPracticesPage.valPracticesHeader(driver);
			fromPracticesPage.selectPractPageItems(driver);

			fromPracticesPage.verifyTemBarPractice(driver);
			click.clickToNext(driver);

			/// *** Verify the current Levers ***///
			System.out.println(" *****************  LEVERS   STATUS befor user drag the Circles *****************");
			System.out.println();

			fromSummaryPage.setCurrentLevel("level current");
			fromSummaryPage.findCurrentLevers(driver);

			TimeUnit.SECONDS.sleep(3);

			/// *** Drag the Goal horizontally ***///

			fromSummaryPage.dragtTestGoalsHorizLoop(driver);

			System.out.println(" *****************  LEVERS   STATUS after user drag the Circles *****************");
			System.out.println();

			fromSummaryPage.setCurrentLevel("level goalLL");
			fromSummaryPage.findCurrentLevers(driver);

			driver.quit();

		}

}
