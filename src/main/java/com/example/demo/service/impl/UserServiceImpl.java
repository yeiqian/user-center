package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.domain.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-04-29 15:53:55
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword) {
        return 0;
    }
}




