package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	public static WebElement sigin;
	
	@FindBy(how=How.ID,using = "email")
	public static WebElement emailid;
	
	@FindBy(id="passwd")
	public static WebElement emailpass;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	public static WebElement siginto;
	
	
	
	
	
	
	
	
	
	
	
	/*public static WebElement sigin(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@class='login']"));
	}

	public static WebElement emailid(WebDriver driver) {

		return driver.findElement(By.id("email"));

	}

	public static WebElement emailpass(WebDriver driver) {

		return driver.findElement(By.id("passwd"));

	}

	public static WebElement siginto(WebDriver driver) {

		return driver.findElement(By.xpath("//span[normalize-space()='Sign in']"));

	}*/

}
