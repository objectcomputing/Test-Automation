package com.objectcomputing.assessment.prasad.testcases;

import com.objectcomputing.assessment.prasad.pages.SourcingPage;
import com.objectcomputing.assessment.prasad.pages.SurveyLoginPage;
import com.objectcomputing.assessment.prasad.util.CallClick;
import com.objectcomputing.assessment.prasad.util.DropDownList;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC05_SourcingLabelAndDescription {

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

        CallClick click = new CallClick();
        DropDownList selections = new DropDownList(driver);
        SourcingPage fromSourcingPage = new SourcingPage();
        selections.selectDropDown("100%");
        click.clickToNext(driver);

        selections.selectDropDown("100%");
        click.clickToNext(driver);

        System.out.println();
        System.out.println("*******    TESTCASE NAME : TC05_SourcingLabelAndDescription  ******* ");

        fromSourcingPage.valSourcHeader(driver);
        fromSourcingPage.valSourcLabel(driver);
        fromSourcingPage.valSourcLabDes(driver);
        driver.quit();
    }

}
