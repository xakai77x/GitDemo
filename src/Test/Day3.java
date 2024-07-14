package Test;

import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void webLogin() {

		System.out.println("web");

	}

	@Test(groups = "Smoke", enabled = false)
	public void mobileLogin() {

		System.out.println("mobile");

	}

	@Test(dependsOnMethods = { "webLogin" })
	public void loginAPI() {

		System.out.println("API");
		System.out.println("Develop Branch more change");

	}

}
