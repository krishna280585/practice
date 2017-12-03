package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductByPageFactory extends BasePage {

    public ProductByPageFactory()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="searchDropdownBox")
   private WebElement category;

    @FindBy(className="nav-input")
   private WebElement search;

    @FindBy(linkText = "cameras")
   private WebElement sublink;

    @FindBy(linkText = "Digital cameras")
   private  WebElement dcamera;

    @FindBy(linkText = "DSLR cameras")
    private WebElement dslr;

    @FindBy(xpath="//*[@id='anonCarousel1']/ol/li[2]/div[1]/a/span")
    private WebElement product;

    @FindBy(xpath="//*[@id='anonCarousel1']/ol/li[1]/div[1]/a/span")
    private WebElement product1;

    @FindBy(xpath="//span[contains(text(),'Nikon D3300 Digital SLR Camera - Black')]")
    private WebElement producct;

    @FindBy(id="add-to-cart-button")
    private WebElement addToCart;

    @FindBy(id="siNoCoverage-announce")
    private WebElement purchase;

    @FindBy(id="hlb-ptc-btn-native")
    private WebElement checkout;

    @FindBy(xpath="//h1[contains(text(),'Sign in')]")
    private WebElement xpathtext;


    public void selectCategory()
    {
     Select dropdown=new Select(category);
     dropdown.selectByVisibleText("Electronics & Photo");
    }
    public void clickSearch()
    {
     search.click();
    }
    public void clickCameras(String link)
    {
        sublink.click();
    }
    public void clickDigitalCameras()
    {
      dcamera.click();
    }
    public void clickProduct()throws InterruptedException
    {
      dslr.click();
      product1.click();

    }
    public void addToBasket()
    {
    addToCart.click();
    }
    public void protectPurchase()
    {
     purchase.click();
    }
    public void proceedCheckout()
    {
    checkout.click();
    }
   public boolean isTextDisplayed()
    {
        return xpathtext.isDisplayed();
    }
}
