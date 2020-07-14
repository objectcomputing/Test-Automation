package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GettingThere {

    ///*************************************************************************************************///
    ///***              Verifying the  Getting There label and its Description.                      ***///
    ///*************************************************************************************************///

    public void verifyGettingThere(WebDriver driver) {

        //*****************************  Verifying  Labels Description ONE *********************************///

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/header[1]")).getText();
        String actdesone = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]")).getText();


        String expectedDesone = "To get to where you want to be, we recommend advancing your Hosting"
                + " from PaaS to Serverless and your Practices from Catalog to Experiments.";

        System.out.println("*******  Verifying \"Getting There label and Description\" on Final Page    ******");

        System.out.println("Expected Confirmation message: " + expectedDesone);
        System.out.println("Actual Confirmation message: " + actdesone);
        System.out.println();

        Assert.assertEquals(actdesone, expectedDesone);

    }

}
