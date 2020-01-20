package com.liujx.service.impl;

import com.liujx.entity.User;
import com.liujx.mapper.UserMapper;
import com.liujx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Auther: 刘金鑫
 * @Date: 2020/1/20 11:18
 * @Version: 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> getList() {
        return userMapper.selectList(null);
    }
}
