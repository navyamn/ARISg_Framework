package GoogleTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Base {

		Properties properties;
		WebDriver driver;
		FileInputStream fis;
		String vBrowser;
		
		@Test
		public WebDriver BrowserCall() throws IOException
	    {

	    properties=new Properties();
	    fis=new FileInputStream("C:\\Users\\00005379\\eclipse-workspace\\Selenium_Training_Day1\\AG_Framework1\\Data.Properties");
	    properties.load(fis);
	    vBrowser=properties.getProperty("Browser");

	    if(vBrowser.equalsIgnoreCase("Chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browser\\chromedriver.exe");
	        driver=new ChromeDriver();
	    }
	    else if(vBrowser.equalsIgnoreCase("Edge"))
	    {
	        System.setProperty("webdriver.edge.driver", "C:\\Selenium\\browser\\msedgedriver.exe");
	        driver=new EdgeDriver();   
	    }
	    else
	    {
	        System.out.println("Invalid Browser");
	    }
		return driver;
		
	}

}
