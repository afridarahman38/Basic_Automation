package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWebElements extends BaseDriver{
	//clear attribute
	public void clear() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement clear = driver.findElement(By.id("firstName"));
		clear.sendKeys("Afrida");
		Thread.sleep(1000);	
		
		firstName.clear();
		firstName.sendKeys("Kaab");
		Thread.sleep(1000);
	}
	//get attribute
	public void getAttribute() throws InterruptedException{
		driver.manage().window().maximize();			
		driver.get("https://demoqa.com/automation-practice-form");
			
		WebElement getAtt = driver.findElement(By.id("firstName"));
		System.out.println(getAtt.getAttribute("placeholder"));
		Thread.sleep(1000);
		}
	//get text
	public void getText() throws InterruptedException{
		driver.manage().window().maximize();			
		driver.get("https://demoqa.com/automation-practice-form");
				
		WebElement getText = driver.findElement(By.xpath("//*[@class='practice-form-wrapper']"));
		System.out.println(getText.getText());
		Thread.sleep(1000);
		}
	//get current url
	public void getCurrentUrl() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		
		WebElement cssSelector = driver.findElement(By.cssSelector("#q"));
		cssSelector.click();
		Thread.sleep(1000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
