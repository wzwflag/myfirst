package com.example.wuzhongwenweb.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;

@Controller
public class HelloController {
    @Autowired
    private ServletContext servletContext;
    @RequestMapping(value = "/speak")
    public String speak(Model model) {
        model.addAttribute("msg", "Hello , World!!!");
        String webRootPath = servletContext.getRealPath("");
        System.out.println(webRootPath);
        return "result";
    }
    @RequestMapping("/index")
    public String index()
    {

        System.out.println("index");
        return "test/login/index";
    }



}