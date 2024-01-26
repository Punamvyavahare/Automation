package day0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Openbrowser {

	public static void main(String[] args) {
		
		// WebDriverManager.chromedriver().browserVersion("118.0.5993.70").setup();
		System.setProperty("webdriver.chrome.driver", "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println("Title:"+driver.getTitle());
		
		String sourcecode=driver.getPageSource();
		
		System.out.println("sourcecode length"+sourcecode.length());
		
		driver.close();

	}

}
