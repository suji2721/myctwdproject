package flipkartTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class HomePage<Webdriver> {
	
	WebDriver driver;
	@Test(priority = 1)
	public void openBrowser() throws Exception {
		
		driver = new ChromeDriver();
		       
		
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
	public void redmiGoPage() throws Exception {
					
					driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("Redmi 9A Sport (Carbon Black, 32 GB)");
					driver.findElement(By.xpath("//input[@class=\"_3704LK\"]//following::button[1]")).click();
					Thread.sleep(2000);
	}
			    @Test(priority = 8)
			    public void clickOnVideo() throws Exception   {
			    	
			    	Dimension d = new Dimension(600, 650);
					driver.manage().window().setSize(d);
					
					// Part 1
					// To capture the Main window name and print the same
					String mw = driver.getWindowHandle();
					
					System.out.println("Main window name is:- " + mw);
					System.out.println("=============================================================");

					
					// Part 2
					// Generate a new window
					driver.findElement(By.xpath("//input[@class=\"_3704LK\"]//following::img[11]")).click();

					driver.manage().window().maximize();
					
					// Collect all the list of window handles in one container
					Set<String> awn = driver.getWindowHandles();		

					System.out.println("All window name is:- " + awn);
					System.out.println("=============================================================");

					
					// Part 3
					/*
					 * Using the Array concept the two window names will get the identity as window
					 * 1 and 2 respectively
					 */

					String Window1 = (String) awn.toArray()[0];
					System.out.println("Window 1 name is:- " + Window1);
					System.out.println("=============================================================");

					String Window2 = (String) awn.toArray()[1];
					System.out.println("Window 2 name is:- " + Window2);
					System.out.println("=============================================================");

					// Part 4
					// Switch between the windows using the defined user window names
					
					driver.switchTo().window(Window2);
					Thread.sleep(3000);
			    
				
					
					WebElement e1 = driver.findElement(By.xpath("//div[@class=\"_1AuMiq P9aMAP\"]"));
					
					
					e1.click();
					
					Actions act1 = new Actions(driver);		
					
					act1.moveToElement(e1).perform();
					
					/*Actions act1 = new Actions(driver);
					
					act1.moveToElement(e1)
					.sendKeys("601201")
					.build()
					.perform();*/
					
					Thread.sleep(2000);
					driver.switchTo().window(Window1);
					Thread.sleep(2000);
					driver.switchTo().window(Window2);
					Thread.sleep(2000);
					
					WebElement e2 = driver.findElement(By.xpath("//input[@class=\"_36yFo0\"]"));
					
					 e2.sendKeys(Keys.NUMPAD6);
					 e2.sendKeys(Keys.NUMPAD0);
					 e2.sendKeys(Keys.NUMPAD0);
					 e2.sendKeys(Keys.NUMPAD0);
					 e2.sendKeys(Keys.NUMPAD0);
					 e2.sendKeys(Keys.NUMPAD1);
					
					WebElement e3 = driver.findElement(By.xpath("//span[@class=\"_2P_LDn\"]"));
					
					e3.click();
					
					driver.findElement(By.xpath("//span[@class=\"YxlyDn\"]")).click();
					
					driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _1KAjNd\"]")).click();
					
					driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
					
			    
      
		      
			    
			    }
}
			    
				
	
	

	
	
