package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.User;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.signup.SignupPageObject;

import static utils.RandomGenerator.generateRandomEmail;
import static utils.RandomGenerator.generateRandomPhoneNumber;
import static utils.RandomGenerator.generateRandomString;

public class SignupSteps {
    private SignupPageObject signuppage = new SignupPageObject();
    private User user = new User();
    private User userTwo = new User("Janis", "Berzins");

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signuppage.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signuppage.enterLastName(user.getLastName());
    }

    @And("^I eneter Mobile number$")
    public void iEneterMobileNumber() throws Throwable {
        signuppage.enterMobileNumber(user.getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        signuppage.enterEmail(user.getEmailAddress());
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        signuppage.enterPassword(user.getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        signuppage.enterConfirmationPassword(user.getPassword());
    }
}
