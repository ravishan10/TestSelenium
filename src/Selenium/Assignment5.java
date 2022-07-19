package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption3")).click();
		String str =driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
		System.out.println(str);
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropdown);
		
		s.selectByVisibleText(str);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(str);
		driver.findElement(By.id("alertbtn")).click();
		
		String str1 = driver.switchTo().alert().getText();
				
				
		System.out.println(str1);
		
		if(str1.contains(str))
		{
			System.out.println("Pass");
		}
		else {
			
			System.out.println("Fail");
		}
		driver.switchTo().alert().accept();
	}

}
