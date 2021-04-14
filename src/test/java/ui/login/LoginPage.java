package ui.login;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement emailInput = $(By.id("login-username"));
    private SelenideElement passwordInput = $(By.id("login-password"));
    private SelenideElement logInButton = $(By.id("login-button"));

    void setEmailInput(String emailInput) {
        this.emailInput.val(emailInput);
    }

    void setPasswordInput(String passwordInput) {
        this.passwordInput.val(passwordInput);
    }

    void clickLogInButton(){
        logInButton.click();
    }
}
