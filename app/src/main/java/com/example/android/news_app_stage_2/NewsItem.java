package com.example.android.news_app_stage_2;


public class NewsItem {
    private String mNewsTitle;
    private String mDate;
    private String mSection;
    private String mUrl;
    private String mAuthorName;


    public String getmAuthorName() {
        return mAuthorName;
    }

    String getmNewsTitle() {
        return mNewsTitle;
    }

    String getmDate() {
        return mDate;
    }

    String getmSection() {
        return mSection;
    }

    String getmUrl() {
        return mUrl;
    }

    NewsItem(String newsItem, String date, String section, String url, String authorName) {
        this.mNewsTitle = newsItem;
        this.mDate = date;
        this.mSection = section;
        this.mUrl = url;
        this.mAuthorName = authorName;
    }
}

