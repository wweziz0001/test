package androidx.media;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import q.C0735e;

/* JADX INFO: renamed from: androidx.media.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0290g extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f4586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f4588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f4589h;
    public final /* synthetic */ A i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0290g(A a5, String str, k kVar, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.i = a5;
        this.f4586e = kVar;
        this.f4587f = str2;
        this.f4588g = bundle;
        this.f4589h = bundle2;
    }

    @Override // androidx.media.u
    public final void d(Object obj) {
        List list = (List) obj;
        C0735e c0735e = this.i.mConnections;
        k kVar = this.f4586e;
        Object orDefault = c0735e.getOrDefault(((Messenger) kVar.f4600f.f4576a).getBinder(), null);
        String str = kVar.f4595a;
        String str2 = this.f4587f;
        if (orDefault != kVar) {
            if (A.DEBUG) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
                return;
            }
            return;
        }
        try {
            kVar.f4600f.b(str2, list, this.f4588g, this.f4589h);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
