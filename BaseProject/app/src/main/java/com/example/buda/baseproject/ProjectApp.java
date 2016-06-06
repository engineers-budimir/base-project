package com.example.buda.baseproject;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.example.buda.baseproject.database.DatabaseManager;
import com.j256.ormlite.android.apptools.OpenHelperManager;

import timber.log.Timber;

/**
 * Created by Buda on 6/6/2016.
 */
public class ProjectApp extends Application implements Application.ActivityLifecycleCallbacks {

    //Initialize Database helper class
    static {
        OpenHelperManager.setOpenHelperClass(DatabaseManager.class);
    }

    @Override
    public void onCreate() {
        super.onCreate();


        // Debug logging
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
            Timber.d("OnCreate Application");
        }

        //Monitor activity callbacks
        registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}
