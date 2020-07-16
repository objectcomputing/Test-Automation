package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EngLabelDes {

    ///*************************************************************************************************///
    ///***              Verifying the Drop down Labels Descriptions on Engineering Page"             ***///
    ///*************************************************************************************************///

    public void engLabelDescription(WebDriver driver) {

        //*****************************  Verifying  Labels Description ONE *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).click();
        String actdesone = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/div")).getText();


        String expectedDesone = "IT project teams not only take advantage of freely available industry standard components, but they also participate in open source projects that have a high level of synergy with business objectives or domains.";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description One here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesone);
        System.out.println("Actual Confirmation message: " + actdesone);
        System.out.println();

        Assert.assertEquals(actdesone, expectedDesone);

        //*****************************  Verifying  Labels Description TWO *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).click();

        String actdestwo = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/div")).getText();


        String expectedDestwo = "IT projects afford the time to explore freely available industry standard components to reduce project spend and increase functional maturity of the pieces of many solutions.";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description Two here  ******");

        System.out.println("Expected Confirmation message: " + expectedDestwo);
        System.out.println("Actual Confirmation message: " + actdestwo);
        System.out.println();

        Assert.assertEquals(actdestwo, expectedDestwo);

        //*****************************  Verifying  Labels Description THREE *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).click();

        String actdesthree = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/div")).getText();

        String expectedDesthree = "The business affords effort to bring forward reusable components and projects take advantage of these resources to reduce project cost and improve solution maintenance and support.";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description Three here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesthree);
        System.out.println("Actual Confirmation message: " + actdesthree);
        System.out.println();

        Assert.assertEquals(actdesthree, expectedDesthree);

        //*****************************  Verifying  Labels Description FOUR   *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).click();

        String actdesfour = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/div")).getText();

        String expectedDesfour = "The business affords effort to identify similarities between components being developed by concurrent projects. These components are architected to be used by multiple solutions.";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description Four here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesfour);
        System.out.println("Actual Confirmation message: " + actdesfour);
        System.out.println();

        Assert.assertEquals(actdesfour, expectedDesfour);


        //*****************************  Verifying  Labels Description FIVE      *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();

        String actdesfive = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/div")).getText();

        String expectedDesfive = "IT projects do not worry about the similarities between components they develop in order to deliver automations. Each initiative develops whatever is needed to meet its requirements.";

        System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description Five here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesfive);
        System.out.println("Actual Confirmation message: " + actdesfive);
        System.out.println();

        Assert.assertEquals(actdesfive, expectedDesfive);


        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();


    }


}
