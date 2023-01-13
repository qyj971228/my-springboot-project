package com.qyj.hello.pojo;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;

@Data
public class User implements Serializable {

  private int id;

  @NotBlank(message = "姓名不能为空")
  private String firstName;

  @NotBlank(message = "⽤户名不能为空!")
  private String lastName;

  @Min(0)
  private int age;
}
