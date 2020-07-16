package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SourcingPageChoiceLabelVal {

    public void validateSourcChoiceLabel(WebDriver driver) {

        ///*************************************************************************************************///
        ///***                         Verifying the Drop down Labels on Sourcing page"                  ***///
        ///*************************************************************************************************///

        //***                         Verifying  Labels one

        String actlabelone = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).getText();

        String expectlabeldone = "Software-As-A-Service (SaaS) solutions";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels One here  ******");

        System.out.println("Expected Confirmation message: " + expectlabeldone);
        System.out.println("Actual Confirmation message: " + actlabelone);
        System.out.println();

        Assert.assertEquals(actlabelone, expectlabeldone);

        //***                         Verifying  Labels Two

        String actlabeltwo = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).getText();

        String expectlabeldtwo = "Applications hosted by third-parties in the cloud";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Two here  ******");

        System.out.println("Expected Confirmation message: " + expectlabeldtwo);
        System.out.println("Actual Confirmation message: " + actlabeltwo);
        System.out.println();

        Assert.assertEquals(actlabeltwo, expectlabeldtwo);

        //***                         Verifying  Labels Three

        String actlabelthree = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).getText();

        String expectlabeldthree = "Applications that you have moved to hosting in the cloud";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Three here  ******");

        System.out.println("Expected Confirmation message: " + expectlabeldthree);
        System.out.println("Actual Confirmation message: " + actlabelthree);
        System.out.println();

        Assert.assertEquals(actlabelthree, expectlabeldthree);

        //***                         Verifying  Labels Four


        String actlabelfour = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).getText();

        String expectlabelfour = "COTS extended through APIs, plug-ins, or other interfaces";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Four here  ******");

        System.out.println("Expected Confirmation message: " + expectlabelfour);
        System.out.println("Actual Confirmation message: " + actlabelfour);
        System.out.println();

        Assert.assertEquals(actlabelfour, expectlabelfour);

        //***                         Verifying  Labels Five

        String actlabelfive = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).getText();

        String expectlabelfive = "Commercial Off-The-Shelf (COTS) solutions licensed";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Five here  ******");

        System.out.println("Expected Confirmation message: " + expectlabelfive);
        System.out.println("Actual Confirmation message: " + actlabelfive);
        System.out.println();

        Assert.assertEquals(actlabelfive, expectlabelfive);

    }
}
