package com.objectcomputing.assessment.test;

import org.openqa.selenium.*;
import org.testng.Assert;

public class FinalPageCurrentGoalLevel {

    ///*************************************************************************************************///
    ///***                                 FINAL PAGE IT Current Goals                               ***///
    ///*************************************************************************************************///

    public void verifyCurrentGoals(WebDriver driver) throws InterruptedException {

        //***                      	Cost and Maintainability Vertical Bar Position                       ***///

        WebElement g1 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]/div[4]"));

        int exxco1 = 807;
        int exyco1 = 170;

        // To  find and print the Top coordinates
        Point actlocation = g1.getLocation();
        //System.out.println(actlocation);

        int xco1 = actlocation.getX();
        int yco1 = actlocation.getY();

        // To  find and print the Top coordinates
        Dimension size1 = g1.getSize();
        //System.out.println(size1);


        //System.out.println(xco1);
        //System.out.println(yco1);


        Assert.assertEquals(xco1, exxco1);
        Assert.assertEquals(yco1, exyco1);

        System.out.println();
        System.out.println("********  Base on the quick assessment of your IT maturity, this is the current Position       ************");
        System.out.println("Current\"Cost & Maintainability assessment\"goal Expected\\Actual XY-Cord are: " + exxco1 + ":" + xco1 + " " + +exyco1 + ":" + yco1);
        //System.out.println("\"Cost & Maintainability assessment \"Expected and Actual Y-Cord are : " + exyco1+  ":" + yco1);
        System.out.println();

        //***                      	      Functional Range / Future Proof                                   ***///

        WebElement g2 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[2]/div[4]"));

        int exxco2 = 1176;
        int exyco2 = 230;

        Point actlocation2 = g2.getLocation();
        //System.out.println(actlocation2);

        int xco2 = actlocation2.getX();
        int yco2 = actlocation2.getY();

        Dimension size2 = g2.getSize();
        //System.out.println(size2);

        Assert.assertEquals(xco2, exxco2);
        Assert.assertEquals(yco2, exyco2);

        System.out.println("Current\"\"Functional Range / Future Proof\"goal Expected\\Actual XY-Cord are: " + exxco2 + ":" + xco2 + " " + +exyco2 + ":" + yco2);
        //System.out.println("\"Functional Range / Future Proof\" Expected and Actual X-Cord are : " + exxco2+  ":" + xco2);
        //System.out.println("\"Functional Range / Future Proof \"Expected and Actual Y-Cord are : " + exyco2+  ":" + yco2);
        System.out.println();


        //***                             Availability                                                      ***///

        WebElement g3 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[3]/div[4]"));

        int exxco3 = 859;
        int exyco3 = 290;

        Point actlocation3 = g3.getLocation();
        //System.out.println(actlocation3);

        int xco3 = actlocation3.getX();
        int yco3 = actlocation3.getY();

        Dimension size3 = g3.getSize();
        //System.out.println(size3);

        Assert.assertEquals(xco3, exxco3);
        Assert.assertEquals(yco3, exyco3);

        System.out.println("Current\"Availability\"goal Expected\\Actual XY-Cord are: " + exxco3 + ":" + xco3 + " " + +exyco3 + ":" + yco3);
        //System.out.println("\"Availability\" Expected and Actual X-Cord are : " + exxco3+  ":" + xco3);
        //System.out.println("\"Availability\" Expected and Actual Y-Cord are : " + exyco3+  ":" + yco3);
        System.out.println();


        //***                      	      Security                                                          ***///

        WebElement g4 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[4]/div[4]"));

        int exxco4 = 971;
        int exyco4 = 350;

        Point actlocation4 = g4.getLocation();
        //System.out.println(actlocation4);

        int xco4 = actlocation4.getX();
        int yco4 = actlocation4.getY();

        Dimension size4 = g4.getSize();
        //System.out.println(size4);

        Assert.assertEquals(xco4, exxco4);
        Assert.assertEquals(yco4, exyco4);

        System.out.println("Current\"Security\"goal Expected\\Actual XY-Cord are: " + exxco4 + ":" + xco4 + " " + +exyco4 + ":" + yco4);
        //System.out.println("\"Security\" Expected and Actual X-Cord are : " + exxco4+  ":" + xco4);
        //System.out.println("\"Security\" Expected and Actual Y-Cord are : " + exyco4+  ":" + yco4);
        System.out.println();


        //***                      	      Innovation / Time-to-Market                                       ***///
        WebElement g5 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[5]/div[4]"));

        int exxco5 = 907;
        int exyco5 = 410;

        Point actlocation5 = g5.getLocation();
        //System.out.println(actlocation5);

        int xco5 = actlocation5.getX();
        int yco5 = actlocation5.getY();

        Dimension size5 = g5.getSize();
        //System.out.println(size5);

        Assert.assertEquals(xco5, exxco5);
        Assert.assertEquals(yco5, exyco5);

        System.out.println("Current\"Innovation / Time-to-Market\"goal Expected\\Actual XY-Cord are: " + exxco5 + ":" + xco5 + " " + +exyco5 + ":" + yco5);
        System.out.println("\"Innovation / Time-to-Market\" Expected and Actual X-Cord are : " + exxco5 + ":" + xco5);
        //System.out.println("\"Security\" Expected and Actual Y-Cord are : " + exyco5+  ":" + yco5);
        System.out.println();


    }

}


