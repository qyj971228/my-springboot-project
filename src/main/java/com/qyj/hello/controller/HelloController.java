package com.qyj.hello.controller;

import com.qyj.hello.exception.AuthException;
import com.qyj.hello.handler.Result;
import com.qyj.hello.pojo.User;
import com.qyj.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class HelloController {

  @Autowired
  UserService userService;

  @PostMapping("/")
  public Result<String> hello() {
    return Result.string("hello");
  }

  @PostMapping("/admin")
  public void admin() {
    throw new AuthException();
  }

  @PostMapping("/findAll")
  public List<User> findAll() {
    return userService.findAll();
  }

  @PostMapping("/save")
  public void save(@Valid User user) {
    userService.save(user);
  }

}
