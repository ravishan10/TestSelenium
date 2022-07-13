package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;
//import org.openqa.selenium.edge.EdgeDriver;

public class PassengerDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		 String s1= driver.findElement(By.id("divpaxinfo")).getText();
			
		 System.out.println(s1);
		
		int i=1;
		
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();	
			i++;
		}
		
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		 String s2= driver.findElement(By.id("divpaxinfo")).getText();
		
		 System.out.println(s2);
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}
	

}
