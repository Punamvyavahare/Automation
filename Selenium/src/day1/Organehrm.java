package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



	
		// TODO Auto-generated method stub
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Organehrm {

			public static void main(String[] args) {
				String desiredChromeVersion = "118.0.5993.70";
				WebDriver driver =new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		     //	WebElement username=test.findElement(By.name("username"));
//		     	username.sendKeys("Admin");
//		     	WebElement passward=test.findElement(By.name("password"));
//		     	passward.sendKeys("admin123");
//		     	
		   // WebElement 	loginpage=test.findElement(By.tagName("\"submit\""));
		    
		  //  loginpage.click();
		    WebElement usernameInput = driver.findElement(By.xpath("(//input[@name='username'])"));
	        usernameInput.clear();        
	        usernameInput.sendKeys("Admin");

	        WebElement passwordInput = driver.findElement(By.xpath("(//input[@name='password'])"));
	        passwordInput.clear();        
	        passwordInput.sendKeys("admin123");

	        WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])"));
	        loginButton.click();
	        
	       WebElement logout=driver.findElement(By.className(" \"oxd-userdropdown-link\""));
	       logout.click();
	       
			

		


	}

}
