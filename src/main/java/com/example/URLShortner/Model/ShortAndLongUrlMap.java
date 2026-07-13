package com.example.URLShortner.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ShortAndLongUrlMap")
public class ShortAndLongUrlMap {

    @Id
    public String longUrl;
    public String shortUrl;
}
