package com.liujx.service.system.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liujx.entity.system.UserBean;
import com.liujx.mapper.system.UserMapper;
import com.liujx.service.system.user.IUserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Auther: 刘金鑫
 * @Date: 2020/1/21 15:30
 * @Version: 1.0
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserBean> implements IUserService {
}
