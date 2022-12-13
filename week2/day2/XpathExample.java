package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExample {
	
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://leaftaps.com/opentaps");

		WebElement eleusername = driver.findElement(By.xpath("//input[@class='inputLogin']"));
		eleusername.sendKeys("DemoCsr");

		WebElement elepassword = driver.findElement(By.xpath("//input[@id='password']"));
		elepassword.sendKeys("crmsfa");

        driver.findElement(By.xpath("//input[contains(@class,'decora')]")).click();
		

		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		
	}

}
