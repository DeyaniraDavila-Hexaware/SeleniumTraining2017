package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Select the browser to run
		// Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\Course 2017\\Drivers\\chromedriver.exe");
				
		// Firefox (Gecko driver)
		// System.setProperty("webdriver.gecko.driver", "D:\\Training\\Selenium\\Course 2017\\Drivers\\geckodriver.exe");
						
		// 2. Open the browser --> WebDriver 
		// this is for chrome
		WebDriver driver;
				
		// 3. set options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
				
		// 4. Release a driver with options
		driver = new ChromeDriver(options);
				
		// Day 2 links and waits	
		//SearchLinks links = new SearchLinks("http://demoqa.com/", driver);
		//links.ClickOnContact("Contact");
		
		//driver.quit();
	}

	
	
}
