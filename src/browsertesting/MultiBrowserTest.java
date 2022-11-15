package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.Firefox.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser Name");
        }

        //open url
        driver.get(baseUrl);

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("page title is: " + title);

        //Print current Url
        System.out.println("current url: " + driver.getCurrentUrl());

        //Print page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter Email to Email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user"); //type the email

        //Enter the password to Password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");

        //close the browser
        driver.quit();

    }
}