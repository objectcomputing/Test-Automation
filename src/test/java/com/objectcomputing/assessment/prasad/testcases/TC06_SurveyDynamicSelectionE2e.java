package com.objectcomputing.assessment.prasad.testcases;

import com.objectcomputing.assessment.prasad.pages.*;
import com.objectcomputing.assessment.prasad.util.CallClick;
import com.objectcomputing.assessment.prasad.util.DynamicPercentSelection;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC06_SurveyDynamicSelectionE2e {

    @Test
    public void SurveyDynamicSelection() throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        //Initiating your firefoxdriver
        FirefoxOptions options = new FirefoxOptions();
        String opts = System.getenv("FIREFOX_OPTS");
        if (opts != null) {
            options.addArguments(opts);
        }
        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();
        CallClick click = new CallClick();

        driver.get("https://assessment.objectcomputing.com/");

        HostingPage fromHostPage = new HostingPage();
        EngineeringPage fromEngPage = new EngineeringPage();
        SourcingPage fromSourcingPage = new SourcingPage();
        PracticesPage fromPracticesPage = new PracticesPage();
        DynamicPercentSelection fromDynamicSelect = new DynamicPercentSelection();
        SummaryPage fromSummaryPage = new SummaryPage();


        SurveyLoginPage login = new SurveyLoginPage();
        login.surveyLogin(driver);

        System.out.println();
        System.out.println("*******    TESTCASE NAME : TC06_SurveyDynamicSelectionE2e  ******* ");

        fromHostPage.valHostHeader(driver);

        fromDynamicSelect.operation(driver);
        click.clickToNext(driver);

        fromEngPage.valEngHeader(driver);

        fromDynamicSelect.operation(driver);
        click.clickToNext(driver);

        fromSourcingPage.valSourcHeader(driver);

        fromDynamicSelect.operation(driver);
        TimeUnit.SECONDS.sleep(3);
        click.clickToNext(driver);

        fromPracticesPage.valPracticesHeader(driver);
        fromPracticesPage.selectPractPageItems(driver);
        click.clickToNext(driver);

        System.out.println(" *****************  LEVERS   STATUS befor user drag the Circles *****************");
        System.out.println();
        fromSummaryPage.setCurrentLevel("level current");
        fromSummaryPage.findCurrentLevers(driver);
        TimeUnit.SECONDS.sleep(3);

        //DragTest dragit = new DragTest();
        //dragit.dragtTestGoalsHorizLoop(driver);
        fromSummaryPage.dragtTestGoalsHorizLoop(driver);

        System.out.println(" *****************  LEVERS   STATUS after user drag the Circles *****************");
        System.out.println();
        fromSummaryPage.setCurrentLevel("level goal");
        fromSummaryPage.findCurrentLevers(driver);


        TimeUnit.SECONDS.sleep(5);

        driver.quit();

    }

}
