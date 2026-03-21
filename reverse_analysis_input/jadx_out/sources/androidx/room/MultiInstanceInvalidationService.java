package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import s1.g;
import s1.h;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f4763m = new LinkedHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f4764n = new h(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g f4765o = new g(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        N3.h.e(intent, "intent");
        return this.f4765o;
    }
}
