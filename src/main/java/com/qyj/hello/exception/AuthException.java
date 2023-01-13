package com.qyj.hello.exception;

import com.qyj.hello.handler.Result;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class AuthException extends RuntimeException {
  private final String data = "无权访问";
  private final String msg = HttpStatus.FORBIDDEN.name();
  private final int code = HttpStatus.FORBIDDEN.value();

  public Result getResult() {
    return new Result<>(this.data, this.msg, this.code);
  }
}
