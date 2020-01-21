package com.liujx.controller.system.user;

import com.liujx.entity.system.UserBean;
import com.liujx.service.system.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserManageController
 * @Auther: 刘金鑫
 * @Date: 2020/1/21 15:32
 * @Version: 1.0
 * @Description:
 */

@RestController
@RequestMapping(value = "/admin")
public class UserManageController {

    @Autowired
    IUserService userService;

    /**
     * 新增一个用户对象
     * 非幂等
     * */

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public Object addUser(String userName,String passWord){
        UserBean userBean = new UserBean();
        userBean.setUserName(userName);
        userBean.setPassWord(passWord);
        Boolean b = userService.save(userBean);
        return b;
    }
}
