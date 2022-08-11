package pages;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;


public class LoginPage extends BasePage {


    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;


    @FindBy(xpath = "//title[text()='Digital Bank']")
    public WebElement title;


    @FindBy(id = "submit")
    public WebElement signInButton;


    @FindBy(css = "a[href='/bank/signup']")
    public WebElement signUpHereLink;



    public void verifyPageTitle() {
        Assert.assertEquals("Title is not the same", "Digital Bank", Driver.getDriver().getTitle());
    }

    public void verifySignInButtonIsDisplayed() {
        Assert.assertTrue(signInButton.isDisplayed());
    }

    public void doLogin() {

        username.sendKeys(ConfigReader.getProperty("login.username"));
        password.sendKeys(ConfigReader.getProperty("login.password"));

    }
    public void verifyUseIsOnHomepage() {

        Assert.assertTrue("User is not on the Home Page", signUpHereLink.isDisplayed());
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }


    public void clickSignUpLink() {
        signUpHereLink.click();
    }


}