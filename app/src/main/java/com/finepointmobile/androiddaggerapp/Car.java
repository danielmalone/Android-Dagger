package com.finepointmobile.androiddaggerapp;

/**
 * Created by danielmalone on 7/23/17.
 */

public class Car {

    private String mBrand;

    private String mMake;

    public Car(String brand, String make) {
        mBrand = brand;
        mMake = make;
    }

    public String getBrand() {
        return mBrand;
    }

    public void setBrand(String brand) {
        mBrand = brand;
    }

    public String getMake() {
        return mMake;
    }

    public void setMake(String make) {
        mMake = make;
    }
}
