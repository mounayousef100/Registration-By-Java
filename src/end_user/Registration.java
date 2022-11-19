package end_user;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		String testEmail = "mounayousef100@gmail.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdallah\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver .get("https://www.booking.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a/span")).click();
		driver.findElement(By.className("ZMH9h0HCYH9GGNxHnXGJ")).sendKeys(testEmail);	
		
		driver.findElement(By.className("yfCvx60qsR50VNBG15jF")).click();
		driver.findElement(By.className("u55FYmQIjZnd2OBbq78g")).click();
		
		driver.findElement(By.className("access-panel__social-button-image")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("love1001912@yahoo.com");
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("@66666666@");
		driver.findElement(By.id("loginbutton")).click();
		
		driver.findElement(By.name("ss")).sendKeys("jordan");
		driver.findElement(By.className( "e57ffa4eb5")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0.250)");
		
		
		
		
	}

}
