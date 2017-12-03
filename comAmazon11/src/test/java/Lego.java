//import cucumber.api.java.After;
//import cucumber.api.java.Before;

import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class Lego extends BasePage {

    @Before
    public void openBrowser() {
        System.out.println("opening the browser");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
    }

    @Test
    public void searchProduct() throws InterruptedException {
        System.out.println("hello");
        driver.findElement(By.xpath(".//*[@id='nav-tools']/a/span")).click();
        driver.findElement(By.id("ap_email")).sendKeys("kk.madhuri111@gmail.com");
        if (driver.findElement(By.id("continue")).isDisplayed()) {
            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("ap_password")).sendKeys("dhruvin09");
        } else
            driver.findElement(By.id("ap_password")).sendKeys("dhruvin09");

    }

    @After
    public void closeBrowser() {
        System.out.println("closing the browser");
        driver.quit();
    }

    public static void closeBrowser(Scenario scenario) {
        scenario = scenario;
        if (scenario.isFailed()) {

        }
        System.out.println("closing the browser");
        driver.quit();
    }
}