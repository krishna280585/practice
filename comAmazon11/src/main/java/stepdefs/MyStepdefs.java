package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.SearchProduct;

public class MyStepdefs {
    SearchProduct sp=new SearchProduct();
    @Given("^User should be on Amazon homepage$")
    public void userShouldBeOnAmazonHomepage() throws Throwable {
        sp.userOnHomePage();
    }

    @When("^User clicks the \"([^\"]*)\" link$")
    public void userClicksTheLink(String link) throws Throwable {
       sp.userClickTheLink(link);
    }

    @And("^User enters the Email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEntersTheEmailAndPassword(String email, String password) throws Throwable {
     sp.userEnterDetails(email,password);

    }

    @And("^User clicks on Signin button$")
    public void userClicksOnSigninButton() throws Throwable {
        sp.userClicksSigninButton();

    }
    @Then("^User successfully login into the Amazon account with text \"([^\"]*)\"$")
    public void userSuccessfullyLoginIntoTheAmazonAccountWithText(String message) throws Throwable {
        Assert.assertTrue(sp.isTextPresent(message));

    }

    @When("^User wants to search a product \"([^\"]*)\"$")
    public void userWantsToSearchAProduct(String text) throws Throwable {
    sp.userSearchProduct(text);

    }

    @And("^User clicks on the search button$")
    public void userClicksOnTheSearchButton() throws Throwable {
     sp.userClickOnSearchButton();

    }

    @Then("^User can see the list of toys with text \"([^\"]*)\"$")
    public void userCanSeeTheListOfToysWithText(String message) throws Throwable {
        sp.isTextPresent(message);

    }

    @And("^User selects for Bathtoys$")
    public void userSelectsForBathtoys() throws Throwable {
    sp.userSelectToy();

    }
    @And("^User checks the delivery option$")
    public void userChecksTheDeliveryOption() throws Throwable {
    sp.userChecksOption();

    }

    @And("^User checks the age criteria$")
    public void userChecksTheAgeCriteria() throws Throwable {
     sp.userSelectsAge();

    }

    @And("^User selects the toys by different Sortby option$")
    public void userSelectsTheToysByDifferentSortbyOption() throws Throwable {
     sp.userSelectSortByOption();

    }
    @When("^User selects the first toy \"([^\"]*)\"$")
    public void userSelectsTheFirstToy(String arg0) throws Throwable {
        sp.selectFirstToy();
    }

    @And("^User enters the quantity$")
    public void userEntersTheQuantity() throws Throwable {
    sp.userEntersQuantity();

    }
    @And("^User clicks on add to basket$")
    public void userClicksOnAddToBasket() throws Throwable {
     sp.clickOnAddBasket();

    }

    @And("^User clicks on proceed to checkout$")
    public void userClicksOnProceedToCheckout() throws Throwable {
     sp.clickOnProceedCheckout();

    }
    @Then("^User should view the pickup page$")
    public void userShouldViewThePickupPage() throws Throwable {
    sp.userViewpickUpPage();

    }
//    @And("^User enters the Email \"([^\"]*)\"$")
//    public void userEntersTheEmail(String email) throws Throwable {
//      sp.enterEmail(email);

   // }
    @And("^User clicks the continue button$")
    public void userClicksTheContinueButton() throws Throwable {
       sp.Clickcontinue();

    }

//    @And("^User enters the password \"([^\"]*)\"$")
//    public void userEntersThePassword(String password) throws Throwable {
//       sp.enterPassword(password);
//
//    }

    @Then("^User should view the pickup page with text \"([^\"]*)\"$")
    public void userShouldViewThePickupPageWithText(String message) throws Throwable {
      Assert.assertTrue(sp.isTextPresent(message));
    }


    @And("^User navigates to home page$")
    public void userNavigatesToHomePage() throws Throwable {
       sp.navigate();

    }

    @And("^User should signoff$")
    public void userShouldSignoff() throws Throwable {
       sp.logOff();


    }
}
