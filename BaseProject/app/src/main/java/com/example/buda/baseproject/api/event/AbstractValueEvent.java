package com.example.buda.baseproject.api.event;

/**
 * Created by Buda on 6/6/2016.
 */
public abstract class AbstractValueEvent<T> {
    private T value;

    private Object caller;

    public AbstractValueEvent(T value) {
        this.value = value;
    }

    public AbstractValueEvent(T value, Object caller) {
        this.value = value;
        this.caller = caller;
    }

    public T getValue() {
        return value;
    }

    public Object getCaller() {
        return caller;
    }
}
