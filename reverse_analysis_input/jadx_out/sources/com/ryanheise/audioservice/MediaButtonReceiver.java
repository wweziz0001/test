package com.ryanheise.audioservice;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends Z.c {
    public static final String ACTION_NOTIFICATION_DELETE = "com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE";

    @Override // Z.c, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AudioService audioService;
        if (intent == null || !ACTION_NOTIFICATION_DELETE.equals(intent.getAction()) || (audioService = AudioService.instance) == null) {
            super.onReceive(context, intent);
        } else {
            audioService.handleDeleteNotification();
        }
    }
}
