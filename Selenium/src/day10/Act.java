package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demo.vtiger.com/vtigercrm/index.php");

        WebElement usernameInput = driver.findElement(By.id("username"));
    usernameInput.clear();        
    usernameInput.sendKeys("Admin");

    WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.clear();
        passwordInput.sendKeys("admin");

    WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
    loginButton.click();
    WebElement signout=driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
    signout.click();
      
    }






	}


