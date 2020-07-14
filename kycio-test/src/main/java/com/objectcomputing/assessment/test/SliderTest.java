package com.objectcomputing.assessment.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SliderTest {

    ///*************************************************************************************************///
    ///***                                 FINAL PAGE  drag Goals                                    ***///
    ///*************************************************************************************************///

    public void dragtTestGoalsHorizontally(WebDriver driver) throws InterruptedException {


        org.openqa.selenium.Dimension wtest = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]")).getSize();
        WebElement dragElementFrom1 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[4]"));

        System.out.println("Size of the button : " + wtest);
        System.out.println("Width of the button with constant : " + wtest.width);

        org.openqa.selenium.Point point1 = dragElementFrom1.getLocation();
        double xcord1 = point1.getX();
        double ycord1 = point1.getY();

        double xfinalcord1 = 1440;
        //double xfinalcord1 = 1439.2;

        //double xfinalcord1 = 1439.9;

        double xmovecord1 = xfinalcord1 - xcord1;
        //int xmovecord1 = (int) (wtest.width -xcord1);


        System.out.println("This is the current xcord:" + xcord1);
        System.out.println(ycord1);
        System.out.println("This is the total difference between current position and Findl width:" + xmovecord1);

        Actions actions1 = new Actions(driver);
        actions1.clickAndHold(dragElementFrom1).moveByOffset((int) xmovecord1, 0).release().perform();
        dragElementFrom1.click();

        //new Actions(driver).dragAndDropBy(dragElementFrom1, (int) xmovecord1, 0).build().perform();

        //new Actions(driver).dragAndDropBy(dragElementFrom2, 264, 0).build().perform();
        //new Actions(driver).dragAndDropBy(dragElementFrom2, (int) 262.56, 0).build().perform(); - working line

        TimeUnit.SECONDS.sleep(3);


        ///***                                 Drag the "Functional Range / Future Proof"                 ***///


        WebElement dragElementFrom2 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[4]"));

        org.openqa.selenium.Point point2 = dragElementFrom2.getLocation();
        double xcord2 = point2.getX();
        double ycord2 = point2.getY();

        double xfinalcord2 = 1440;

        //double xfinalcord2 = 1439.2;
        double xmovecord2 = xfinalcord2 - xcord2;

        System.out.println(xcord2);
        System.out.println(ycord2);
        System.out.println(xmovecord2);

        System.out.println("This is the total difference between current position and Findl width:" + xmovecord2);

        Actions actions2 = new Actions(driver);
        actions2.clickAndHold(dragElementFrom2).moveByOffset((int) xmovecord2, 0).release().perform();
        dragElementFrom2.click();


        //new Actions(driver).dragAndDropBy(dragElementFrom2, (int) xmovecord2, 0).build().perform();

        //new Actions(driver).dragAndDropBy(dragElementFrom2, 264, 0).build().perform();
        //new Actions(driver).dragAndDropBy(dragElementFrom2, (int) 262.56, 0).build().perform(); - working line

        TimeUnit.SECONDS.sleep(3);


        ///***                                 Drag the "Availability"                                    ***///


        WebElement dragElementFrom3 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[3]/div[4]"));

        org.openqa.selenium.Point point3 = dragElementFrom3.getLocation();
        double xcord3 = point3.getX();
        double ycord3 = point3.getY();

        double xfinalcord3 = 1440;

        //double xfinalcord3 = 1439.2;
        //double xfinalcord3 = 1439.1;

        double xmovecord3 = xfinalcord3 - xcord3;

        System.out.println(xcord3);
        System.out.println(ycord3);
        System.out.println(xmovecord3);
        System.out.println("This is the total difference between current position and Findl width:" + xmovecord3);

        Actions actions3 = new Actions(driver);
        actions3.clickAndHold(dragElementFrom3).moveByOffset((int) xmovecord3, 0).release().perform();
        dragElementFrom3.click();


        //new Actions(driver).dragAndDropBy(dragElementFrom3, (int) xmovecord3, 0).build().perform();

        //new Actions(driver).dragAndDropBy(dragElementFrom3, (int) 579.678, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);


        ///***                                 Drag the "Security"                                       ***///


        WebElement dragElementFrom4 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[4]/div[4]"));

        org.openqa.selenium.Point point4 = dragElementFrom4.getLocation();
        double xcord4 = point4.getX();
        double ycord4 = point4.getY();

        //double xfinalcord4 = 1439.2;
        double xfinalcord4 = 1440;

        double xmovecord4 = xfinalcord4 - xcord4;

        System.out.println(xcord4);
        System.out.println(ycord4);
        System.out.println(xmovecord4);
        System.out.println("This is the total difference between current position and Findl width:" + xmovecord4);

        Actions actions4 = new Actions(driver);
        actions4.clickAndHold(dragElementFrom4).moveByOffset((int) xmovecord4, 0).release().perform();
        dragElementFrom4.click();


        //new Actions(driver).dragAndDropBy(dragElementFrom4, (int) xmovecord4, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);


        ///***                                 Drag the "Innovation / Time-to-Market"                    ***///


        WebElement dragElementFrom5 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[5]/div[4]"));

        org.openqa.selenium.Point point5 = dragElementFrom5.getLocation();
        //float xcord5 = point5.getX();
        //float ycord5 = point5.getY();

        double xcord5 = point5.getX();
        double ycord5 = point5.getY();

        double xfinalcord5 = 1440;

        //double xfinalcord5 = 1439.2;
        //double xfinalcord5 = 1438.6;

        double xmovecord5 = xfinalcord5 - xcord5;

        System.out.println(xcord5);
        System.out.println(ycord5);
        System.out.println(xmovecord5);
        System.out.println("This is the total difference between current position and Findl width:" + xmovecord5);

        Actions actions5 = new Actions(driver);
        actions5.clickAndHold(dragElementFrom5).moveByOffset((int) xmovecord5, 0).release().perform();
        dragElementFrom5.click();

        //new Actions(driver).dragAndDropBy(dragElementFrom5, (int) xmovecord5, 0).build().perform();

        //new Actions(driver).dragAndDropBy(dragElementFrom5, (int) 532.157, 0).build() .perform();

        TimeUnit.SECONDS.sleep(3);


    }

}