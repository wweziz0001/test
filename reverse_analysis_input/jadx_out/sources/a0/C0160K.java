package a0;

import android.util.SparseBooleanArray;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: a0.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0160K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0188n f3223a;

    static {
        new SparseBooleanArray();
        AbstractC0360m.h(!false);
        AbstractC0370w.G(0);
    }

    public C0160K(C0188n c0188n) {
        this.f3223a = c0188n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0160K) {
            return this.f3223a.equals(((C0160K) obj).f3223a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3223a.hashCode();
    }
}
