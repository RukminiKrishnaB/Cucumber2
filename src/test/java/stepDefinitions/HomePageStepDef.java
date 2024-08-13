package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import utility.PicoContainerSetup;

public class HomePageStepDef {
	
	PicoContainerSetup picoContainerSetup ;
	public HomePageStepDef(PicoContainerSetup picoContainerSetup) {
		this.picoContainerSetup = picoContainerSetup;
	}
	By mensWear_l = By.xpath("//span[contains(text(),'Men')]");
	By mensMenu_l = By.xpath("//a[contains(text(),'Jackets')]");
	
	@Given("I navigate to jackshirt page")
	public void i_navigate_to_jackshirt_page() {

	WebElement mensWear_e = picoContainerSetup.driver.findElement(mensWear_l);
	mensWear_e.click();
	WebElement mensMenu_e = picoContainerSetup.driver.findElement(mensMenu_l);
	mensMenu_e.click();
	}
}
