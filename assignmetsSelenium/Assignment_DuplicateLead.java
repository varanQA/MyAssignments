package assignmetsSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_DuplicateLead {


	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://leaftaps.com/opentaps");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		WebElement eleusername = driver.findElement(By.id("username"));
		eleusername.sendKeys("DemoCsr");
		WebElement elepassword = driver.findElement(By.id("password"));
		elepassword.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decora')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		WebElement elefindlead = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		elefindlead.click();
		WebElement eleemail = driver.findElement(By.xpath("//span[text()='Email']"));
		eleemail.click();
		WebElement eleinputemail = driver.findElement(By.xpath("//input[@name='emailAddress']"));
		eleinputemail.sendKeys("varandeepak@testleaf.com");
		WebElement elesearch = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elesearch.click();
		WebElement elename = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		String name = elename.getText();
		elename.click();
		System.out.println("Lead Name = "+name);
		WebElement eleduplicate = driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
		eleduplicate.click();
		String title = driver.getTitle();
		System.out.println("Titile Name = "+title);
		WebElement elecreateduplicate = driver.findElement(By.xpath("//input[@value='Create Lead']"));
		elecreateduplicate.click();
		WebElement elefindlead1 = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		elefindlead1.click();
		WebElement eleemail1 = driver.findElement(By.xpath("//span[text()='Email']"));
		eleemail1.click();
		WebElement eleinputemail1 = driver.findElement(By.xpath("//input[@name='emailAddress']"));
		eleinputemail1.sendKeys("varandeepak@testleaf.com");
		WebElement elesearch1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elesearch1.click();
		WebElement elename1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[2]"));
		String name1 = elename1.getText();

		if (name .equals(name1)) {
			System.out.println("The Name Getting Duplicated");

		}
		else {
			System.out.println("Duplicate function not working");
		}





	}
}
