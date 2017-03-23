package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BootStrapDD {
	
	
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "/Users/mrinalirao/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com.au/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		List<WebElement> mylist = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		for(WebElement ele: mylist){
			//System.out.println(ele.getAttribute("innerHTML"));
			if(ele.getAttribute("innerHTML").contentEquals("JavaScript")){
				ele.click();
				break;
				
			}
		}
	

}
}

