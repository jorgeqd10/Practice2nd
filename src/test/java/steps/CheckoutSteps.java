package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import po.CheckoutPage;

import java.util.List;
import io.cucumber.datatable.DataTable;

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

    @Then("I filling out my info")
    public void iFillingOutMyInfo(DataTable dataTable) throws InterruptedException{

        System.out.println("Filled out Information");

        List<List<String>> personalInfo = dataTable.asLists(String.class);
        String firstname = personalInfo.get(0).get(1);
        String lastname = personalInfo.get(1).get(1);
        String zip = personalInfo.get(2).get(1);
        checkoutPage.enterYourInformation(firstname, lastname, zip);
    }
}
