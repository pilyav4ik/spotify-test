package ui.basic;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {


    void clickLink(String text){
        $(By.xpath("//a[contains(text(),'"+text+"')]")).click();
    }

    void clickButton(String text) {
        $(By.xpath("//button[contains(text(),'"+text+"')]"));
    }
}
