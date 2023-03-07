package section3_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven_propertiesFile {
   public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Selenium\\Secetion3\\acti.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	
	String URL=pobj.getProperty("url");
	System.out.println(URL);
	String UserName=pobj.getProperty("username");
	System.out.println(UserName);
	String Password=pobj.getProperty("password");
	System.out.println(Password);
	
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 //Logic
	 driver.get(URL);
	 driver.findElement(By.id("username")).sendKeys(UserName);
	 driver.findElement(By.name("pwd")).sendKeys(Password);
	 driver.findElement(By.id("loginButton")).click();
}
}
 