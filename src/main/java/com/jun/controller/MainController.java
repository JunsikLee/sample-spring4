package com.jun.controller;

import com.jun.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @Autowired
    private MainService mainService;

    @RequestMapping(method = RequestMethod.GET, value = "/main")
    public String Test(ModelMap model){
        model.addAttribute("title", "Spring MVC");
        model.addAttribute("message", "Hello Spring MVC Framework!");
        model.addAttribute("main", mainService.GetString());

        return "main";
    }
}
