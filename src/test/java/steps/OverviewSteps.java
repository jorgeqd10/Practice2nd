package steps;

import io.cucumber.java.en.Then;
import po.OverviewPage;

public class OverviewSteps {
    OverviewPage overviewPage = new OverviewPage();

    @Then("I validate {string} is displayed on overview")
    public void iValidateIsDisplayedOnOverview(String label) {
        overviewPage.validateItem(label);
    }

    @Then("I click finish button")
    public void iClickFinishButton() {
        overviewPage.clickFinishBtn();
    }
}
