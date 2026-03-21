package x2;

import android.content.Context;
import android.preference.PreferenceManager;
import m.W0;
import r2.f;

/* JADX INFO: renamed from: x2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0990a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f10824b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f10825a;

    public C0990a(W0 w02) {
        Context context = w02.f8350a;
        String str = (String) w02.f8351b;
        String str2 = (String) w02.f8352c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f10825a = (f) w02.f8356g;
    }
}
