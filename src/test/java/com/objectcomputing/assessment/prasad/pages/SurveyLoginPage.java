package com.objectcomputing.assessment.prasad.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SurveyLoginPage {


    public void surveyLogin(WebDriver driver) throws InterruptedException {

        //*************************************************************************************************///
        ///***    Enter All the valid values and on the Log in Page and successfully completes the login ***///
        ///*************************************************************************************************///


        WebElement enteremail = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[1]/input"));
        enteremail.sendKeys("goodtest@yahoo.com");

        WebElement entername = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[2]/input"));
        entername.sendKeys("Prasad");

        WebElement entercompanyname = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[3]/input"));
        entercompanyname.sendKeys("Tesla");

        TimeUnit.SECONDS.sleep(2);

        driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[4]/button")).click();
        ;

        TimeUnit.SECONDS.sleep(3);


    }

}
