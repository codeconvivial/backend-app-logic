package com.codingconvival.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;
import java.util.HashMap;


@Controller
public class UserController {
    @RequestMapping("/test")
    @ResponseBody
    
    public Map<String, String> demo(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "changed");
        return map;
    }
}
