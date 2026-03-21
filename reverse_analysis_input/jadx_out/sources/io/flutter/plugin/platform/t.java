package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class t extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f6821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f6822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6823c;

    public t(Context context, B b4, Context context2) {
        super(context);
        this.f6821a = b4;
        this.f6823c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length && i < 11; i++) {
            if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                return this.f6823c.getSystemService(str);
            }
        }
        if (this.f6822b == null) {
            this.f6822b = this.f6821a;
        }
        return this.f6822b;
    }
}
