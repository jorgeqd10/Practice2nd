package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class OverviewPage extends BasePage{
    public OverviewPage() {
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='cart_item']")
    private List<WebElement> cartItem;
    private String itemName = "//div[@class='inventory_item_name']";

    @FindBy(xpath = "//button[@data-test='finish']")
    private WebElement finishBtn;

    public void validateItem(String value){
        boolean flag = false;
        for(int i = 0; i < cartItem.size(); i++){
            if(value.equals(cartItem.get(i).findElement(By.xpath(itemName)).getText())){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Label " + value + " is displayed correctly");
        } else {
            System.out.println("Label " + value + " is missing");
        }
    }

    public void clickFinishBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(finishBtn)).click();
    }


}
