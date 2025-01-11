package pagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3schoolPage {
    WebDriver driver;

    public W3schoolPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


//    @FindBy(xpath = xpath("//td[text()='Ernst Handel']/parent::tr/td[3]")
//    @FindBy(xpath = xpath("//td[text()='Ernst Handel']/../td[3]")
//    @FindBy(xpath = xpath("//td[text()='Ernst Handel']/following-sibling::td[2]")

   @FindBy(xpath = "//tr[contains(.,'Ernst Handel')]/td[3]")
   WebElement country;

    public String getCountry(){
        return country.getText();
    }

}
