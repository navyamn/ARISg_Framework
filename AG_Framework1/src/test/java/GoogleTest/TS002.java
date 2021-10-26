package GoogleTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import GooglePageObject.GoogleHomePage;
import GooglePageObject.GoogleResultPage;

public class TS002 extends Base{

	
	@Test
	public void STEP02() throws IOException, InterruptedException
	{
		driver=BrowserCall();
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//Enter the search data
		GoogleHomePage GHP=new GoogleHomePage(driver);
		GHP.FSearchBox().sendKeys("Aris Global");
		Thread.sleep(2000);
		GHP.FSearchButton().click();
		Thread.sleep(2000);
		
		
		//Capture the Result Statistics
		GoogleResultPage GRP=new GoogleResultPage(driver);
		String vRes=GRP.FResultStats().getText();
		System.out.println(vRes);
		
			}
	@AfterTest
	public void BrowserClose() {
		driver.close();
	}
}
