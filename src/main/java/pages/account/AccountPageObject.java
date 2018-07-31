package pages.account;

import com.codeborne.selenide.SelenideElement;
import pages.login.LoginPageObject;
import pages.signup.SignupPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AccountPageObject {
    private SelenideElement getProfileButton() {
        return $("test");
    }
    private SelenideElement getLogoutButton() {
        return $("test");
    }

    public void selectProfileButton(){
        getProfileButton().click();
    }
    public LoginPageObject selectLogoutButton(){
        getLogoutButton().click();
        return page(LoginPageObject.class);
    }

}
