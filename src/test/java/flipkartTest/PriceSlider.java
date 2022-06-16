package flipkartTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PriceSlider {
	
	
	WebDriver driver;
	@Test(priority = 1)
	public void openBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sreen\\Selenium\\drivers\\chromedriver3.exe");
		 driver = new ChromeDriver();
	        driver.manage().window().maximize();
		
	}
	@Test(priority = 2)
	public void openUrl() throws Exception {
	
				driver.get("https://www.flipkart.com/");
				Thread.sleep(2000);	
	}
	@Test(priority = 3)
	public void closingModel() throws Exception {
				driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
				driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]")).click();
				Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void openingOptions() throws InterruptedException {
	
				WebElement e = driver.findElement(By.xpath("//span[contains(text(), \"Electronics\")]"));
				
				Actions act = new Actions(driver);		
				
				act.moveToElement(e).perform();
				 Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[@href=\"/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi\"]")).click();
				Thread.sleep(2000);
	}
	
	
	
	@Test(priority = 5)
	public void priceSlider() throws Exception {
		WebElement e = driver.findElement(By.xpath("//input[@class=\"_3704LK\"]//following::select[2]"));
		Thread.sleep(2000);
	    Select s = new Select(e);
	    s.selectByIndex(3);
				 
	}
	
	@Test(priority = 6)
	public void close() {
		
		driver.close();
		}

}
