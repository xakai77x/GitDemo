package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {

	@AfterSuite
	public void finalTest() {

		System.out.println("final");

	}

	@AfterTest
	public void logout() {

		System.out.println("logout");

	}

	@BeforeSuite
	public void theBeginning() {

		System.out.println("I will really run first");

	}

	@Test(dataProvider="getData")
	public void login(String username, String password) {
		
		System.out.println(username);
		System.out.println(password);
		
		System.out.println("newTest");
		
	}
	
	@DataProvider
	public Object getData() {

		// 1st combination - username password
		// 2nd combination - username password
		
		Object[][] data = new Object[3][2];
		data[0][0] = "firstUsername";
		data[0][1] = "firstPassword";
		
		data[1][0] = "secondUsername";
		data[1][1] = "secondPassword";
		
		data[2][0] = "thirdUsername";
		data[2][1] = "thirdPassword";
		
		return data;
	}

}
