package com.qyj.hello.service;

import com.qyj.hello.pojo.User;

import java.util.List;

public interface UserService {

  List<User> findAll();
  void save(User user);
}
