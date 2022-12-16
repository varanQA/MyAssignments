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

public class Marathon_BookMyShow {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//driver.findElement(By.xpath("//span[@class='sc-kZmsYB ekDEWP ellipsis']")).click();
		driver.findElement(By.xpath("//img[@alt='HYD']")).click();
		String url = driver.getCurrentUrl();
		System.out.println("Your Current Url - "+url);
		driver.findElement(By.xpath("//div[text()='See All ›']")).click();
		driver.findElement(By.xpath("//img[@alt='Love Today']")).click();
		driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
		WebElement eleTname = driver.findElement(By.xpath("//a[contains(text(),'AMB Cinemas')]"));
		String tName = eleTname.getText();
		System.out.println("Fist Theater Shows in Hydrabad Location - "+tName);
		driver.findElement(By.xpath("//div[text()='INFO'][1]")).click();
		WebElement eleParking = driver.findElement(By.xpath("//div[text()='            Parking Facility        ']"));
		String parkingAvailable = eleParking.getText();
		if (parkingAvailable.contains(parkingAvailable)) {
			System.out.println("Parking Facility Available");
			
		}
		else {
			System.out.println("Parking Facility Not Available");
		}
		
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		driver.findElement(By.xpath("(//a[@data-venue-code='AMBH'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Accept'][1]")).click();
		driver.findElement(By.id("pop_1")).click();
		driver.findElement(By.id("proceed-Qty")).click();
		driver.findElement(By.xpath("//div[@id='B_2_021']")).click();
		driver.findElement(By.id("btmcntbook")).click();
		Thread.sleep(2000);
		WebElement eleSubTotal = driver.findElement(By.xpath("//span[@id='subTT']"));
		String subTotal = eleSubTotal.getText();
		System.out.println("Sub Total = "+subTotal);
		File screenshotAs = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
        File dest = new File("./snap/bookMyShow.jpg");
        FileUtils.copyFile(screenshotAs, dest);
		

		
	}

}
