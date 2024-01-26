package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.EqualsMethod;

public class Explicatewait_Actime {

	public static void main(String[] args) {
		String desiredChromeVersion = "118.0.5993.70";
		
		WebDriver demo=new ChromeDriver();
		
	//	demo.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		demo.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		demo.get("https://demo.actitime.com/login.do");
		WebElement Username=demo.findElement(By.id("username"));
		Username.sendKeys("admin");
		WebElement passward=demo.findElement(By.name("pwd"));
		passward.sendKeys("manager");
		WebElement loginbutton=demo.findElement(By.id("loginButton"));
		loginbutton.click();
		String expectedtitle="actiTIME - Login";
		WebDriverWait wait=new WebDriverWait(demo, Duration.ofSeconds(20));
	  //  wait.until(ExpectedConditions.titleIs(expectedtitle));
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
	    String actualhomepage=demo.getTitle();
	    System.out.println("Home page actual title"+actualhomepage);
	    System.out.println("Home page expected title"+expectedtitle);
	    System.out.println("login is sucessfully"+ actualhomepage.equals(expectedtitle));
	    
	    WebElement logout=demo.findElement(By.id("logoutLink"));
	    logout.click();
	    demo.close();
	    
		
	}

}
