package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EmailVerification {


    public boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public String checkSingleCharEmail(WebDriver driver, String email) throws InterruptedException {

        //*************************************************************************************************///
        ///***    Enter a single character in All the valid values and on the Log in Page and successfully completes the login ***///
        ///*************************************************************************************************///


        WebElement enteremail = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[1]/input"));
        enteremail.sendKeys("gg@g.com");
        String getemail = enteremail.getText();
        System.out.println("The E-mail ID is: " + getemail);

        WebElement entername = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[2]/input"));
        entername.sendKeys("Prasad");

        WebElement entercompanyname = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[3]/input"));
        entercompanyname.sendKeys("Tesla");

        TimeUnit.SECONDS.sleep(2);

        driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[4]/button")).click();
        ;
        //String alertMessage = driver.switchTo().alert().getText();


        TimeUnit.SECONDS.sleep(3);

        return getemail;


    }
}


