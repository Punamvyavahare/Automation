package day1;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vaildatepageactime {

	public static void main(String[] args) {
		 String desiredChromeVersion = "118.0.5993.70";
		 WebDriver demo=new ChromeDriver();
         demo.get("https://demo.actitime.com/login.do");
         WebElement Userinputfield=demo.findElement(By.id("username"));
         Userinputfield.sendKeys("admin");
         WebElement Passwardfield=demo.findElement(By.name("pwd"));
         Passwardfield.sendKeys("manager");
        WebElement LoginButton=demo.findElement(By.id("loginButton"));
        LoginButton.click();
        String title = demo.getTitle();

        String expectedTitle = "actiTIME - Login";
        String expectedUrl = "https://demo.actitime.com/login.do";
        
        if (title.equals(expectedTitle)) {
            System.out.println("Title is as expected");
        } else {
            System.out.println("Title is not as expected");
        }

}
}