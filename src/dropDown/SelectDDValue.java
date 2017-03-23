package dropDown;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.apache.commons.*;

public class SelectDDValue {
	@Test
	public void selectDDValue(){
		System.setProperty("webdriver.gecko.driver", "/Users/mrinalirao/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Select month = new Select(driver.findElement(By.id("month")));
		System.out.println(month.getFirstSelectedOption().getText());
		month.selectByVisibleText("Dec");
		String selectedValue=month.getFirstSelectedOption().getText();
		System.out.println(selectedValue);
		List<WebElement> month_list =month.getOptions();
		List<String> actList = null, expList =null;
		for(WebElement ele: month_list){
			//System.out.println(ele.getText());
			actList.add(ele.getText());
		}
		expList = Arrays.asList("Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec");
		System.out.println(Arrays.equals(actList.toArray(), expList.toArray()));
				
	}

}
