package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.close();
		
	}

}
