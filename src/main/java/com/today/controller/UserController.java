package com.today.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.today.service.UserService;
import com.today.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @Resource(name="userServiceImpl")
    private UserService service;
    
    @RequestMapping("/showUser")
    public String index(HttpServletRequest request, Model model){
        System.out.println("3333333333333333");
        int id = Integer.parseInt(request.getParameter("id"));
        User user = service.getUserById(id);
        model.addAttribute("user", user);
        return "user";
    }
}
