package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EngineeringPageChoiceLabelVal {


    public void validateEngChoiceLabel(WebDriver driver) {

        ///*************************************************************************************************///
        ///***                         Verifying the Drop down Labels on Engineering page"                                   ***///
        ///*************************************************************************************************///

        //***                         Verifying  Labels one

        String actlabelone = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).getText();

        String expectlabeldone = "Contributing to open source";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels One here  ******");

        System.out.println("Expected Confirmation message: " + expectlabeldone);
        System.out.println("Actual Confirmation message: " + actlabelone);
        System.out.println();

        Assert.assertEquals(actlabelone, expectlabeldone);

        //***                         Verifying  Labels Two

        String actlabeltwo = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).getText();

        String expectlabeldtwo = "Leveraging open source";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels Two here  ******");

        System.out.println("Expected Confirmation message: " + expectlabeldtwo);
        System.out.println("Actual Confirmation message: " + actlabeltwo);
        System.out.println();

        Assert.assertEquals(actlabeltwo, expectlabeldtwo);

        //***                         Verifying  Labels Three

        String actlabelthree = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).getText();

        String expectlabeldthree = "Reused";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels Three here  ******");

        System.out.println("Expected Confirmation message: " + expectlabeldthree);
        System.out.println("Actual Confirmation message: " + actlabelthree);
        System.out.println();

        Assert.assertEquals(actlabelthree, expectlabeldthree);

        //***                         Verifying  Labels Four


        String actlabelfour = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).getText();

        String expectlabelfour = "Reusable";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels Four here  ******");

        System.out.println("Expected Confirmation message: " + expectlabelfour);
        System.out.println("Actual Confirmation message: " + actlabelfour);
        System.out.println();

        Assert.assertEquals(actlabelfour, expectlabelfour);

        //***                         Verifying  Labels Five

        String actlabelfive = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).getText();

        String expectlabelfive = "Custom";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels Five here  ******");

        System.out.println("Expected Confirmation message: " + expectlabelfive);
        System.out.println("Actual Confirmation message: " + actlabelfive);
        System.out.println();

        Assert.assertEquals(actlabelfive, expectlabelfive);

    }

}
