package com.amazon.demo;

import com.amazon.demo.common.AppiumService;
import com.amazon.demo.common.DriverFactory;
import com.amazon.demo.common.DriverManager;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class NewTest {
	


	@BeforeClass
	public void setUp(){
		DriverFactory.initDriver();
	}

	@AfterClass
	public void close(){
		DriverFactory.quitDriver();
	}
  @Test
  public void testA() {
	  WebElement byAccessibilityId =  DriverManager.getDriver().findElementByAccessibilityId("Accessibility");
		  System.out.println("ByAccessibilityId - " + byAccessibilityId.getText());
		
	  
  }
	@Test
	public void Test02_ById() {

		MobileElement byId = DriverManager.getDriver().findElementById("android:id/text1");
		System.out.println("ById- " + byId.getText());

	}


}
