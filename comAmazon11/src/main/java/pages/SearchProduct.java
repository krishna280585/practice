package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SearchProduct extends BasePage

{
    public void userOnHomePage() {

    }

    public void userClickTheLink(String link) {
        driver.findElement(By.xpath(".//*[@id='nav-tools']/a/span")).click();


    }

    public void userEnterDetails(String email, String password) throws InterruptedException {
        driver.findElement(By.id("ap_email")).sendKeys(email);
        try {
//            WebElement element = driver.findElement(By.id("continue"));
//            if (element.isDisplayed()) {
//                element.click();
//                driver.findElement(By.id("ap_password")).sendKeys(password);
//            }
//            else
//            {
//                driver.findElement(By.id("ap_password")).sendKeys(password);
//            }
            if (driver.findElement(By.id("continue")).isDisplayed()) {
                driver.findElement(By.id("continue")).click();
                driver.findElement(By.id("ap_password")).sendKeys("dhruvin09");
            } else
                driver.findElement(By.id("ap_password")).sendKeys("dhruvin09");

        }
        catch(Exception e)
        {
            e.printStackTrace();

        }

    }

    public void userClicksSigninButton() {
        driver.findElement(By.id("signInSubmit")).click();
    }
    public boolean isTextPresent(String message) {
        return driver.findElement(By.tagName("body")).getText().contains(message);
    }

    public void userSearchProduct(String text) {
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys(text);
    }

    public void userClickOnSearchButton() {
    driver.findElement(By.className("nav-input")).click();
    }

    public void userSelectToy() {
    driver.findElement(By.xpath((".//*[@id='leftNavContainer']/ul[1]/div/li[1]/span/ul/div/li[10]/span/a/span"))).click();
    }

    public void userChecksOption() {
        driver.findElement(By.xpath(".//*[@id='leftNavContainer']/ul[2]/div/li[2]/span/span/div/label/span/span")).click();
        waitForElement();
    }

    public void userSelectsAge() {
        driver.findElement(By.xpath(".//*[@id='leftNavContainer']/ul[4]/div/li[2]/span/span/div/label/input")).click();
        waitForElement();

    }

    public void clickOnButton()
    {
    driver.findElement(By.xpath("*[@id='leftNavContainer']/ul[11]/div/li[6]/span/form/span[3]/span/input")).click();
    waitForElement();
    }

    public void userSelectSortByOption() {
        WebElement element=driver.findElement(By.id("sort"));
        Select sortBy=new Select(element);
        sortBy.selectByVisibleText("Price: High to Low");
        waitForElement();
    }

    public void selectFirstToy()
    {
        driver.findElement(By.linkText("Legler Large Display Wooden Letters Children's Furniture")).click();
    }

    public void userEntersQuantity() {
    Select drop=new Select(driver.findElement(By.id("quantity")));
    drop.selectByValue("2");
    }

    public void clickOnAddBasket() {
   driver.findElement(By.id("add-to-cart-button")).click();
    }

    public void clickOnProceedCheckout() {
   driver.findElement(By.id("hlb-ptc-btn-native")).click();
    }

    public void userViewpickUpPage() {
    }

    public void Clickcontinue() {
        driver.findElement(By.id("continue")).click();
    }


    private void waitForElement() {
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void navigate() {
        driver.navigate().to("https://www.amazon.co.uk/");
    }
    public void logOff() {
    WebElement element=driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]"));
        Actions action=new Actions(driver);
     action.moveToElement(element).perform();
     driver.findElement(By.linkText("Not krish? Sign Out")).click();

    }

}
