package a0;

import d0.AbstractC0370w;

/* JADX INFO: renamed from: a0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0193s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3449a;

    static {
        new C0193s(new F0.u());
        AbstractC0370w.G(0);
        AbstractC0370w.G(1);
        AbstractC0370w.G(2);
        AbstractC0370w.G(3);
        AbstractC0370w.G(4);
        AbstractC0370w.G(5);
        AbstractC0370w.G(6);
    }

    public C0193s(F0.u uVar) {
        uVar.getClass();
        int i = AbstractC0370w.f5326a;
        this.f3449a = uVar.f817a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0193s)) {
            return false;
        }
        C0193s c0193s = (C0193s) obj;
        c0193s.getClass();
        return this.f3449a == c0193s.f3449a;
    }

    public final int hashCode() {
        long j5 = this.f3449a;
        return ((((int) 0) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 29791;
    }
}
