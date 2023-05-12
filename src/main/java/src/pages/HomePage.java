package src.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import src.utils.ElementUtils;

public class HomePage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public HomePage(WebDriver driver){
        this.driver=driver;
        elementUtils=new ElementUtils(driver);
    }

    private WebElement getHeader(String headerValue){
        String headerXpathValue="//a[contains(text(),'"+headerValue+"')]";
        return elementUtils.getElement("xpath",headerXpathValue);
    }

    public boolean isHeaderValuePresent(String headerValue){
        String header=getHeader(headerValue).getText();
        System.out.println(header);
            return getHeader(headerValue).isDisplayed();
    }
}
