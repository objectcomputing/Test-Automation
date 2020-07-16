package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DialougeVerify {

    public void verifyDialougeEng(WebDriver driver) throws InterruptedException {

        String actualmessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog")).getText();

        String expectedmessage = "Percentages must add to 100.";

        System.out.println();
        System.out.println("*******  Verifying \" Less than 100 % \" Validation on ENGINEERING page.  ******");
        System.out.println();

        System.out.println("Expected Confirmation message: " + expectedmessage);
        System.out.println("Actual Confirmation message:   " + actualmessage);
        System.out.println();


        Assert.assertEquals(actualmessage, expectedmessage);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog/form/input")).click();
        TimeUnit.SECONDS.sleep(2);
    }

    public void verifyDialougeSourc(WebDriver driver) throws InterruptedException {


        String actualmessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog")).getText();

        String expectedmessage = "Percentages must add to 100.";

        System.out.println();
        System.out.println("*******  Verifying \" Less than 100 % \" Validation on SOURCING page.  ******");
        System.out.println();

        System.out.println("Expected Confirmation message: " + expectedmessage);
        System.out.println("Actual Confirmation message:   " + actualmessage);
        System.out.println();


        Assert.assertEquals(actualmessage, expectedmessage);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog/form/input")).click();
        TimeUnit.SECONDS.sleep(2);

    }

    public void verifyDialougeHost(WebDriver driver) throws InterruptedException {
        String actualmessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog")).getText();

        String expectedmessage = "Percentages must add to 100.";

        System.out.println();
        System.out.println("*******  Verifying \" Less than 100 % \" Validation on Engineering page.  ******");
        System.out.println();


        System.out.println("Expected Confirmation message: " + expectedmessage);
        System.out.println("Actual Confirmation message:   " + actualmessage);
        System.out.println();


        Assert.assertEquals(actualmessage, expectedmessage);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog/form/input")).click();
        TimeUnit.SECONDS.sleep(2);
    }


}
