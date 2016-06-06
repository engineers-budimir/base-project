package com.example.buda.baseproject.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.buda.baseproject.R;
import com.example.buda.baseproject.api.SpiceManagerProvider;
import com.example.buda.baseproject.api.listener.AuthenticateListener;
import com.example.buda.baseproject.api.request.AuthenticateRequest;
import com.example.buda.baseproject.entity.User;

import butterknife.ButterKnife;

public class MainActivity extends SpiceConsumerActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void authhenticateRequest() {
        User user = new User();
        AuthenticateRequest request = new AuthenticateRequest(user);
        getSpiceManager(SpiceManagerProvider.AUTHENTICATE_PROVIDER)
                .execute(request, new AuthenticateListener());
    }
}
