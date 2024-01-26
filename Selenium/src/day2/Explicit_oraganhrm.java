package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit_oraganhrm {

	public static void main(String[] args) {
		String desiredChromeVersion = "118.0.5993.70";
		WebDriver test=new ChromeDriver();
		test.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement username =test.findElement(By.name("username"));
		username.sendKeys("Admin"); 
		WebElement passward=test.findElement(By.name("password"));
		passward.sendKeys("admin123");

	}

}
