package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FinaSlideTest {

    ///*************************************************************************************************///
    ///***                                 FINAL PAGE  drag Goals                                    ***///
    ///*************************************************************************************************///

    public void slideFinalTest(WebDriver driver) throws InterruptedException {

        ///***                                 Drag the "Cost / Maintainability"                         ***///

        TimeUnit.SECONDS.sleep(3);
        System.out.println("I reached here");

        WebElement dragElementFrom1 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[4]"));
        System.out.println("I reached here too");
        Actions actions1 = new Actions(driver);
        actions1.clickAndHold(dragElementFrom1).moveByOffset((int) 631.593, 0).release().build().perform();
        //dragElementFrom1.click();

        //new Actions(driver).dragAndDropBy(dragElementFrom1, (int) 631.593, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        //WebElement dragElementFrom1 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[4]"));
        //Actions action1 = new Actions(driver);
        //action1.dragAndDropBy(dragElementFrom1, (int) 631.593, 0).build().perform();


        ///***                                 Drag the "Functional Range / Future Proof"                 ***///
        System.out.println("hello");

        WebElement dragElementFrom2 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[4]"));
        System.out.println("hello there");

        Actions actions2 = new Actions(driver);
        actions2.clickAndHold(dragElementFrom2).moveByOffset((int) 262.56, 0).release().build().perform();
        //dragElementFrom2.click();

        //new Actions(driver).dragAndDropBy(dragElementFrom2, (int) 262.56, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        ///***                                 Drag the "Availability"                                    ***///

        WebElement dragElementFrom3 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[3]/div[4]"));

        Actions actions3 = new Actions(driver);
        actions3.clickAndHold(dragElementFrom3).moveByOffset((int) 579.678, 0).release().build().perform();
        //dragElementFrom3.click();

        //new Actions(driver).dragAndDropBy(dragElementFrom3, (int) 579.678, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        ///***                                 Drag the "Security"                                       ***///

        WebElement dragElementFrom4 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[4]/div[4]"));

        Actions actions4 = new Actions(driver);
        actions4.clickAndHold(dragElementFrom4).moveByOffset((int) 468.021, 0).release().release().build().perform();
        dragElementFrom4.click();
        //new Actions(driver).dragAndDropBy(dragElementFrom4, (int) 468.021, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        ///***                                 Drag the "Innovation / Time-to-Market"                    ***///

        WebElement dragElementFrom5 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[5]/div[4]"));
        Actions actions5 = new Actions(driver);

        actions5.clickAndHold(dragElementFrom5).moveByOffset((int) 532.157, 0).release().build().perform();
        dragElementFrom4.click();
        //new Actions(driver).dragAndDropBy(dragElementFrom5, (int) 532.157, 0).build() .perform();
        TimeUnit.SECONDS.sleep(3);

    }
}
    
  







