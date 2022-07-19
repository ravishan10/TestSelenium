package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]/span[2]")).click();
		
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofMillis(10000));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement options = driver.findElement(By.cssSelector("select[class='form-control']"));
		
		Select dropdown = new Select(options);
		
		dropdown.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-footer .btn-info")));
		
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class='card-footer']/button"));
		
		for(int i=0;i<lists.size();i++)
		{
			
			lists.get(i).click();
			
		}
		
		driver.findElement(By.xpath("//li[@class='nav-item active']/a")).click();
		
		driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
		
		driver.findElement(By.id("country")).sendKeys("IND");
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='suggestions']/ul[1]/li[1]/a")));
		
		driver.findElement(By.xpath("//div[@class='suggestions']/ul[1]/li[1]/a")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("checkbox2")).click();
		
		
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
	}

}
