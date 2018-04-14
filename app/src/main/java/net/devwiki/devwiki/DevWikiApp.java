package net.devwiki.devwiki;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import net.devwiki.log.DevLog;

/**
 * 自定义的Application
 * Created by DevWiki on 2016/10/30.
 */

public class DevWikiApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DevLog.d("0");
        DevLog.d("00");
        DevLog.d("000");
        DevLog.d("0000");
        DevLog.d("00000");
//        KLog.d("The girls and Dodgson took another boat trip a month later when he elaborated the plot to " +
//                "the story of Alice, and in November he began working on the manuscript in earnest.");
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
}
