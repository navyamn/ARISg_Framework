package GoogleTest;

import java.io.IOException;
import org.testng.annotations.Test;
public class TS001 extends Base{
			@Test
	    public void STEP01() throws IOException, InterruptedException
	    {
	        driver=BrowserCall();
	        driver.get(properties.getProperty("URL"));
	        driver.manage().window().maximize();
	        Thread.sleep(4000);
	        driver.close();
	    }

}
