package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OverloadingSelection {

    ///*************************************************************************************************///
    ///***                HOSTING PAGE   Select 100% from the FIRST Drop down                         ***///
    ///*************************************************************************************************///

    public void hostingChoice(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
        TimeUnit.SECONDS.sleep(1);

        // Iterate through the "Bootstrap Drop down" list and select item based on the choice

        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

        for (WebElement fs : myElements) {
            if (fs.getText().matches("100%")) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }

    }

    ///*************************************************************************************************///
    ///***                ENGINEERING PAGE   Select 100 % from the SECOND Drop down                  ***///
    ///*************************************************************************************************///
    public void engChoice(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div")).click();


        TimeUnit.SECONDS.sleep(1);

        // Iterate through the "Bootstrap Drop down" list and select item based on the choice

        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

        for (WebElement fs : myElements) {
            if (fs.getText().matches("100%")) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }
    }

    ///*************************************************************************************************///
    ///***                SOURCING PAGE   Select 100 % from the THIRD Drop down                      ***///
    ///*************************************************************************************************///

    public void srcChoice(WebDriver driver) throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[3]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);


        List<WebElement> secondElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

        for (WebElement ss : secondElement) {
            if (ss.getText().matches("100%")) {
                System.out.println(ss.getText());
                ss.click();
                break;
            }
        }
        System.out.println();

    }
}
