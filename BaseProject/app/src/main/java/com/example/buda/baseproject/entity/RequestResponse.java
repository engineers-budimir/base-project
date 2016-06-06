package com.example.buda.baseproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Buda on 6/6/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestResponse<T> implements Serializable {
    @JsonProperty("success")
    private boolean success;

    @JsonProperty("error")
    private String error;

    @JsonProperty("payload")
    private T payload;

    public RequestResponse() {
    }

    public boolean isSuccess() {
        return success;
    }

    public String getError() {
        return error;
    }

    public T getPayload() {
        return payload;
    }

}
