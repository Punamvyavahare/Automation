package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicatwait_Acttime {

	public static void main(String[] args) {
		String desiredChromeVersion = "118.0.5993.70";
		WebDriver test=new ChromeDriver();
		test.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		test.get("https://demo.actitime.com/login.do");
		
		WebElement Username=test.findElement(By.id("username"));
		Username.sendKeys("admin");
		WebElement passward= test.findElement(By.name("pwd"));
		passward.sendKeys("manager");
       WebElement loginbutton=test.findElement(By.id("loginButton"));
       loginbutton.click();
       
       
	}

}