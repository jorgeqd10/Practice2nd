package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CheckoutPage extends BasePage{
    public CheckoutPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-test='firstName']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@data-test='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@data-test='postalCode']")
    private WebElement zipCodeField;

    @FindBy(xpath = "//input[@data-test='continue']")
    private WebElement continueBtn;

    public void clickcontinueBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }
    public void enterYourInformation(String firstname, String lastname, String zipcode){
        wait.until(ExpectedConditions.visibilityOf(firstNameField)).clear();
        wait.until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys(firstname);
        wait.until(ExpectedConditions.visibilityOf(lastNameField)).clear();
        wait.until(ExpectedConditions.visibilityOf(lastNameField)).sendKeys(lastname);
        wait.until(ExpectedConditions.visibilityOf(zipCodeField)).clear();
        wait.until(ExpectedConditions.visibilityOf(zipCodeField)).sendKeys(zipcode);
    }
}
