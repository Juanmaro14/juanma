package com.qa.utility;

import java.io.File;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testscripts.TestBase;

public class Listeners extends TestBase implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		Object currentClass = result.getInstance();
		WebDriver driver = ((TestBase) currentClass).getDriver();
		if (driver != null) {
			try {
				File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(file, new File(Paths.get(System.getProperty("user.dir"), "screenshots")
						+ File.separator + result.getName() + "_" + result.getEndMillis() + ".png"));
				System.out.println("Test Succeded - Screenshot Captured");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		Object currentClass = result.getInstance();
		WebDriver driver = ((TestBase) currentClass).getDriver();
		if (driver != null) {
			try {
				File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(file, new File(Paths.get(System.getProperty("user.dir"), "screenshots")
						+ File.separator + result.getName() + "_" + result.getEndMillis() + ".png"));
				System.out.println("Test Failed - Screenshot Captured");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
