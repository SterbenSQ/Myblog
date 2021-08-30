package com.sterbensq.myblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainPageController {

    @GetMapping("index")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("index");

        return mv;
    }
}
