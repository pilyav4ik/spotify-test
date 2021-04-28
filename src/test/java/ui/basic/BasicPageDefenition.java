package ui.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.open;

public class BasicPageDefenition {

    private BasicPage basicPage = new BasicPage();

    @Given("go to the {string} page")
    public void i_want_to_open_page(String webpage) {
        open(webpage);
    }

    @Then("click {string} link")
    public void clickLink(String link){
        basicPage.clickLink(link);
    }

    @Then("click {string} button")
    public void clickButton(String string) {
        basicPage.clickButton(string);
    }

    @Then("content with text {string} visible")
    public void confirmMessage(String string){
        basicPage.contentIsVisible(string);
    }

}
