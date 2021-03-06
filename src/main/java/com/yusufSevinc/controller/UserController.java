package com.yusufSevinc.controller;

import com.yusufSevinc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public String userGetAll(Model model){
        model.addAttribute("users" , userRepository.getUsers());
        return "users";
    }
}
