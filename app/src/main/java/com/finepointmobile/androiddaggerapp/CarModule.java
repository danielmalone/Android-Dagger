package com.finepointmobile.androiddaggerapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by danielmalone on 7/23/17.
 */

@Module
public class CarModule {

    @Provides
    @Singleton
    Car provideCar() {
        return new Car("Ford", "Mustang");
    }
}
