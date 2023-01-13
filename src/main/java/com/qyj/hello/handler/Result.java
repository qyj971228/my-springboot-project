package com.qyj.hello.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class Result<T> {

  int code;

  String msg;

  T data;

  public Result(T data) {
    this.data = data;
    this.msg = HttpStatus.OK.name();
    this.code = HttpStatus.OK.value();
  }

  public Result(T data, String msg) {
    this.data = data;
    this.msg = HttpStatus.OK.name();
    this.code = HttpStatus.OK.value();
  }

  public Result(T data, String msg, int code) {
    this.data = data;
    this.msg = msg;
    this.code = code;
  }

  static public Result<String> string(String str) {
    return new Result<>(str, "success");
  }

}
