package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestFacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/mrinalirao/Downloads/geckodriver");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    	capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://seleniumpractise.blogspot.com.au/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
       
		//handleRadioButtons
		List<WebElement> radio =driver.findElements(By.xpath("//input[@name ='lang' and @type='radio']"));
       
        for(WebElement ele: radio){
        	
        	System.out.println("values from radio buttons=====>" + ele.getAttribute("value"));
        	if(ele.getAttribute("value").equalsIgnoreCase("RUBY"))
        		
        	{
        		ele.click();
        	}
        }
	}

}
