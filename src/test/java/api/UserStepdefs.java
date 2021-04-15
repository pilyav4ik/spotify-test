package api;

import api.config.Config;
import api.config.ResponseWithToken;
import api.service.UserService;
import api.user.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;
import lombok.extern.slf4j.Slf4j;

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


    @Given("get user name")
    public void iShouldGetName() {
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

    @Then("request is 400")
    public void request_is_400(Integer int1) {


        ValidatableResponse response = given()
                .header("Content-Type", "application/json")
                .auth()
                .oauth2(config.getTOKEN()+"false")
                .get("https://api.spotify.com/v1/me")
                .then()
                .assertThat();

        int actualStatus = response.extract().statusCode();
        int expectStatus = int1 ;

        assertEquals(actualStatus, expectStatus);
    }



    @Then("name is {string}")
    public void getUserName(String string) {

        ResponseWithToken responseWithToken =  new ResponseWithToken();

        String actualName = responseWithToken.reponse().extract().body().jsonPath().getString("display_name");
        String  expectName = "ipiliavskyi" ;
        System.out.println(" ActualName : "+ actualName);
        assertEquals(actualName, expectName);
    }
}
