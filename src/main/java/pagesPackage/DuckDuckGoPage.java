package pagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckDuckGoPage {
    WebDriver driver;

    public DuckDuckGoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[not(contains(@class, 'shrink'))]/a/img")
    WebElement  logo;

    public String getPageTitle(){
        return driver.getTitle();
    }

    public Boolean isLogoDisplayed(){
        return logo.isDisplayed();
    }

}
