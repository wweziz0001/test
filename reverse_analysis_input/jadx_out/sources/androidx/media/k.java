package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f4598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f4599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0284a f4600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f4601g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0292i f4602h;
    public final /* synthetic */ A i;

    public k(A a5, String str, int i, int i5, Bundle bundle, C0284a c0284a) {
        this.i = a5;
        this.f4595a = str;
        this.f4596b = i;
        this.f4597c = i5;
        this.f4598d = new B(i, str, i5);
        this.f4599e = bundle;
        this.f4600f = c0284a;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.mHandler.post(new RunnableC0293j(this));
    }
}
