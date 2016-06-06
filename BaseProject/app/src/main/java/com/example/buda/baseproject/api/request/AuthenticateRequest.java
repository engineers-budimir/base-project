package com.example.buda.baseproject.api.request;

import com.example.buda.baseproject.api.hub.AuthenticateHub;
import com.example.buda.baseproject.entity.RequestResponse;
import com.example.buda.baseproject.entity.User;

/**
 * Created by Buda on 6/6/2016.
 */
public class AuthenticateRequest extends AbstractRequest<User, AuthenticateHub> {
    private User mUser;

    public AuthenticateRequest(User user) {
        super(AuthenticateHub.class);
        this.mUser = user;
    }

    @Override
    public RequestResponse<User> loadDataFromNetwork() throws Exception {
        return getService().authenticate(mUser);
    }
}
