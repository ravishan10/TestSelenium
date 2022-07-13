package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement Staticdropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByIndex(3);
		
		String s = dropdown.getFirstSelectedOption().getText();
		
		System.out.println(s);
		
		dropdown.selectByVisibleText("AED");
		
		String s1 = dropdown.getFirstSelectedOption().getText();
		System.out.println(s1);
		
		dropdown.selectByValue("INR");
		
	Thread.sleep(3000);
	
		driver.close();
		
	}

}
