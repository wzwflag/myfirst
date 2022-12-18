package com.example.wuzhongwenweb.controller;

import com.example.wuzhongwenweb.common.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("test/login")
@Controller
public class LoginController {

    @RequestMapping("/index")
    public String index()
    {
        return "test/login/index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestParam(name="name") String name, @RequestParam(name="psw") String psw)
    {
        Result result = new Result();
        result.setData(true);
        return result;
    }
}
