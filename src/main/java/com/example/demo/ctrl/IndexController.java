package com.example.demo.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;


@Controller
public class IndexController {
    
    /*
    필요에 따라서 메서드가 파라미터값을 전달받을 때
    @PathVariable
    @ReqeustParam
    XXXXDTO
    */
    // @GetMapping("/index.multicampus")
    @GetMapping("/")
    public String index(HttpSession session) {
        System.out.println("debug >>> IndexController user endpoint : /");
        if(session.getAttribute("loginUser") != null){
            return "landing";
        }
        return "index";
        
        
    }
    
}
