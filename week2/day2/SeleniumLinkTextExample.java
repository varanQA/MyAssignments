package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLinkTextExample {

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

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();





	}	

}
