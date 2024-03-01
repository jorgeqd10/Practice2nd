package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import po.AllItemsPage;

public class AllItemsSteps {
    AllItemsPage allItemsPage = new AllItemsPage();

    @Then("I click on sauce labs backpack add to cart button")
    public void iClickslBackPackButton() {
        allItemsPage.clickAddBackpackBtn();
    }

    @Then("I click shopping cart button")
    public void iClickShoppingCartButton() {
        allItemsPage.clickShoppingCartBtn();
    }

    @Then("I click on sauce labs bike light add to cart button")
    public void iClickOnSauceLabsBikeLightAddToCartButton() {
        allItemsPage.clickAddBikeLightBtn();
    }

    @Then("I click on sauce labs t shirt add to cart button")
    public void iClickOnSauceLabsTShirtAddToCartButton() {
        allItemsPage.clickAddTShirtBtn();
    }
}
