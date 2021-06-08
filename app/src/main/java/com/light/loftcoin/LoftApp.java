package com.light.loftcoin;

import android.app.Application;
import android.os.StrictMode;

import com.light.loftcoin.util.DebugTree;

import timber.log.Timber;

public class LoftApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            StrictMode.enableDefaults();
            Timber.plant(new DebugTree());
        }

        component = DaggerAppComponent.builder()
                .application(this)
                .build();

        Timber.d("%s", component.coinsRepo());
        Timber.d("%s", component.coinsRepo());
    }
}
