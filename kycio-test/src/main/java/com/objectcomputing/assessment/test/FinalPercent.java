package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FinalPercent {

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
        driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();

//			TimeUnit.SECONDS.sleep(1);

        //	List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

//			for(String i : sellist) {
//				   for(WebElement fs:myElements) {
//				        if(fs.getText().matches(i)) {
//							check = fs.getText();
//				        	fs.click();
//				                break;			            
//				      }
        //
//				    }
//				   
//				   System.out.println(check);

        for (int i = 0; i < sellist.size(); i++) {
            //	List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

            //loop for select options(5 drop down) {
            for (int j = 0; j < 5; j++) {

                // First Drop down selection


                List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

                for (WebElement fs : myElements) {
                    if (fs.getText().matches(sellist.get(i))) {
                        check = fs.getText();
                        fs.click();
                        //   break;
                    }

                }

                List<WebElement> secondElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

                for (WebElement ss : secondElements) {
                    if (ss.getText().matches(sellist.get(i))) {
                        check = ss.getText();
                        ss.click();
                        break;
                    }

                }

            }
        }

        System.out.println("printing value of :" + check);

    }


    public void inspectFirstChoiceSourcSel(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();

        TimeUnit.SECONDS.sleep(1);

        // Iterate through the "Bootstrap Drop down" list and select item based on the choice


        List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));


        for (WebElement fs : myElements) {
            if (fs.getText().matches("100%")) {
                check = fs.getText();
                fs.click();
                break;
            }

        }

        System.out.println(check);

    }

}