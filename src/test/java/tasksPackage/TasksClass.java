package tasksPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class TasksClass {


    @Test
    public void verifyPageTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");

        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "DuckDuckGo - Your protection, our priority.");
        driver.quit();
    }

/*
    @Test
    public void verifyLogoIsDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header[@class='header_header__3o0p0']//a[@class='header_logoHorizontal__yw4eT header_logoText__rodFL header_logoImg__PFezv']//img")));
        assertTrue(logo.isDisplayed(), "DuckDuckGo logo is not displayed!");
        driver.quit();
    }
*/




}
