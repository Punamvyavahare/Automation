package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Uvvalidation_Actime {

	public static void main(String[] args) {
		String desiredChromeVersion = "118.0.5993.70";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		WebElement Userinputfield=driver.findElement(By.id("username"));
		System.out.println("User input field visible" + Userinputfield.isDisplayed());
		//System.out.println("User input field editable"+Userinputfield.is Enabled());
		System.out.println("is username input field editable? " +Userinputfield.isEnabled());
		//System.out.println("user name input field default value" +Userinputfield.getAttribute("Username"));
		System.out.println("username input field default value- "+Userinputfield.getAttribute("placeholder"));
		WebElement Passwardinputfield=driver.findElement(By.name("pwd"));
		System.out.println("Passwardinputfieldvisible is visible?"+Passwardinputfield.isDisplayed());
		System.out.println("Passwardinputfieldvisible is editable? "+Passwardinputfield.isEnabled());
		System.out.println("Passwardinputfieldvisible is defalut value"+Passwardinputfield.getAttribute("placeholder"));
		
		WebElement keepMeLoggedInCheckbox=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println("is checkbox visible? "+keepMeLoggedInCheckbox.isDisplayed());
		System.out.println("is checkbox clickable? "+keepMeLoggedInCheckbox.isEnabled());
		System.out.println("is checkbox by default selected? "+keepMeLoggedInCheckbox.isSelected());
		
		keepMeLoggedInCheckbox.click();
		System.out.println("after clicking on checkbox, check whether it's selected or not? "+keepMeLoggedInCheckbox.isSelected());
		
		WebElement LoginButton=driver.findElement(By.id("loginButton"));
		System.out.println("LoginButton is visible?"+LoginButton.isDisplayed());
		System.out.println("LoginButton is clickable?"+LoginButton.isEnabled());
		System.out.println("LoginButton is name-"+LoginButton.getText());
		
		
	}

}
