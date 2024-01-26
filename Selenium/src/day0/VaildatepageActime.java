package day0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VaildatepageActime {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "D:\\Acceleretion -Testing\\workspace\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        String desiredChromeVersion = "118.0.5993.70";
        WebDriver test = new ChromeDriver();
        test.get("https://demo.vtiger.com/vtigercrm/index.php");
        
        String title = test.getTitle();
        int titleLength = title.length();
        System.out.println("Current title: " + title);
        System.out.println("Title length: " + titleLength);
        
        String currentUrl = test.getCurrentUrl();
        int urlLength = currentUrl.length();
        
        String expectedTitle = "vtiger";
        String expectedUrl = "https://demo.vtiger.com/vtigercrm/index.php";
        
        if (title.equals(expectedTitle)) {
            System.out.println("Title is as expected");
        } else {
            System.out.println("Title is not as expected");
        }

        if (currentUrl.equals(expectedUrl)) {
            System.out.println("URL is as expected");
        } else {
            System.out.println("URL is not as expected");
        }

        // Step 6: Close the browser
       // test.quit();
    }
}
