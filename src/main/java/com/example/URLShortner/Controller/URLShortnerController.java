package com.example.URLShortner.Controller;
import com.example.URLShortner.Service.UrlShortnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;

@RestController
public class URLShortnerController {

    UrlShortnerService _UrlShortnerService;
    URLShortnerController(UrlShortnerService UrlShortnerService){
        _UrlShortnerService = UrlShortnerService;

    }

    @GetMapping("/getShortURL")
    String getShortURL(String longURL){

        return _UrlShortnerService.getShortUrlFromLongUrl(longURL);
    }

}
