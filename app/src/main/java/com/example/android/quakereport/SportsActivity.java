package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_list);

        //Create an array of words
        final ArrayList<News> news = new ArrayList<News>();


        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));
        news.add(new News("@drawable/gaming", "gamingnewsasdads", "A little info about the news", "http://www.google.ch"));


        NewsAdapter adapter = new NewsAdapter(this, news);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
