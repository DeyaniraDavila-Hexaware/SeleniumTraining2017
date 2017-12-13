package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Registration {

	static WebDriver driver;
	static WebElement element;
	
	public static void main(String[] args){
		
		String driver_path = "D:\\Training\\Selenium\\Course 2017\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);

		ChromeOptions o = new ChromeOptions();
		o.addArguments("disable-extensions");
		o.addArguments("--disable-notifications");
		o.addArguments("--start-maximized");
		driver = new ChromeDriver(o);
			
		
		try {
			driver.get("http://www.demoqa.com/registration");			
		} catch (Exception e) {
			System.out.println("Fallo: " + e.getMessage());
		}
		
		
		
		/*
		 * Implicit Wait: An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time
		 * when trying to find an element or elements if they are not immediately available.
		 * The default setting is 0.
		 * Once set, the implicit wait is set for the life of the WebDriver object instance.
		 * */	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// When to use: Not recommended
		

		/*
		 * Explicit wait: An explicit waits is code you define to wait for a certain condition
		 * to occur before proceeding further in the code. WebDriverWait by default calls
		 * the ExpectedCondition every 500 milliseconds until it returns successfully.
		 * */
		//WebDriverWait waitVar = new WebDriverWait(driver, 10);
		//waitVar.until(ExpectedConditions.elementToBeClickable(element));
		
		// When to use: If element takes a long time to load.
		// Also, used to check property of an element (presence, clickability. etc).
		
		
		
		/*
		 * FluentWait: For each FluentWait instance, you can specify:

				- Frequency with which FluentWait has to check the conditions defined.
				- Ignore specific types of exception waiting such as NoSuchElementExceptions while
				  searching for an element on the page.
				- Maximum amount of time to wait for a condition

         When to use FluentWait: When you try to test the presence of an element that may appear
          after every x seconds/minutes.
		 */
		
		// PD: nadie usa Fluent waits.
		
		
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		//	       .withTimeout(30, TimeUnit.SECONDS)
		//	       .pollingEvery(5, TimeUnit.SECONDS)
		//	       .ignoring(NoSuchElementException.class);
		

		//WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
		//{
		//  public WebElement apply(WebDriver driver) {
		//  return driver.findElement(By.id("foo"));
		//}
		//});
		 
		 
		 
		 
		// Handle Selects using Selenium WebDriver
		element = driver.findElement(By.id("dropdown_7"));
		Select dropdown = new Select(element);
		// Select By Index
		dropdown.selectByIndex(2);
		// Select By Value
		dropdown.selectByValue("India");
		// Select by visible Text
		dropdown.selectByVisibleText("Mexico");
		
		
		
		
	}
}
