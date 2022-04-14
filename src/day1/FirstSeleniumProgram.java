package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Selenium-Java\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Selenium-Java\\BrowserDrivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Selenium-Java\\BrowserDrivers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		
		
		driver.get("https://www.selenium.dev/downloads/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
