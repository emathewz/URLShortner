package com.example.URLShortner.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;

@RestController
public class URLShortnerController {


    URLShortnerController(){

    }

    @GetMapping("/getShortURL")
    String getShortURL(String longURL){
        return "ShortURL";
    }

}
