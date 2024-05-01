package com.example.demo.service;
import java.util.Date;

import com.example.demo.model.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testUserService(){
        User user = new User();
        user.setName("111");
        user.setUserAccount("212");
        user.setAvatarUrl("www.baidu.com");
        user.setUserPassword("6545");
        user.setPhone("45252");
        user.setEmail("2342343");

        userService.save(user);

    }

}
