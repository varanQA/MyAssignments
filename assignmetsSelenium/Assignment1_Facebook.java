package assignmetsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Facebook {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/");

		WebElement eleCreateAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		eleCreateAcc.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement eleName = driver.findElement(By.xpath("//input[@name='firstname']"));
		eleName.sendKeys("Test");
		WebElement eleSurName = driver.findElement(By.xpath("//input[@name='lastname']"));
		eleSurName.sendKeys("Leaf");
		WebElement eleMobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		eleMobile.sendKeys("9876543210");
		WebElement elePass = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		elePass.sendKeys("Test@Leaf");
		WebElement eleDate = driver.findElement(By.xpath("//select[@id='day']"));
		Select date = new Select(eleDate);
		date.selectByIndex(10);
		//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement eleMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(eleMonth);
		month.selectByVisibleText("Oct");
		WebElement eleYear = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(eleYear);
		year.selectByValue("1990");
		WebElement eleRadio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		eleRadio.click();
		WebElement eleSignin = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		eleSignin.click();





	}
}
