package V3;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: V3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0136m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f2427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M3.l f2428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f2430e;

    public C0136m(Object obj, D d5, M3.l lVar, Object obj2, Throwable th) {
        this.f2426a = obj;
        this.f2427b = d5;
        this.f2428c = lVar;
        this.f2429d = obj2;
        this.f2430e = th;
    }

    public static C0136m a(C0136m c0136m, D d5, CancellationException cancellationException, int i) {
        Object obj = c0136m.f2426a;
        if ((i & 2) != 0) {
            d5 = c0136m.f2427b;
        }
        D d6 = d5;
        M3.l lVar = c0136m.f2428c;
        Object obj2 = c0136m.f2429d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = c0136m.f2430e;
        }
        c0136m.getClass();
        return new C0136m(obj, d6, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0136m)) {
            return false;
        }
        C0136m c0136m = (C0136m) obj;
        return N3.h.a(this.f2426a, c0136m.f2426a) && N3.h.a(this.f2427b, c0136m.f2427b) && N3.h.a(this.f2428c, c0136m.f2428c) && N3.h.a(this.f2429d, c0136m.f2429d) && N3.h.a(this.f2430e, c0136m.f2430e);
    }

    public final int hashCode() {
        Object obj = this.f2426a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        D d5 = this.f2427b;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        M3.l lVar = this.f2428c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f2429d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2430e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2426a + ", cancelHandler=" + this.f2427b + ", onCancellation=" + this.f2428c + ", idempotentResume=" + this.f2429d + ", cancelCause=" + this.f2430e + ')';
    }

    public /* synthetic */ C0136m(Object obj, D d5, M3.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : d5, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
