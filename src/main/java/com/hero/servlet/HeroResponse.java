package com.hero.servlet;
//Servlet 响应规范
public interface HeroResponse {

    void write(String content) throws Exception;
}
