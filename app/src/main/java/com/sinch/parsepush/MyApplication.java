package com.sinch.parsepush;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by a on 05/07/2015.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "app_key", "client_key");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
