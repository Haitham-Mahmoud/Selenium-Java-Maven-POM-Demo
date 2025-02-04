package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    //Locators
    @FindBy(id= "user-name")
    WebElement usernameField;

    @FindBy(id="password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {;
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        // Wait for the login button to be clickable
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); // Wait up to 10 seconds
        //WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginButton.click();
    }
}
