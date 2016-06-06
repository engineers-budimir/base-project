package com.example.buda.baseproject.api.listener;

import com.example.buda.baseproject.ProjectApp;
import com.example.buda.baseproject.api.event.GenericApiErrorEvent;
import com.example.buda.baseproject.entity.RequestResponse;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

import timber.log.Timber;

/**
 * Created by Buda on 6/6/2016.
 */
public abstract class AbstractListener<T extends RequestResponse> implements RequestListener<T> {

    private Object caller;

    public AbstractListener() {
    }

    public AbstractListener(Object caller) {
        this.caller = caller;
    }

    @Override
    public void onRequestFailure(SpiceException spiceException) {
        Timber.e("onRequestFailure " + spiceException.getMessage());
        ProjectApp.getEventBus().post(new GenericApiErrorEvent(spiceException.getMessage(), this.getClass()));
    }
}
