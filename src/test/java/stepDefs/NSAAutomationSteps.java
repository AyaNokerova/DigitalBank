package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.NSAAutomationPage;

public class NSAAutomationSteps {

    NSAAutomationPage nsaAutomationPage = new NSAAutomationPage();

    @Then("Page title {string} is displayed")
    public void page_title_is_displayed(String pageTitle) {
        Assert.assertEquals(pageTitle, nsaAutomationPage.newSavingsPageTitleDisplayed());
    }
    @Then("Select Savings Account Type field is displayed")
    public void select_savings_account_type_field_is_displayed() {
        Assert.assertEquals("Select Savings Account Type", nsaAutomationPage.selectSavingsAccountTypeDisplayed());

    }
    @Then("Radio button options: Savings, Money Market are displayed")
    public void radio_button_options_savings_money_market_are_displayed() {
        Assert.assertTrue("Savings Type Radio Buttons are not displayed",  nsaAutomationPage.savingsTypeRadioButtonsDisplayed());
    }
    @Then("Radio button options: Savings, Money Market are unchecked")
    public void radio_button_options_savings_money_market_are_unchecked() {
        Assert.assertTrue("Savings Type Radio Buttons are Checked", nsaAutomationPage.savingsTypeRadioButtonsUnchecked());
    }

}
