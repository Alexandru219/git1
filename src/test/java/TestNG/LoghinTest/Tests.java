package LoghinTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.Login;

import java.util.concurrent.TimeUnit;

public class Tests {
    WebDriver driver;
//    System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.29.0-win64\\geckodriver.exe");
    String baseUrl = "https://simpalsid.com/user/login"; //https://simpalsid.com/user/register

    @BeforeMethod
    public void beforeMethod(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }


//    @Test
//    public void LoginWithDefaultUserTest(){
//        WebElement loginElement= driver.findElement(By.xpath("//div[@class=\"login__title\"]"));
//        Assert.assertTrue(loginElement.isDisplayed());
//        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='login']"));
//        usernameInput.sendKeys("ajax0070909");//use your username
//        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
//        passwordInput.sendKeys("qwe123!@#");//use your password
//        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
//        button.click();
//        //add check, //add logout
//    }

    // Page Object Model POM
    @Test
    public void LoginWithDefaultUserTest2(){
        Login login = new Login(driver);

        login.checkLoginElementPresence();
//        login.completeUsername("ajax0070909");
        login.usernameInputAnnotations.sendKeys("ajax0070909");
        login.completePassword("qwe123!@#");
        login.clickLoginBy();
        //add check, //add logout
    }
    @AfterMethod
    public void afterMethods(){
//        driver.close();
//        driver.quit();
    }
}
