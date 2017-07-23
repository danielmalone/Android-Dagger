package com.finepointmobile.androiddaggerapp;

import dagger.Module;

/**
 * Created by danielmalone on 7/23/17.
 */

@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
