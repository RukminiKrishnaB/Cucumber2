package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerHomePage {

	WebDriver driver ;
	public CustomerHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By createAccount_L = By.xpath("//div[@class='panel wrapper']//a[contains(text(), 'Create an Account' )] ");
	public By signIn_L = By.xpath("//div[@class='panel wrapper']//a[contains(text(), 'Sign In' )] ");
	public By userName_L = By.xpath("//div[@class='panel header']//li[@class='greet welcome']//span"); 
	
	public void navigateToCreateNewAccount() {
		WebElement createAccount_Element = driver.findElement(createAccount_L);
		createAccount_Element.click();	
	}
	public void navigateToCustomerLoginPage() {
		WebElement signIn_Element = driver.findElement(signIn_L);
		signIn_Element.click();
	}
	public String getLoggedInUserName() {
		WebElement userName_e = driver.findElement(userName_L);
		return userName_e.getText();
}
}
