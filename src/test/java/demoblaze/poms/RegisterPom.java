package demoblaze.poms;

import demoblaze.core.AbstractPom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPom extends AbstractPom {
    @FindBy(xpath = "//a[@id=\"signin2\"]")
    public WebElement signupLinkElement;
    @FindBy(xpath = "//label[contains(text(),\"Username\")]")
    public WebElement usernameLabelElement;
    @FindBy(xpath = "//div[@class='modal-dialog']//input[@id='sign-username']")
    public WebElement usernameInputElement;
    @FindBy(xpath = "//label[contains(text(),\"Password\")]")
    public WebElement passwordLabelElement;
    @FindBy(xpath = "//div[@class='modal-dialog']//input[@id='sign-password']")
    public WebElement passwordInputElement;
    @FindBy(xpath = "//div[@class='modal-dialog']//button[contains(text(),\"Sign up\")]")
    public WebElement buttonElement;
    String xpathUsername = "//div[@class='modal-dialog']//input[@id='sign-username']";
    By signupLink = By.xpath("//a[@id=\"signin2\"]");
    By loginElementBy = By.xpath("//label[contains(text(),\"Username\")]");
    By usernameInputBy = By.xpath("//div[@class='modal-dialog']//input[@id='sign-username']");
    By passwordLabelBy = By.xpath("//label[contains(text(),\"Password\")]");
    By passwordInputBy = By.xpath("//div[@class='modal-dialog']//input[@id='sign-password']");
    By buttonBy = By.xpath("//div[@class='modal-dialog']//button[contains(text(),\"Sign up\")]");

    public RegisterPom(WebDriver driver) {
        super(driver);
    }

    public void clickSignupLink() {
        WebElement signLink = driver.findElement(signupLink);
        signLink.click();
    }

    public void checkLoginElementPresenceBy() {
        WebElement loginElement = driver.findElement(loginElementBy);
        Assert.assertTrue(loginElement.isDisplayed());
    }

    public void checkPasswordElementPresenceBy() {
        WebElement passwordElement = driver.findElement(passwordLabelBy);
        Assert.assertTrue(passwordElement.isDisplayed());
    }

    public void completeUsernameBy(String username) {
        WebElement usernameInput = driver.findElement(usernameInputBy);
        usernameInput.sendKeys(username);
    }

    public void completePasswordBy(String password) {
        WebElement usernameInput = driver.findElement(passwordInputBy);
        usernameInput.sendKeys(password);
    }

    public void clickLoginBy() {
        WebElement button = driver.findElement(buttonBy);
        button.click();
    }

    public void clickSignupLinkElement() {
        Assert.assertTrue(signupLinkElement.isDisplayed());
        signupLinkElement.click();
    }

    public void usernameLabelElementIsPresent() {
        Assert.assertTrue(usernameLabelElement.isDisplayed());
    }

    public void enterUsernameInputElement(String username) {
        usernameInputElement.sendKeys(username);
    }

    public void passwordLabelElementIsPresent() {
        Assert.assertTrue(passwordLabelElement.isDisplayed());
    }

    public void enterPasswordInputElement(String password) {
        passwordInputElement.sendKeys(password);
    }

    public void clickOnButtonElement() {
        buttonElement.click();
    }
}
