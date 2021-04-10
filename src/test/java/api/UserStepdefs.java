package api;

import api.config.Config;
import api.service.UserService;
import api.user.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


@Slf4j
public class UserStepdefs {

    private UserService userService = new UserService();
    private Config config = new Config();

    @Given("get user request")
    public void iShouldGetCode() {
        User user = userService.getUser(config.getURL(), config.getTOKEN());
        System.out.println(user);
    }


    @Then("request is {int}")
    public void request_is(Integer int1) {


        ValidatableResponse response = given()
                .header("Content-Type", "application/json")
                .auth()
                .oauth2(config.getTOKEN())
                .get("https://api.spotify.com/v1/me")
                .then()
                .assertThat();

        int actualStatus = response.extract().statusCode();
        int expectStatus = int1 ;

        assertEquals(actualStatus, expectStatus);
    }
}
