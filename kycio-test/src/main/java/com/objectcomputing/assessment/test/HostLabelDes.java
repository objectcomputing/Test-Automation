package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HostLabelDes {

    ///*************************************************************************************************///
    ///***                         Verifying the Drop down Labels Descriptions"                      ***///
    ///*************************************************************************************************///

    public void hostLabelDescription(WebDriver driver) {


        //*****************************  Verifying  Labels Description ONE *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).click();
        String actdesone = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/div")).getText();


        String expectedDesone = "A cloud-computing execution model in which the cloud provider runs the server,"
                + " and dynamically manages the allocation of machine resources. Pricing is based on the actual"
                + " amount of resources consumed by an application, rather than on pre-purchased units of capacity.";

        System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description One here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesone);
        System.out.println("Actual Confirmation message: " + actdesone);
        System.out.println();

        Assert.assertEquals(actdesone, expectedDesone);

        //*****************************  Verifying  Labels Description TWO *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).click();

        String actdestwo = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/div")).getText();


        String expectedDestwo = "An optimized form of IaaS that takes advantage of service usage patterns to reduce"
                + " the total amount of infrastructure necessary for an enterprise or product.";

        System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description Two here  ******");

        System.out.println("Expected Confirmation message: " + expectedDestwo);
        System.out.println("Actual Confirmation message: " + actdestwo);
        System.out.println();

        Assert.assertEquals(actdestwo, expectedDestwo);

        //*****************************  Verifying  Labels Description THREE *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).click();

        String actdesthree = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/div")).getText();

        String expectedDesthree = "Infrastructure-as-a-Service: IT infrastructure dedicated for your use is arranged through"
                + " an internet service provider for computing, location, data partitioning, scaling, security, and backup services.";

        System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description Three here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesthree);
        System.out.println("Actual Confirmation message: " + actdesthree);
        System.out.println();

        Assert.assertEquals(actdesthree, expectedDesthree);

        //*****************************  Verifying  Labels Description FOUR   *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).click();

        String actdesfour = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/div")).getText();

        String expectedDesfour = "IT infrastructure is provisioned on premises controlled by your company. Effort is made"
                + " to identify economies of scale and cost-saving synergies between departments and projects.";

        System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description Four here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesfour);
        System.out.println("Actual Confirmation message: " + actdesfour);
        System.out.println();

        Assert.assertEquals(actdesfour, expectedDesfour);


        //*****************************  Verifying  Labels Description FIVE      *********************************///

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();

        String actdesfive = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/div")).getText();

        String expectedDesfive = "IT infrastructure is provisioned on premises controlled by your company."
                + " The departments requesting IT infrastructure are allocated dedicated infrastructure based"
                + " on their request, with little effort made to identify economies of scale or cost-saving synergies.";

        System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description Five here  ******");

        System.out.println("Expected Confirmation message: " + expectedDesfive);
        System.out.println("Actual Confirmation message: " + actdesfive);
        System.out.println();

        Assert.assertEquals(actdesfive, expectedDesfive);


        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();


    }

}


