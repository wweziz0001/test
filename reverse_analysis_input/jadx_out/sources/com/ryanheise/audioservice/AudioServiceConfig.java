package com.ryanheise.audioservice;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AudioServiceConfig {
    private static final String KEY_ACTIVITY_CLASS_NAME = "activityClassName";
    private static final String KEY_ANDROID_NOTIFICATION_CHANNEL_DESCRIPTION = "androidNotificationChannelDescription";
    private static final String KEY_ANDROID_NOTIFICATION_CHANNEL_ID = "androidNotificationChannelId";
    private static final String KEY_ANDROID_NOTIFICATION_CHANNEL_NAME = "androidNotificationChannelName";
    private static final String KEY_ANDROID_NOTIFICATION_CLICK_STARTS_ACTIVITY = "androidNotificationClickStartsActivity";
    private static final String KEY_ANDROID_NOTIFICATION_ICON = "androidNotificationIcon";
    private static final String KEY_ANDROID_NOTIFICATION_ONGOING = "androidNotificationOngoing";
    private static final String KEY_ANDROID_RESUME_ON_CLICK = "androidResumeOnClick";
    private static final String KEY_ANDROID_SHOW_NOTIFICATION_BADGE = "androidShowNotificationBadge";
    private static final String KEY_ANDROID_STOP_FOREGROUND_ON_PAUSE = "androidStopForegroundOnPause";
    private static final String KEY_ART_DOWNSCALE_HEIGHT = "artDownscaleHeight";
    private static final String KEY_ART_DOWNSCALE_WIDTH = "artDownscaleWidth";
    private static final String KEY_BROWSABLE_ROOT_EXTRAS = "androidBrowsableRootExtras";
    private static final String KEY_NOTIFICATION_COLOR = "notificationColor";
    private static final String SHARED_PREFERENCES_NAME = "audio_service_preferences";
    public String activityClassName;
    public String androidNotificationChannelDescription;
    public String androidNotificationChannelId;
    public String androidNotificationChannelName;
    public boolean androidNotificationClickStartsActivity;
    public String androidNotificationIcon;
    public boolean androidNotificationOngoing;
    public boolean androidResumeOnClick;
    public boolean androidShowNotificationBadge;
    public boolean androidStopForegroundOnPause;
    public int artDownscaleHeight;
    public int artDownscaleWidth;
    public String browsableRootExtras;
    public int notificationColor;
    private SharedPreferences preferences;

    public AudioServiceConfig(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        this.preferences = sharedPreferences;
        this.androidResumeOnClick = sharedPreferences.getBoolean(KEY_ANDROID_RESUME_ON_CLICK, true);
        this.androidNotificationChannelId = this.preferences.getString(KEY_ANDROID_NOTIFICATION_CHANNEL_ID, null);
        this.androidNotificationChannelName = this.preferences.getString(KEY_ANDROID_NOTIFICATION_CHANNEL_NAME, null);
        this.androidNotificationChannelDescription = this.preferences.getString(KEY_ANDROID_NOTIFICATION_CHANNEL_DESCRIPTION, null);
        this.notificationColor = this.preferences.getInt(KEY_NOTIFICATION_COLOR, -1);
        this.androidNotificationIcon = this.preferences.getString(KEY_ANDROID_NOTIFICATION_ICON, "mipmap/ic_launcher");
        this.androidShowNotificationBadge = this.preferences.getBoolean(KEY_ANDROID_SHOW_NOTIFICATION_BADGE, false);
        this.androidNotificationClickStartsActivity = this.preferences.getBoolean(KEY_ANDROID_NOTIFICATION_CLICK_STARTS_ACTIVITY, true);
        this.androidNotificationOngoing = this.preferences.getBoolean(KEY_ANDROID_NOTIFICATION_ONGOING, false);
        this.androidStopForegroundOnPause = this.preferences.getBoolean(KEY_ANDROID_STOP_FOREGROUND_ON_PAUSE, true);
        this.artDownscaleWidth = this.preferences.getInt(KEY_ART_DOWNSCALE_WIDTH, -1);
        this.artDownscaleHeight = this.preferences.getInt(KEY_ART_DOWNSCALE_HEIGHT, -1);
        this.activityClassName = this.preferences.getString(KEY_ACTIVITY_CLASS_NAME, null);
        this.browsableRootExtras = this.preferences.getString(KEY_BROWSABLE_ROOT_EXTRAS, null);
    }

    public Bundle getBrowsableRootExtras() {
        if (this.browsableRootExtras == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.browsableRootExtras);
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    try {
                        try {
                            try {
                                bundle.putInt(next, jSONObject.getInt(next));
                            } catch (Exception unused) {
                                bundle.putString(next, jSONObject.getString(next));
                            }
                        } catch (Exception unused2) {
                            bundle.putBoolean(next, jSONObject.getBoolean(next));
                        }
                    } catch (Exception unused3) {
                        System.out.println("Unsupported extras value for key " + next);
                    }
                } catch (Exception unused4) {
                    bundle.putDouble(next, jSONObject.getDouble(next));
                }
            }
            return bundle;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void save() {
        this.preferences.edit().putBoolean(KEY_ANDROID_RESUME_ON_CLICK, this.androidResumeOnClick).putString(KEY_ANDROID_NOTIFICATION_CHANNEL_ID, this.androidNotificationChannelId).putString(KEY_ANDROID_NOTIFICATION_CHANNEL_NAME, this.androidNotificationChannelName).putString(KEY_ANDROID_NOTIFICATION_CHANNEL_DESCRIPTION, this.androidNotificationChannelDescription).putInt(KEY_NOTIFICATION_COLOR, this.notificationColor).putString(KEY_ANDROID_NOTIFICATION_ICON, this.androidNotificationIcon).putBoolean(KEY_ANDROID_SHOW_NOTIFICATION_BADGE, this.androidShowNotificationBadge).putBoolean(KEY_ANDROID_NOTIFICATION_CLICK_STARTS_ACTIVITY, this.androidNotificationClickStartsActivity).putBoolean(KEY_ANDROID_NOTIFICATION_ONGOING, this.androidNotificationOngoing).putBoolean(KEY_ANDROID_STOP_FOREGROUND_ON_PAUSE, this.androidStopForegroundOnPause).putInt(KEY_ART_DOWNSCALE_WIDTH, this.artDownscaleWidth).putInt(KEY_ART_DOWNSCALE_HEIGHT, this.artDownscaleHeight).putString(KEY_ACTIVITY_CLASS_NAME, this.activityClassName).putString(KEY_BROWSABLE_ROOT_EXTRAS, this.browsableRootExtras).apply();
    }

    public void setBrowsableRootExtras(Map<?, ?> map) {
        if (map != null) {
            this.browsableRootExtras = new JSONObject(map).toString();
        } else {
            this.browsableRootExtras = null;
        }
    }
}
