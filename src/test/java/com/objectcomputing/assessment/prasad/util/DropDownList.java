package com.objectcomputing.assessment.prasad.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

//		public class HostingSelection extends SurveyResAndDev{

public class DropDownList {

    private WebDriver driver;

    // public DropDownList(WebDriver driverObject) {
    // this.driver = driverObject;
    // }

    /// *********************************************************************************************************///
    /// *** Select One values from the Drop down ***///
    /// *********************************************************************************************************///

    public DropDownList(WebDriver driver2) {
        this.driver = driver2;
        // TODO Auto-generated constructor stub
    }

    public void selectDropDown(String value1) throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement fs : myElements) {
            if (fs.getText().matches(value1)) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }

    }

    /// *********************************************************************************************************///
    /// *** Select Two values from the Drop down ***///
    /// *********************************************************************************************************///

    public void selectDropDown(String value1, String value2) throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
        TimeUnit.SECONDS.sleep(1);

        // Iterate through the "Bootstrap Drop down" list and select item based on the
        // choice
        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement fs : myElements) {
            if (fs.getText().matches(value1)) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> secondElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement ss : secondElement) {
            if (ss.getText().matches(value2)) {
                System.out.println(ss.getText());
                ss.click();
                break;
            }
        }

    }

    /// *********************************************************************************************************///
    /// *** Select Three values from the Drop down ***///
    /// *********************************************************************************************************///

    public void selectDropDown(String value1, String value2, String value3) throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement fs : myElements) {
            if (fs.getText().matches(value1)) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> secondElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement ss : secondElement) {
            if (ss.getText().matches(value2)) {
                System.out.println(ss.getText());
                ss.click();
                break;
            }
        }

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[3]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> thirdElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement ts : thirdElement) {
            if (ts.getText().matches(value3)) {
                System.out.println(ts.getText());
                ts.click();
                break;
            }
        }
    }

    /// *********************************************************************************************************///
    /// *** Select Four values from the Drop down ***///
    /// *********************************************************************************************************///

    public void selectDropDown(String value1, String value2, String value3, String value4) throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement fs : myElements) {
            if (fs.getText().matches(value1)) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> secondElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement ss : secondElement) {
            if (ss.getText().matches(value2)) {
                System.out.println(ss.getText());
                ss.click();
                break;
            }
        }

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[3]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> thirdElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement ts : thirdElement) {
            if (ts.getText().matches(value3)) {
                System.out.println(ts.getText());
                ts.click();
                break;
            }
        }

        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> fouthElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement frs : fouthElement) {
            if (frs.getText().matches(value4)) {
                System.out.println(frs.getText());
                frs.click();
                break;
            }
        }
    }

    /// *********************************************************************************************************///
    /// *** Select Five values from the Drop down ***///
    /// *********************************************************************************************************///

    public void selectDropDown(String value1, String value2, String value3, String value4, String value5)
            throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
        TimeUnit.SECONDS.sleep(1);


        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement fs : myElements) {
            if (fs.getText().matches(value1)) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }


        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> secondElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement ss : secondElement) {
            if (ss.getText().matches(value2)) {
                System.out.println(ss.getText());
                ss.click();
                break;
            }
        }


        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[3]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> thirdElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement ts : thirdElement) {
            if (ts.getText().matches(value3)) {
                System.out.println(ts.getText());
                ts.click();
                break;
            }
        }

        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> fouthElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement frs : fouthElement) {
            if (frs.getText().matches(value4)) {
                System.out.println(frs.getText());
                frs.click();
                break;
            }
        }

        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[5]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> fifthElement = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement frs : fifthElement) {
            if (frs.getText().matches(value5)) {
                System.out.println(frs.getText());
                frs.click();
                break;
            }
        }
    }

    public void selectDropDownTempBar(String tempValue) throws InterruptedException {
        String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

        if (actualonehost.matches("Hosting"))

            driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
        TimeUnit.SECONDS.sleep(1);

        if (actualonehost.matches("Engineering"))

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        if (actualonehost.matches("Sourcing"))

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[3]/div[1]/div")).click();
        TimeUnit.SECONDS.sleep(1);

        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
        for (WebElement fs : myElements) {
            if (fs.getText().matches(tempValue)) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }

    }

}
