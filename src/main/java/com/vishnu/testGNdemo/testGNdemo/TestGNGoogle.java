package com.vishnu.testGNdemo.testGNdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.TestNG;
import org.openqa.selenium.*;



import org.testng.TestNG;

public class TestGNGoogle {

public static void runGoogle() {
  System.setProperty("webdriver.chrome.driver","C://Learning//Java//chromedriver//chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.google.com");
  driver.close();

}

public static void testodev() {
  System.setProperty("webdriver.chrome.driver","C://Learning//Java//chromedriver//chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.testodev.io");
  driver.close();
}
}
