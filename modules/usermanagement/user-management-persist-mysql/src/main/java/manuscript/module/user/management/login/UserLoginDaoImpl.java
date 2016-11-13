package manuscript.module.user.management.login;

import manuscript.module.user.management.login.mapper.UserLoginMapper;
import manuscript.module.user.management.login.request.UserLoginRequest;
import manuscript.module.user.management.login.response.UserLoginDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Bence Varadi
 *
 */
public class UserLoginDaoImpl implements UserLoginDao {

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public String getUserPasswordToValidation(UserLoginRequest request) {
        return userLoginMapper.getUserPasswordToValidation(request.getUserName());
    }

    @Override
    public UserLoginDto getUserDatas(String userName) {
        return userLoginMapper.getUserDatas(userName);
    }

    @Override
    public int isEnabledUser(String userName) {
        return userLoginMapper.isEnabledUser(userName);
    }

    @Override
    public int getFailedLoginPiece(String userName) {
        return userLoginMapper.getFailedLoginPiece(userName);
    }

    @Override
    public void increaseFailedLoginPiece(String userName) {
        userLoginMapper.incraseFailedLoginPiece(userName);
    }
}
