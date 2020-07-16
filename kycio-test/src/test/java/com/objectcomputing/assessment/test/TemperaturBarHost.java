package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class TemperaturBarHost {

    public void verifyTemBarHost(WebDriver driver) {

        WebElement checkselect = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[1]/span"));
        checkselect.getText();
        System.out.println("The current selected item on the Hosting page is : " + checkselect.getText());

        if (checkselect.getText().equals("100%")) {


            WebElement width1 = driver.findElement(By.xpath("//div[@class='current-state']//div[1]/div/div[2]"));

            int imagewidth1 = width1.getSize().getWidth();

            int expectedwidth1 = 798;

            System.out.println();
            System.out.println("*******  Verifying \"Cost/Maintainability\" State on the Hosting page  ******");
            System.out.println();

            System.out.println("Expected:- Current State of \"Cost/Maintainability\" is: " + expectedwidth1);
            System.out.println("Actual:- Current State of \"Cost/Maintainability\" is: " + imagewidth1);
            System.out.println();

            Assert.assertEquals(imagewidth1, expectedwidth1);


            WebElement width2 = driver.findElement(By.xpath("//div[@class='current-state']//div[2]/div/div[2]"));


            int imagewidth2 = width2.getSize().getWidth();


            int expectedwidth2 = 0;

            System.out.println();
            System.out.println("*******  Verifying \"Availability\" State on the Hosting page  ******");
            System.out.println();

            System.out.println("Expected:- Current State of \"Availability\" is: " + expectedwidth2);
            System.out.println("Actual:- Current State of \"Availability\" is: " + imagewidth2);
            System.out.println();


            Assert.assertEquals(imagewidth2, expectedwidth2);

            WebElement width3 = driver.findElement(By.xpath("//div[@class='current-state']//div[3]/div/div[2]"));


            int imagewidth3 = width3.getSize().getWidth();


            int expectedwidth3 = 478;

            System.out.println();
            System.out.println("*******  Verifying \"Security\" State on the Hosting page  ******");
            System.out.println();

            System.out.println("Expected:- Current State of \"Security\" is: " + expectedwidth3);
            System.out.println("Actual:- Current State of \"Security\" is: " + imagewidth3);
            System.out.println();


            Assert.assertEquals(imagewidth3, expectedwidth3);

            WebElement width4 = driver.findElement(By.xpath("//div[@class='current-state']//div[4]/div/div[2]"));

            int imagewidth4 = width4.getSize().getWidth();


            int expectedwidth4 = 159;

            System.out.println();
            System.out.println("*******  Verifying \"Innovation/Time to Market\" State on the Hosting page  ******");
            System.out.println();

            System.out.println("Expected:- Current State of \"Innovation/Time to Market\" is: " + expectedwidth4);
            System.out.println("Actual:- Current State of \"Innovation/Time to Market\" is: " + imagewidth4);
            System.out.println();


            Assert.assertEquals(imagewidth4, expectedwidth4);

        }

    }

}
