package net.devwiki.devwiki.utils;

import android.app.backup.BackupManager;
import android.content.res.Configuration;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

/**
 * 语言工具类
 * @author zyz
 * Created by zyz on 2018/1/17.
 */

public class LanguageUtil {

    public static void changeLanguage(Locale locale) {
        try {
            Object objIActMag, objActMagNative;

            Class iActManager = Class.forName("android.app.IActivityManager");
            Class actManagerNative = Class.forName("android.app.ActivityManagerNative");

            //amn = ActivityManagerNative.getDefault();
            Method actManagerNativeGetDefault = actManagerNative.getDeclaredMethod("getDefault");

            objIActMag = actManagerNativeGetDefault.invoke(actManagerNative);

            // objIActMag = amn.getConfiguration();
            Method mtdIActMag$getConfiguration = iActManager.getDeclaredMethod("getConfiguration");

            Configuration config = (Configuration) mtdIActMag$getConfiguration.invoke(objIActMag);

            // set the locale to the new value
            config.locale = locale;

            //持久化   config.userSetLocale = true;
            Class clzConfig = Class.forName("android.content.res.Configuration");
            Field userSetLocale = clzConfig.getField("userSetLocale");
            userSetLocale.set(config, true);

            // 此处需要声明权限:android.permission.CHANGE_CONFIGURATION
            // 会重新调用 onCreate();
            Class[] clzParams = { Configuration.class };

            // objIActMag.updateConfiguration(config);
            Method mtdIActMag$updateConfiguration = iActManager.getDeclaredMethod("updateConfiguration", clzParams);
            mtdIActMag$updateConfiguration.invoke(objIActMag, config);

            BackupManager.dataChanged("com.android.providers.settings");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
