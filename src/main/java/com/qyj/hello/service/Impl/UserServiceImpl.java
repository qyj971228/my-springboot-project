package com.qyj.hello.service.Impl;

import com.qyj.hello.mapper.UserDao;
import com.qyj.hello.pojo.User;
import com.qyj.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserDao userMapper;

  public List<User> findAll() {
    return userMapper.findAll();
  }

  public void save(User user) {
    userMapper.save(user);
  }
}
