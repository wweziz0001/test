package x0;

import a0.C0170V;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f10775d = new q0(new C0170V[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2.b0 f10777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10778c;

    static {
        AbstractC0370w.G(0);
    }

    public q0(C0170V... c0170vArr) {
        this.f10777b = m2.I.q(c0170vArr);
        this.f10776a = c0170vArr.length;
        int i = 0;
        while (true) {
            m2.b0 b0Var = this.f10777b;
            if (i >= b0Var.size()) {
                return;
            }
            int i5 = i + 1;
            for (int i6 = i5; i6 < b0Var.size(); i6++) {
                if (((C0170V) b0Var.get(i)).equals(b0Var.get(i6))) {
                    AbstractC0360m.m("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i5;
        }
    }

    public final C0170V a(int i) {
        return (C0170V) this.f10777b.get(i);
    }

    public final int b(C0170V c0170v) {
        int iIndexOf = this.f10777b.indexOf(c0170v);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f10776a == q0Var.f10776a && this.f10777b.equals(q0Var.f10777b);
    }

    public final int hashCode() {
        if (this.f10778c == 0) {
            this.f10778c = this.f10777b.hashCode();
        }
        return this.f10778c;
    }
}
