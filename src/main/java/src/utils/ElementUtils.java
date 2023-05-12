package src.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
    private WebDriver driver;

    public ElementUtils(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public WebElement getElement(String locatorType, String locatorValue){
        return driver.findElement(getBy(locatorType,locatorValue));
    }

    public By getBy(String locatorType, String locatorValue){
        By locator=null;
        switch (locatorType.toLowerCase()){
            case "id":
                locator=By.id(locatorValue);
            case "name":
                locator=By.name(locatorValue);
            case "xpath":
                locator=By.xpath(locatorValue);
            case "linktext":
                locator=By.linkText(locatorValue);
            default:
                break;
        }
        return locator;
    }

}
