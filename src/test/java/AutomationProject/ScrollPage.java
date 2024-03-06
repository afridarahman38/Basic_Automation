package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollPage extends BaseDriver{
	
	public void scrollUp() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//specific locator
		WebElement specificLocator = driver.findElement(By.xpath("//span[contains(text(),'© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", specificLocator);
		Thread.sleep(5000);
		
		//top
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(1000);
		
		//down
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
	}

}
