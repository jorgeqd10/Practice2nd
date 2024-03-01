package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import po.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Then("I enter {string} username")
    public void iEnterUsername(String username) {
        loginPage.enterUsername(username);
    }

    @Then("I enter {string} password")
    public void iEnterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }
}
