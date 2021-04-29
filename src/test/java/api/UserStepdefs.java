package api;

import api.config.Config;
import api.config.ResponseWithToken;
import api.service.UserService;
import api.user.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class UserStepdefs {

    private UserService userService = new UserService();
    private Config config = new Config();

    @Given("get user request")
    public void iShouldGetCode() {
        User user = userService.getUser(config.getURL(), config.getTOKEN());
        System.out.println(user);
    }


    @Given("get user name")
    public void iShouldGetName() {
        User user = userService.getUser(config.getURL(), config.getTOKEN());
        System.out.println(user);
    }


    @Then("token is {string} then request is {int}")
    public void request_is(String token, int status) {

        ValidatableResponse response = given()
                .header("Content-Type", "application/json")
                .auth()
                .oauth2(token)
                .get("https://api.spotify.com/v1/me")
                .then()
                .assertThat();

        int actualStatus = response.extract().statusCode();

        assertEquals(actualStatus, status);
    }



    @Then("name is {string}")
    public void getUserName(String string) {

        ResponseWithToken responseWithToken =  new ResponseWithToken();

        String actualName = responseWithToken.reponse().extract().body().jsonPath().getString("display_name");
        String  expectName = "ipiliavskyi" ;
        assertEquals(expectName, actualName);
    }
}
