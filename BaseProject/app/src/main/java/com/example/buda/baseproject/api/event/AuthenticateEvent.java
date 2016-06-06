package com.example.buda.baseproject.api.event;

import com.example.buda.baseproject.entity.RequestResponse;
import com.example.buda.baseproject.entity.User;

/**
 * Created by Buda on 6/6/2016.
 */
public class AuthenticateEvent extends AbstractValueEvent<RequestResponse<User>> {


    public AuthenticateEvent(RequestResponse<User> value) {
        super(value);
    }

    public AuthenticateEvent(RequestResponse<User> value, Object caller) {
        super(value, caller);
    }
}
