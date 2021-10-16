package com.amr.project.webapp.controller;

import com.amr.project.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    @GetMapping("/signup")
    public String index(Model model){
        model.addAttribute("user", new User());
        return "signup";}
}
