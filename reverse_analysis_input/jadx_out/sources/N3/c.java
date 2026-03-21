package N3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements S3.a, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient S3.a f1607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f1608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Class f1609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f1611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f1612q;

    public c(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f1608m = obj;
        this.f1609n = cls;
        this.f1610o = str;
        this.f1611p = str2;
        this.f1612q = z4;
    }

    public abstract S3.a a();

    public final d b() {
        Class cls = this.f1609n;
        if (!this.f1612q) {
            return q.a(cls);
        }
        q.f1627a.getClass();
        return new j(cls);
    }
}
