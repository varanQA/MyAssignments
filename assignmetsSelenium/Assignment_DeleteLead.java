package assignmetsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_DeleteLead {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://leaftaps.com/opentaps");

		WebElement eleusername = driver.findElement(By.id("username"));
		eleusername.sendKeys("DemoCsr");
		WebElement elepassword = driver.findElement(By.id("password"));
		elepassword.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decora')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		WebElement elefindlead = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		elefindlead.click();
		WebElement elephone = driver.findElement(By.xpath("//span[text()='Phone']"));
		elephone.click();
		WebElement eleinputphone = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		eleinputphone.sendKeys("9876543210");
		WebElement elefindbutton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elefindbutton.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement eleleadid = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[4]"));
		String leadid = eleleadid.getText();
		//System.out.println("Lead ID - "+ leadid);
		eleleadid.click();
		WebElement eledelete = driver.findElement(By.linkText("Delete"));
		eledelete.click();
		System.out.println("Lead ID - "+ leadid);
		WebElement elefindlead1 = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		elefindlead1.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement eleinputleadid = driver.findElement(By.xpath("//input[@name='id']"));
		eleinputleadid.sendKeys(leadid);
		WebElement elesearch = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		elesearch.click();








	}

}
