package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.account.AccountPageObject;

public class AccountSteps {
    AccountPageObject accountpage = new AccountPageObject();

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT PAGE OPENED");
    }

    @And("^I logout from account page$")
    public void iLogoutFromAccountPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        accountpage.selectProfileButton();
        accountpage.selectLogoutButton();
    }
}
