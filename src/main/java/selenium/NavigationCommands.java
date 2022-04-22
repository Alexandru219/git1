package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the FireFox driver
        System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // Open ToolsQA web site
        String appUrl = "https://demoqa.com/";
        driver.get(appUrl);

        // Click on Elements link
//        .//*[@class="category-cards"]
//        .//*[@class="category-cards"]//*[.="Elements"]
//        .//*[@class="card mt-4 top-card"]//.[.="Elements"]
//        .//*[contains(text(),"Elem")]
        String elementsCardXpath = ".//*[@class='category-cards']//div[@class='card mt-4 top-card'][1]";
        System.out.println(elementsCardXpath);
        driver.findElement(By.xpath(elementsCardXpath)).click();
        Thread.sleep(30000);
        // Go back to Home Page
        driver.navigate().back();
        Thread.sleep(30000);
        // Go forward to Registration page
        driver.navigate().forward();
        Thread.sleep(30000);
        // Go back to Home page
        driver.navigate().to(appUrl);
        Thread.sleep(30000);
        // Refresh browser
        driver.navigate().refresh();

        // Close browser

        System.out.println("Closing browser");
        Thread.sleep(3000);
        driver.close();
    }
}
