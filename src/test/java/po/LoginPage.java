package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LoginPage extends BasePage{


    public LoginPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginBtn;

    public void enterUsername(String value){
        wait.until(ExpectedConditions.visibilityOf(usernameField)).clear();
        wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(value);
    }

    public void enterPassword(String value){
        wait.until(ExpectedConditions.visibilityOf(passwordField)).clear();
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(value);
    }

    public void clickLoginBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
}
