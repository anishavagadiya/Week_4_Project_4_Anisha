package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.Firefox.drive", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

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
