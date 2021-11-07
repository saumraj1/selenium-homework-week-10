package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/\n";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get(baseUrl);
       driver.manage().window().maximize();
       String getTitle =driver.getTitle();
        System.out.println(getTitle);
        driver.close();


    }
}
