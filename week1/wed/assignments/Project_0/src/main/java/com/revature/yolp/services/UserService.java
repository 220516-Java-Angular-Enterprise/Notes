package main.java.com.revature.yolp.services;


/* Purpose: validation ie. checks username, password, and retrieve data from our daos */
public class UserService {

    public boolean isValidUsername(String username) {
        return username.matches(^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*$)
    }
}
