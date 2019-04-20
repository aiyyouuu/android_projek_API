package com.example.android_projek_api.Presenter;

import com.example.android_projek_api.Model.HolidayItem;

import java.util.List;

public interface MainView {
    void onSucces(List<HolidayItem> holidayItemList);

    void onError(String errorMessage);

    void onFailure (String failureMessage);
}
