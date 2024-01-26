package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DemoBlazemutiplehandling {
	public static void main(String[] args) {
		

			WebDriver driver=setUp("chrome", "https://www.demoblaze.com/");
			
			List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
			List<WebElement> devicepricelist=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
			System.out.println("Device count: "+deviceList.size());
			for(int i=0;i<deviceList.size();i++) {
				System.out.println(deviceList.get(i).getText()+ " "+devicepricelist.get(i).getText());
				//TODO: print device price as well
				
			}

		}

		public static WebDriver setUp(String browserName,String url) {
			WebDriver driver=null;
			if(browserName.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			return driver;
		}
	}