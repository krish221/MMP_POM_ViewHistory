package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test 
{
	 public static WebDriver driver;
	 public static FileInputStream fis;
	 public static Properties or = new Properties();
	 public static Properties config = new Properties();
	
	
	public Base_Test() 
	{
		if(driver==null)
		{
		try {
			fis =new FileInputStream("./src/test/resources/property/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fis =new FileInputStream("./src/test/resources/property/or.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			or.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(config.getProperty("TestURL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}		
	}
}
