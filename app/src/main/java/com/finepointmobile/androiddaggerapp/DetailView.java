package com.finepointmobile.androiddaggerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class DetailView extends AppCompatActivity {

    private static final String TAG = "DetailView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CarComponent component = DaggerCarComponent.builder().carModule(new CarModule()).build();
        Car car = component.asdf();
        Log.d(TAG, "onCreate: " + car.getBrand());
    }
}
