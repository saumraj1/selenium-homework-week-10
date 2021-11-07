package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl ="https://demo.nopcommerce.com/\n";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();  //maximise window
        String getTitle= driver.getTitle();  // title get karava mate
        System.out.println(getTitle); // title print karava mate
        driver.close(); //

    }
}
