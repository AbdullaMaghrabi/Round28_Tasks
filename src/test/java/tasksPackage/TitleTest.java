package tasksPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pagesPackage.DuckDuckGoPage;
import search.Landing;
import taskTemplate.TestClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TitleTest extends TestClass {

    @Test
    public void verifyPageTitle() {

        String pageTitle = new Landing(driver)
                .navigate()
                .getPageTitle();
        Assert.assertEquals(pageTitle, "DuckDuckGo - Your protection, our priority.");
    }
}
