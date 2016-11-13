package manuscript.module.user.management.login.mapper;

import manuscript.module.user.management.login.response.UserLoginDto;

/**
 *
 * @author Bence Varadi
 *
 */
public interface UserLoginMapper {

    public String getUserPasswordToValidation(String userName);

    public UserLoginDto getUserDatas(String userName);

    public int isEnabledUser(String userName);

    public int getFailedLoginPiece(String userName);

    public void incraseFailedLoginPiece(String userName);
}
