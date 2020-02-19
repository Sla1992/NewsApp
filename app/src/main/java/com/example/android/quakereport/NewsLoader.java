package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public  class NewsLoader extends AsyncTaskLoader<List<News>> {

    public static final String LOG_TAG = NewsLoader.class.getName();

    private String mUrl;

    public NewsLoader(Context context, String url){
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading(){
        Log.e(LOG_TAG, "TEST: NewsLoader onStartLoading() called.");
        forceLoad();
    }


    @Override
    public List<News> loadInBackground() {
        Log.e(LOG_TAG, "TEST: NewsLoader loadInBackground() called.");

        // Don't perform the request if there are no URLs, or the first URL is null
        if (mUrl == null) {
            return null;
        }

        List<News> news = QueryUtils.fetchNewsData(mUrl);
        return news;
    }
}
