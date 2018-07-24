package com.tvvbbb.objectboxlivedataswallowsexception;

import android.app.Application;

import io.objectbox.BoxStore;

/**
 * Created by tvvbb on 2018/7/23.
 */

public class App extends Application {

    private BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        boxStore = MyObjectBox.builder().androidContext(this).build();
    }

    public BoxStore getBoxStore(){
        return boxStore;
    }

}
