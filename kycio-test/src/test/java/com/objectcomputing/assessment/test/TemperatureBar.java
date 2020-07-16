package com.objectcomputing.assessment.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TemperatureBar {

    //public WebDriver driver;
    //static String baseurl = "https://assessment.objectcomputing.com/";

    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.gecko.driver", "C:\\Users\\malamelp\\geckodriver.exe");

        //	   WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\malamelp\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        OverloadingSelection choiceselect = new OverloadingSelection();
        CallClick click = new CallClick();


        ///*************************************************************************************************///
        ///***                     Launch the Survey Application URL                                     ***///
        ///*************************************************************************************************///

        driver.get("https://assessment.objectcomputing.com/");

        ///*************************************************************************************************///
        ///***    Enter All the valid values on the Log in Page and successfully completes the login     ***///
        ///*************************************************************************************************///

        SurveyLogin login = new SurveyLogin();
        login.surveyLogin(driver);

        ///*************************************************************************************************///
        ///***                         Verifying the Page header as "Hosting"                            ***///
        ///*************************************************************************************************///

        VerifyPageHeader firstPage = new VerifyPageHeader();
        firstPage.verifyPageHosting(driver);


        ///*************************************************************************************************///
        ///****  Hosting Page - Select one  value from 5 different drop down validate it to 100%         ***///
        ///****  To navigate to Engineering Page.                                                        ***///
        ///*************************************************************************************************///

        choiceselect.hostingChoice(driver);

        ///*************************************************************************************************///
        ///***                           Current State of Temperature-bar                                ***///
        ///*************************************************************************************************///
        TemperaturBarHost checkselection = new TemperaturBarHost();
        checkselection.verifyTemBarHost(driver);

        ///*************************************************************************************************///
        ///***                HOSTING PAGE   Select value = 100 % , Navigate to ENGINEERING PAGE         ***///
        ///*************************************************************************************************///

        click.clickToNext(driver);

        ///*************************************************************************************************///
        ///***                         Verifying the Page header as "Engineering"                        ***///
        ///*************************************************************************************************///

        VerifyPageHeader secondPage = new VerifyPageHeader();
        secondPage.verifyPageEngineering(driver);

        ///*************************************************************************************************///
        ///****  Engineering Page - Select one  value from 5 different drop down validate it to 100%     ***///
        ///****  To navigate to Sourcing  Page.                                                          ***///
        ///*************************************************************************************************///

        choiceselect.engChoice(driver);

        //*************************************************************************************************///
        ///***                ENGINEERING PAGE   Select value = 100 % , Navigate to SOURCING PAGE       ***///
        ///************************************************************************************************///

        click.clickToNext(driver);

        ///*************************************************************************************************///
        ///***                         Verifying the Page header as "Sourcing"                        ***///
        ///*************************************************************************************************///

        VerifyPageHeader thirdPage = new VerifyPageHeader();
        thirdPage.verifyPageSourcing(driver);

        ///*************************************************************************************************///
        ///****  Sourcing Page - Select one value from 5 different drop down validate it to 100%         ***///
        ///****  To navigate to Sourcing  Page.                                                          ***///
        ///*************************************************************************************************///

        choiceselect.srcChoice(driver);

        ///************************************************************************************************///
        ///***                SOURCING PAGE   Select value = 100 % , Navigate to PRACTICES PAGE         ***///
        ///************************************************************************************************///

        click.clickToNext(driver);

        ///*************************************************************************************************///
        ///****  Practices Page - Select different items on the  Practices Page                          ***///
        ///*************************************************************************************************///

        PracticesPage prctsPage = new PracticesPage();
        prctsPage.selectPractPageItems(driver);

        ///************************************************************************************************///
        ///***                PRACTICES PAGE   Select value = 100 % , Navigate to FINAL PAGE            ***///
        ///************************************************************************************************///

        click.clickToNext(driver);


        ///*************************************************************************************************///
        ///***              Verify the current Levers                                                    ***///
        ///*************************************************************************************************///
        System.out.println(" *****************  LEVERS   STATUS befor user drag the Circles *****************");
        System.out.println();
        CurrentLevers currentlevers = new CurrentLevers();
        currentlevers.setCurrentLevel("level current");
        currentlevers.findCurrentLevers(driver);
        TimeUnit.SECONDS.sleep(3);

        ///*************************************************************************************************///
        ///***              Drag the Goal horizontally                                                   ***///
        ///*************************************************************************************************///

        //DragGoalsHorizontally dragit1 = new DragGoalsHorizontally();
        //dragit1.dragGoalsHorizontally(driver);

        DragTest dragit2 = new DragTest();
        dragit2.dragtTestGoalsHorizLoop(driver);

        // SliderTest slideperfect = new SliderTest();
        //slideperfect.dragtTestGoalsHorizontally(driver);

        //FinaSlideTest f1 = new FinaSlideTest();
        //f1.slideFinalTest(driver);
        System.out.println(" *****************  LEVERS   STATUS after user drag the Circles *****************");
        System.out.println();
        currentlevers.setCurrentLevel("level goal");
        currentlevers.findCurrentLevers(driver);

        ///*************************************************************************************************///
        ///***              To close all the child windows (Web browsers)                                ***///
        ///*************************************************************************************************///

        //	driver.quit();

    }

}





