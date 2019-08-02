package com.sharding.demo;

import com.sharding.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingDemoApplicationTests {


    @Autowired
    private UserService userService;

    @Test
    public void test() {
        userService.selectById(1);
    }

}
