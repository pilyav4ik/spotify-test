package api.config;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class ResponseWithToken {


    private Config config = new Config();


    public ValidatableResponse reponse(){
        return given()
                .header("Content-Type", "application/json")
                .auth()
                .oauth2(config.getTOKEN())
                .get("https://api.spotify.com/v1/me")
                .then()
                .assertThat();
    }

}
