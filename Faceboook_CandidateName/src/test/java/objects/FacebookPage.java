package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

	WebDriver driver;

	public FacebookPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#email")
	WebElement email;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement pswd;
	@FindBy(name = "login")
	WebElement login;

	public void EnterUsername() {
		email.clear();
		email.sendKeys("ramesh23796@gmail.com");
	}

	public void EnterPassword() {
		pswd.clear();
		pswd.sendKeys("16a95a056");
	}

	public void VerifyLogin() {
		login.click();
		String title = driver.getTitle();
		assertEquals(title, "Log in to Facebook");

	}
}
