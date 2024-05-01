package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.domain.User;

/**
* @author admin
* @description 针对表【user】的数据库操作Service
* @createDate 2024-04-29 15:53:55
*/
public interface UserService extends IService<User> {
    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 返回用户ID
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);
}