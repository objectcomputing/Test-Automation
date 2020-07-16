package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EngineeringPageSelection {

    ///*************************************************************************************************///
    ///***                ENGINEERING PAGE   Select 10% from the FIRST Drop down                     ***///
    ///*************************************************************************************************///

    public void engFirstChoice(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();

        TimeUnit.SECONDS.sleep(1);

        // Iterate through the "Bootstrap Drop down" list and select item based on the choice

        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

        for (WebElement fs : myElements) {
            if (fs.getText().matches("50%")) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }

    }

    ///*************************************************************************************************///
    ///***                ENGINEERING PAGE   Select 40 % from the SECOND Drop down                   ***///
    ///*************************************************************************************************///


    public void engSecondChoice(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);


        List<WebElement> secondElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

        for (WebElement ss : secondElement) {
            if (ss.getText().matches("50%")) {
                System.out.println(ss.getText());
                ss.click();
                break;
            }
        }

    }


    ///*************************************************************************************************///
    ///***                ENGINEERING PAGE   Select 30 % from the THIRD Drop down                    ***///
    ///*************************************************************************************************///

    public void engThirdChoice(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[3]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);


        List<WebElement> thirdElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

        for (WebElement ts : thirdElement) {
            if (ts.getText().matches("30%")) {
                System.out.println(ts.getText());
                ts.click();
                break;
            }
        }
    }


    ///*************************************************************************************************///
    ///***                ENGINEERING PAGE   Select 10 % from the FOURTH Drop down                   ***///
    ///*************************************************************************************************///

    public void engFourthChoice(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);


        List<WebElement> fouthElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

        for (WebElement frs : fouthElement) {
            if (frs.getText().matches("10%")) {
                System.out.println(frs.getText());
                frs.click();
                break;
            }
        }
    }

    ///*************************************************************************************************///
    ///***                ENGINEERING PAGE   Select 10 % from the FIFTH Drop down                    ***///
    ///*************************************************************************************************///

    public void engFifthChoice(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[5]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);


        List<WebElement> fifthElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

        for (WebElement fts : fifthElement) {
            if (fts.getText().matches("0%")) {
                System.out.println(fts.getText());
                fts.click();
                break;
            }
        }
    }

}

