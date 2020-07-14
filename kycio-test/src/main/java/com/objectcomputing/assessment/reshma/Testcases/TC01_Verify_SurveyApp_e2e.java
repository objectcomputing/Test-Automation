/**
 *
 */
package com.objectcomputing.assessment.reshma.Testcases;

import com.objectcomputing.assessment.reshma.Pages.*;
import com.objectcomputing.assessment.reshma.utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author tajr
 *
 */
public class TC01_Verify_SurveyApp_e2e {
    WebDriver driver;
    LoginPage loginPage;
    HostingPage hostingPage;
    EngineeringPage engineeringPage;
    SourcingPage sourcingPage;
    PracticesPage practicePage;
    SummaryPage summaryPage;


    @BeforeMethod
    public void beforeMethod() {

        //This will launch the browser and specify URL
        driver = BrowserFactory.startApplication(driver, "Chrome", "https://assessment.objectcomputing.com/");

        //Created Page Object using Page Factory
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        hostingPage = PageFactory.initElements(driver, HostingPage.class);
        engineeringPage = PageFactory.initElements(driver, EngineeringPage.class);
        sourcingPage = PageFactory.initElements(driver, SourcingPage.class);
        practicePage = PageFactory.initElements(driver, PracticesPage.class);
        summaryPage = PageFactory.initElements(driver, SummaryPage.class);

    }

    @Test
    public void test() throws InterruptedException {
        //Call the method
        loginPage.registerInSurveyApp("tajr123@objectcomputing.com", "Reshma Taj", "OCI");
        hostingPage.selectValuesInHostingPage("10%", "20%", "30%", "30%", "10%");
        engineeringPage.selectValuesInEngineeringPage("40%", "10%", "10%", "10%", "30%");
        sourcingPage.selectValuesInSourcingPage("10%", "10%", "10%", "10%", "60%");
        practicePage.selectOptionsInPracticePage("3");
        practicePage.apiSelection();
        practicePage.enterTextAndValue("Insomnia", "8");
        summaryPage.selectOptionsInSummaryPage();
        summaryPage.scrollUpPage();
    }

    @AfterMethod

    public void afterMethod() {

        driver.quit();

    }
}
