package com.pdc.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);
private int ControllerCount=0;
    @RequestMapping("/")
    public String Home(Model model) {

        Map map = new HashMap<>();
        map.put("name", "hong");
        map.put("age", "55");
        model.addAttribute("user", map);
        System.out.println("컨트롤러 잘됨 "+ControllerCount++);
        return "home";
    }

}
