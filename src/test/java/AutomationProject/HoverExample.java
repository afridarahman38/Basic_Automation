package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HoverExample extends BaseDriver{
	
	public void hoverTest() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		
		//mouse movement
		Actions action = new Actions(driver);
		
		WebElement electronic = driver.findElement(By.xpath("//span[contains(text(),'Electronic Accessories')]"));
		action.moveToElement(electronic).build().perform();
		Thread.sleep(1000);
		
		WebElement computer = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[8]/li[4]/a[1]/span[1]"));
		action.moveToElement(computer).build().perform();
		Thread.sleep(1000);
		
		WebElement monitor = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[8]/li[4]/ul[1]/ul[1]/li[1]/a[1]/img[1]"));
		action.moveToElement(monitor).build().perform();
		monitor.click();
		Thread.sleep(1000);		
	}
}
