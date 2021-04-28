package ui.login;

import io.cucumber.java.en.Then;
import ui.config.UserConfig;

public class LoginPageDef {

    private LoginPage loginPage = new LoginPage();

    @Then("input email")
    public void inputEmail() {
        loginPage.setEmailInput(UserConfig.USER_EMAIL);
    }

    @Then("input password")
    public void inputPassword(){
        loginPage.setPasswordInput(UserConfig.USER_PASSWORD);
    }

    @Then("check checkbox {string} is cheked")
    public void checkCheckboxIsCheked(String arg0) {

    }

    @Then("click login button")
    public void clickButton() {
        loginPage.clickLogInButton();
    }

}
