package com.example.buda.baseproject.api.request;

import com.example.buda.baseproject.entity.RequestResponse;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;


/**
 * Created by bojan on 12/11/2015.
 */
public abstract class AbstractRequest<T, M> extends RetrofitSpiceRequest<RequestResponse<T>, M> {
    public AbstractRequest(Class<M> hubClass) {
        super((Class<RequestResponse<T>>)(Class<?>)RequestResponse.class, hubClass);
    }
}
