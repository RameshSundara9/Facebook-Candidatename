package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {

	WebDriver driver;

	public GoogleSearch(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//textarea[@id='APjFqb']")
	WebElement searchbox;
	// @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")WebElement
	// search_button;
	@FindBy(xpath = "//h3[normalize-space()='Facebook - log in or sign up']")
	WebElement FB_url;

	public void searchOn_Google(String Searchinput) {

		try {

			searchbox.sendKeys(Searchinput, Keys.ENTER);
			Thread.sleep(1000);
		}

		catch (Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
	}

	public void clickOn_FBURL() {

		try {
			FB_url.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
	}
}