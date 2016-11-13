package manuscript.module.user.management.login;

import manuscript.module.user.management.login.request.UserLoginRequest;
import manuscript.module.user.management.login.response.UserLoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Bence Varadi
 *
 */
@Controller
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public UserLoginDto executeLogin(@RequestBody UserLoginRequest request) {
        return userLoginService.isValidUser(request);
    }

}
