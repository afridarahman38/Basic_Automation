package AutomationProject;

import org.testng.annotations.Test;

public class OpenURL extends BaseDriver{
	String url = "https://testng.org/";
	
	@Test
	public void testURL() {
		driver.manage().window().maximize();
		driver.get(url); 
	}
}
