package com.example.android_projek_api.Connection;

import com.example.android_projek_api.Model.HolidayResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/v1/holidays")
    Call<HolidayResponse> getHoliday(@Query("country") String country,
                                     @Query("year") String year,
                                     @Query("day") String day,
                                     @Query("month") String month);
}
