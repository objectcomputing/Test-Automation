package com.objectcomputing.assessment.prasad.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HostingPage {
	
	public void valHostHeader(WebDriver driver) {

        String actualonehost = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/header/h2")).getText();

        String expectedone = "Hosting";

        System.out.println();
        System.out.println("*******  Verifying \"Hosting\" page header here  ******");
        System.out.println();

        System.out.println("Expected Confirmation message: " + expectedone);
        System.out.println("Actual Confirmation message: " + actualonehost);
        System.out.println();


        Assert.assertEquals(actualonehost, expectedone);

    }

	public void valHostLabel(WebDriver driver) {

		// *** Verifying Host Labels One

		String actHostlabelone = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).getText();

		String expectlabeldone = "Cloud hosted, serverless";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels One here  ******");
		System.out.println("Expected Confirmation message: " + expectlabeldone);
		System.out.println("Actual Confirmation message: " + actHostlabelone);
		System.out.println();

		Assert.assertEquals(actHostlabelone, expectlabeldone);

		// *** Verifying Host Labels Two

		String acthostlabeltwo = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).getText();

		String expectlabeldtwo = "Cloud hosted, containerized";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels Two here  ******");
		System.out.println("Expected Confirmation message: " + expectlabeldtwo);
		System.out.println("Actual Confirmation message: " + acthostlabeltwo);
		System.out.println();

		Assert.assertEquals(acthostlabeltwo, expectlabeldtwo);

		// *** Verifying Host Labels Three

		String acthostlabelthree = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).getText();

		String expectlabeldthree = "Cloud hosted, IaaS";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels Three here  ******");
		System.out.println("Expected Confirmation message: " + expectlabeldthree);
		System.out.println("Actual Confirmation message: " + acthostlabelthree);
		System.out.println();

		Assert.assertEquals(acthostlabelthree, expectlabeldthree);

		// *** Verifying Host Labels Four

		String acthostlabelfour = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).getText();

		String expectlabelfour = "On premises, optimized";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels Four here  ******");
		System.out.println("Expected Confirmation message: " + expectlabelfour);
		System.out.println("Actual Confirmation message: " + acthostlabelfour);
		System.out.println();

		Assert.assertEquals(acthostlabelfour, expectlabelfour);

		// *** Verifying Host Labels Five

		String acthostlabelfive = driver
				.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).getText();

		String expectlabelfive = "On premises, demand-driven";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels Five here  ******");
		System.out.println("Expected Confirmation message: " + expectlabelfive);
		System.out.println("Actual Confirmation message: " + acthostlabelfive);
		System.out.println();

		Assert.assertEquals(acthostlabelfive, expectlabelfive);

	}

	public void valHostLabDes(WebDriver driver) {

		// ***************************** Verifying Host Labels Description ONE

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/label")).click();
		String actdesone = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]/div"))
				.getText();

		String expectedDesone = "A cloud-computing execution model in which the cloud provider runs the server,"
				+ " and dynamically manages the allocation of machine resources. Pricing is based on the actual"
				+ " amount of resources consumed by an application, rather than on pre-purchased units of capacity.";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description One here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesone);
		System.out.println("Actual Confirmation message: " + actdesone);
		System.out.println();

		Assert.assertEquals(actdesone, expectedDesone);

		// ***************************** Verifying Host Labels Description TWO

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/label")).click();

		String actdestwo = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/div"))
				.getText();

		String expectedDestwo = "An optimized form of IaaS that takes advantage of service usage patterns to reduce"
				+ " the total amount of infrastructure necessary for an enterprise or product.";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description Two here  ******");
		System.out.println("Expected Confirmation message: " + expectedDestwo);
		System.out.println("Actual Confirmation message: " + actdestwo);
		System.out.println();

		Assert.assertEquals(actdestwo, expectedDestwo);

		// ***************************** Verifying Host Labels Description THREE

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/label")).click();

		String actdesthree = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/div"))
				.getText();

		String expectedDesthree = "Infrastructure-as-a-Service: IT infrastructure dedicated for your use is arranged through"
				+ " an internet service provider for computing, location, data partitioning, scaling, security, and backup services.";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description Three here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesthree);
		System.out.println("Actual Confirmation message: " + actdesthree);
		System.out.println();

		Assert.assertEquals(actdesthree, expectedDesthree);

		// ***************************** Verifying Host Labels Description FOUR

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/label")).click();

		String actdesfour = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[4]/div[2]/div"))
				.getText();

		String expectedDesfour = "IT infrastructure is provisioned on premises controlled by your company. Effort is made"
				+ " to identify economies of scale and cost-saving synergies between departments and projects.";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description Four here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesfour);
		System.out.println("Actual Confirmation message: " + actdesfour);
		System.out.println();

		Assert.assertEquals(actdesfour, expectedDesfour);

		// ***************************** Verifying Host Labels Description FIVE

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();

		String actdesfive = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/div"))
				.getText();

		String expectedDesfive = "IT infrastructure is provisioned on premises controlled by your company."
				+ " The departments requesting IT infrastructure are allocated dedicated infrastructure based"
				+ " on their request, with little effort made to identify economies of scale or cost-saving synergies.";

		System.out.println("*******  Verifying \"Hosting\" page dropdown labels Description Five here  ******");
		System.out.println("Expected Confirmation message: " + expectedDesfive);
		System.out.println("Actual Confirmation message: " + actdesfive);
		System.out.println();

		Assert.assertEquals(actdesfive, expectedDesfive);

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div[2]/label")).click();

	}
	
	public void verifyDialougeHost(WebDriver driver) throws InterruptedException {
		String actualmessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog")).getText();

		String expectedmessage = "Percentages must add to 100.";

		System.out.println();
		System.out.println("*******  Verifying \" Less than 100 % \" Validation on Engineering page.  ******");
		System.out.println();

		System.out.println("Expected Confirmation message: " + expectedmessage);
		System.out.println("Actual Confirmation message:   " + actualmessage);
		System.out.println();

		Assert.assertEquals(actualmessage, expectedmessage);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/dialog/form/input")).click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyTemBarHost(WebDriver driver) {

		WebElement checkselect = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[1]/span"));
		checkselect.getText();
		//System.out.println("The current selected item on the Hosting page is : " + checkselect.getText());

		if (checkselect.getText().equals("100%")) {

			WebElement width1 = driver.findElement(By.xpath("//div[@class='current-state']//div[1]/div/div[2]"));

			String expval1 = "width: 62.5%;";
			
			System.out.println("        *******     Current State values are     *******");
			System.out.println();
			System.out.println("Expected:- Current State of \"Cost/Maintainability\" is          ==>: " + expval1);

			Assert.assertEquals(width1.getAttribute("style"), expval1);

			WebElement width2 = driver.findElement(By.xpath("//div[@class='current-state']//div[2]/div/div[2]"));

			String expval2 = "width: 0%;";
			System.out.println("Expected:- Current State of \"Functional Range/Future Proof\" is ==>: " + expval2);
			Assert.assertEquals(width2.getAttribute("style"), expval2);

			WebElement width3 = driver.findElement(By.xpath("//div[@class='current-state']//div[3]/div/div[2]"));

			String expval3 = "width: 37.5%;";
			System.out.println("Expected:- Current State of \"Availability\" is                  ==>: " + expval3);
			Assert.assertEquals(width3.getAttribute("style"), expval3);

			WebElement width4 = driver.findElement(By.xpath("//div[@class='current-state']//div[4]/div/div[2]"));

			String expval4 = "width: 12.5%;";

			System.out.println("Expected:- Current State of \"Security\" is                      ==>: " + expval4);
			Assert.assertEquals(width4.getAttribute("style"), expval4);

			WebElement width5 = driver.findElement(By.xpath("//div[@class='current-state']//div[5]/div/div[2]"));

			String expval5 = "width: 12.5%;";

			System.out.println("Expected:- Current State of \"Innovation/Time to Market\" is     ==>: " + expval5);
			Assert.assertEquals(width5.getAttribute("style"), expval5);

		}
	}

}
