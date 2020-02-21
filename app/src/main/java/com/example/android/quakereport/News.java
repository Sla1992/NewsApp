package com.example.android.quakereport;

import android.net.Uri;

import java.net.URL;

public class News {

    private String mImageUrl;
    private String mTitle;
    private String mDescription;
    private String mUrl;
    private String mTime;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    // Constructor
    public News(String imageUrl, String title, String description, String time, String url){
        mImageUrl = imageUrl;
        mTitle = title;
        mDescription = description;
        mTime = time;
        mUrl = url;
    }

    //Getters and setters

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }



}
