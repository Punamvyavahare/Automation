package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uvaildation_orangehrm {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String desiredChromeVersion = "118.0.5993.70";
	WebDriver test=new ChromeDriver();
	test.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	test.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement Usernamefield=test.findElement(By.name("username"));
	System.out.println("User name is visible-"+Usernamefield.isDisplayed());
	System.out.println("User name is editable-"+Usernamefield.isEnabled());
	System.out.println("User name is default value is-"+Usernamefield.getAttribute("placeholder"));
	WebElement Passwardnemefield=test.findElement(By.name("password"));
	System.out.println("passward field is visiable-"+Passwardnemefield.isDisplayed());
	System.out.println("passward field is editable"+Passwardnemefield.isEnabled());
	System.out.println("passward field default value"+Passwardnemefield.getAttribute("placeholder"));
	WebElement LoginButton =test.findElement(By.className("oxd-button"));
	System.out.println("LoginButton is visible?"+LoginButton.isDisplayed());
	System.out.println("LoginButton is clickable?"+LoginButton.isEnabled());
	System.out.println("LoginButton is name-"+LoginButton.getText());
	System.out.println("Login text size: "+LoginButton.getCssValue("font-size"));
	System.out.println("Login text family: "+LoginButton.getCssValue("font-family"));
	System.out.println("Login text color: "+LoginButton.getCssValue("color"));
	System.out.println("Login button background color: "+LoginButton.getCssValue("background-color"));
	
	WebElement forgetpassward=test.findElement(By.className("oxd-text"));
	System.out.println("forgetpassward field is visible?"+forgetpassward.isDisplayed());
	System.out.println("forgetpassward field is clickable?"+forgetpassward.isEnabled());
	System.out.println("forgetpassward field is name-"+forgetpassward.getText());
	
	WebElement Errormessage=test.findElement(By.className("data-test='error"));
    System.out.println("Errormessage is text"+Errormessage.getText()); 
	
	

	}

}
