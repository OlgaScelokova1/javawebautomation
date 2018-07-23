package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps {
    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        selectMyAccountMenu();
    }

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }

    @And("^I select Sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        selectSignUpButton();
    }

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        enterFirstName();
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        enterLastName();
    }

    @And("^I eneter Mobile number$")
    public void iEneterMobileNumber() throws Throwable {
        enterMobileNumber();
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        enterEmailAddress();
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        enterPassword();
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        confirmPassword();
    }

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT PAGE OPENED");
    }
}
