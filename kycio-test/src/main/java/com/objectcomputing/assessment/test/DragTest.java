package com.objectcomputing.assessment.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragTest {

    ///*************************************************************************************************///
    ///***                                 FINAL PAGE  drag Goals                                    ***///
    ///*************************************************************************************************///

    public void dragtTestGoalsHorizLoop(WebDriver driver) throws InterruptedException {

        ///***                                 Drag the "Cost / Maintainability"                         ***///

        TimeUnit.SECONDS.sleep(3);
        //float xfinalcord1 = (float) 1439.2;

        //org.openqa.selenium.Dimension wtest = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]")).getSize();

        //	System.out.println("Size of the button : "+ wtest);
        //	System.out.println("Width of the button with constant : "+ wtest.width);

        for (int i = 1; i < 6; i++) {

            org.openqa.selenium.Dimension wtest = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]")).getSize();


            String dragit = "//*[@id='app']/div/div[2]/div[" + (i) + " ]/div[4]";


            WebElement dragElementFrom1 = driver.findElement(By.xpath(dragit));
            org.openqa.selenium.Point point1 = dragElementFrom1.getLocation();


            float xcord1 = point1.getX();
            float xfinalcord1 = (float) wtest.width;
            float xmovecord1 = xfinalcord1 - xcord1;

            Actions actions1 = new Actions(driver);
            actions1.clickAndHold(dragElementFrom1).moveByOffset((int) xmovecord1, 0).release().perform();
            //dragElementFrom1.click();


            TimeUnit.SECONDS.sleep(3);

        }

    }
}
	
		
    
    
    

  
    
		
               	
		
		
	
	