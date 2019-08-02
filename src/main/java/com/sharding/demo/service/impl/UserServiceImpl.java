package com.sharding.demo.service.impl;

import com.sharding.demo.entity.User;
import com.sharding.demo.mapper.db1.UserOneMapper;
import com.sharding.demo.mapper.db2.UserTwoMapper;
import com.sharding.demo.mapper.db3.UserThreeMapper;
import com.sharding.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserOneMapper userOneMapper;

    @Autowired
    private UserTwoMapper userTwoMapper;

    @Autowired
    private UserThreeMapper userThreeMapper;

    @Override
    public void selectById(Integer id) {
        log.info("{}", userOneMapper.selectById(id));
        log.info("{}", userTwoMapper.selectById(id));
        log.info("{}", userThreeMapper.selectById(id));
    }
}
