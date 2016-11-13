package manuscript.module.user.management.login;

import manuscript.module.user.management.login.request.UserLoginRequest;
import manuscript.module.user.management.login.response.UserLoginDto;

/**
 *
 * @author Bence Varadi
 *
 */
public interface UserLoginService {

    public UserLoginDto isValidUser(UserLoginRequest request);
}
