package pl.piotrdawidziuk.roundone.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    @ResponseBody
    public String home() {
        return "Hello";
    }

    @RequestMapping("/")
    public String test1() {
        return "index";
    }

}
