package com.example.URLShortner.Repository;
import com.example.URLShortner.Model.ShortAndLongUrlMap;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public class ShortandLongMapRepository {


    @PersistenceContext
    EntityManager entityManager;
    public String getShortUrlFromLongUrl(String longUrl){

        ShortAndLongUrlMap shortAndLongUrlMap = entityManager.find(ShortAndLongUrlMap.class,longUrl);
        String ShortUrl = shortAndLongUrlMap.shortUrl;
        return ShortUrl;
    }


}


