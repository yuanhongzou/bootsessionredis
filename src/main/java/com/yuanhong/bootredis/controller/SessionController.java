package com.yuanhong.bootredis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/session")
public class SessionController {

    /**
     * 测试 add redis session
     */
    @RequestMapping("/add")
    public Object addSession(HttpServletRequest request, HttpSession session){
        String url = request.getRequestURL().toString();
        session.setAttribute("url",url);
        return url;
    }

    /**
     * 测试 add redis session
     */
    @RequestMapping("/get")
    public Object getSession(HttpServletRequest request, HttpSession session){
        return session.getAttribute("url");
    }

}
