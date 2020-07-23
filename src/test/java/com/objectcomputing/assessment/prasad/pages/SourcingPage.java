package com.objectcomputing.assessment.prasad.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SourcingPage {

	public void valSourcHeader(WebDriver driver) {

		String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

		String expectedone = "Sourcing";

		System.out.println();
		System.out.println("*******  Verifying \"Sourcing\" page header here  ******");
		System.out.println();

		System.out.println("Expected Confirmation message: " + expectedone);
		System.out.println("Actual Confirmation message: " + actualonehost);
		System.out.println();

		Assert.assertEquals(actualonehost, expectedone);
	}

	public void valSourcLabel(WebDriver driver) {

		// *** Verifying Labels one

		String actsourclabelone = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).getText();

		String expectlabeldone = "Software-As-A-Service (SaaS) solutions";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels One here  ******");
		System.out.println("Expected Confirmation message: " + expectlabeldone);
		System.out.println("Actual Confirmation message: " + actsourclabelone);
		System.out.println();

		Assert.assertEquals(actsourclabelone, expectlabeldone);

		// *** Verifying Labels Two

		String actsourlabeltwo = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).getText();

		String expectlabeldtwo = "Applications hosted by third-parties in the cloud";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Two here  ******");
		System.out.println("Expected Confirmation message: " + expectlabeldtwo);
		System.out.println("Actual Confirmation message: " + actsourlabeltwo);
		System.out.println();

		Assert.assertEquals(actsourlabeltwo, expectlabeldtwo);

		// *** Verifying Labels Three

		String actsourlabelthree = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).getText();

		String expectlabeldthree = "Applications that you have moved to hosting in the cloud";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Three here  ******");
		System.out.println("Expected Confirmation message: " + expectlabeldthree);
		System.out.println("Actual Confirmation message: " + actsourlabelthree);
		System.out.println();

		Assert.assertEquals(actsourlabelthree, expectlabeldthree);

		// *** Verifying Labels Four

		String actsourlabelfour = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).getText();

		String expectlabelfour = "COTS extended through APIs, plug-ins, or other interfaces";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Four here  ******");
		System.out.println("Expected Confirmation message: " + expectlabelfour);
		System.out.println("Actual Confirmation message: " + actsourlabelfour);
		System.out.println();

		Assert.assertEquals(actsourlabelfour, expectlabelfour);

		// *** Verifying Labels Five

		String actsourlabelfive = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).getText();

		String expectlabelfive = "Commercial Off-The-Shelf (COTS) solutions licensed";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Five here  ******");
		System.out.println("Expected Confirmation message: " + expectlabelfive);
		System.out.println("Actual Confirmation message: " + actsourlabelfive);
		System.out.println();

		Assert.assertEquals(actsourlabelfive, expectlabelfive);

	}

	public void valSourcLabDes(WebDriver driver) {

		// ***************************** Verifying Labels Description ONE

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).click();
		String actdesone = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/div"))
				.getText();

		String expectedDesone = "The product vendor takes care of all support, maintenance, and product features for all clients on one uniform cloud-hosted solution.";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description One here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesone);
		System.out.println("Actual Confirmation message: " + actdesone);
		System.out.println();

		Assert.assertEquals(actdesone, expectedDesone);

		// ***************************** Verifying Labels Description TWO

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).click();

		String actdestwo = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/div"))
				.getText();

		String expectedDestwo = "In this category, the solution vendor cloud hosts a copy of their software dedicated for your use. This is also called a single-tenant cloud hosted solution.";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description Two here  ******");
		System.out.println("Expected Confirmation message: " + expectedDestwo);
		System.out.println("Actual Confirmation message: " + actdestwo);
		System.out.println();

		Assert.assertEquals(actdestwo, expectedDestwo);

		// ***************************** Verifying Labels Description THREE

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).click();

		String actdesthree = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/div"))
				.getText();

		String expectedDesthree = "This category leaves the operational support for these solutions with your support team, while reducing server purchasing costs. An example is hosting Oracle Financial applications in the cloud.";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description Three here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesthree);
		System.out.println("Actual Confirmation message: " + actdesthree);
		System.out.println();

		Assert.assertEquals(actdesthree, expectedDesthree);

		// ***************************** Verifying Labels Description FOUR

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).click();

		String actdesfour = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/div"))
				.getText();

		String expectedDesfour = "The amount of the functional range that you provide for your enterprise or products that is procured by licensing commercial off-the-shelf software, which you then adapt to your needs and/or extend the process coverage through software development by your IT staff.";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description Four here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesfour);
		System.out.println("Actual Confirmation message: " + actdesfour);
		System.out.println();

		Assert.assertEquals(actdesfour, expectedDesfour);

		// ***************************** Verifying Labels Description FIVE

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();

		String actdesfive = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/div"))
				.getText();

		String expectedDesfive = "The amount of the functional range that you provide for your enterprise or products that is"
				+ " procured by licensing commercial off-the-shelf software. This particular category only includes those"
				+ " products that you are able to use \"out of the box\"; without any coding effort by your IT staff.";

		System.out.println("*******  Verifying \"Sourcing\" page dropdown labels Description Five here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesfive);
		System.out.println("Actual Confirmation message: " + actdesfive);
		System.out.println();

		Assert.assertEquals(actdesfive, expectedDesfive);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();

	}

	public void verifyDialougeSourc(WebDriver driver) throws InterruptedException {

		String actualmessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog")).getText();

		String expectedmessage = "Percentages must add to 100.";

		System.out.println();
		System.out.println("*******  Verifying \" Less than 100 % \" Validation on SOURCING page.  ******");
		System.out.println();

		System.out.println("Expected Confirmation message: " + expectedmessage);
		System.out.println("Actual Confirmation message:   " + actualmessage);
		System.out.println();

		Assert.assertEquals(actualmessage, expectedmessage);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog/form/input")).click();
		TimeUnit.SECONDS.sleep(2);

	}
	
	public void verifyTemBarSourc(WebDriver driver) {

		WebElement checkselect = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[3]/div[1]/div/div[1]/span"));
		checkselect.getText();
		//System.out.println("The current selected item on the Sourcing page is : " + checkselect.getText());

		if (checkselect.getText().equals("100%")) {

			WebElement width1 = driver.findElement(By.xpath("//div[@class='current-state']//div[1]/div/div[2]"));

			String expval1 = "width: 77.2444%;"; 
			
			System.out.println("        *******     Current State values are     *******");
			System.out.println();
			System.out.println("Expected:- Current State of \"Cost/Maintainability\" is          ==>: " + expval1);

			Assert.assertEquals(width1.getAttribute("style"), expval1);

			WebElement width2 = driver.findElement(By.xpath("//div[@class='current-state']//div[2]/div/div[2]"));

			String expval2 = "width: 35.5572%;";
			System.out.println("Expected:- Current State of \"Functional Range/Future Proof\" is ==>: " + expval2);
			Assert.assertEquals(width2.getAttribute("style"), expval2);

			WebElement width3 = driver.findElement(By.xpath("//div[@class='current-state']//div[3]/div/div[2]"));

			String expval3 = "width: 58.8771%;";
			System.out.println("Expected:- Current State of \"Availability\" is                  ==>: " + expval3);
			Assert.assertEquals(width3.getAttribute("style"), expval3);

			WebElement width4 = driver.findElement(By.xpath("//div[@class='current-state']//div[4]/div/div[2]"));

			String expval4 = "width: 39.9455%;";

			System.out.println("Expected:- Current State of \"Security\" is                      ==>: " + expval4);
			Assert.assertEquals(width4.getAttribute("style"), expval4);

			WebElement width5 = driver.findElement(By.xpath("//div[@class='current-state']//div[5]/div/div[2]"));

			String expval5 = "width: 33.8771%;";

			System.out.println("Expected:- Current State of \"Innovation/Time to Market\" is     ==>: " + expval5);
			Assert.assertEquals(width5.getAttribute("style"), expval5);

		}
	}
}
