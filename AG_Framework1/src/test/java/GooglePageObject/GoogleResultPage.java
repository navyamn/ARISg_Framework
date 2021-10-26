package GooglePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage {

	public WebDriver driver;

	public GoogleResultPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By ResultText = By.id("result-stats");
	
	public WebElement FResultStats() {
		
		return(driver.findElement(ResultText));
	}
}
