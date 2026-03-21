package com.ryanheise.audioservice;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import e3.C0394c;
import io.flutter.embedding.android.AbstractActivityC0502v;

/* JADX INFO: loaded from: classes.dex */
public class AudioServiceFragmentActivity extends AbstractActivityC0502v {
    @Override // io.flutter.embedding.android.AbstractActivityC0502v
    public String getCachedEngineId() {
        AudioServicePlugin.getFlutterEngine(this);
        return AudioServicePlugin.getFlutterEngineId();
    }

    @Override // io.flutter.embedding.android.AbstractActivityC0502v
    public String getInitialRoute() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.AbstractActivityC0502v, androidx.fragment.app.AbstractActivityC0255w, androidx.activity.m, t.AbstractActivityC0820i, android.app.Activity
    public void onCreate(Bundle bundle) {
        AudioServicePlugin.getFlutterEngine(this);
        super.onCreate(bundle);
    }

    @Override // io.flutter.embedding.android.InterfaceC0495n
    public C0394c provideFlutterEngine(Context context) {
        return AudioServicePlugin.getFlutterEngine(context);
    }

    @Override // io.flutter.embedding.android.AbstractActivityC0502v
    public boolean shouldDestroyEngineWithHost() {
        return false;
    }

    @Override // io.flutter.embedding.android.AbstractActivityC0502v
    public boolean shouldHandleDeeplinking() {
        try {
            Bundle metaData = getMetaData();
            if (metaData == null || !metaData.containsKey("flutter_deeplinking_enabled")) {
                return true;
            }
            return metaData.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
