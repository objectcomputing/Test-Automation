package com.objectcomputing.assessment.prasad.testcases;

import com.objectcomputing.assessment.prasad.pages.*;
import com.objectcomputing.assessment.prasad.util.CallClick;
import com.objectcomputing.assessment.prasad.util.DropDownList;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC12_SuveyApp_AllSelectE2eChromeTest {


    //public static void main(String[] args) throws InterruptedException{
    @Test
    void SuveyApp_AllSelectE2eChromeTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //Initiating your chromedriver
        ChromeOptions options = new ChromeOptions();
        String opts = System.getenv("CHROME_OPTS");
        if (opts != null) {
            options.addArguments(opts);
        }
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://assessment.objectcomputing.com/");
        driver.manage().window().maximize();

        CallClick click = new CallClick();
        DropDownList selections = new DropDownList(driver);
        SummaryPage fromSummaryPage = new SummaryPage();

        SurveyLoginPage login = new SurveyLoginPage();
        login.surveyLogin(driver);

        HostingPage fromHostPage = new HostingPage();
        EngineeringPage fromEngPage = new EngineeringPage();
        SourcingPage fromSourcingPage = new SourcingPage();
        PracticesPage fromPracticesPage = new PracticesPage();

        fromHostPage.valHostHeader(driver);

        System.out.println("   *****  Value/Values selected on the HOSTING page are  *** ");
        selections.selectDropDown("10%", "40%", "30%", "10%", "10%");

        //String[] list1 = {"10", "60", "30"};
        //String[] list2 = {"20", "60", "10", "10"};
        //test t = new test();
        //	DropDownListFinal t = new DropDownListFinal();
        //	t.selectDropDownFinal(list1);
        //	t.selectDropDownFinal(list1);
        //DropDownListRD t = new DropDownListRD();
        //t.selectDropDown(list1);

        //	DropDownListFinal t = new DropDownListFinal();
        //	t.selectDropDownFinal(list1);


        click.clickToNext(driver);

        fromEngPage.valEngHeader(driver);

        System.out.println("   *****  Value/Values selected on the ENGINEERING page are  *** ");
        selections.selectDropDown("20%", "10%", "20%", "10%", "40%");

        click.clickToNext(driver);

        fromSourcingPage.valSourcHeader(driver);

        System.out.println("   *****  Value/Values selected on the SOURCING page are  *** ");
        selections.selectDropDown("50%", "20%", "10%", "10%", "10%");

        click.clickToNext(driver);

        fromPracticesPage.valPracticesHeader(driver);
        fromPracticesPage.selectPractPageItems(driver);
        click.clickToNext(driver);

        System.out.println(" *****************  LEVERS   STATUS befor user drag the Circles *****************");
        System.out.println();

        fromSummaryPage.setCurrentLevel("level current");
        fromSummaryPage.findCurrentLevers(driver);
        TimeUnit.SECONDS.sleep(3);

        fromSummaryPage.dragtTestGoalsHorizLoop(driver);

        System.out.println(" *****************  LEVERS   STATUS after user drag the Circles *****************");
        System.out.println();

        fromSummaryPage.setCurrentLevel("level goal");
        fromSummaryPage.findCurrentLevers(driver);

        fromSummaryPage.verifyGettingThereAllSelectE2e(driver);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[6]/button[2]")).click();

        driver.quit();

    }
}
