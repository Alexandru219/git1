package demoblaze.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPom {
    protected WebDriver driver;

    public AbstractPom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
