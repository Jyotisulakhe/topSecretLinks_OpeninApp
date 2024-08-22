package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected WebDriver driver;
	@BeforeClass// this will execute before any class 
	public void setup() throws IOException {
		driver=new ChromeDriver();//craeting object of ChromeDriver for chrome browser opening
		Properties pr= new Properties();//properites object
		//craeting object of FileInputStream for accessing properties from basic file, put path of that basic.properties file
		FileInputStream fis=new FileInputStream("C:\\Users\\Asus\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\openinAppAutomate\\src\\test\\resources\\basic.properties");
		pr.load(fis);//this will load properties file that provide on FileInputStream
		String url=pr.getProperty("url");//accesiing url from  basic.properties file
		driver.get(url);// should open url of application
		
		String instaurl=pr.getProperty("instaurl");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait, this will wait if  have any exception then it will wait till mentioned time and then throw exception
		driver.manage().window().maximize();// for maximizing window
		
		
	}
	
	

}
