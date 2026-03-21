package io.flutter.view;

import g.InterfaceC0434a;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public final class FlutterCallbackInformation {
    public final String callbackClassName;
    public final String callbackLibraryPath;
    public final String callbackName;

    private FlutterCallbackInformation(String str, String str2, String str3) {
        this.callbackName = str;
        this.callbackClassName = str2;
        this.callbackLibraryPath = str3;
    }

    public static FlutterCallbackInformation lookupCallbackInformation(long j5) {
        return FlutterJNI.nativeLookupCallbackInformation(j5);
    }
}
