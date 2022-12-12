package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	public static Properties properties = null;
	public static WebDriver driver = null;

	public Properties loadPropertyFile() throws IOException {

		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;

	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String edgedriverLocation = properties.getProperty("edgedriverlocation");
		String chromedriverLocation = properties.getProperty("chromedriverlocation");

		if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", edgedriverLocation);
			driver = new EdgeDriver();

		} else {
			browser.equalsIgnoreCase("chrome");
			System.setProperty("webdriver.chrome.driver", chromedriverLocation);
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterSuite
	public void tearDown() {
		//driver.quit();
	}
}
