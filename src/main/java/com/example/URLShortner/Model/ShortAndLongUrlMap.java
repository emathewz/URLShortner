package com.example.URLShortner.Model;
import jakarta.persistence.Entity;

@Entity
public class ShortAndLongUrlMap {

    String longUrl;
    String shortUrl;
}
