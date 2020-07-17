package com.objectcomputing.assessment.prasad.testcases;

import com.objectcomputing.assessment.prasad.pages.HostingPage;
import com.objectcomputing.assessment.prasad.pages.SurveyLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC03_HostingLabelAndDescription {

    @Test
    public void verifyLabelDesEngPage() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //Initiating your chromedriver
        ChromeOptions options = new ChromeOptions();
        String opts = System.getenv("CHROME_OPTS");
        if (opts != null) {
            options.addArguments(opts);
        }
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://assessment.objectcomputing.com/");
        driver.manage().window().maximize();

        SurveyLoginPage login = new SurveyLoginPage();
        login.surveyLogin(driver);

        HostingPage fromhostPage = new HostingPage();

        fromhostPage.valHostHeader(driver);
        fromhostPage.valHostLabel(driver);
        fromhostPage.valHostLabDes(driver);
        driver.quit();

    }
}
