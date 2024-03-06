package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationExample extends BaseDriver{
	public void testNavigation() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		
		WebElement xpath = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		xpath.click();
		Thread.sleep(1000);
		
		//back webpage
		driver.navigate().back();
		
		//Navigate to Command
		driver.navigate().to("https://docs.google.com/document/d/1GygvG-kRl5r1B_RGgl8EMyAQfgOjQ6V2mRvHy1lSQNQ/edit?fbclid=IwAR0kVkGupX2lwGEpqh4xejTiNmO3BY1ldnUCk2lXnRZM5frZj0Ct_ttU1t0");
		
		//forward webpage
		//driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
		
		Thread.sleep(1000);
	}

}
