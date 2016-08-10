package com.example.janerubygrissom.myapplication;

import android.app.Application;

import com.google.android.gms.analytics.Tracker;

/**
 * Created by janerubygrissom on 8/9/16.
 */

import android.app.Application;

public class MyAnalyticsApplication extends Application {
        @Override
        public void onCreate() {
                super.onCreate();
                AnalyticsTrackers.initialize(this);
            }

                public static Tracker getDefaultTracker(){
                return AnalyticsTrackers.getInstance().get(AnalyticsTrackers.Target.APP);
            }
    }