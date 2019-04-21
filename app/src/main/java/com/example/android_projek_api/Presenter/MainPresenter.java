package com.example.android_projek_api.Presenter;

import android.content.Context;

import com.example.android_projek_api.Connection.BaseApp;
import com.example.android_projek_api.Model.HolidayResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
    private Context context;
    private MainView mainView;

    public MainPresenter(Context context, MainView mainView){
        this.context = context;
        this.mainView = mainView;
    }
    public void loadHoliday(String country, String year,  String month) {
        BaseApp.service.getHoliday(country, year, month).enqueue(new Callback<HolidayResponse>() {
            @Override
            public void onResponse(Call<HolidayResponse> call, Response<HolidayResponse> response) {
                if (response.isSuccessful()) {
                    mainView.onSucces(response.body().getHolidays());
                } else {
                    mainView.onError(response.message());
                }
            }

            @Override
            public void onFailure(Call<HolidayResponse> call, Throwable t) {
                mainView.onFailure(t.getMessage());
            }
        });
    }
}
