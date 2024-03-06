package AutomationProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExamples extends BaseDriver{
	public void testLocators() throws InterruptedException{
		//browser opening
		driver.manage().window().maximize();
		//link opening
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Afrida");
		//wait the browser at first
		Thread.sleep(1000);							
	}
	public void linkLocators() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		WebElement link = driver.findElement(By.linkText("Home"));
		link.click();
		Thread.sleep(1000);
	} 
	public void partialLinkLocators() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		WebElement partialLink = driver.findElement(By.partialLinkText("Ho"));
		partialLink.click();
		Thread.sleep(1000);
	}
	//how many links in that webpage
	public void tagNameLocators() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		List<WebElement> tagName = driver.findElements(By.tagName("a"));
		System.out.println(tagName.size());
		Thread.sleep(1000);
	} 
	//class Name locator
	public void classNameLocator() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		
		WebElement className = driver.findElement(By.className("bld-txt"));
		className.click();
		Thread.sleep(1000);
	}
	//css selector
	public void cssSelectorLocator() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		
		WebElement cssSelector = driver.findElement(By.cssSelector("#q"));
		cssSelector.click();
		Thread.sleep(1000);		
	}

	//xPath
	/*
	 * format1 = //tagName[@attributeName='value']
	 * format2 = //*[@attributeName='value']
	 * format3 = //*[contains(text(),'value')]
	 * format4 = //*[@attributeName='value' and @attributeName='value']
	 * format5 = //*[@attributeName='value' or @attributeName='value']
	 */
	public void xPathLocator() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		
		WebElement xpath = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		xpath.click();
		Thread.sleep(1000);
	}
	
}
