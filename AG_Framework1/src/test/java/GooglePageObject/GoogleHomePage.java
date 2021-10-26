package GooglePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	public WebDriver driver;

	public GoogleHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By SearchBox=By.name("q");
	By SearchButton=By.name("btnK");
	
	public WebElement FSearchBox()
	{
		return driver.findElement(SearchBox);
	}
	
	public WebElement FSearchButton()
	{
		return driver.findElement(SearchButton);
	}

}
