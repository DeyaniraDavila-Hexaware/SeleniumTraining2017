package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchLinks {

	// Create a method to search links using selenium
	String url;
	WebDriver driver;
	
	/// Explicit Wait:  An explicit wait is code you define to wait for a certain condition.
	// Send the driver, and the time in seconds.
	WebDriverWait waitVariable = new WebDriverWait(driver, 30); // wait for 30 seconds.
	
	public SearchLinks(String url, WebDriver driver){
		this.url = url;
		this.driver = driver;
	}
	
	public void ClickOnContact(String linkText){
		// "http://demoqa.com/"
		
		driver.navigate().to(url);
		
		waitVariable.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='menu-item-374']/a")));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Search the link Contact and click.
		driver.findElement(By.linkText(linkText)).click();
		
		
		/// Set a delay for an implicit wait: Tell the driver to wait for a certain amount of time.
		// Thread.sleep
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // No recommended.		
		
		
		
		
		
		// Where to wait
		WebElement homeElement = driver.findElement(By.linkText("Home"));
		waitVariable.until(ExpectedConditions.elementToBeClickable(homeElement));
		
		// Search all the links that say Home
		List<WebElement> homeLinks = driver.findElements(By.linkText("Home"));
		
		for (WebElement linkElement : homeLinks){
			if(linkElement.getText().toString() == "Home")
				System.out.println(linkElement.getText());
			else
				System.out.println("Error");
		}
	}
}
