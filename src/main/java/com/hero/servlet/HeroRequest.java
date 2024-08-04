package com.hero.servlet;

import java.util.List;
import java.util.Map;

/**
 * Servlet 规范之请求规范
 */
public interface HeroRequest {
    //获取URI 包含请求参数
    String getUri();
    //获取请求路径 不含参数
    String getPath();
    //获取HTTP请求方法
    String getMethod();
    //获取请求参数
    Map<String, List<String>> getParameters();
    //获取指定名称的请求参数
    List<String>getParameters(String name);

    String getParameter(String name);
}
