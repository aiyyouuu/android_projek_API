package com.example.android_projek_api.Model;

import com.google.gson.annotations.SerializedName;

public class HolidayItem {
    @SerializedName("publishedAt")
    private String publishedAt;

    @SerializedName("title")
    private String title;

    @SerializedName("date")
    private String date;

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return
                "HolidayItem{" +
                        "publishedAt = '" + publishedAt + '\'' +
                        "title = '" + title + '\'' +
                        "date = '" + date + '\'' +
                        "}";
    }
}
