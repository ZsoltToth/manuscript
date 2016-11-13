package manuscript.module.user.management.login;

import manuscript.module.user.management.login.request.UserLoginRequest;
import manuscript.module.user.management.login.response.UserLoginDto;

/**
 *
 * @author Bence Varadi
 *
 */
public interface UserLoginDao {

    public String getUserPasswordToValidation(UserLoginRequest request);

    public UserLoginDto getUserDatas(String userName);

    public int isEnabledUser(String userName);

    public int getFailedLoginPiece(String userName);

    public void increaseFailedLoginPiece(String userName);

}
