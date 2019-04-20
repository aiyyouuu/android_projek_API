package com.example.android_projek_api.Model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class HolidayResponse {

    @SerializedName("articles")
    private List<HolidayItem> holidays;

    @SerializedName("status")
    private String status;

    public List<HolidayItem> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<HolidayItem> holidays) {
        this.holidays = holidays;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return
                "HolidayResponse{ " +
                        ", articles = '" + holidays + '\'' +
                        ", status = '" + status + '\'' +
                        "}";
    }
}
