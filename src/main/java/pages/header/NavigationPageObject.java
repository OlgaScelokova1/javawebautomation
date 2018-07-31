package pages.header;

import com.codeborne.selenide.SelenideElement;
import pages.signup.SignupPageObject;

import static com.codeborne.selenide.Selenide.*;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void selectMyAccountButton(){
        getMyAccountButton().click();
    }

    public SignupPageObject selectSignUpButton(){
        getSignUpButton().click();
        return page(SignupPageObject.class);
    }
}
