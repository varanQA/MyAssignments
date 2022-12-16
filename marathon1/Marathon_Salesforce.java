package marathon1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Marathon_Salesforce {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//Thread.sleep(2000);
		WebElement eleoppor = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();",eleoppor);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Varan Deepak");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("12/15/2022");
		driver.findElement(By.xpath("//span[text()='--None--'][1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		File screenshotAs = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
        File dest = new File("./snap/salesForce.jpg");
        FileUtils.copyFile(screenshotAs, dest);
		
		
		
	}

}
