package assignmetsSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_ACME {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		WebElement elesearch = driver.findElement(By.xpath("//button[@type='submit']"));
		elesearch.click();
		String title = driver.getTitle();
		System.out.println("Current Title = "+title);
		WebElement elelogout = driver.findElement(By.xpath("//a[text()='Log Out']"));
		elelogout.click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}
