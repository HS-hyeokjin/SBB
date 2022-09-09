package com.mysite.sbb;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "helaaaallo";
    }
}
