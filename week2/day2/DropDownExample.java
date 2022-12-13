package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownExample {
	
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://leaftaps.com/opentaps");

		WebElement eleusername = driver.findElement(By.id("username"));
		eleusername.sendKeys("DemoCsr");

		WebElement elepassword = driver.findElement(By.id("password"));
		elepassword.sendKeys("crmsfa");

		WebElement eleclick = driver.findElement(By.className("decorativeSubmit"));
		eleclick.click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(elesource);
		source.selectByVisibleText("Conference");
		
		WebElement eleindus = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry = new Select(eleindus);
		industry.selectByValue("IND_FINANCE");
		
		WebElement eleowner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership = new Select(eleowner);
		ownership.selectByIndex(5);
		
		
		





	}	


}
