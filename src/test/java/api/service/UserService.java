package api.service;

import api.config.Config;
import api.repository.UserRepository;
import api.user.User;
import io.restassured.response.ValidatableResponse;

import static api.context.RunContext.RUN_CONTEXT;
import static io.restassured.RestAssured.given;

public class UserService implements UserRepository{

    Config config = new Config();

    @Override
    public User getUser(String url, String token) {
        String URL = config.getURL()  + url;
        User user = new User();

        ValidatableResponse response = given().log().everything()
                .header("Content-Type", "application/json")
                .auth()
                .oauth2(config.getTOKEN())
                .get("https://api.spotify.com/v1/me")
                .then().log().ifError();
        RUN_CONTEXT.put("response",response);
        try{
            user = response.extract().jsonPath().getObject("user", User.class);
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

        return user;
    }
}
