package com.example.buda.baseproject.api.service;

import com.example.buda.baseproject.api.hub.AuthenticateHub;

/**
 * Created by Buda on 6/6/2016.
 */
public class AuthenticateService extends BaseService {
    @Override
    public void onCreate() {
        super.onCreate();
        addRetrofitInterface(AuthenticateHub.class);
    }
}
