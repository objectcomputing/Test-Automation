package com.objectcomputing.assessment.test;


//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.testng.Assert;

public class FinalPageItMaturity {

    ///*************************************************************************************************///
    ///***                                 FINAL PAGE IT Maturity                                    ***///
    ///*************************************************************************************************///

    public void suggestItMaturity(WebDriver driver) throws InterruptedException {

        //***                      	Cost and Maintainability Vertical Bar Position                       ***///

        WebElement e1 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]/div[3]"));

        int exxco1 = 824;
        int exyco1 = 165;

        // To  find and print the Top coordinates
        Point actlocation = e1.getLocation();
        //System.out.println(actlocation);

        int xco1 = actlocation.getX();
        int yco1 = actlocation.getY();

        // To  find and print the Top coordinates
        Dimension size1 = e1.getSize();
        //System.out.println(size1);


        //System.out.println(xco1);
        //System.out.println(yco1);


        Assert.assertEquals(xco1, exxco1);
        Assert.assertEquals(yco1, exyco1);

        System.out.println();
        System.out.println("\"Cost & Maintainability assessment\" Expected and Actual X-Cord are : " + exxco1 + ":" + xco1);
        System.out.println("\"Cost & Maintainability assessment \"Expected and Actual Y-Cord are : " + exyco1 + ":" + yco1);
        System.out.println();

        //***                      	      Functional Range / Future Proof                                   ***///

        WebElement e2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]"));

        int exxco2 = 1193;
        int exyco2 = 225;

        Point actlocation2 = e2.getLocation();
        //System.out.println(actlocation2);

        int xco2 = actlocation2.getX();
        int yco2 = actlocation2.getY();

        Dimension size2 = e2.getSize();
        //System.out.println(size2);

        Assert.assertEquals(xco2, exxco2);
        Assert.assertEquals(yco2, exyco2);

        System.out.println("\"Functional Range / Future Proof\" Expected and Actual X-Cord are : " + exxco2 + ":" + xco2);
        System.out.println("\"Functional Range / Future Proof \"Expected and Actual Y-Cord are : " + exyco2 + ":" + yco2);
        System.out.println();


        //***                             Availability                                                      ***///

        WebElement e3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div[3]"));

        int exxco3 = 876;
        int exyco3 = 285;

        Point actlocation3 = e3.getLocation();
        //System.out.println(actlocation3);

        int xco3 = actlocation3.getX();
        int yco3 = actlocation3.getY();

        Dimension size3 = e3.getSize();
        //System.out.println(size3);

        Assert.assertEquals(xco3, exxco3);
        Assert.assertEquals(yco3, exyco3);

        System.out.println("\"Availability\" Expected and Actual X-Cord are : " + exxco3 + ":" + xco3);
        System.out.println("\"Availability\" Expected and Actual Y-Cord are : " + exyco3 + ":" + yco3);
        System.out.println();


        //***                      	      Security                                                          ***///

        WebElement e4 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div[3]"));

        int exxco4 = 988;
        int exyco4 = 345;

        Point actlocation4 = e4.getLocation();
        //System.out.println(actlocation4);

        int xco4 = actlocation4.getX();
        int yco4 = actlocation4.getY();

        Dimension size4 = e4.getSize();
        //System.out.println(size4);

        Assert.assertEquals(xco4, exxco4);
        Assert.assertEquals(yco4, exyco4);

        System.out.println("\"Security\" Expected and Actual X-Cord are : " + exxco4 + ":" + xco4);
        System.out.println("\"Security\" Expected and Actual Y-Cord are : " + exyco4 + ":" + yco4);
        System.out.println();


        //***                      	      Innovation / Time-to-Market                                       ***///
        WebElement e5 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[3]"));

        int exxco5 = 924;
        int exyco5 = 405;

        Point actlocation5 = e5.getLocation();
        //System.out.println(actlocation5);

        int xco5 = actlocation5.getX();
        int yco5 = actlocation5.getY();

        Dimension size5 = e5.getSize();
        //System.out.println(size5);

        Assert.assertEquals(xco5, exxco5);
        Assert.assertEquals(yco5, exyco5);

        System.out.println("\"Innovation / Time-to-Market\" Expected and Actual X-Cord are : " + exxco5 + ":" + xco5);
        System.out.println("\"Innovation / Time-to-Market\" Expected and Actual Y-Cord are : " + exyco5 + ":" + yco5);
        System.out.println();


    }


}
	
	



