package net.devwiki.devwiki;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import net.devwiki.log.DevLog;

/**
 * 自定义的Application
 * @author zyz
 * Created by DevWiki on 2016/10/30.
 */

public class DevWikiApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                DevLog.d("ActivityCreated:" + activity.getLocalClassName());
            }

            @Override
            public void onActivityStarted(Activity activity) {
                DevLog.d("ActivityStarted:" + activity.getLocalClassName());
            }

            @Override
            public void onActivityResumed(Activity activity) {
                DevLog.d("ActivityResumed:" + activity.getLocalClassName());
            }

            @Override
            public void onActivityPaused(Activity activity) {
                DevLog.d("ActivityPaused:" + activity.getLocalClassName());
            }

            @Override
            public void onActivityStopped(Activity activity) {
                DevLog.d("ActivityStopped:" + activity.getLocalClassName());
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                DevLog.d("ActivitySaveInstanceState:" + activity.getLocalClassName());
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                DevLog.d("ActivityDestroyed:" + activity.getLocalClassName());
            }
        });
    }
}
