package AutomationProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGExample{
	@Test (priority = 0)
	public void firstTest() {
		System.out.println("Test");
	}
	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("Before suite test");
	}
	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("After suite test");
	}
	@BeforeClass
	public void beforeClassTest() {
		System.out.println("Before class test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method test");
	}	
	@AfterClass
	public void afterClassTest() {
		System.out.println("After class test");
	}
	@Test (priority = 1)
	public void extraTest() {
		System.out.println("Extra Test");
	}
}
