package AutomationProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertsPopUpsExample extends BaseDriver{
	
	public void testAlert() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
	
		alertButton.click();
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		Thread.sleep(1000);
		
	}

	public void confirmAlert() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		
		Alert alert = driver.switchTo().alert();
		
		confirmButton.click();
		alert.dismiss();
		Thread.sleep(1000);
	}
	
	public void prompotButton() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement promptButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptButton.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		alert.sendKeys("Hello world");
		alert.accept();
		Thread.sleep(1000);
	}

}
