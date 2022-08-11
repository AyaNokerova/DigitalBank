package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Login extends BasePage {


    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//title[text()='Digital Bank']")
    public WebElement title;

    @FindBy(id = "submit")
    public WebElement signInButton;

    @FindBy (xpath = "//div[contains(@class, 'alert')]")
    public WebElement errorMessage;

    public void openWebsite() {
        driver.get(ConfigReader.getProperty("app.baseurl"));
    }

}
