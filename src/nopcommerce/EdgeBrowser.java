package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/\n";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String geTitle= driver.getTitle();
        System.out.println(geTitle);
        driver.close();



    }
}
