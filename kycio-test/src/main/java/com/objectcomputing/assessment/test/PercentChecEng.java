package com.objectcomputing.assessment.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PercentChecEng {

    // static String newValue;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\malamelp\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://assessment.objectcomputing.com/");

        SurveyLogin login = new SurveyLogin();
        login.surveyLogin(driver);

        CallClick click = new CallClick();
        DialougeVerify dialouge = new DialougeVerify();


        ///*************************************************************************************************///
        ///****  Hosting Page - Select multiple values from 5 different drop down validate it to 100%    ***///
        ///****  To navigate to Engineering Page.                                                        ***///
        ///*************************************************************************************************///

        HostingPageSelection firstChoice = new HostingPageSelection();
        firstChoice.hostingFirstChoice(driver);

        HostingPageSelection secondChoice = new HostingPageSelection();
        secondChoice.hostingSecondChoice(driver);

        HostingPageSelection thirdChoice = new HostingPageSelection();
        thirdChoice.hostingThirdChoice(driver);

        HostingPageSelection fourthChoice = new HostingPageSelection();
        fourthChoice.hostingFourthChoice(driver);
        TimeUnit.SECONDS.sleep(1);

        HostingPageSelection fifthChoice = new HostingPageSelection();
        fifthChoice.hostingFifthChoice(driver);

        click.clickToNext(driver);

        ///*************************************************************************************************///
        ///****  Engineering Page - Select multiple values from 5 different drop down validate it to 100%***///
        ///****  To navigate to Sourcing  Page.                                                          ***///
        ///*************************************************************************************************///

        EngineeringPageSelection firstChoiceEng = new EngineeringPageSelection();
        firstChoiceEng.engFirstChoice(driver);

        click.clickToNext(driver);
        dialouge.verifyDialougeEng(driver);
        driver.quit();

    }


}
	

