package com.objectcomputing.assessment.prasad.testcases;

import com.objectcomputing.assessment.prasad.pages.HostingPage;
import com.objectcomputing.assessment.prasad.pages.SurveyLoginPage;
import com.objectcomputing.assessment.prasad.util.CallClick;
import com.objectcomputing.assessment.prasad.util.DropDownList;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC07_PercentChecHost {

    @Test

    public static void totalValidationHost() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //Initiating your chromedriver
        ChromeOptions options = new ChromeOptions();
        String opts = System.getenv("CHROME_OPTS");
        if (opts != null) {
            options.addArguments(opts);
        }
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://assessment.objectcomputing.com/");

        SurveyLoginPage login = new SurveyLoginPage();
        login.surveyLogin(driver);

        CallClick click = new CallClick();
        DropDownList selections = new DropDownList(driver);
        HostingPage fromHostingPage = new HostingPage();

        System.out.println("   *****  Value/Values selected on the HOSTING page are  *** ");
        selections.selectDropDown("50%");
        click.clickToNext(driver);
        fromHostingPage.verifyDialougeHost(driver);
        driver.quit();

    }
}
