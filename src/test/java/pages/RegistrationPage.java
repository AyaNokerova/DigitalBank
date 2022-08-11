package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationPage extends BasePage {

    @FindBy(id= "title")
    public WebElement titleRegistrationField;

    @FindBy(xpath = "//select/option[contains(text(),'Please select')]")
    public WebElement pleaseSelectMessage;

    @FindBy(id = "firstName")
    public WebElement firstNameRegistrationField;

    @FindBy(id = "lastName")
    public WebElement lastNameRegistrationField;

    @FindBy(xpath = "//input[@value= 'M']")
    public WebElement genderMRegistrationField;

    @FindBy(xpath = "//input[@value= 'F']")
    public WebElement genderFRegistrationField;

    @FindBy(id = "dob")
    public WebElement dateOfBirthRegistrationField;

    @FindBy(id = "ssn")
    public WebElement ssnRegistrationField;

    @FindBy(id = "emailAddress")
    public WebElement emailRegistrationField;

    @FindBy(id = "password")
    public WebElement passwordRegistrationField;

    @FindBy(id = "//confirmPassword")
    public WebElement confirmPasswordRegistrationField;

    @FindBy(xpath = "//button[contains(text(), 'Next')]")
    public WebElement nextButton;

    @FindBy(xpath = "//a[contains(text(), 'Sign in')]")
    public WebElement singInLink;

    public void verifyUserIsOnRegistrationPage() {

        Assert.assertTrue("User is not on the RegistrationPage Page", firstNameRegistrationField.isDisplayed());
    }
    public void verifyUserClickOnTitleField() {

        titleRegistrationField.click();
    }

    public void verifyUserSeeDropDown() {
        WebElement categoryDropdown = driver.findElement(By.id("title"));
        Select catDropdownSelect = new Select(categoryDropdown);
        Assert.assertTrue("User is not in the Title Field", pleaseSelectMessage.isDisplayed());
    }

    public void verifyUserCanSelectTitle(String selection, String title) {

        WebElement categoryDropdown = driver.findElement(By.id("title"));
        Select catDropdownSelect = new Select(categoryDropdown);
        catDropdownSelect.selectByVisibleText(selection);
        List<WebElement> selectedOption = catDropdownSelect.getAllSelectedOptions();
        Assert.assertEquals(title, selectedOption.get(0).getText());



    }


}





