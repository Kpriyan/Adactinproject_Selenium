package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdatePageObjects;

public class UpdateTestcase {
	
	@Test
	public void update () {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.sigin.click();
		LoginPageObjects.emailid.sendKeys("greenstech2021@gmail.com");
		LoginPageObjects.emailpass.sendKeys("greenstech");
		LoginPageObjects.siginto.click();
		
		PageFactory.initElements(driver, UpdatePageObjects.class);
		UpdatePageObjects.sarach.sendKeys("Dress"+Keys.ENTER);
		UpdatePageObjects.signout.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*LoginPageObjects.sigin(driver).click();
		LoginPageObjects.emailid(driver).sendKeys("greenstech2021@gmail.com");
		LoginPageObjects.emailpass(driver).sendKeys("greenstech");
		LoginPageObjects.siginto(driver).click();
		UpdatePageObjects.sarach(driver).sendKeys("Dress"+Keys.ENTER);
		UpdatePageObjects.signout(driver).click();*/
		
		
		
		/* WebElement sarach = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		 sarach.sendKeys("Dress"+Keys.ENTER);
			
		 WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
		 signout.click();*/

		
		
		
	}
	
	

}
