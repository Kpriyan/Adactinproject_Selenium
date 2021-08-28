package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCase {
    @Test
	public void login () {
		
		
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
		
		
		
		
		
		
		
		
		
		
		/*LoginPageObjects.sigin(driver).click();
		LoginPageObjects.emailid(driver).sendKeys("greenstech2021@gmail.com");
		LoginPageObjects.emailpass(driver).sendKeys("greenstech");
		LoginPageObjects.siginto(driver).click();*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement sigin = driver.findElement(By.xpath("//a[@class='login']"));
		sigin.click();

        WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("greenstech2021@gmail.com");

		WebElement emailpass = driver.findElement(By.id("passwd"));
		emailpass.sendKeys("greenstech");

		WebElement siginto = driver.findElement(By.xpath("//span[normalize-space()='Sign in']"));
		siginto.click();*/

		
		
		
		
		
		
		
		
		
	}

}
