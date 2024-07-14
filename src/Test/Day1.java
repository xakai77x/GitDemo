package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@Parameters({ "loanURL" })
	@Test
	public void helloWorld(String loanURL) {
		System.out.println("Hello World");
		System.out.println(loanURL);
	}

	@Test(groups = "Smoke", timeOut = 4000)
	public void helloWorld2() {
		System.out.println("Hello World");
	}

	@Parameters({ "URL" })
	@Test
	public void getURL(String urlName) {

		System.out.println(urlName);
		Assert.assertTrue(false);

	}

	@Parameters({ "URL", "ApiKey/username" })
	@Test
	public void getAPIKey(String URL, String APIKey) {
		
		System.out.println(URL);
		System.out.println(APIKey);
		System.out.println("Test 1");
		System.out.println("Test 2");
		
		System.out.println("Test 3");
		System.out.println("Test 4");
		System.out.println("Test 5");
		System.out.println("Test 6");
		

	}
}