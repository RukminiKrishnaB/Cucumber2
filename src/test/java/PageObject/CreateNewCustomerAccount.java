package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewCustomerAccount {
	WebDriver driver;

	public CreateNewCustomerAccount(WebDriver driver) {
		this.driver = driver;
	}
	By firstName_l = By.id("firstname");
	By lastName_l = By.id("lastname");
	By emailAddress_l = By.id("email_address");
	By password_l = By.id("password");
	By confirmation_password_l = By.id("confirmation_password");
	By createAccount_l = By.xpath("//span[contains(text(),'Create an Account')] ");
	
	 public void SetPersonalInfo(String firstname, String lastname) {
		 WebElement firstName_e = driver.findElement(firstName_l);
		 firstName_e.sendKeys(firstname);
		 WebElement lastName_e = driver.findElement(lastName_l);
		 lastName_e.sendKeys(firstname);	 
	 }
	 public void setSignInInfo(String email, String password) {
		 WebElement emailAddress_e = driver.findElement(emailAddress_l);
		 emailAddress_e.sendKeys(email);
		 WebElement password_e = driver.findElement(password_l);
		 password_e.sendKeys(password);
		 WebElement confirmation_password_e = driver.findElement(confirmation_password_l);
		 confirmation_password_e.sendKeys(password);	 
	 }
	 public void createAnAccount(String firstname, String lastname, String email, String password) {
		 SetPersonalInfo(firstname,lastname) ;
		 setSignInInfo(email,password);
		 WebElement createAnAccount_e = driver.findElement(createAccount_l);
	     createAnAccount_e.click();
	 }
}
