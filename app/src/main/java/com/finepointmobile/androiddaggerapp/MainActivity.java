package com.finepointmobile.androiddaggerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mCar = new Car("Honda", "Fit");
    }

    @Inject
    public String Asdf(Car car) {
        return "asdf";
    }
}
