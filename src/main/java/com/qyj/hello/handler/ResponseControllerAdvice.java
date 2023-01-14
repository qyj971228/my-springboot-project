package com.qyj.hello.handler;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice(basePackages = {"com.qyj.hello.controller"})
public class ResponseControllerAdvice implements ResponseBodyAdvice<Object> {

  public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> aClass) {
    return !returnType.getGenericParameterType().equals(Result.class);
  }

  public Object beforeBodyWrite(Object data, MethodParameter returnType, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
    return new Result<>(data);
  }
}
