package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class LoginSteps {
    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        selectLoginButton();
    }

    @And("^I enter login Email$")
    public void iEnterLoginEmail() throws Throwable {
        enterLoginEmail();
    }

    @And("^I enter login Password$")
    public void iEnterLoginPassword() throws Throwable {
        enterLoginPassword();
    }

    @And("^I select Login form button$")
    public void iSelectLoginFormButton() throws Throwable {
        selectLoginFormButton();
    }
}
