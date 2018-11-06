package cucumberJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class CucumberJava {
	WebDriver driver = null;

	@Given("^I should be at signup page$")
	public void signupPage() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://cucumber.herokuapp.com/signup");
	}

	@And("^I provide valid infomations$")
	public void validInfo() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("repassword")).sendKeys("123456");
		driver.findElement(By.name("email")).sendKeys("123456@gmail.com");
		driver.findElement(By.name("fullname")).sendKeys("123456");
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByVisibleText("Nam");
		driver.findElement(By.name("birthday")).sendKeys("05/05/1997");
	}

	@When("^I click on the signup button$")
	public void signupClick() throws Throwable {
//		driver.findElement(By.cssSelector("html body div.container div.login form div.col-md-6.login-do label.hvr-skew-backward input")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @value='Đăng kí']")).click();
	}

	@Then("^I should be able to login into profile page$")
	public void profilePage() throws Throwable {
		Assert.assertTrue(driver.getCurrentUrl().contains("https://cucumber.herokuapp.com/profile"));

		driver.close();
	}
}