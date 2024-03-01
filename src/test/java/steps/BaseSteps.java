package steps;
import io.cucumber.java.en.Given;
import po.BasePage;

public class BaseSteps {

    BasePage basePage = new BasePage();

    @Given("I am opening sauce page")
    public void iAmOpeningSaucePage(){
        basePage.openSauceDemoPage();
    }


}
