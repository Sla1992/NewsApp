package com.example.android.newsreport;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {

    private News news;

    @Before
    public void setUp(){
        news = new News("http://thisismyapisite.com","myNewsTitle","myNewsDescription","12-12-12T22:39:59Z","http://myimageurl.com");
    }

    @Test
    public void getNews() {

        assertEquals("http://thisismyapisite.com",news.getmImageUrl());
        assertEquals("myNewsTitle",news.getmTitle());
        assertEquals("myNewsDescription",news.getmDescription());
        assertEquals("12-12-12T22:39:59Z",news.getmTime());
        assertEquals("http://myimageurl.com",news.getmUrl());

    }
}
