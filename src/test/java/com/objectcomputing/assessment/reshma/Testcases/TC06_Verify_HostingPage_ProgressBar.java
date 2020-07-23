/**
 *
 */
package com.objectcomputing.assessment.reshma.Testcases;

import com.objectcomputing.assessment.reshma.Pages.HostingPage;
import com.objectcomputing.assessment.reshma.Pages.LoginPage;
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
public class TC06_Verify_HostingPage_ProgressBar {
    WebDriver driver;
    LoginPage loginPage;
    HostingPage hostingPage;


    @BeforeMethod
    public void beforeMethod() {
        //This will launch the browser and specify URL
        driver = BrowserFactory.startApplication(driver, "Chrome", "https://assessment.objectcomputing.com/");

        //Created Page Object using Page Factory
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        hostingPage = PageFactory.initElements(driver, HostingPage.class);
    }

    @Test
    public void test() throws InterruptedException {
        //Call the method
        loginPage.registerInSurveyApp("tajr123@objectcomputing.com", "Reshma Taj", "OCI");
        hostingPage.selectValuesInHostingPage("10%", "20%", "30%", "30%", "10%");
        hostingPage.verifyHostingPageProgressBar();
    }

    @AfterMethod

    public void afterMethod() {

        driver.quit();

    }
}
