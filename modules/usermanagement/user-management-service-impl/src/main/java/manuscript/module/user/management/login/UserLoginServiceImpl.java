package manuscript.module.user.management.login;


import manuscript.module.user.management.login.request.UserLoginRequest;
import manuscript.module.user.management.login.response.UserLoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bence Varadi
 *
 */
@Service
public class UserLoginServiceImpl implements  UserLoginService{

    @Autowired
    public UserLoginDao dao;

    @Override
    public UserLoginDto isValidUser(UserLoginRequest request) {
        if (dao.getUserPasswordToValidation(request).equals(request.getPassword()) && dao.isEnabledUser(request.getUserName()) == 0 && dao.getFailedLoginPiece(request.getUserName()) < 6)
            return dao.getUserDatas(request.getUserName());

        dao.increaseFailedLoginPiece(request.getUserName());
        return null;
    }
}
