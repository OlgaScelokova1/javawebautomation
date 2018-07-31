package stepdefinitions;


import cucumber.api.java.en.And;

import pages.login.LoginPageObject;


public class LoginSteps {
    LoginPageObject loginpage = new LoginPageObject();



    @And("^I enter login Email$")
    public void iEnterLoginEmail() throws Throwable {
        loginpage.enterEmail(SignupSteps.user.getEmailAddress());
    }

    @And("^I enter login Password$")
    public void iEnterLoginPassword() throws Throwable {
        loginpage.enterPassword(SignupSteps.user.getPassword());
    }

    @And("^I select Login form button$")
    public void iSelectLoginFormButton() throws Throwable {
       loginpage.selectLoginButton();
    }

    @And("^login page is opened$")
    public void loginPageIsOpened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("LOGIN PAGE OPENED");
    }
}
