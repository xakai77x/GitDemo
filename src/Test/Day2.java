package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test(groups = "Smoke")
	public void helloWorld3() {
		System.out.println("Hello World 3");
	}
	
	@BeforeTest
	public void preReq() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void preMeth() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aftMeth() {
		System.out.println("After Method");
	}
	
	@Test
	public void helloWorld4() {
		System.out.println("Hello World 4");
		System.out.println("Develop branch change");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
}
