package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class VerifyPageHeader {

    ///*************************************************************************************************///
    ///***                         Verifying the Page header as "Hosting"                            ***///
    ///*************************************************************************************************///


    public void verifyPageHosting(WebDriver driver) {

        String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

        String expectedone = "Hosting";

        System.out.println();
        System.out.println("*******  Verifying \"Hosting\" page header here  ******");
        System.out.println();

        System.out.println("Expected Confirmation message: " + expectedone);
        System.out.println("Actual Confirmation message: " + actualonehost);
        System.out.println();


        Assert.assertEquals(actualonehost, expectedone);

    }

    ///*************************************************************************************************///
    ///***                         Verifying the Page header as "Engineering"                            ***///
    ///*************************************************************************************************///

    public void verifyPageEngineering(WebDriver driver) {


        String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

        String expectedone = "Engineering";

        System.out.println();
        System.out.println("*******  Verifying \"Engineering\" page header here  ******");
        System.out.println();

        System.out.println("Expected Confirmation message: " + expectedone);
        System.out.println("Actual Confirmation message: " + actualonehost);
        System.out.println();


        Assert.assertEquals(actualonehost, expectedone);

    }

    ///*************************************************************************************************///
    ///***                         Verifying the Page header as "Sourcing"                            ***///
    ///*************************************************************************************************///

    public void verifyPageSourcing(WebDriver driver) {


        String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

        String expectedone = "Sourcing";

        System.out.println();
        System.out.println("*******  Verifying \"Sourcing\" page header here  ******");
        System.out.println();

        System.out.println("Expected Confirmation message: " + expectedone);
        System.out.println("Actual Confirmation message: " + actualonehost);
        System.out.println();


        Assert.assertEquals(actualonehost, expectedone);

    }

    ///*************************************************************************************************///
    ///***                         Verifying the Page header as "Practices"                            ***///
    ///*************************************************************************************************///

    public void verifyPagePractices(WebDriver driver) {


        String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

        String expectedone = "Sourcing";

        System.out.println();
        System.out.println("*******  Verifying \"Sourcing\" page header here  ******");
        System.out.println();

        System.out.println("Expected Confirmation message: " + expectedone);
        System.out.println("Actual Confirmation message: " + actualonehost);
        System.out.println();


        Assert.assertEquals(actualonehost, expectedone);

    }


}
