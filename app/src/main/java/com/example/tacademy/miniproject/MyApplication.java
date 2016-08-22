package com.example.tacademy.miniproject;

import android.app.Application;
import android.content.Context;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Administrator on 2016-08-09.
 */
public class MyApplication extends Application {
    static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

        context = this;
    }

    public static Context getContext() {
        return context;
    }
}