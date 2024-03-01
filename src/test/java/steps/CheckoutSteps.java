package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import po.CheckoutPage;

public class CheckoutSteps {
    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("I click continue button")
    public void iClickContinueButton() {
        checkoutPage.clickcontinueBtn();
    }

    @Then("I fill out my information {string}, {string}, {string}")
    public void iFillOutMyInformation(String firstname, String lastname, String zipCode) {
        checkoutPage.enterYourInformation(firstname, lastname, zipCode);
    }
}
