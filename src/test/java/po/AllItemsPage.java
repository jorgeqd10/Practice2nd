package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AllItemsPage extends BasePage{
    public AllItemsPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-backpack']")
    private WebElement useslBackPackAddBtn;

    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-bike-light']")
    private WebElement bikeLightAddBtn;

    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement tShirtAddBtn;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    private WebElement shoppingCartBtn;

    public void clickAddBackpackBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(useslBackPackAddBtn)).click();
    }

    public void clickAddBikeLightBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(bikeLightAddBtn)).click();
    }

    public void clickAddTShirtBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(tShirtAddBtn)).click();
    }

    public void clickShoppingCartBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartBtn)).click();
    }


}
