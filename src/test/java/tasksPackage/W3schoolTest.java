package tasksPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesPackage.W3schoolPage;

import java.time.Duration;

public class W3schoolTest {
    WebDriver driver;
    W3schoolPage w3schoolPage;
    Wait<WebDriver> wait;


    @Test
    public void verifyTheCountry(){
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        String country = w3schoolPage.getCountry();
        Assert.assertEquals(country, "Austria");
    }

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.enableBiDi();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);

        driver.manage().window().maximize();
        w3schoolPage = new W3schoolPage(driver);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
