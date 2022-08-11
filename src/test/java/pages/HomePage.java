package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "home-menu-item")
    WebElement homeMenuItem;

    public void verifyUserIsSignedInSuccessfully(){
        Assert.assertTrue("User is not on the Home Page",homeMenuItem.isDisplayed());
    }
}
