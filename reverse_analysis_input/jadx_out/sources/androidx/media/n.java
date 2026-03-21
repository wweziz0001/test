package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;
import q.C0732b;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f4605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f4606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f4607n;

    public n(q qVar, String str, Bundle bundle) {
        this.f4607n = qVar;
        this.f4605l = str;
        this.f4606m = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f4607n;
        Iterator it = ((C0732b) qVar.f4618d.mConnections.keySet()).iterator();
        while (it.hasNext()) {
            qVar.f((k) qVar.f4618d.mConnections.getOrDefault((IBinder) it.next(), null), this.f4605l, this.f4606m);
        }
    }
}
