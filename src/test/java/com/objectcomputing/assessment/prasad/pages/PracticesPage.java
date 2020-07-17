package com.objectcomputing.assessment.prasad.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class PracticesPage {

    public void valPracticesHeader(WebDriver driver) {


        String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

        String expectedone = "Practices";

        System.out.println();
        System.out.println("*******  Verifying \"Practices\" page header here  ******");
        System.out.println();

        System.out.println("Expected Confirmation message: " + expectedone);
        System.out.println("Actual Confirmation message: " + actualonehost);
        System.out.println();

        Assert.assertEquals(actualonehost, expectedone);

    }

    public void selectPractPageItems(WebDriver driver) throws InterruptedException {

        ///***             Do your developers expose your business services through APIs?                ***///
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/input")).click();
        ;
        TimeUnit.SECONDS.sleep(1);

        ///***                                         REST?                                             ***///
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/input")).click();
        ;
        TimeUnit.SECONDS.sleep(1);

        ///***                                        SOAP?                                              ***///
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/input")).click();
        ;
        TimeUnit.SECONDS.sleep(1);

        ///***                     If you support APIs, do you publish a catalog of them?                ***///                                             ***///
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[6]/input")).click();
        ;
        TimeUnit.SECONDS.sleep(1);

        ///***    Are you able to host alternative approaches to solutions in production (experiments)?  ***///                                             ***///
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[8]/input")).click();
        ;
        TimeUnit.SECONDS.sleep(1);

    }

    public void verifyTemBarPractice(WebDriver driver) {

        WebElement width1 = driver.findElement(By.xpath("//div[@class='current-state']//div[1]/div/div[2]"));

        String expval1 = "width: 77.2444%;";

        System.out.println();
        System.out.println("        *******     Current State values are     *******");
        System.out.println();
        System.out.println("Expected:- Current State of \"Cost/Maintainability\" is          ==>: " + expval1);

        Assert.assertEquals(width1.getAttribute("style"), expval1);

        WebElement width2 = driver.findElement(By.xpath("//div[@class='current-state']//div[2]/div/div[2]"));

        String expval2 = "width: 41.8072%;";
        System.out.println("Expected:- Current State of \"Functional Range/Future Proof\" is ==>: " + expval2);
        Assert.assertEquals(width2.getAttribute("style"), expval2);

        WebElement width3 = driver.findElement(By.xpath("//div[@class='current-state']//div[3]/div/div[2]"));

        String expval3 = "width: 71.3771%;";
        System.out.println("Expected:- Current State of \"Availability\" is                  ==>: " + expval3);
        Assert.assertEquals(width3.getAttribute("style"), expval3);

        WebElement width4 = driver.findElement(By.xpath("//div[@class='current-state']//div[4]/div/div[2]"));

        String expval4 = "width: 58.6955%;";

        System.out.println("Expected:- Current State of \"Security\" is                      ==>: " + expval4);
        Assert.assertEquals(width4.getAttribute("style"), expval4);

        WebElement width5 = driver.findElement(By.xpath("//div[@class='current-state']//div[5]/div/div[2]"));

        String expval5 = "width: 58.8771%;";

        System.out.println("Expected:- Current State of \"Innovation/Time to Market\" is     ==>: " + expval5);
        System.out.println();

        Assert.assertEquals(width5.getAttribute("style"), expval5);

    }
}
