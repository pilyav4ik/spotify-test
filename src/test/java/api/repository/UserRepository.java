package api.repository;

import api.user.User;


public interface UserRepository {
    User getUser(String url, String token);
}
