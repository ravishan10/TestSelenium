package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynaminDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("sri");
		Thread.sleep(2000);
		
		List<WebElement> options= driver.findElements(By.cssSelector(".ui-menu-item"));
		
		for(WebElement option :options) {
			
			if(option.getText().equalsIgnoreCase("Sri Lanka"))
			{
				option.click();
				break;
			}
		}

	}

}
