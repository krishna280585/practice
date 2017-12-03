package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.ProductByPageFactory;

public class GuestStepdefs {
    ProductByPageFactory page1=new ProductByPageFactory();
    @Given("^User should on Amazon homepage$")
    public void userShouldOnAmazonHomepage() throws Throwable {

    }

    @When("^User selects the sub category \"([^\"]*)\"$")
    public void userSelectsTheSubCategory(String link) throws Throwable {
        page1.selectCategory();
    }

    @And("^User clicks the search button$")
    public void userClicksTheSearchButton() throws Throwable {
        page1.clickSearch();
    }

    @And("^User clicks the sub categories \"([^\"]*)\"$")
    public void userClicksTheSubCategories(String link) throws Throwable {
    page1.clickCameras(link);

    }
    @And("^User clicks the DigitalCameras$")
    public void userClicksTheDigitalCameras() throws Throwable {
        page1.clickDigitalCameras();


    }
    @And("^User clicks the DSLR$")
    public void userClicksTheDSLR() throws Throwable {

    }
    @And("^User clicks the \"([^\"]*)\"$")
    public void userClicksThe(String link) throws Throwable {
    page1.clickProduct();

    }
    @And("^User clicks on the add to basket$")
    public void userClicksOnTheAddToBasket() throws Throwable {
    page1.addToBasket();

    }

    @And("^User clicks on the proceed to checkout$")
    public void userClicksOnTheProceedToCheckout() throws Throwable {
       page1.proceedCheckout();

    }

    @Then("^User should get the login page to checkout$")
    public void userShouldGetTheLoginPageToCheckout() throws Throwable {
       Assert.assertTrue(page1.isTextDisplayed());

    }


    @And("^User clicks on Add to basket$")
    public void userClicksOnAddToBasket() throws Throwable {
        page1.protectPurchase();
    }
}
