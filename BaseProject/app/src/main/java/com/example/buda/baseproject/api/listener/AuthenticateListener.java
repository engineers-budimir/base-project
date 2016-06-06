package com.example.buda.baseproject.api.listener;


import com.example.buda.baseproject.ProjectApp;
import com.example.buda.baseproject.api.event.AuthenticateEvent;
import com.example.buda.baseproject.entity.RequestResponse;
import com.example.buda.baseproject.entity.User;

/**
 * Created by Buda on 21.12.2015..
 */
public class AuthenticateListener extends AbstractListener<RequestResponse<User>>  {

    @Override
    public void onRequestSuccess(RequestResponse<User> loginRegisterPayloadRequestResponse) {
        ProjectApp.getEventBus().post(new AuthenticateEvent(loginRegisterPayloadRequestResponse));
    }
}
