package com.example.buda.baseproject.api.service;

import com.example.buda.baseproject.Consts;
import com.octo.android.robospice.retrofit.RetrofitJackson2SpiceService;

import org.apache.commons.lang3.StringUtils;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import timber.log.Timber;

/**
 * Created by Buda on 6/6/2016.
 */
public abstract class BaseService extends RetrofitJackson2SpiceService {

    private static final String TOKEN = "Authorization";

    /**
     * Method will add interceptor which contain 'Authorization' token for all API calls
     * @return RestAdapter Builder
     */
    @Override
    protected RestAdapter.Builder createRestAdapterBuilder() {
        RestAdapter.Builder builder = super.createRestAdapterBuilder();
        RequestInterceptor interceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade requestFacade) {
                Timber.d("Intercept");

                //adding token only if need
                final String token = null;
//                token = SharedPreferencesHelper.getAuthTokenAPI(getApplicationContext());
                if (StringUtils.isNotEmpty(token)) {
                    requestFacade.addHeader(TOKEN, token);
                }
            }
        };
        builder.setRequestInterceptor(interceptor);
        builder.setLogLevel(RestAdapter.LogLevel.FULL);
        return builder;
    }

    @Override
    protected String getServerUrl() {
        return Consts.BASE_API_URL;
    }
}
