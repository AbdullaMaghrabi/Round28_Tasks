package tasksPackage;

import org.testng.annotations.Test;
import search.Landing;
import taskTemplate.TestClass;

import static org.testng.Assert.assertTrue;

public class LogoTest extends TestClass {


    @Test
    public void verifyLogoIsDisplayed() {

            wait.until(d -> {
                boolean isLogoDisplayed = new Landing(driver)
                        .navigate()
                        .isLogoDisplayed();
                assertTrue(isLogoDisplayed);
                return true;
            });
    }
}
