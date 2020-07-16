package com.objectcomputing.assessment.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FinalPercentOne {

    String check;

    ///*************************************************************************************************///
    ///***                Dynamic Percent Selection                                                  ***///
    ///*************************************************************************************************///


    public ArrayList<String> test() {
        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        ArrayList<String> selectedList = new ArrayList<String>();
        int result = 0;
        do {
            if (result < 100) {
                int random = (int) (Math.random() * 10);
                if ((result + list[random]) <= 100) {
                    selectedList.add(list[random] + "%");
                    System.out.println("Intermediate list" + selectedList);
                    result += list[random];
                    System.out.println("result = " + result);
                }
            }

        } while (result < 100);
        System.out.println("Final selected List is as shown below");
        return selectedList;
    }

    public void operation(WebDriver driver) throws InterruptedException {
        ArrayList<String> sellist = test();
        //	driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();


        for (int i = 0; i < sellist.size(); i++) {
            //	 driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();

            //loop for select options(5 drop down) {
            //	for ( int j = 0; j <5; j++) {   //  I WAS HERE

            // First Drop down selection

            //	for ( int j = 0; j <5; j++) {

            driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();

            List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));


            for (WebElement fs : myElements) {
                if (fs.getText().matches(sellist.get(i))) {
                    check = fs.getText();
                    fs.click();
                    System.out.println("A1");

                    break;
                }
                System.out.println("A2");
            }
            driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();

            List<WebElement> secondElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

            for (WebElement ss : secondElements) {
                if (ss.getText().matches(sellist.get(i))) {
                    check = ss.getText();
                    ss.click();
                    System.out.println("B1");
                    break;
                }
                System.out.println("B2");

            }

            driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();

            List<WebElement> thirdElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

            for (WebElement ts : thirdElements) {
                if (ts.getText().matches(sellist.get(i))) {
                    check = ts.getText();
                    System.out.println("C1");

                    ts.click();
                    break;
                }
                System.out.println("C2");

            }


            driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();

            List<WebElement> fourElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

            for (WebElement fs : fourElements) {
                if (fs.getText().matches(sellist.get(i))) {
                    check = fs.getText();
                    fs.click();
                    break;
                }
                System.out.println("D");

            }

            driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();

            List<WebElement> fifthElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

            for (WebElement ffts : fifthElements) {
                if (ffts.getText().matches(sellist.get(i))) {
                    check = ffts.getText();
                    ffts.click();
                    break;
                }
                System.out.println("E");

            }

        }

        System.out.println("printing value of :" + check);

    }
}
//}


