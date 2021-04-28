package ui.registration;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    private SelenideElement emailInput = $(By.cssSelector("#email"));
    private SelenideElement emailConfirmInput = $(By.cssSelector("#confirm"));
    private SelenideElement password = $(By.xpath("//*[@id=\"password\"]"));
    private SelenideElement profileName = $(By.xpath("//*[@id=\"displayname\"]"));
    private SelenideElement month = $(By.xpath("//select[@id='month']"));
    private SelenideElement day = $(By.xpath("//input[@id='day']"));
    private SelenideElement year = $(By.xpath("//input[@id='year']"));
    private SelenideElement genderMale = $(By.xpath("//span[contains(text(),'Male')]"));
    private SelenideElement genderFemale = $(By.xpath("//span[contains(text(),'Female')]"));
    private SelenideElement genderNonbinary = $(By.xpath("//span[contains(text(),'Non-binary')]"));
    private SelenideElement submitButton =$(By.xpath("//button[@type='submit']"));

    void setEmailInput(String string) {
        emailInput.sendKeys(string);
    }

    void setEmailConfirmInput(String string) {
        emailConfirmInput.sendKeys(string);
    }

    void setPassword(String string) {
        password.sendKeys(string);
    }

    void setProfileName(String string) {
        profileName.sendKeys(string);
    }

    void setMonth(String string) {
        if (!string.equals("")){
            month.sendKeys(string);
        }else{
            month.sendKeys("");
        }
    }

    void setDay(int string) {
        String dayString = String.valueOf(string);
        if (!dayString.equals("")){
            day.sendKeys(dayString);
        }else{
            day.sendKeys("");
        }
    }

    void setYear(int string) {
        String yearString = String.valueOf(string);
        if (!yearString.equals("")){
            year.sendKeys(yearString);
        }else{
            year.sendKeys("");
        }
    }

    void setGenderMale() {
        genderMale.click();
    }

    void setGenderFemale() {
        genderFemale.click();
    }

    void setGenderNonbinary() {
        genderNonbinary.click();
    }
}
