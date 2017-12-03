import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    Scenario scenario;

    @Before
    public static void openBrowser()
    {
        if(AutomationConstrants.BROWSER.equalsIgnoreCase("chrome"))
        {
            System.out.println("opening the browser");
            System.setProperty("webdriver.chrome.driver","chromedriver");
            driver=new ChromeDriver();
        }
        else if(AutomationConstrants.BROWSER.equalsIgnoreCase("firefox"))
        {
            System.out.println("opening the browser");
            System.setProperty("webdriver.gecko.driver","geckodriver");
            driver=new FirefoxDriver();

        }
        else
        {
            Assert.fail("there is no driver to open");
        }
        driver.get(AutomationConstrants.URL);
        driver.manage().timeouts().implicitlyWait(AutomationConstrants.MAX_TIMEOUT, TimeUnit.SECONDS);
    }
    @After
    public static void closeBrowser()
    {
        System.out.println("closing the browser");
        driver.quit();
    }
}
