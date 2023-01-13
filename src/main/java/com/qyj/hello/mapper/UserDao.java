package com.qyj.hello.mapper;

import com.qyj.hello.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

  @Select("select * from user")
  List<User> findAll();

  @Insert({ "insert into user(firstName, lastName, age) values(#{firstName}, #{lastName}, #{age})"})
  void save(User user);

}
