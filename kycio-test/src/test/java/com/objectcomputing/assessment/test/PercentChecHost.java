package com.objectcomputing.assessment.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PercentChecHost {

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

        click.clickToNext(driver);
        dialouge.verifyDialougeHost(driver);
        driver.quit();

    }
}

