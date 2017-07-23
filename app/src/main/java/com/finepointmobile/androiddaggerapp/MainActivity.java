package com.finepointmobile.androiddaggerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mFab = (FloatingActionButton) findViewById(R.id.fab);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DetailView.class));
            }
        });

        CarComponent component = DaggerCarComponent.builder().carModule(new CarModule()).build();
        Car car = component.asdf();
        car.setBrand("Honda");
        car.setMake("Fit");
        Log.d(TAG, "onCreate: " + car.getBrand());
    }

    @Inject
    public String Asdf(Car car) {
        return "asdf";
    }
}
