package ui.basic;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {


    public void clickLink(String text){
        $(By.xpath("//a[contains(text(),'"+text+"')]")).click();
    }

    public void clickButton(String text) {
        $(By.xpath("//button[contains(text(),'"+text+"')]"));
    }

    public void contentIsVisible(String text){
        $(By.xpath("//*[contains(text(),'"+text+"')]"));
    }
}
