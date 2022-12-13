package assignmetsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_CreateContact {


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
		WebElement elecontacts = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		elecontacts.click();
		WebElement elecreatecontacts = driver.findElement(By.xpath("//a[contains(text(),'Create ')]"));
		elecreatecontacts.click();
		WebElement elefirstname = driver.findElement(By.xpath("//input[@id='firstNameField']"));
		elefirstname.sendKeys("VARAN");
		WebElement elelastname = driver.findElement(By.xpath("//input[@id='lastNameField']"));
		elelastname.sendKeys("DEEPAK");
		WebElement eledept = driver.findElement(By.xpath("//input[@name='departmentName']"));
		eledept.sendKeys("QA");
		WebElement eledescription = driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]"));
		eledescription.sendKeys("QA-Testing a description field");
		WebElement eleemail = driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']"));
		eleemail.sendKeys("varandeepak@testleaf.com");
		WebElement elestate = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select state = new Select(elestate);
		state.selectByVisibleText("Indiana");
		WebElement elecreatebutton = driver.findElement(By.xpath("//input[@name='submitButton']"));
		elecreatebutton.click();
		WebElement eleedit = driver.findElement(By.xpath("//a[text()='Edit']"));
		eleedit.click();
		WebElement eledescription1 = driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]"));
		eledescription1.clear();
		WebElement eleimpnotes = driver.findElement(By.xpath("//textarea[@name='importantNote']"));
		eleimpnotes.sendKeys("QA-Edit feature testing in important notes field");	
		WebElement eleupdate = driver.findElement(By.xpath("//input[@value='Update']"));
		eleupdate.click();
		System.out.println("Resulting Page Title is - "+ driver.getTitle());





	}
}