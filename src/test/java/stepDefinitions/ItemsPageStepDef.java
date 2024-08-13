package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.When;
import utility.PicoContainerSetup;

public class ItemsPageStepDef {
	
	PicoContainerSetup picoContainerSetup;
	public ItemsPageStepDef(PicoContainerSetup picoContainerSetup) {
		this.picoContainerSetup = picoContainerSetup ;
	}
	public By getSizeLocator (String size) {
		return By.xpath("//a[contains(text(),'Proteus Fitness Jackshirt')]//ancestor::div[@class='product details product-item-details']//child::div[text()='"+size+"']");	
	}
	public By getColorLocator (String color) {
		return By.xpath("//a[contains(text(),'Proteus Fitness Jackshirt')]//ancestor::div[@class='product details product-item-details']//child::div[@option-label='"+color+"'] ");
		
	}
	
	@When("I select a jacket of {string} {string}")
	public void i_select_a_jacket_of(String size, String color) {
		WebElement size_e = picoContainerSetup.driver.findElement(getSizeLocator(size));
		size_e.click();
		WebElement color_e = picoContainerSetup.driver.findElement(getColorLocator(color));
		color_e.click();
	}
	
	@When("click on add to cart button")
	public void click_on_add_to_cart_button() {
	}

}
