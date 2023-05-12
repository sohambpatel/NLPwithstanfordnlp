import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import src.configreader.ConfigReader;
import src.factory.DriverFactory;
import src.pages.HomePage;

import java.util.Properties;

public class HomeTest {
    Properties properties;
    WebDriver driver=null;
    @BeforeTest
    public void beforeTestMethod(){
        ConfigReader configReader=new ConfigReader();
        properties=configReader.readProp("english");
        DriverFactory driverFactory=new DriverFactory();
        driver=driverFactory.initDriver("chrome",properties);
    }

    @Test
    public void testHome(){

        HomePage homePage=new HomePage(driver);
        homePage.isHeaderValuePresent(properties.getProperty("header"));
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
