package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Results {
    private WebDriver driver;
    private By dynamicResult;

    public Results(WebDriver driver){
        this.driver = driver;
    }


    public String getSearchResultTitle(int targetSearchResult){
        dynamicResult = By.xpath("(//li[@data-layout='organic'])[" + targetSearchResult + "]//a[@data-testid='result-title-a']");
        return driver.findElement(dynamicResult).getText();
    }

    public String getSearchResultUrl(int targetSearchResult){
        dynamicResult = By.xpath("(//li[@data-layout='organic'])[" + targetSearchResult + "]//a[@data-testid='result-title-a']");
        return driver.findElement(dynamicResult).getDomAttribute("href");
    }
}
