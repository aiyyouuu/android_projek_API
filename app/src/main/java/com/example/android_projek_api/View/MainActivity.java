package com.example.android_projek_api.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.android_projek_api.Adapter.HolidayAdapter;
import com.example.android_projek_api.Model.HolidayItem;
import com.example.android_projek_api.Presenter.MainPresenter;
import com.example.android_projek_api.Presenter.MainView;
import com.example.android_projek_api.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    private RecyclerView rc;
    private HolidayAdapter adapter;
    private MainPresenter mainPresenter;
    private String country = "PL";
    private String year = "2018";
    private String day = "25";
    private String month = "12";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc = findViewById(R.id.rec_holiday);
        mainPresenter = new MainPresenter(this, this);
        mainPresenter.loadHoliday(country, year, day, month);
    }

    @Override
    public void onSucces(List<HolidayItem> holidayItemList) {
        adapter = new HolidayAdapter(getApplicationContext(), holidayItemList);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure(String failureMessage) {
        Toast.makeText(this, failureMessage, Toast.LENGTH_SHORT).show();
    }
}
