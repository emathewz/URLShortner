package com.example.URLShortner.Service;


import com.example.URLShortner.Repository.ShortandLongMapRepository;
import org.springframework.stereotype.Service;

@Service
public class UrlShortnerService {

    ShortandLongMapRepository _shortandLongMapRepository;
    UrlShortnerService(ShortandLongMapRepository shortandLongMapRepository){
        _shortandLongMapRepository = shortandLongMapRepository;
    }

    public String getShortUrlFromLongUrl(String longUrl){

        return _shortandLongMapRepository.getShortUrlFromLongUrl(longUrl);
    }
}
