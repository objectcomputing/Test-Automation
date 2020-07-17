package com.objectcomputing.assessment.prasad.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CallClick {

    public void clickToNext(WebDriver driver) throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath(("//button[@class='next']"))).click();
        TimeUnit.SECONDS.sleep(3);
    }
}