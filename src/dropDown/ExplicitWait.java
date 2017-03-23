package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	@Test
	public void explicitWait(){
		System.setProperty("webdriver.gecko.driver", "/Users/mrinalirao/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com.au/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		WebElement ele = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		if(ele.isDisplayed()){
			System.out.println("element is displayed");
		}
		else{
			System.out.println("element is not displayed");
		}
	}

}
