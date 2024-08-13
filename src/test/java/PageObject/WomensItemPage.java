package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomensItemPage {
	
	WebDriver driver ; 
	public WomensItemPage(WebDriver driver) {
		this.driver = driver;
		}
	public By women_L = By.xpath("ul[@id=\"ui-id-2\"]//span[contains(text(),\"Women\")] ");
	public By womenTops_L = By.xpath("//div[@class=\"categories-menu\"]//span[contains(text(),\"Tops\")]");
	
	public void navigateToWomenPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement WomenTops_Element = driver.findElement(women_L);
		wait.until(ExpectedConditions.elementToBeClickable(WomenTops_Element));
		WomenTops_Element.click();
	}
	public void navigateToWomenTops() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement WomenTops_Element2 = driver.findElement(womenTops_L);
		wait.until(ExpectedConditions.elementToBeClickable(WomenTops_Element2));
		WomenTops_Element2.click();
	}

}
