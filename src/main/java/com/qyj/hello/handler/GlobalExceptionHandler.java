package com.qyj.hello.handler;

import com.qyj.hello.exception.AuthException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public Result<String> BindExceptionHandler(BindException e) {
    return new Result<>(e.getBindingResult().getFieldError().getDefaultMessage(), HttpStatus.BAD_REQUEST.name(), HttpStatus.BAD_REQUEST.value());
  }

  @ExceptionHandler
  @ResponseStatus(HttpStatus.FORBIDDEN)
  @ResponseBody
  public Result<String> AuthExceptionHandler(AuthException e) {
    return e.getResult();
  }

  @ExceptionHandler
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ResponseBody
  public Result<String> exceptionHandler(Exception e) {
    System.out.println(e);
    return new Result<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.name(), HttpStatus.INTERNAL_SERVER_ERROR.value());
  }
}
