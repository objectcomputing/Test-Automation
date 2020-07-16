package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RandomCal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        String percentage = list[2] + "%";
        System.out.println(percentage);

        int randomValue = (int) (Math.random() * 10);
        int listSelection = list[randomValue];


        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("https://assessment.objectcomputing.com/");
        driver.manage().window().maximize();
        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

        for (WebElement fs : myElements) {
            if (fs.getText().matches(percentage)) {
                System.out.println(fs.getText());
                fs.click();
                break;
            }
        }
    }
}

