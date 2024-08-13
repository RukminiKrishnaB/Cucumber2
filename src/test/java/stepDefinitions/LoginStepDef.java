package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import utility.PicoContainerSetup;

public class LoginStepDef {
	//PicoContainerSetup
	
	PicoContainerSetup picoContainerSetup;
	public LoginStepDef(PicoContainerSetup picoContainerSetup) {
		this.picoContainerSetup = picoContainerSetup ;
		
	}
	
	By email_l = By.id("email");
	By password_l = By.id("pass");
	By loginButton_l = By.id("send2");

	@Given("I login to Luma app with valid login details {string} and {string}")
	public void i_login_to_luma_app_with_valid_login_details_and(String uname, String password) {
		
		picoContainerSetup.driver = new ChromeDriver();
		picoContainerSetup.driver.manage().window().maximize();
		picoContainerSetup.driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
		
	WebElement login_e = picoContainerSetup.driver.findElement(email_l);
	login_e.sendKeys(uname);
	WebElement password_e = picoContainerSetup.driver.findElement(password_l);
	password_e.sendKeys(password);
	WebElement loginButton_e = picoContainerSetup.driver.findElement(loginButton_l);
	loginButton_e.click();

	}
}
