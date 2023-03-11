package section3_selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestingAssertPass {
  @Test
  public void checkAssertPass()
  {
	     System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.google.com/");
		 String actualTitle="Google";
		 String expTitle=driver.getTitle();
		 Assert.assertEquals(actualTitle, expTitle);
		 System.out.println("Pass");
  }
}
