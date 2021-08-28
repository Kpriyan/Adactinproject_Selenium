package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatePageObjects {
	
	
	@FindBy(xpath="//input[@id='search_query_top']")
	public static WebElement sarach;
	
	
	
	@FindBy(xpath="//a[@title='Log me out']")
	public static WebElement  signout;
	
	
	
	
	
	

	/*public static WebElement sarach(WebDriver driver) {

		return driver.findElement(By.xpath("//input[@id='search_query_top']"));

	}

	public static WebElement signout(WebDriver driver) {

		return driver.findElement(By.xpath("//a[@title='Log me out']"));

	}*/

}
