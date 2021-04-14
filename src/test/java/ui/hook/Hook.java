package ui.hook;

import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.open;

public class Hook {
    @Before
    public void openURL(){
        open("https://www.spotify.com/us/");
        }
    }
