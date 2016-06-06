package com.example.buda.baseproject.view.activity;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.buda.baseproject.api.SpiceManagerProvider;
import com.example.buda.baseproject.database.DatabaseManager;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.octo.android.robospice.SpiceManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Buda on 6/6/2016.
 */
public abstract class SpiceConsumerActivity extends BaseActivity {

    private SpiceManagerProvider mSpiceManagerProvider;
    protected DatabaseManager mDBManager;

    private Map<Class, SpiceManager> mSpiceManagers = new HashMap<Class, SpiceManager>();

    {
        mSpiceManagers.put(SpiceManagerProvider.AUTHENTICATE_PROVIDER, new SpiceManager(SpiceManagerProvider.AUTHENTICATE_PROVIDER));

    }

    @Override
    protected void onStart() {
//        SocketManager.getInstance().connect(CiaoApp.getCurrentUser().get_id());
        for (Map.Entry<Class, SpiceManager> entry : mSpiceManagers.entrySet()) {
            entry.getValue().start(this);
        }

        super.onStart();
    }

    protected SpiceManager getSpiceManager(Class spiceManagerServiceClass) {
        return mSpiceManagerProvider.getSpiceManager(spiceManagerServiceClass);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        mDBManager = OpenHelperManager.getHelper(this, DatabaseManager.class);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mDBManager != null) {
            OpenHelperManager.releaseHelper();
            mDBManager = null;
        }
    }
}
