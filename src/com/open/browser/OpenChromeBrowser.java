package com.open.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenChromeBrowser {

	static WebDriver dr = null;
	static String basePath = System.getProperty("user.dir");

	public static void main(String[] args) throws InterruptedException {

		System.out.println(
				"\n open FACEBOOK on chrome browser with the help of \n    SELENIUM WEBDRIVER and close the browser ");
		Thread.sleep(5000);
		System.out.println("\n        opening the chrome browser \n         ");
		              OpenChromeBrowser.getBrowserForWindows("chrome");
		Thread.sleep(5000);
		System.out.println(" \n              opening FACEBOOK                 ");
		Thread.sleep(7000);
		                       dr.get("https://www.facebook.com/");
		System.out.println("\n             maximize the WINDOW            ");
		Thread.sleep(6000);
		                       dr.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("\n             sending username            ");
		dr.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		System.out.println("\n             Typing password            ");
		Thread.sleep(2000);
		dr.findElement(By.id("pass")).sendKeys("xyz123");
		Thread.sleep(2000);
		System.out.println("\n             clicking on Login            ");
		dr.findElement(By.xpath("//button[text()=\"Log In\"]")).click();
		Thread.sleep(2000);
		System.out.println("\n             closing the BROWSER             ");
		Thread.sleep(5000);
		                                     dr.close();

	}

	public static void getBrowserForWindows(String browser) {

		System.setProperty("webdriver.chrome.driver", basePath + "\\NewDrivers\\chromedriver.exe");
		                          dr = new ChromeDriver();

	}

}
