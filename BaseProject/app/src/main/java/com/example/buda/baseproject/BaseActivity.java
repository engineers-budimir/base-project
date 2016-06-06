package com.example.buda.baseproject;

import android.support.v7.app.AppCompatActivity;

import timber.log.Timber;

/**
 * Created by Buda on 6/6/2016.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        Timber.d(this.getClass().getSimpleName() + " onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Timber.d(this.getClass().getSimpleName() + " onResume");
        ProjectApp.getEventBus().register(this);

        // Update network state

        super.onResume();
    }

    @Override
    protected void onPause() {
        Timber.d(this.getClass().getSimpleName() + " onPause");
        ProjectApp.getEventBus().unregister(this);
        super.onPause();
    }

    @Override
    protected void onStop() {
        Timber.d(this.getClass().getSimpleName() + " onStop");
        super.onStop();
    }

    @Override
    protected void onStart() {
        Timber.d(this.getClass().getSimpleName() + " onStart");
        super.onStart();
    }
}
