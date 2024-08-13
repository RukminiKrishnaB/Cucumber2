package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CustomerLoginPage {

    WebDriver driver;
    By email_l = By.id("email");
	By password_l = By.id("pass");
	By loginButton_l = By.id("send2");
	By createAccount_l = By.xpath("//span[contains(text(),'Create an Account')] ");
	
	public CustomerLoginPage(WebDriver driver) {
	this.driver = driver;
	}
	public void LoginToLuma(String uname, String password) {
	WebElement login_e = driver.findElement(email_l);
	login_e.sendKeys(uname);
	WebElement password_e = driver.findElement(password_l);
	password_e.sendKeys(password);
	WebElement loginButton_e = driver.findElement(loginButton_l);
	loginButton_e.click();
	}
	public void NavigateToCreateAccount() {
	WebElement createAnAccount_e = driver.findElement(createAccount_l);
	createAnAccount_e.click();
		
	}
}



