package ui.hook;

import io.cucumber.java.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Hook {
    @Before
    public void openURL(){
        open("https://www.spotify.com/us/");
        if ($(By.id("onetrust-accept-btn-handler")).isDisplayed()){
            $(By.id("onetrust-accept-btn-handler")).click();
        }
        }
    }
