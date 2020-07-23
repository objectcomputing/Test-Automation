package com.objectcomputing.assessment.prasad.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EngineeringPage {

	public void valEngHeader(WebDriver driver) {

		String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

		String expectedone = "Engineering";

		System.out.println();
		System.out.println("*******  Verifying \"Engineering\" page header here  ******");
		System.out.println();

		System.out.println("Expected Confirmation message: " + expectedone);
		System.out.println("Actual Confirmation message: " + actualonehost);
		System.out.println();

		Assert.assertEquals(actualonehost, expectedone);

	}

	public void valEngLabel(WebDriver driver) {

		String acthostlabelone = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).getText();

		String expectlabeldone = "Contributing to open source";

		System.out.println("*******  Verifying \"Engineering\" page dropdown labels One here  ******");
		System.out.println("Expected Confirmation message: " + expectlabeldone);
		System.out.println("Actual Confirmation message: " + acthostlabelone);
		System.out.println();

		Assert.assertEquals(acthostlabelone, expectlabeldone);

		// *** Verifying Labels Two

		String acthostlabeltwo = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).getText();

		String expectlabeldtwo = "Leveraging open source";

		System.out.println("*******  Verifying \"Engineering\" page dropdown labels Two here  ******");
		System.out.println("Expected Confirmation message: " + expectlabeldtwo);
		System.out.println("Actual Confirmation message: " + acthostlabeltwo);
		System.out.println();

		Assert.assertEquals(acthostlabeltwo, expectlabeldtwo);

		// *** Verifying Labels Three

		String acthostlabelthree = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).getText();

		String expectlabeldthree = "Reused";

		System.out.println("*******  Verifying \"Engineering\" page dropdown labels Three here  ******");
		System.out.println("Expected Confirmation message: " + expectlabeldthree);
		System.out.println("Actual Confirmation message: " + acthostlabelthree);
		System.out.println();

		Assert.assertEquals(acthostlabelthree, expectlabeldthree);

		// *** Verifying Labels Four

		String acthostlabelfour = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).getText();

		String expectlabelfour = "Reusable";

		System.out.println("*******  Verifying \"Engineering\" page dropdown labels Four here  ******");
		System.out.println("Expected Confirmation message: " + expectlabelfour);
		System.out.println("Actual Confirmation message: " + acthostlabelfour);
		System.out.println();

		Assert.assertEquals(acthostlabelfour, expectlabelfour);

		// *** Verifying Labels Five

		String acthostlabelfive = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).getText();

		String expectlabelfive = "Custom";

		System.out.println("*******  Verifying \"Engineering\" page dropdown labels Five here  ******");
		System.out.println("Expected Confirmation message: " + expectlabelfive);
		System.out.println("Actual Confirmation message: " + acthostlabelfive);
		System.out.println();

		Assert.assertEquals(acthostlabelfive, expectlabelfive);

	}

	public void valEngLabDes(WebDriver driver) {

		// ***************************** Verifying Labels Description ONE
		// *********************************///

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).click();
		String actdesone = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/div"))
				.getText();

		String expectedDesone = "IT project teams not only take advantage of freely available industry standard components, but they also participate in open source projects that have a high level of synergy with business objectives or domains.";
		System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description One here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesone);
		System.out.println("Actual Confirmation message: " + actdesone);
		System.out.println();

		Assert.assertEquals(actdesone, expectedDesone);

		// ***************************** Verifying Labels Description TWO
		// *********************************///

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).click();

		String actdestwo = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/div"))
				.getText();

		String expectedDestwo = "IT projects afford the time to explore freely available industry standard components to reduce project spend and increase functional maturity of the pieces of many solutions.";
		System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description Two here  ******");
		System.out.println("Expected Confirmation message: " + expectedDestwo);
		System.out.println("Actual Confirmation message: " + actdestwo);
		System.out.println();

		Assert.assertEquals(actdestwo, expectedDestwo);

		// ***************************** Verifying Labels Description THREE
		// *********************************///

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).click();

		String actdesthree = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/div"))
				.getText();

		String expectedDesthree = "The business affords effort to bring forward reusable components and projects take advantage of these resources to reduce project cost and improve solution maintenance and support.";
		System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description Three here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesthree);
		System.out.println("Actual Confirmation message: " + actdesthree);
		System.out.println();

		Assert.assertEquals(actdesthree, expectedDesthree);

		// ***************************** Verifying Labels Description FOUR
		// ***************************

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).click();

		String actdesfour = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/div"))
				.getText();

		String expectedDesfour = "The business affords effort to identify similarities between components being developed by concurrent projects. These components are architected to be used by multiple solutions.";
		System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description Four here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesfour);
		System.out.println("Actual Confirmation message: " + actdesfour);
		System.out.println();

		Assert.assertEquals(actdesfour, expectedDesfour);

		// ***************************** Verifying Labels Description FIVE
		// *********************************///

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();

		String actdesfive = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/div"))
				.getText();

		String expectedDesfive = "IT projects do not worry about the similarities between components they develop in order to deliver automations. Each initiative develops whatever is needed to meet its requirements.";
		System.out.println("*******  Verifying \"Engineering\" page dropdown labels Description Five here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesfive);
		System.out.println("Actual Confirmation message: " + actdesfive);
		System.out.println();

		Assert.assertEquals(actdesfive, expectedDesfive);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();

	}
	
	public void verifyDialougeEng(WebDriver driver) throws InterruptedException {

		String actualmessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog")).getText();

		String expectedmessage = "Percentages must add to 100.";

		System.out.println();
		System.out.println("*******  Verifying \" Less than 100 % \" Validation on ENGINEERING page.  ******");
		System.out.println();

		System.out.println("Expected Confirmation message: " + expectedmessage);
		System.out.println("Actual Confirmation message:   " + actualmessage);
		System.out.println();

		Assert.assertEquals(actualmessage, expectedmessage);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog/form/input")).click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyTemBarEng(WebDriver driver) {

		WebElement checkselect = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[1]/span"));
		checkselect.getText();
		//System.out.println("The current selected item on the Engineering page is : " + checkselect.getText());

		if (checkselect.getText().equals("100%")) {

			WebElement width1 = driver.findElement(By.xpath("//div[@class='current-state']//div[1]/div/div[2]"));

			String expval1 = "width: 71.8366%;";
			
			System.out.println("        *******     Current State values are     *******");
			System.out.println();
			System.out.println("Expected:- Current State of \"Cost/Maintainability\" is          ==>: " + expval1);

			Assert.assertEquals(width1.getAttribute("style"), expval1);

			WebElement width2 = driver.findElement(By.xpath("//div[@class='current-state']//div[2]/div/div[2]"));

			String expval2 = "width: 23.3789%;";
			System.out.println("Expected:- Current State of \"Functional Range/Future Proof\" is ==>: " + expval2);
			Assert.assertEquals(width2.getAttribute("style"), expval2);

			WebElement width3 = driver.findElement(By.xpath("//div[@class='current-state']//div[3]/div/div[2]"));

			String expval3 = "width: 56.1732%;";
			System.out.println("Expected:- Current State of \"Availability\" is                  ==>: " + expval3);
			Assert.assertEquals(width3.getAttribute("style"), expval3);

			WebElement width4 = driver.findElement(By.xpath("//div[@class='current-state']//div[4]/div/div[2]"));

			String expval4 = "width: 35.8789%;";

			System.out.println("Expected:- Current State of \"Security\" is                      ==>: " + expval4);
			Assert.assertEquals(width4.getAttribute("style"), expval4);

			WebElement width5 = driver.findElement(By.xpath("//div[@class='current-state']//div[5]/div/div[2]"));

			String expval5 = "width: 31.1732%;";

			System.out.println("Expected:- Current State of \"Innovation/Time to Market\" is     ==>: " + expval5);
			Assert.assertEquals(width5.getAttribute("style"), expval5);

		}
	}

}