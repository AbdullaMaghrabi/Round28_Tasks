package tasksPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import search.Landing;
import taskTemplate.TestClass;

public class ResultsTest extends TestClass {

    @Test
    public void checkFirstResult() {

        wait.until(d -> {
            String searchResultTitle = new Landing(driver)
                    .navigate()
                    .search("Selenium WebDriver")
                    .getSearchResultUrl(1);
            Assert.assertEquals(searchResultTitle, "https://www.selenium.dev/documentation/webdriver/");
            return true;
        });
    }
    @Test
    public void checkFourResults() {

        wait.until(d -> {
            String searchResultTitle = new Landing(driver)
                    .navigate()
                    .search("TestNG Tutorial")
                    .getSearchResultTitle(4);
            Assert.assertEquals(searchResultTitle, "TestNG Tutorial");
            return true;
        });
    }
}
