package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import po.YourCartPage;


public class YourCartSteps {
    YourCartPage yourCartPage = new YourCartPage();

    @Then("I validate {string} is displayed")
    public void iValidateIsDisplayed(String label) {
        yourCartPage.validateProductLabel(label);
    }

    @Then("I validate {string} price is displayed")
    public void iValidatePriceIsDisplayed(String price) {
        yourCartPage.validatePricePrice(price);
    }

    @And("I click checkout button")
    public void iClickCheckoutButton() {
        yourCartPage.clickcheckoutBtn();
    }
}
