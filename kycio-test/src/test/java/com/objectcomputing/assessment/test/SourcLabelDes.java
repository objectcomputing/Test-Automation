package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SourcLabelDes {

    ///*************************************************************************************************///
    ///***              Verifying the Drop down Labels Descriptions on Sourcing Page"                ***///
    ///*************************************************************************************************///

    public void sourcLabelDescription(WebDriver driver) {

        //*****************************  Verifying  Labels Description ONE *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).click();
        String actdesone = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/div")).getText();


        String expectedDesone = "The product vendor takes care of all support, maintenance, and product features for all clients on one uniform cloud-hosted solution.";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description One here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesone);
        System.out.println("Actual Confirmation message: " + actdesone);
        System.out.println();

        Assert.assertEquals(actdesone, expectedDesone);

        //*****************************  Verifying  Labels Description TWO *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).click();

        String actdestwo = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/div")).getText();


        String expectedDestwo = "In this category, the solution vendor cloud hosts a copy of their software dedicated for your use. This is also called a single-tenant cloud hosted solution.";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description Two here  ******");

        System.out.println("Expected Confirmation message: " + expectedDestwo);
        System.out.println("Actual Confirmation message: " + actdestwo);
        System.out.println();

        Assert.assertEquals(actdestwo, expectedDestwo);

        //*****************************  Verifying  Labels Description THREE *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).click();

        String actdesthree = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/div")).getText();

        String expectedDesthree = "This category leaves the operational support for these solutions with your support team, while reducing server purchasing costs. An example is hosting Oracle Financial applications in the cloud.";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description Three here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesthree);
        System.out.println("Actual Confirmation message: " + actdesthree);
        System.out.println();

        Assert.assertEquals(actdesthree, expectedDesthree);

        //*****************************  Verifying  Labels Description FOUR   *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).click();

        String actdesfour = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/div")).getText();

        String expectedDesfour = "The amount of the functional range that you provide for your enterprise or products that is procured by licensing commercial off-the-shelf software, which you then adapt to your needs and/or extend the process coverage through software development by your IT staff.";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description Four here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesfour);
        System.out.println("Actual Confirmation message: " + actdesfour);
        System.out.println();

        Assert.assertEquals(actdesfour, expectedDesfour);


        //*****************************  Verifying  Labels Description FIVE      *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();

        String actdesfive = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/div")).getText();

        String expectedDesfive = "The amount of the functional range that you provide for your enterprise or products that is"
                + " procured by licensing commercial off-the-shelf software. This particular category only includes those"
                + " products that you are able to use \"out of the box\"; without any coding effort by your IT staff.";

        System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description Five here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesfive);
        System.out.println("Actual Confirmation message: " + actdesfive);
        System.out.println();

        Assert.assertEquals(actdesfive, expectedDesfive);


        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();


    }
}
