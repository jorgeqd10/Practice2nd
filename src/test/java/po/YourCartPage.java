package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class YourCartPage extends BasePage{
    public YourCartPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='cart_item_label']/a")
    private List<WebElement> cartItem;
    private String title = "//div[@class='cart_item_label']/a";
    private String price = "//div[@class='cart_item_label']/div[2]";

    @FindBy(xpath = "//button[@data-test='checkout']")
    private WebElement checkoutBtn;
    public void validateProductLabel(String value){
        boolean flag = false;
        for(int i = 0; i < cartItem.size(); i++){
            String aux = cartItem.get(i).findElement(By.xpath(title)).getText();
            if(aux.equals(value)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Label " + value + " is displayed correctly");
        } else {
            System.out.println("Label " + value + " is missing");
        }
    }

    public void validatePricePrice(String value){
        boolean flag = false;
        for(int i = 0; i < cartItem.size(); i++){
            String aux = cartItem.get(i).findElement(By.xpath(price)).getText();
            if(aux.contains(value)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Price " + value + " is displayed correctly");
        } else {
            System.out.println("Price " + value + " is missing");
        }
    }
    public void clickcheckoutBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
    }



}
