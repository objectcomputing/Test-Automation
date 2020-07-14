package com.objectcomputing.assessment.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxCio {

    // static String newValue;

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        // Create drive object for the FireFox Browser
        // class name =  FireFoxDriver

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

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

        HostingPageSelection firstChoice = new HostingPageSelection();
        firstChoice.hostingFirstChoice(driver);

        HostingPageSelection secondChoice = new HostingPageSelection();
        secondChoice.hostingSecondChoice(driver);

        HostingPageSelection thirdChoice = new HostingPageSelection();
        thirdChoice.hostingThirdChoice(driver);

        HostingPageSelection fourthChoice = new HostingPageSelection();
        fourthChoice.hostingFourthChoice(driver);

        HostingPageSelection fifthChoice = new HostingPageSelection();
        fifthChoice.hostingFifthChoice(driver);

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

        click.clickToNext(driver);

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

        SourcingPageSelection firstChoiceSrc = new SourcingPageSelection();
        firstChoiceSrc.srcFirstChoice(driver);

        SourcingPageSelection secondChoiceSrc = new SourcingPageSelection();
        secondChoiceSrc.srcSecondChoice(driver);

        SourcingPageSelection thirdChoiceSrc = new SourcingPageSelection();
        thirdChoiceSrc.srcThirdChoice(driver);

        //SourcingPageSelection fourthChoiceSrc = new SourcingPageSelection();
        //fourthChoiceSrc.srcFourthChoice(driver);

        //TimeUnit.SECONDS.sleep(1);

        //SourcingPageSelection fifthChoiceSrc = new SourcingPageSelection();
        //fifthChoiceSrc.srcFifthChoice(driver);

        ///*************************************************************************************************///
        ///***                SOURCING PAGE   Select value = 100 % , Navigate to PRACTICES PAGE          ***///
        ///*************************************************************************************************///

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
        DragTest dragit = new DragTest();
        dragit.dragtTestGoalsHorizLoop(driver);

        currentlevers.setCurrentLevel("level goal");
        currentlevers.findCurrentLevers(driver);


        ///*************************************************************************************************///
        ///***                                   Getting There                                           ***///
        ///*************************************************************************************************///

        GettingThere testdes = new GettingThere();
        testdes.verifyGettingThere(driver);

        ///*************************************************************************************************///
        ///***              Complete the Process on Final Page                                           ***///
        ///*************************************************************************************************///


        //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[6]/button[2]")).click();


        ///*************************************************************************************************///
        ///***              To close all the child windows (Web browsers)                                ***///
        ///*************************************************************************************************///

        //		driver.quit();

    }

}

