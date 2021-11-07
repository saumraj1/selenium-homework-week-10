package wchtorg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl="https://www.wcht.org.uk/\n";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver =new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle= driver.getTitle();
        System.out.println(getTitle);
       // driver.close();

    }
}
