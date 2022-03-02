package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {

	WebDriver driver;
	Properties pro;
	
	public BaseClass() throws FileNotFoundException, IOException {
		
		pro = new Properties();
		pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\Configurations.properties")));
		
	}

	public void BrowserInitializaton() throws InterruptedException {
		String BrowserName = pro.getProperty("Browser");
		System.out.println("Browser Name is :"+BrowserName);
		if(BrowserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+ "\\Resources\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else if(BrowserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(BrowserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver",System.getProperty("user.dir")+ "\\Resources\\operadriver.exe");
			driver = new OperaDriver();
		}else if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}else  {
			System.out.println("Running in the default Browser i.e edge");
			System.setProperty("webdriver.msedge.driver", "\\Resources\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Browser executed sucessfully");
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
	}
	
	
}
