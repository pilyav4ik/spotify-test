package api.config;

import api.token.Token;

public class Config {
    private Token token = new Token();

    public String getURL() {
        return "https://api.spotify.com/v1/";
    }

    public String getTOKEN() {
        return token.getToken();
    }
}
