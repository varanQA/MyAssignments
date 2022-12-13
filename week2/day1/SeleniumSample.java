package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSample {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://leaftaps.com/opentaps");
		
		WebElement eleusername = driver.findElement(By.id("username"));
		eleusername.sendKeys("Demosalesmanager");
		
		WebElement elepassword = driver.findElement(By.id("password"));
		elepassword.sendKeys("crmsfa");
		
		WebElement eleclick = driver.findElement(By.className("decorativeSubmit"));
		eleclick.click();
		
		
		
		
	}
}


