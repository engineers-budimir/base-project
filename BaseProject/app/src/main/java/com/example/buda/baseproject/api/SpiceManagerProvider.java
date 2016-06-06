package com.example.buda.baseproject.api;

import com.example.buda.baseproject.api.service.AuthenticateService;
import com.octo.android.robospice.SpiceManager;

/**
 * Created by Buda on 6/6/2016.
 */
public interface SpiceManagerProvider {
    public static final Class AUTHENTICATE_PROVIDER = AuthenticateService.class;

    /**
     * Returns the requested spice manager which is used for executing API requests
     *
     * @param spiceManagerServiceClass
     * @return
     */
    SpiceManager getSpiceManager(Class spiceManagerServiceClass);
}
