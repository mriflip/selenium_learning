import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TutorialOne {
	private WebDriver mydriver;
	String myURL="http://www.youtube.com";
	String xpathExpression =".//*[@id='masthead-search-term']";
	String search, searchResult;
	
	@Before
	public void setup() throws Exception{
		
		//Set system property to execute on local
//		System.setProperty("webdriver.gecko.driver","/Users/mrinalirao/Downloads/geckodriver");
//		mydriver= new FirefoxDriver();
		search = "soccer songs";
		
		//set the capabilities to execute on remote machines
		System.setProperty("webdriver.gecko.driver", "/Users/mrinalirao/Downloads/geckodriver");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    	capabilities.setCapability("marionette", true);
		mydriver = new FirefoxDriver(capabilities);
	}
	
	@Test
	public void myMainTest() throws Exception{
	 mydriver.navigate().to(myURL);
	 mydriver.findElement(By.xpath(xpathExpression)).sendKeys(search);
	 mydriver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[3]/form/button")).click();
	//searchResult = mydriver.findElement(By.xpath("//p[@class='num-results first-focus']")).getText();
	 //mydriver.findElement(By.xpath("//*[contains(@id,'section-list']//following::div[@class='filter-top']"));
	 //System.out.println(searchResult);
	}
	
	
	@After
	public void teardown() throws Exception{
	 mydriver.quit();
	}
	

}
