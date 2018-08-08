package com.linh.hello.controller;

import com.sun.deploy.net.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by trinhngoclinh on 8/8/2018.
 */
@Controller
public class HelloController {
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    @RequestMapping(value = "/student/show-form",method = RequestMethod.GET)
    public  String showForm(){
        return "student/form";
    }
    @RequestMapping(value = "/student/save-data",method = RequestMethod.POST)
    public String saveData(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String mark = request.getParameter("mark");
        String major =request.getParameter("major");

        request.setAttribute("name",name);
        request.setAttribute("mark",mark);
        request.setAttribute("major",major);

        return "student/success";
    }

//    @RequestMapping("/redirect")
//    public String redirectInx()
//    {
//        return "student/form";
//    }
}
