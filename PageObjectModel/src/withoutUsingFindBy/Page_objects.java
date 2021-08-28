package withoutUsingFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Page_objects {
	
	
	public static WebElement email;
	
	public static WebElement pass;
	
	public static WebElement  login;
	
	@Test
	public void login() {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		PageFactory.initElements(driver, Page_objects.class);
		
		email.sendKeys("vpgreenstech2021@gmail.com");
		pass.sendKeys("greenstech");
		login.click();
		
		
		
		
		
		
		
	}
	
	

}
