package wchtorg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl= "https://www.wcht.org.uk/\n";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(baseUrl);
        String getTitle= driver.getTitle();
        System.out.println();
        driver.close();
    }
}
