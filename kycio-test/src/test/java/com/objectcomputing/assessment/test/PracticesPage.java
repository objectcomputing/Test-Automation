package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PracticesPage {

    ///*************************************************************************************************///
    ///***                SOURCING PAGE   Select 10% from the FIRST Drop down                        ***///
    ///*************************************************************************************************///

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
}

