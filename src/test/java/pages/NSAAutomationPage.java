package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NSAAutomationPage extends BasePage {

   // @FindBy(className = "card-title text-white")
  @FindBy(xpath = "//strong[text()='New Savings Account']")

    WebElement newSavingsPageTitle;

    //@FindBy(className = "form-control-label")
    @FindBy(xpath = "//strong[text()='Select Savings Account Type']")
    WebElement savingsAccountTypeMenu;

    @FindBy(id = "Savings")
    WebElement savingsRadioButton;

    @FindBy(id = "Money Market")
    WebElement moneyMarketRadioButton;

    public String newSavingsPageTitleDisplayed() {

        return newSavingsPageTitle.getText();
    }

    public String selectSavingsAccountTypeDisplayed() {
        return savingsAccountTypeMenu.getText();
    }

    public boolean savingsTypeRadioButtonsDisplayed() {
        return (savingsRadioButton.isDisplayed() && moneyMarketRadioButton.isDisplayed());
    }

    public boolean savingsTypeRadioButtonsUnchecked() {
        return (!savingsRadioButton.isSelected() && !moneyMarketRadioButton.isSelected());
    }

}
