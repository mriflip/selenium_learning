package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	//wont work as gecko driver and action class have some issues
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.gecko.driver", "/Users/mrinalirao/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable']"));
		act.dragAndDrop(drag, drop).build().perform();
	}

}
