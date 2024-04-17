package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import po.LoginPage;

import java.util.List;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @When("User enters valid credentials")
    public void userEntersValidCredentials(DataTable dataTable) throws InterruptedException{
        System.out.println("Credentials Entered");
        List<List<String>> signUpForm = dataTable.asLists(String.class);
        String userName = signUpForm.get(0).get(0);
        String password = signUpForm.get(0).get(1);
        loginPage.enterUsername(userName);
        loginPage.enterPassword(password);
        loginPage.clickLoginBtn();
    }


}
