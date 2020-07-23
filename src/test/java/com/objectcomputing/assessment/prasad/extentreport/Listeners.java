package com.objectcomputing.assessment.prasad.extentreport;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;


//ExtentTest test;
//ExtentReports extent = ExtendReprotNG.getReportObject();


		

	public class Listeners implements ITestListener						
	{
		WebDriver driver;
		ExtentTest test;
		public ExtentTest extentTest;
		ExtentReports extent = ExtendReprotNG.getReportObject();
		//ExtentReports extent = ExtentManagerA.createInstance();

		// To Make the test thread safe (execute test parallel using multiple thread)
		//ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
		

		
		@Override
		public void onTestStart(ITestResult result) {
			
			 test = extent.createTest(result.getMethod().getMethodName());
				// To Make the test thread safe (execute test parallel using multiple thread 
			// extentTest.set(test);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			//ITestListener.super.onTestSuccess(result);
			test.log(Status.PASS, "Test Passed");
		//	extentTest.get().log(Status.PASS, "Test Passed");
			

			
		}

		@Override
		public void onTestFailure(ITestResult result) {
		    String methodName = result.getMethod().getMethodName();
			String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
			
			test.fail("<details>" + "<summary>" + "<b>" + "<font color ="+"red> "+ "Exception Occured:Click to see"+
			"</font>"+"</b>" + "</summary>"+exceptionMessage.replaceAll(",","<br>") + "</details>"+
					"\n");
			String failureLogg = "TEST CASE FAILED";
			Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
			test.log(Status.FAIL,m);
		}

		/*
			//String path = takeScreenshot(driver, result.getMethod().getMethodName());
			String path = takeScreenshot(result.getMethod().getMethodName());

			try {
			
			test.fail("<b>"+"<font color="+"<red>"+
					"Screen shot of failure"+"</font>"+"</b>",
			MediaEntityBuilder.createScreenCaptureFromPath(path).build());	

				//MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenShotName).build());	
				//MediaEntityBuilder.createScreenCaptureFromPath(path).build();	

			}catch(IOException e) {
				test.fail("Test Failed, can't attach the screen shot");
				
			}
			String logText = "<b>Test Method" + methodName + "Failed<b/>"; 
			Markup mrkup = MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.log(Status.FAIL,mrkup);



			//extentTest.get().fail(result.getThrowable());
			//test.fail(result.getThrowable());
	}

/*
		private void getScreenShotPath(String testMethodName) {
			// TODO Auto-generated method stub
			
	}
*/
		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestSkipped(result);
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailedWithTimeout(result);
		}

		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			ITestListener.super.onStart(context);
		}

		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			//ITestListener.super.onFinish(context);
			extent.flush();
		}		
		
		
		public String takeScreenshot(String methodName) {
		//public String takeScreenshot(String methodName) {

			String fileName = getScreenshotName(methodName);
			String directory = System.getProperty("user.dir")+"./screenshots/";	
			new File(directory).mkdir();
			String path = directory + fileName;
			
			try {
				File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot, new File(path));
				System.out.println("********************************");
				System.out.println("Screen shot stored at:" + path );
				System.out.println("***************************");
						
			} catch (Exception e){
				
				e.printStackTrace();
			}
	     return path;		
			
		}
		
		//*/
		public static String getScreenshotName(String methodName) {
			Date d = new Date();
			String fileName = "Automatic Report_" + d.toString().replace(":", "_") + ".png";
			return fileName;
				
			
		}
		

	}

