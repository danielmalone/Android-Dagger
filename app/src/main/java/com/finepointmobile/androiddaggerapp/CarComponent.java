package com.finepointmobile.androiddaggerapp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by danielmalone on 7/23/17.
 */

@Singleton
@Component(modules = {CarModule.class})
public interface CarComponent {
    
    Car asdf();
}
