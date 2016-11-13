package manuscript.module.user.management.login.request;

/**
 * Created by Beni on 2016.11.13..
 */
public class UserLoginRequest {

    private String userName;
    private String password;

    public UserLoginRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
