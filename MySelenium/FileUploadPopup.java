package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
driver.findElement(By.name("upfile")).sendKeys("/Users/nigora/Desktop/QA/test_pyramid.jpeg ");
	// input type = "file" name = "upfile"; you can not automate if you dont have type = "file"
		
		
		
		
		
		
		
	}

}