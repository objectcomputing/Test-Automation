package com.objectcomputing.assessment.prasad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IeCio {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub

        // Create drive object for the InternetExplorer Browser
        // class name =  InternetExplorer

        System.setProperty("webdriver.ie.driver", "C:\\Users\\malamelp\\IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();

        TimeUnit.SECONDS.sleep(2);


        driver.get("https://assessment.objectcomputing.com/");
        //driver.get("https://google.com/");

        //TimeUnit.SECONDS.sleep(5);
        driver.quit();


    }

}
