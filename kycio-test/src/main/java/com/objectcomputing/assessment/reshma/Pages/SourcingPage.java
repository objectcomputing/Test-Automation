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
public class SourcingPage {

    WebDriver driver;
    @FindBy(xpath = "//body//div[@id='app']//div//div//div//div[1]//div[1]//div[1]//div[2]//*[local-name()='svg']//*[name()='path' and contains(@d,'M9.211364 ')]")
    WebElement SaaSSolutions;
    @FindBy(xpath = "//body//div[@id='app']//div//div//div//div//div[2]//div[1]//div[2]")
    WebElement applicationsHostedByThirdPartyInTheCloud;
    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]")
    WebElement applicationsMovedtoHostingInTheCloud;
    @FindBy(xpath = "//div[4]//div[1]//div[1]//div[2]")
    WebElement COTSExtended;
    @FindBy(xpath = "//div[5]//div[1]//div[1]//div[2]")
    WebElement COTSLicensed;
    @FindBy(xpath = "//ul[@class='vs__dropdown-menu']//li")
    List<WebElement> selectValue;
    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement SourcingPageNextButton;

    public SourcingPage(WebDriver ldriver) {
        this.driver = ldriver;
    }

    public void selectValuesInSourcingPage(String SaaSSolutionsValue, String applicationsHostedByThirdPartyInTheCloudValue, String applicationsMovedtoHostingInTheCloudValue, String COTSExtendedValue, String COTSLicensedValue) throws InterruptedException {
        SaaSSolutions.click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> dd_menu = selectValue;

        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(SaaSSolutionsValue)) {
                element.click();
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        applicationsHostedByThirdPartyInTheCloud.click();

        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(applicationsHostedByThirdPartyInTheCloudValue)) {
                element.click();
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        applicationsMovedtoHostingInTheCloud.click();
        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(applicationsMovedtoHostingInTheCloudValue)) {
                element.click();
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }

        COTSExtended.click();
        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(COTSExtendedValue)) {
                element.click();
                Thread.sleep(5000);
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        COTSLicensed.click();

        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(COTSLicensedValue)) {
                element.click();
                Thread.sleep(5000);
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        SourcingPageNextButton.click();
        Thread.sleep(5000);
    }


}



