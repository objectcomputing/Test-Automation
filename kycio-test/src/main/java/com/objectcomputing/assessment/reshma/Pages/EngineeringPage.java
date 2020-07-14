/**
 *
 */
package com.objectcomputing.assessment.reshma.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author tajr
 *
 * This class will store all the locators and methods of login page.
 *
 */
public class EngineeringPage {

    WebDriver driver;
    @FindBy(xpath = "//body//div[@id='app']//div//div//div//div[1]//div[1]//div[1]//div[2]")
    WebElement contributingToOpenSource;
    @FindBy(xpath = "//body//div[@id='app']//div//div//div//div//div[2]//div[1]//div[2]")
    WebElement leveragingOpenSource;
    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]")
    WebElement reused;
    @FindBy(xpath = "//div[4]//div[1]//div[1]//div[2]")
    WebElement reusable;
    @FindBy(xpath = "//body/div[@id='app']/div/div/div/div/div[5]/div[1]/div[1]/div[1]")
    WebElement custom;
    @FindBy(xpath = "//ul[@class='vs__dropdown-menu']//li")
    List<WebElement> selectValue;
    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement EngineeringPageNextButton;

    public EngineeringPage(WebDriver ldriver) {
        this.driver = ldriver;
    }

    public void selectValuesInEngineeringPage(String contributingToOpenSourceValue, String leveragingOpenSourceValue, String reusedValue, String reusableValue, String customValue) throws InterruptedException {
        contributingToOpenSource.click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> dd_menu = selectValue;

        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(contributingToOpenSourceValue)) {
                element.click();
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        leveragingOpenSource.click();

        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(leveragingOpenSourceValue)) {
                element.click();
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        reused.click();
        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(reusedValue)) {
                element.click();
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }

        reusable.click();
        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(reusableValue)) {
                element.click();
                Thread.sleep(5000);
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        custom.click();

        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(customValue)) {
                element.click();
                Thread.sleep(5000);
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        EngineeringPageNextButton.click();
        Thread.sleep(5000);
    }


}



