package com.objectcomputing.assessment.prasad.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropDownListFinal {

    String check;
    String[] sellist;
    private WebDriver driver;

    public void DropDownList(WebDriver driverObject) {
        this.driver = driverObject;
    }

    /// *********************************************************************************************************///
    /// *** Select One values from the Drop down ***///
    /// *********************************************************************************************************///

    /*
     * void method(String[] values) { // for(String i : values) { //
     * System.out.println(i); // }
     *
     * for(int i=0; i<values.length; i++) { System.out.println(values[i]); } }
     *
     * public static void main(String[] args) {
     *
     * String[] list1 = {"10", "60", "30"}; // String[] list2 = {"20", "60", "10",
     * "10"}; test t = new test(); t.method(list1); // t.method(list2);
     *
     *
     * } }
     */

    public void selectDropDownFinal(String[] value, WebDriver driver) throws InterruptedException {

        //	driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
        //	TimeUnit.SECONDS.sleep(1);

        for (String val : value) {
            List<WebElement> myElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
            for (WebElement fs : myElements) {
                if (fs.getText().matches(val)) {
                    System.out.println(fs.getText());
                    fs.click();
                    break;
                }
            }
        }
    }
}

//sellist = value;
//		for (int i = 0; i < value.length; i++) {
//		System.out.println(value[i]);
//		for (int j = 0; j < 6; j++) {

//			String dropdown = "//*[@id='app']/div/div[1]/div[1]/div[2]/div[" + (i + 1) + "]/div[1]/div";
//			System.out.println(dropdown);

//			driver.findElement(By.xpath(dropdown)).click();
//			TimeUnit.SECONDS.sleep(2);

//	driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();


//	List<WebElement> thirdElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
	/*			for (String val : value) {
					List<WebElement> thirdElements = driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));

					for (WebElement ts : thirdElements) {
					//	if (ts.getText().matches(val.get(i))) {
					if (ts.getText().matches(val)) {

							check = ts.getText();
							ts.click();
							break;
						}
					}
				}

			//	System.out.println(value[i]);

			}
		}



// System.out.println("I reached here");

// for (int j = 0; j < 6; j++) {
//System.out.println("I reached here too");
// String dropdown = "//*[@id='app']/div/div[1]/div[1]/div[2]/div[" + (i + 1) +
// "]/div[1]/div";

// driver.findElement(By.xpath(dropdown)).click();
/*
 * TimeUnit.SECONDS.sleep(2);
 * 
 * for(String val: value) {//ramesh
 * 
 * List<WebElement> thirdElements =
 * driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
 * 
 * for (WebElement ts : thirdElements) { // if
 * (ts.getText().matches(value.get(i))) { if (ts.getText().matches(val)) {
 * 
 * check = ts.getText(); ts.click(); break; } }
 * 
 * }
 * 
 * } } }
 * 
 * /*
 * driver.findElement(By.xpath("//div[@class='vs__dropdown-toggle']")).click();
 * TimeUnit.SECONDS.sleep(1);
 * 
 * //adding for loop for(String val: value.length) {//ramesh List<WebElement>
 * myElements =
 * driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
 * 
 * for (WebElement fs : myElements) {
 * 
 * if (fs.getText().matches(val)) { System.out.println(fs.getText());
 * fs.click(); break; } }
 * 
 * } //closing the for loop==> ramesh
 * 
 * }
 * 
 * 
 * private ArrayList<String> test() { // TODO Auto-generated method stub return
 * null; } }
 */

// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div")).click();

// List<WebElement> secondElement =
// driver.findElements(By.xpath(".//ul[@class='vs__dropdown-menu']/li"));
