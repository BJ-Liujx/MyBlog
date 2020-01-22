package com.liujx.controller.system.user;

import com.alibaba.fastjson.JSON;
import com.liujx.controller.system.base.BaseController;
import com.liujx.entity.system.Result;
import com.liujx.entity.system.UserBean;
import com.liujx.service.system.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping(value = "/user")
public class UserManageController extends BaseController {

    /**装配service*/
    @Autowired
    IUserService userService;

    /**
     * 添加用户
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "")
    public Result addUser(@RequestBody UserBean userBean){
        Boolean b = userService.save(userBean);
        return success();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userNo}")
    public Result findUserByNo(@PathVariable String userNo){
        UserBean userBean = userService.getById(userNo);
        String jsonString = JSON.toJSONString(userBean);
        return success(jsonString);
    }




}
