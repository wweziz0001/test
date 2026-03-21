package k0;

import android.os.Handler;
import android.os.Message;
import d0.AbstractC0370w;
import java.util.TreeMap;
import l0.C0564c;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Handler.Callback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B0.f f7631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f7632m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0564c f7636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7639t;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TreeMap f7635p = new TreeMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f7634o = AbstractC0370w.m(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final P0.b f7633n = new P0.b(1);

    public o(C0564c c0564c, d dVar, B0.f fVar) {
        this.f7636q = c0564c;
        this.f7632m = dVar;
        this.f7631l = fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f7639t) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        m mVar = (m) message.obj;
        long j5 = mVar.f7624a;
        TreeMap treeMap = this.f7635p;
        long j6 = mVar.f7625b;
        Long l3 = (Long) treeMap.get(Long.valueOf(j6));
        if (l3 == null || l3.longValue() > j5) {
            treeMap.put(Long.valueOf(j6), Long.valueOf(j5));
        }
        return true;
    }
}
