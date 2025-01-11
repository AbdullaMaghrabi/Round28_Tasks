package search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Landing {
    private WebDriver driver;
    private String url = "https://duckduckgo.com/";

    public Landing(WebDriver driver){
        this.driver = driver;}


    By searchInput = By.id("searchbox_input");
    By logo = By.xpath("//section[not(contains(@class, 'shrink'))]/a/img");
    public Landing navigate(){
        driver.navigate().to(url);
        return this;
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public Boolean isLogoDisplayed(){
        return driver.findElement(logo).isDisplayed();
    }

    public Results search(String searchQuery){
        driver.findElement(searchInput).sendKeys(searchQuery + Keys.ENTER);
        return new Results(driver);
    }

}
