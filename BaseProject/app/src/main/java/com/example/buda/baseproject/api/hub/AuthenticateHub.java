package com.example.buda.baseproject.api.hub;

import com.example.buda.baseproject.entity.RequestResponse;
import com.example.buda.baseproject.entity.User;

import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by Buda on 6/6/2016.
 */
public interface AuthenticateHub {

    @POST("/authenticate")
    RequestResponse<User> authenticate(@Body User user);
}
