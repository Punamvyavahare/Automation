package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandling1 {
	
	

	public static WebDriver setUp(String browserName, String url) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;}
	public static void main(String[] args) {
		WebDriver driver =setUp("Chrome", "https://demo.automationtesting.in/Register.html");
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		Select slt=new Select(skillDropdown);
		System.out.println("Is multi-selected allowed or not?" +slt.isMultiple());
		System.out.println("Default value select ="+slt.getFirstSelectedOption().getText());
		List<WebElement> skilllist =slt .getOptions();
		System.out.println("skill count ="+ skilllist.size());
		
		for(int i=0;i<skilllist.size();i++) {
			System.out.println(skilllist.get(i).getText());
			
			
		
	}
		System.out.println("======year drop down=======");
		WebElement yeardropdown=driver .findElement(By.id("yearbox"));
		Select year=new Select(yeardropdown);
		System.out.println("Is multi select or not ="+year.isMultiple());
		System.out.println("default value is="+year.getFirstSelectedOption().getText());
		List<WebElement> listofyear=year .getOptions();
		System.out.println("years count ="+ listofyear.size());
		for(int i=0;i<listofyear.size();i++){
			System.out.println(listofyear.get(i).getText());
		}
	
	
	
	}
	
	
}


