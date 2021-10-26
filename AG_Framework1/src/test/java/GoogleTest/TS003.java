package GoogleTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TS003 extends Base{

	
	@Test
	public void STEP03() throws IOException, InterruptedException
	{
		driver=BrowserCall();
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		Assert.assertEquals(properties.getProperty("HomeTitle"), driver.getTitle());
		System.out.println("End of the test");
		}
	@AfterTest
	public void BrowserClose() {
		driver.close();
	}
}
