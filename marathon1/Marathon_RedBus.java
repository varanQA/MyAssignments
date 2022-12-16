package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Marathon_RedBus {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(" https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement eleFrom = driver.findElement(By.xpath("//input[@id='src']"));
		eleFrom.sendKeys("CHENNAI");
		WebElement eleFromSelect = driver.findElement(By.xpath("//li[text()='Koyambedu, Chennai']"));
		eleFromSelect.click();
		
		WebElement eleTo = driver.findElement(By.id("dest"));
		eleTo.sendKeys("BANG");
		WebElement eleToSelect = driver.findElement(By.xpath("//li[text()='Majestic, Bangalore']"));
		eleToSelect.click();
		
		driver.findElement(By.id("onward_cal")).click();
		
		WebElement eledate = driver.findElement(By.xpath("//td[text()='16']"));
		eledate.click();
		
		WebElement elesearch = driver.findElement(By.xpath("//button[@id='search_btn']"));
		elesearch.click();
		
		WebElement eleNoOfBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		Thread.sleep(2000);
		String text = eleNoOfBuses.getText();
		System.out.println("No of Buses From Chennai to Banglore = "+text);
		
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		
		WebElement eleSecResulting = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]"));
	String text1 = eleSecResulting.getText();
		System.out.println("No of Buses From Chennai to Banglore = "+text1);
		Thread.sleep(2000);
		WebElement eleview = driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]"));
		//eleview.click();
		driver.executeScript("arguments[0].click();",eleview);
		
		
		
	}

}
