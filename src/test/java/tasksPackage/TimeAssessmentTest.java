package tasksPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TimeAssessmentTest {

    @Test
    public void controlTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("reveal")).click();
        driver.findElement(By.id("revealed")).sendKeys("test");
        driver.quit();
    }

    @Test
    public void implicitWaitTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("reveal")).click();
        driver.findElement(By.id("revealed")).sendKeys("test");
        driver.quit();

    }

    @Test
    public void explicitWaitTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("reveal")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed"))).sendKeys("test");
        driver.quit();
    }


    @Test
    public void fluentWaitTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("reveal")).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NotFoundException.class)
                .ignoring(ElementNotInteractableException.class);

        wait.until(driver1 ->
        {
            driver1.findElement(By.id("revealed")).sendKeys("test");
            return true;
        });
        driver.quit();
    }


    @Test
    public void controlTestBox() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("adder")).click();
        driver.findElement(By.id("box0")).isDisplayed();
        driver.quit();
    }

    @Test
    public void implicitWaitTestBox() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("adder")).click();
        driver.findElement(By.id("box0")).isDisplayed();
        driver.quit();
    }

    @Test
    public void explicitWaitTestBox() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("adder")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("box0"))).isDisplayed();
        driver.quit();
    }

    @Test
    public void fluentWaitTestBox() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("adder")).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NotFoundException.class)
                .ignoring(ElementNotInteractableException.class);

        wait.until(driver1 ->
        {
            driver1.findElement(By.id("box0")).isDisplayed();
            return true;
        });
        driver.quit();
    }
}