package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FindLogo {

    public void findLogo(WebDriver driver) {

        ///*************************************************************************************************///
        ///***                         Verifying the Page header as "Hosting"                            ***///
        ///*************************************************************************************************///


        String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

        String expectedone = "Hosting";

        System.out.println();
        System.out.println("*******  Verifying Page header here  ******");

        System.out.println("Expected Confirmation message: " + expectedone);
        System.out.println("Actual Confirmation message: " + actualonehost);
        System.out.println();


        Assert.assertEquals(actualonehost, expectedone);

    }

}
