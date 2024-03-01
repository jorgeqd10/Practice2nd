package driver;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

public class Driver extends ThucydidesWebDriverSupport {
    protected static WebDriver driverSup;

    public Driver() {
        this.driverSup = getDriver();
        useDriver(getDriver());
    }
}
