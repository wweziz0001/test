package B3;

import N3.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public M3.a f271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile Object f272m = f.f274a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f273n = this;

    public e(M3.a aVar) {
        this.f271l = aVar;
    }

    public final Object a() {
        Object objD;
        Object obj = this.f272m;
        f fVar = f.f274a;
        if (obj != fVar) {
            return obj;
        }
        synchronized (this.f273n) {
            objD = this.f272m;
            if (objD == fVar) {
                M3.a aVar = this.f271l;
                h.b(aVar);
                objD = aVar.d();
                this.f272m = objD;
                this.f271l = null;
            }
        }
        return objD;
    }

    public final String toString() {
        return this.f272m != f.f274a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
