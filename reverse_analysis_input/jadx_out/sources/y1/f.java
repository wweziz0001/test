package y1;

import android.content.Context;
import x1.InterfaceC0987c;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0987c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f10925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f10926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D0.d f10927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B3.e f10930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10931r;

    public f(Context context, String str, D0.d dVar, boolean z4, boolean z5) {
        N3.h.e(dVar, "callback");
        this.f10925l = context;
        this.f10926m = str;
        this.f10927n = dVar;
        this.f10928o = z4;
        this.f10929p = z5;
        this.f10930q = new B3.e(new G1.a(this, 7));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10930q.f272m != B3.f.f274a) {
            ((e) this.f10930q.a()).close();
        }
    }

    @Override // x1.InterfaceC0987c
    public final C1002b j() {
        return ((e) this.f10930q.a()).a(true);
    }

    @Override // x1.InterfaceC0987c
    public final void setWriteAheadLoggingEnabled(boolean z4) {
        if (this.f10930q.f272m != B3.f.f274a) {
            e eVar = (e) this.f10930q.a();
            N3.h.e(eVar, "sQLiteOpenHelper");
            eVar.setWriteAheadLoggingEnabled(z4);
        }
        this.f10931r = z4;
    }
}
