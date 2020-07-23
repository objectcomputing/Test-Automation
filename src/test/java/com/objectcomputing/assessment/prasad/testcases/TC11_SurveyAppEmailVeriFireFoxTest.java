package com.objectcomputing.assessment.prasad.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC11_SurveyAppEmailVeriFireFoxTest {

    public static boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
@Test
    public void SurveyAppEmailVeriFireFoxTest() throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\malamelp\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        ///*************************************************************************************************///
        ///***                     Launch the Survey Application URL                                     ***///
        ///*************************************************************************************************///

        driver.get("https://assessment.objectcomputing.com/");

        System.out.println();
		System.out.println("   *******    TESTCASE NAME : TC11_SurveyAppEmailVeriFireFoxTest  ******* ");
		System.out.println();

        String emailValidation[] = {"g g@g", "g@@a.com", "gg@a.", "gg@g g", "goodemail@gmail.com"};

        for (String tempEmail : emailValidation) {
            TimeUnit.SECONDS.sleep(2);

            WebElement enteremail = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[1]/input"));
            enteremail.sendKeys(tempEmail);
            TimeUnit.SECONDS.sleep(2);

            WebElement entername = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[2]/input"));
            entername.sendKeys("Prasad");

            WebElement entercompanyname = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[3]/input"));
            entercompanyname.sendKeys("Tesla");

            TimeUnit.SECONDS.sleep(2);

            driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[4]/button")).click();

            TC11_SurveyAppEmailVeriFireFoxTest.isValid(tempEmail);

            System.out.println("The E-mail ID is: " + tempEmail);

            System.out.println("Is the above E-mail ID valid? " + isValid(tempEmail));

            TimeUnit.SECONDS.sleep(2);

            // driver.navigate().refresh();

            if (isValid(tempEmail) == false) {

                WebElement emailClear1 = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[1]/input"));
                emailClear1.clear();

                WebElement emailClear2 = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[2]/input"));
                emailClear2.clear();

                WebElement emailClear3 = driver.findElement(By.xpath("//*[@id=\"app\"]/form/div[3]/input"));
                emailClear3.clear();

            }

        }
        TimeUnit.SECONDS.sleep(2);
        driver.quit();

    }


}
	

     


