package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SurveyResAndDev {

    // static String newValue;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        // Create drive object for the FireFox Browser
        // class name =  FireFoxDriver

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\malamelp\\geckodriver.exe");

        WebDriver driver;

        //WebDriver driver = new FirefoxDriver();
        driver = new FirefoxDriver();


        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\malamelp\\chromedriver.exe");

        // WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


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
        ///***                         Verifying the Drop down Labels on the "Hosting" page"             ***///
        ///*************************************************************************************************///

        HostingPageChoiceLabelVal dropDownLabelVal = new HostingPageChoiceLabelVal();
        dropDownLabelVal.choiceLabelValidation(driver);

        ///*************************************************************************************************///
        ///***             Verifying the Drop down Labels  Descriptions on the "Hosting" page"           ***///
        ///*************************************************************************************************///

        HostLabelDes hostLabelDes = new HostLabelDes();
        hostLabelDes.hostLabelDescription(driver);

        ///*************************************************************************************************///
        ///****  Hosting Page - Select multiple values from 5 different drop down validate it to 100%    ***///
        ///****  To navigate to Engineering Page.                                                        ***///
        ///*************************************************************************************************///

        HostingSelection t = new HostingSelection();
        t.hostingFifthChoice(driver, "100%");
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

        ///*************************************************************************************************///
        ///***                HOSTING PAGE   Select value = 100 % , Navigate to ENGINEERING PAGE         ***///
        ///*************************************************************************************************///

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(("//button[@class='next']"))).click();
        TimeUnit.SECONDS.sleep(3);

        ///*************************************************************************************************///
        ///***                         Verifying the Page header as "Engineering"                        ***///
        ///*************************************************************************************************///

        VerifyPageHeader secondPage = new VerifyPageHeader();
        secondPage.verifyPageEngineering(driver);

        ///*************************************************************************************************///
        ///***                     Verifying the Drop down Labels on the "Engineering" page"             ***///
        ///*************************************************************************************************///

        EngineeringPageChoiceLabelVal dropDownLabelValEng = new EngineeringPageChoiceLabelVal();
        dropDownLabelValEng.validateEngChoiceLabel(driver);

        ///*************************************************************************************************///
        ///***           Verifying the Drop down Labels  Descriptions on the "Engineering" page"         ***///
        ///*************************************************************************************************///

        EngLabelDes engLabelDes = new EngLabelDes();
        engLabelDes.engLabelDescription(driver);

        ///*************************************************************************************************///
        ///****  Engineering Page - Select multiple values from 5 different drop down validate it to 100%***///
        ///****  To navigate to Sourcing  Page.                                                          ***///
        ///*************************************************************************************************///

        EngineeringPageSelection firstChoiceEng = new EngineeringPageSelection();
        firstChoiceEng.engFirstChoice(driver);

        EngineeringPageSelection secondChoiceEng = new EngineeringPageSelection();
        secondChoiceEng.engSecondChoice(driver);

        //EngineeringPageSelection thirdChoiceEng = new EngineeringPageSelection();
        //thirdChoiceEng.engThirdChoice(driver);

        //EngineeringPageSelection fourthChoiceEng = new EngineeringPageSelection();
        //fourthChoiceEng.engFourthChoice(driver);

        //EngineeringPageSelection fifthChoiceEng = new EngineeringPageSelection();
        //fifthChoiceEng.engFifthChoice(driver);

        //*************************************************************************************************///
        ///***                ENGINEERING PAGE   Select value = 100 % , Navigate to SOURCING PAGE       ***///
        ///************************************************************************************************///

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(("//button[@class='next']"))).click();
        TimeUnit.SECONDS.sleep(3);


        ///*************************************************************************************************///
        ///***                         Verifying the Page header as "Sourcing"                        ***///
        ///*************************************************************************************************///

        VerifyPageHeader thirdPage = new VerifyPageHeader();
        thirdPage.verifyPageSourcing(driver);

        ///*************************************************************************************************///
        ///***                     Verifying the Drop down Labels on the "Sourcing" page"             ***///
        ///*************************************************************************************************///

        SourcingPageChoiceLabelVal dropDownLabelValSourc = new SourcingPageChoiceLabelVal();
        dropDownLabelValSourc.validateSourcChoiceLabel(driver);

        ///*************************************************************************************************///
        ///***           Verifying the Drop down Labels  Descriptions on the "Sourcing" page"            ***///
        ///*************************************************************************************************///

        SourcLabelDes sourcLabelDes = new SourcLabelDes();
        sourcLabelDes.sourcLabelDescription(driver);

        ///*************************************************************************************************///
        ///****  Sourcing Page - Select multiple values from 5 different drop down validate it to 100%   ***///
        ///****  To navigate to Sourcing  Page.                                                          ***///
        ///*************************************************************************************************///

        //DynamicPercentSelection firstChoiceSourc = new DynamicPercentSelection();

        //FinalPercentOne firstChoiceSourc = new FinalPercentOne();

        //firstChoiceSourc.operation(driver);

        //PageSelection fistChoiceEng = new HostingPageSelection();
        //firstChoiceEng.hostingSecondChoice(driver);

        SourcingPageSelection firstChoiceSrc = new SourcingPageSelection();
        firstChoiceSrc.srcFirstChoice(driver);

        SourcingPageSelection secondChoiceSrc = new SourcingPageSelection();
        secondChoiceSrc.srcSecondChoice(driver);

        SourcingPageSelection thirdChoiceSrc = new SourcingPageSelection();
        thirdChoiceSrc.srcThirdChoice(driver);

        //SourcingPageSelection fourthChoiceSrc = new SourcingPageSelection();
        //fourthChoiceSrc.srcFourthChoice(driver);

        //SourcingPageSelection fifthChoiceSrc = new SourcingPageSelection();
        //fifthChoiceSrc.srcFifthChoice(driver);

        ///************************************************************************************************///
        ///***                SOURCING PAGE   Select value = 100 % , Navigate to PRACTICES PAGE         ***///
        ///************************************************************************************************///

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(("//button[@class='next']"))).click();
        TimeUnit.SECONDS.sleep(3);


        ///*************************************************************************************************///
        ///****  Practices Page - Select different items on the  Practices Page                          ***///
        ///*************************************************************************************************///

        PracticesPage prctsPage = new PracticesPage();
        prctsPage.selectPractPageItems(driver);

        ///************************************************************************************************///
        ///***                PRACTICES PAGE   Select value = 100 % , Navigate to FINAL PAGE            ***///
        ///************************************************************************************************///

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(("//button[@class='next']"))).click();
        TimeUnit.SECONDS.sleep(3);

        ///*************************************************************************************************///
        ///***              Verify the current assessment of IT Maturity                                 ***///
        ///*************************************************************************************************///

        FinalPageItMaturity finalPageItMat = new FinalPageItMaturity();
        finalPageItMat.suggestItMaturity(driver);

        ///*************************************************************************************************///
        ///***              Verify the current assessment of IT Goals                                    ***///
        ///*************************************************************************************************///

        FinalPageCurrentGoalLevel finalPage = new FinalPageCurrentGoalLevel();
        finalPage.verifyCurrentGoals(driver);

        ///*************************************************************************************************///
        ///***              Verify the current Levers                                                    ***///
        ///*************************************************************************************************///

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

        //SliderTest slideperfect = new SliderTest();
        //slideperfect.dragtTestGoalsHorizontally(driver);

        //FinaSlideTest f1 = new FinaSlideTest();
        //f1.slideFinalTest(driver);

        currentlevers.setCurrentLevel("level goal");
        currentlevers.findCurrentLevers(driver);

        ///*************************************************************************************************///
        ///***              To close all the child windows (Web browsers)                                ***///
        ///*************************************************************************************************///

        //	driver.quit();

    }

}



