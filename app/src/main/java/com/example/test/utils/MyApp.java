package com.example.test.utils;

import android.app.Application;
import android.content.Context;
import com.example.test.dagger.components.ApiManagerComponent;
import com.example.test.dagger.components.DaggerApiManagerComponent;
import com.example.test.dagger.components.DaggerMyAppComponent;
import com.example.test.dagger.components.MyAppComponent;
import com.example.test.dagger.modules.ApiMangerModule;
import com.example.test.dagger.modules.MyAppModule;

public class MyApp extends Application {

    public static Context context;
    public static MyAppComponent mAppComponent;
    public static ApiManagerComponent mApiManagerComponent;

    @Override public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        initDagger();
    }

    void initDagger() {
        mAppComponent = DaggerMyAppComponent.builder()
                .myAppModule(new MyAppModule(this))
                .build();

        mApiManagerComponent = DaggerApiManagerComponent.builder()
                .apiMangerModule(new ApiMangerModule())
                .build();
    }

    public MyAppComponent getApplicationComponent() {
        return mAppComponent;
    }

    public ApiManagerComponent getApiManagerComponent() {
        return mApiManagerComponent;
    }

    public static Context getAppContext() {
        return context;
    }
}
