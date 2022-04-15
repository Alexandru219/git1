package demoblaze.testng;

import demoblaze.poms.RegisterPom;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tests {
    public WebDriver driver;
    public WebDriverWait driverWait;
    String baseUrl = "https://www.demoblaze.com/index.html";

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.29.0-win64\\geckodriver.exe");
//        driverWait = new WebDriverWait(driver, 10);
    }

    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test()
    public void register() throws InterruptedException {
        RegisterPom registerUser = new RegisterPom(driver);
        registerUser.clickSignupLink();
        String newUserName = "username" + RandomStringUtils.randomAlphabetic(2);
        String userPass = RandomStringUtils.randomAlphanumeric(6);
        registerUser.checkLoginElementPresenceBy();
        registerUser.completeUsernameBy(newUserName);//use your username
        registerUser.checkPasswordElementPresenceBy();
        registerUser.completePasswordBy(userPass);//use your password
        registerUser.clickLoginBy();
        Thread.sleep(10000);
        isAlertPresent();

    }

    void isAlertPresent() {
        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            Assert.fail("Sth went wrong. User was not registered: " + e.getMessage());
        }
    }

//    @Test
//    public void registerNewUser(String newUserName, String userPass) {
//        RegisterPom registerNewUser = new RegisterPom(driver);
//        registerNewUser.clickSignupLinkElement();
//
//        registerNewUser.usernameLabelElementIsPresent();
//
//        registerNewUser.enterUsernameInputElement(newUserName);
//
//        registerNewUser.passwordLabelElementIsPresent();
//        registerNewUser.enterPasswordInputElement(userPass);
//        registerNewUser.clickOnButtonElement();
//        isAlertPresent();
//    }


    @AfterTest
    public void afterTest() {
//        driver.close();
        driver.quit();
    }

}
