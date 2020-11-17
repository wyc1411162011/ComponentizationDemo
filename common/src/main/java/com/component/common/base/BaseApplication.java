package com.component.common.base;

import android.app.Application;
import android.content.Context;

import java.util.logging.Logger;

public class BaseApplication extends Application {
        private static BaseApplication sInstance;
        public static Context context;
        public static BaseApplication getIns() {
            return sInstance;
        }
        @Override
        public void onCreate() {
            super.onCreate();
            sInstance = this;
            context = this.getApplicationContext();
        }
    }