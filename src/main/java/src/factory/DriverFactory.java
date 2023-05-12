package src.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public WebDriver driver;
    public WebDriver initDriver(String browserName, Properties properties){
        System.out.println("browser name is"+browserName);
        switch(browserName.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
            default:
                System.out.println("please pass the chrome browser"+browserName);
        }
        driver.get(properties.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }
}
