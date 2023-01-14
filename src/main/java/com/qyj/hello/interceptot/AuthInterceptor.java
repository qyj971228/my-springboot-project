package com.qyj.hello.interceptot;

import com.qyj.hello.exception.AuthException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthInterceptor implements HandlerInterceptor {

  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
    String auth = request.getHeader("Auth");
    if (auth == null) {
      throw new AuthException();
    }
    return true;
  }
}
