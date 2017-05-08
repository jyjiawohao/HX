package com.sizu.mingteng.hx;

import android.app.Application;

import com.sizu.mingteng.hx.CustomerService.Preferences;
import com.sizu.mingteng.hx.CustomerService.widget.DemoHelper;

/**
 * Created by lenovo on 2017/5/6.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Preferences.init(this);
        DemoHelper.getInstance().init(this);
    }
}
