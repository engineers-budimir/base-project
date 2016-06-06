package com.example.buda.baseproject.api.event;

import com.example.buda.baseproject.api.listener.AbstractListener;

/**
 * Created by Buda on 6/6/2016.
 */
public class GenericApiErrorEvent extends AbstractValueEvent<String> {

    private Class<? extends AbstractListener> listenerClass;

    public GenericApiErrorEvent(String value, Class<? extends AbstractListener> listenerClass) {
        super(value);
        this.listenerClass = listenerClass;
    }

    public Class<? extends AbstractListener> getListenerClass() {
        return listenerClass;
    }
}