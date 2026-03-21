package com.dexterous.flutterlocalnotifications;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.media.AudioFocusRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ NotificationChannel e(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel f(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }

    public static /* synthetic */ NotificationChannel g(String str, String str2) {
        return new NotificationChannel(str, str2, 2);
    }

    public static /* synthetic */ NotificationChannelGroup h(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ AudioFocusRequest.Builder k(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder o(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* synthetic */ void r() {
    }
}
