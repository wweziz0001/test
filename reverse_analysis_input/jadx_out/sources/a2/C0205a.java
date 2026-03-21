package a2;

import android.app.Application;

/* JADX INFO: renamed from: a2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0205a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0205a f3530a = new C0205a();

    public final String a() {
        String processName = Application.getProcessName();
        N3.h.d(processName, "getProcessName()");
        return processName;
    }
}
