package com.futamilktea.account.service.impl;

import com.futamilktea.account.mapper.UserMapper;
import com.futamilktea.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther: wulusai
 * @PackageName: com.futamilktea.account.service.impl
 * @ClassName: UserServiceImpl
 * @Description:
 * @date: 2019/8/29 20:35
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
}
