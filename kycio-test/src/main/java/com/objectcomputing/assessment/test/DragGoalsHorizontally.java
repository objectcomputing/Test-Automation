package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragGoalsHorizontally {

    ///*************************************************************************************************///
    ///***                                 FINAL PAGE  drag Goals                                    ***///
    ///*************************************************************************************************///

    public void dragGoalsHorizontally(WebDriver driver) throws InterruptedException {

        ///***                                 Drag the "Cost / Maintainability"                         ***///


        TimeUnit.SECONDS.sleep(3);

        WebElement dragElementFrom1 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom1, (int) 631.593, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        //WebElement dragElementFrom1 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[4]"));
        //Actions action1 = new Actions(driver);
        //action1.dragAndDropBy(dragElementFrom1, (int) 631.593, 0).build().perform();

        TimeUnit.SECONDS.sleep(3);


        ///***                                 Drag the "Functional Range / Future Proof"                 ***///


        WebElement dragElementFrom2 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom2, (int) 262.56, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        ///***                                 Drag the "Availability"                                    ***///


        WebElement dragElementFrom3 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[3]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom3, (int) 579.678, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        ///***                                 Drag the "Security"                                       ***///


        WebElement dragElementFrom4 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[4]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom4, (int) 468.021, 0).build().perform();
        //new Actions(driver).dragAndDropBy(dragElementFrom4, (int) 468.021, 0).build().perform();

        TimeUnit.SECONDS.sleep(3);

        ///***                                 Drag the "Innovation / Time-to-Market"                    ***///

        WebElement dragElementFrom5 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[5]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom5, (int) 532.157, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

    }
}
		
	
	
	
	/*
	 * 	for(int i=1; i<6; i++) {
				
			//	org.openqa.selenium.Dimension wtest = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]")).getSize();	

				org.openqa.selenium.Dimension wtest = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]")).getSize();	
			
				String  dragit = "//*[@id='app']/div/div[2]/div["+ (i) +" ]/div[4]";
			
							
				WebElement dragElementFrom1 = driver.findElement(By.xpath(dragit));
				org.openqa.selenium.Point point1 = dragElementFrom1.getLocation();


				float xcord1 = point1.getX();
				float xfinalcord1 = (float) 1438.5;
				float xmovecord1 = xfinalcord1-xcord1;
				
				System.out.println("Current xcord :" + xcord1);
				System.out.println("distance moved :" + xmovecord1);
					 	
				//Actions actions1 = new  Actions(driver);
				//actions1.clickAndHold(dragElementFrom1).moveByOffset((int) xmovecord1, 0).perform();
				new Actions(driver).dragAndDropBy(dragElementFrom1, (int) xcord1, 0).build().perform();

				//dragElementFrom1.click();
				
			    
				TimeUnit.SECONDS.sleep(3);  
			
			                }	
	 */





