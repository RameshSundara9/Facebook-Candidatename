package testScenerios;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.FacebookPage;
import objects.GoogleSearch;

public class TestMethodsGoogleSearch {

	WebDriver driver;

	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void SearchAndClickOn_FB() throws InterruptedException {
		GoogleSearch page = new GoogleSearch(driver);
		page.searchOn_Google("facebook");
		page.clickOn_FBURL();
	}

	@Test
	public void verifyLoginFunctionality() throws InterruptedException {
		FacebookPage page = new FacebookPage(driver);

		Thread.sleep(2000);
		page.EnterUsername();
		page.EnterPassword();
		page.VerifyLogin();
	}

	// @AfterTest
	public void aftertest() {
		driver.quit();
	}
}