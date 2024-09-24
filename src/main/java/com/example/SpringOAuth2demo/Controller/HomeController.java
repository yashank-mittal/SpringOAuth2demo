package com.example.SpringOAuth2demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greet()
    {
        return "Hello Spring!!";
    }
    
}
