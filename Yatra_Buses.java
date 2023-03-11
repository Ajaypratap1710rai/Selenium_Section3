package section3_selenium;
	
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Yatra_Buses{
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 ChromeOptions opt=new ChromeOptions();
	 opt.addArguments("--disable-notifications");
	 WebDriver driver=new ChromeDriver(opt);
//	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.yatra.com/");
	 //driver.findElement(By.xpath("//span[text()='Buses']")).click();
	 //driver.findElement(By.cssSelector("input[name='bus_leaving']")).sendKeys("Delhi",Keys.TAB,"Goa");
	  driver.findElement(By.xpath("//span[text()='Buses']")).click();
		driver.findElement(By.id("BE_bus_from_station")).click();
		driver.findElement(By.xpath("//div[@class='viewport']/div/div/li[3]")).click();
		driver.findElement(By.xpath("//div[@class='viewport']/div/div/li[4]")).click();

	 driver.findElement(By.id("BE_bus_depart_date")).click();
		
		driver.findElement(By.id("30/12/2022")).click();
		driver.findElement(By.id("BE_bus_search_btn")).click();
		String s1=driver.findElement(By.cssSelector("[class='fbold']")).getText();
		System.out.println(s1);
}
}
	