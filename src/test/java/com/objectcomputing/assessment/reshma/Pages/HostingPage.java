/**
 *
 */
package com.objectcomputing.assessment.reshma.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/**
 * @author tajr
 *
 * This class will store all the locators and methods of login page.
 *
 */
public class HostingPage {

    WebDriver driver;
    @FindBy(xpath = "//div[@class='ask']//div[1]//div[1]//div[1]//div[2]//*[local-name()='svg']//*[name()='path' and contains(@d,'M9.211364 ')]")
    WebElement cloudHostedServerless;
    //DropDown Locators
    @FindBy(xpath = "//div[@class='add-to-100']//div[2]//div[1]//div[1]//div[2]")
    WebElement cloudHostedContainerized;
    @FindBy(xpath = "//body/div[@id='app']/div/div/div/div/div[3]/div[1]/div[1]")
    WebElement cloudHostedIaaS;
    @FindBy(xpath = "//div[4]//div[1]//div[1]//div[2]//*[local-name()='svg']//*[name()='path' and contains(@d,'M9.211364 ')]")
    WebElement OnPremisesOptimized;
    @FindBy(xpath = "//div[5]//div[1]//div[1]//div[2]//*[local-name()='svg']//*[name()='path' and contains(@d,'M9.211364 ')]")
    WebElement OnPremisesDemandDriven;
    @FindBy(xpath = "//ul[@class='vs__dropdown-menu']//li")
    List<WebElement> selectValue;
    @FindBy(xpath = "//button[@class='next']")
    WebElement HostingPageNextButton;
    @FindBy(xpath = "//label[contains(text(),'Cloud hosted, serverless')]")
    WebElement labelcloudHostedServerless;

    //Labels and Descriptions
    @FindBy(xpath = "//div[contains(text(),'A cloud-computing execution model in which the clo')]")
    WebElement descriptioncloudHostedServerless;
    @FindBy(xpath = "//label[contains(text(),'Cloud hosted, containerized')]")
    WebElement labelcloudHostedContainerized;
    @FindBy(xpath = "//div[contains(text(),'An optimized form of IaaS that takes advantage of')]")
    WebElement descriptioncloudHostedContainerized;
    @FindBy(xpath = "//label[contains(text(),'Cloud hosted, IaaS')]")
    WebElement labelcloudHostedIaaS;
    @FindBy(xpath = "//div[contains(text(),'Infrastructure-as-a-Service: IT infrastructure ded')]")
    WebElement descriptioncloudHostedIaaS;
    @FindBy(xpath = "//label[contains(text(),'On premises, optimized')]")
    WebElement labelOnPremisesOptimized;
    @FindBy(xpath = "//body/div[@id='app']/div/div/div/div/div[4]/div[2]/div[1]")
    WebElement descriptionOnPremisesOptimized;
    @FindBy(xpath = "//label[contains(text(),'On premises, demand-driven')]")
    WebElement labelOnPremisesDemandDriven;
    @FindBy(xpath = "//body/div[@id='app']/div/div/div/div/div[5]/div[2]/div[1]")
    WebElement descriptionOnPremisesDemandDriven;
    @FindBy(xpath = "//dialog[contains(text(),'Percentages must add to 100.')]")
    WebElement hostingPageAlertMessage;

    //Alert Message
    @FindBy(xpath = "//dialog[contains(text(),'Percentages must add to 100.')]")
    WebElement hostingPageAlertMessageCloseButton;

    public HostingPage(WebDriver ldriver) {
        this.driver = ldriver;
    }

    public void selectValuesInHostingPage(String cloudHostedServerlessValue, String cloudHostedContainerizedValue, String cloudHostedIaaSValue, String OnPremisesOptimizedValue, String OnPremisesDemandDrivenValue) throws InterruptedException {
        cloudHostedServerless.click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> dd_menu = selectValue;

        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(cloudHostedServerlessValue)) {
                element.click();
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        cloudHostedContainerized.click();

        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(cloudHostedContainerizedValue)) {
                element.click();
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        cloudHostedIaaS.click();
        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(cloudHostedIaaSValue)) {
                element.click();
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }

        OnPremisesOptimized.click();
        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(OnPremisesOptimizedValue)) {
                element.click();
                Thread.sleep(5000);
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        OnPremisesDemandDriven.click();
        for (WebElement element : dd_menu) {
            String innerhtml = element.getAttribute("innerHTML");
            if (innerhtml.contains(OnPremisesDemandDrivenValue)) {
                element.click();
                Thread.sleep(5000);
                break;
            }

            System.out.println("Values from dropdown is: ======= " + innerhtml);
        }
        HostingPageNextButton.click();
        Thread.sleep(5000);
    }

    public void verifyHostingPageLabelsAndDescriptions() throws InterruptedException {

        labelcloudHostedServerless.click();
        assertEquals(descriptioncloudHostedServerless.getText(), "A cloud-computing execution model in which the cloud provider runs the server, and dynamically manages the allocation of machine resources. Pricing is based on the actual amount of resources consumed by an application, rather than on pre-purchased units of capacity.");
        System.out.println("Description verified for cloudHostedServerless label is: " + descriptioncloudHostedServerless.getText());
        Thread.sleep(3000);
        labelcloudHostedServerless.click();

        labelcloudHostedContainerized.click();
        assertEquals(descriptioncloudHostedContainerized.getText(), "An optimized form of IaaS that takes advantage of service usage patterns to reduce the total amount of infrastructure necessary for an enterprise or product.");
        System.out.println("Description verified for cloudHostedContainerized label is: " + descriptioncloudHostedContainerized.getText());
        Thread.sleep(3000);
        labelcloudHostedContainerized.click();

        labelcloudHostedIaaS.click();
        assertEquals(descriptioncloudHostedIaaS.getText(), "Infrastructure-as-a-Service: IT infrastructure dedicated for your use is arranged through an internet service provider for computing, location, data partitioning, scaling, security, and backup services.");
        System.out.println("Description verified for cloudHostedIaaS label is: " + descriptioncloudHostedIaaS.getText());
        Thread.sleep(3000);
        labelcloudHostedIaaS.click();

        labelOnPremisesOptimized.click();
        assertEquals(descriptionOnPremisesOptimized.getText(), "IT infrastructure is provisioned on premises controlled by your company. Effort is made to identify economies of scale and cost-saving synergies between departments and projects.");
        System.out.println("Description verified for OnPremisesOptimized label is: " + descriptionOnPremisesOptimized.getText());
        Thread.sleep(3000);
        labelOnPremisesOptimized.click();

        labelOnPremisesDemandDriven.click();
        assertEquals(descriptionOnPremisesDemandDriven.getText(), "IT infrastructure is provisioned on premises controlled by your company. The departments requesting IT infrastructure are allocated dedicated infrastructure based on their request, with little effort made to identify economies of scale or cost-saving synergies.");
        System.out.println("Description verified for OnPremisesDemandDriven label is: " + descriptionOnPremisesDemandDriven.getText());
        Thread.sleep(3000);
        labelOnPremisesDemandDriven.click();

    }

    public void clickOnHostingPageNextButton() throws InterruptedException {
        HostingPageNextButton.click();
        Thread.sleep(5000);
    }

    public void hostingPageHandleAlert() throws InterruptedException {

        Thread.sleep(5000);

        assertEquals(hostingPageAlertMessage.getText(), "Percentages must add to 100.");
        System.out.println("Alert Message is: " + hostingPageAlertMessage.getText());
        Thread.sleep(3000);
        hostingPageAlertMessageCloseButton.click();
        Thread.sleep(1000);
    }

}



