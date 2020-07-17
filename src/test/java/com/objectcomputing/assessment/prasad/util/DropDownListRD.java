package com.objectcomputing.assessment.prasad.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class DropDownListRD {

    String check;
    private WebDriver driver;

    public void DropDownList(WebDriver driverObject) {
        this.driver = driverObject;
    }


    public void selectDropDown(String[] value) throws InterruptedException {

        //	ArrayList<String> sellist = test();
        for (int i = 0; i < value.length; i++) {
            // loop for select options(5 drop down) {
            //	for (int j = 0; j < 6; j++) {

            String dropdown = "//*[@id='app']/div/div[1]/div[1]/div[2]/div[" + (i + 1) + "]/div[1]/div";
            driver.findElement(By.xpath("//*[@id='app']/div/div[1]/div[1]/div[2]/div[1]/div[1]/div")).click();

            //	driver.findElement(By.xpath(dropdown)).click();
            TimeUnit.SECONDS.sleep(2);
            for (String val : value) {

                List<WebElement> thirdElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

                for (WebElement ts : thirdElements) {
                    //if (ts.getText().matches(value.get(i))) {
                    if (ts.getText().matches(val)) {

                        check = ts.getText();
                        ts.click();
                        break;
                    }
                }

            }

            System.out.println("printing value of :" + check);

        }
    }


    private ArrayList<String> test() {
        // TODO Auto-generated method stub
        return null;
    }
}


/// *********************************************************************************************************///
/// *** Select One values from the Drop down ***///
/// *********************************************************************************************************///

//	public DropDownList(WebDriver driver) {
//		this.driver = driver2;
// TODO Auto-generated constructor stub
//	}
/*
		public void selectDropDown(String[] value) // {//, String value2, String value3, String value4, String value5)
				throws InterruptedException {

			driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
			TimeUnit.SECONDS.sleep(1);

			//adding for loop
			for(String val: value) {//ramesh
			List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
			for (WebElement fs : myElements) {
				if (fs.getText().matches(val)) {
					System.out.println(fs.getText());
					fs.click();
					break;
				}
			}
			
			}
				
		} */
		
		

			
	