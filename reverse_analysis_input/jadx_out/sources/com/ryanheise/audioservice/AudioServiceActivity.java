package com.ryanheise.audioservice;

import android.content.Context;
import e3.C0394c;
import io.flutter.embedding.android.AbstractActivityC0488g;

/* JADX INFO: loaded from: classes.dex */
public class AudioServiceActivity extends AbstractActivityC0488g {
    @Override // io.flutter.embedding.android.InterfaceC0491j, io.flutter.embedding.android.InterfaceC0495n
    public C0394c provideFlutterEngine(Context context) {
        return AudioServicePlugin.getFlutterEngine(context);
    }
}
