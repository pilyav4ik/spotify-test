package ui.registration;

import io.cucumber.java.en.When;

public class RegistrationPageDef {

    private RegistrationPage registrationPage = new RegistrationPage();

    @When("input email {string} for registration")
    public void inputEmailEmailForRegistration(String email) {
        registrationPage.setEmailInput(email);
    }

    @When("input email {string} again for registration")
    public void inputEmailEmailtwoAgainForRegistration(String emailtwo) {
        registrationPage.setEmailConfirmInput(emailtwo);
    }

    @When("input password {string} for registration")
    public void inputPasswordForRegistration(String password) {
        registrationPage.setPassword(password);
    }

    @When("input profile name {string} for registration")
    public void inputProfileNameForRegistration(String prifileName) {
        registrationPage.setProfileName(prifileName);
    }

    @When("input month of birth {string} for registration")
    public void inputMonthForRegistration(String month) {
        registrationPage.setMonth(month);
    }

    @When("input day of birth {int} for registration")
    public void inputDayForRegistration(int day) {
        registrationPage.setDay(day);
    }

    @When("input year of birth {int} for registration")
    public void inputYearForRegistration(int year) {
        registrationPage.setYear(year);
    }

    @When("check gender {string} for registration")
    public void checkGenderForRegistration(String gender) {
        if (gender.equals("male")) {
            registrationPage.setGenderMale();
        }
        if (gender.equals("female")) {
            registrationPage.setGenderFemale();
        }
        if (gender.equals("non binary")) {
            registrationPage.setGenderNonbinary();
        }
    }
}

