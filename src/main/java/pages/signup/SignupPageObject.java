package pages.signup;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignupPageObject {
    private SelenideElement getFirstNameField() {
        return $("test");
    }

    private SelenideElement getLastNameField() {
        return $("test");
    }

    private SelenideElement getMobileNumberField() {
        return $("test");
    }

    private SelenideElement getEmailField() {
        return $("test");
    }

    private SelenideElement getPasswordField() {
        return $("test");
    }
    private SelenideElement getConfirmPasswordField() {
        return $("test");
    }
    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void enterFirstName(String firstname){
        getFirstNameField().sendKeys(firstname);
    }
    public void enterLastName(String lastname){
        getLastNameField().sendKeys(lastname);
    }
    public void enterMobileNumber(String number){
        getMobileNumberField().sendKeys(number);
    }
    public void enterEmail(String email){
        getEmailField().sendKeys(email);
    }
    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }
    public void enterConfirmationPassword(String password){
        getConfirmPasswordField().sendKeys(password);
    }
    public AccountPageObject pressSignUpButton(){
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }
    public void createAccount(String firstname, String lastname, String number, String email, String password){
        enterFirstName(firstname);
        enterLastName(lastname);
        enterMobileNumber(number);
        enterEmail(email);
        enterPassword(password);
        enterConfirmationPassword(password);
    }

}
