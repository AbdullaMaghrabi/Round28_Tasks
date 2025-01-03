package tasksPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class TasksClassTest {


    @Test
    public void verifyPageTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");

        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "DuckDuckGo - Your protection, our priority.");
        driver.quit();
    }

    @Test
    public void verifyLogoIsDisplayed() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://duckduckgo.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement logo = driver.findElement(By.xpath("//section[not(contains(@class, 'shrink'))]/a/img"));
        assertTrue(logo.isDisplayed(), "DuckDuckGo logo is displayed!");
        driver.quit();
    }




}
