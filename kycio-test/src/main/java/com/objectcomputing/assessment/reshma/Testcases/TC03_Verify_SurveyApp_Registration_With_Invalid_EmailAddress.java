/**
 *
 */
package com.objectcomputing.assessment.reshma.Testcases;

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
public class TC03_Verify_SurveyApp_Registration_With_Invalid_EmailAddress {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void beforeMethod() {
        driver = BrowserFactory.startApplication(driver, "Chrome", "https://assessment.objectcomputing.com/");
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void verifyValidRegistration() throws InterruptedException {
        loginPage.registerInSurveyApp("tajr", "Reshma Taj", "OCI");
    }

    @AfterMethod

    public void afterMethod() {
        BrowserFactory.quitBrowser(driver);
    }
}
