package A0;

import a0.b0;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import h0.r0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0[] f41b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w[] f42c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f43d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f44e;

    public A(r0[] r0VarArr, w[] wVarArr, b0 b0Var, y yVar) {
        AbstractC0360m.c(r0VarArr.length == wVarArr.length);
        this.f41b = r0VarArr;
        this.f42c = (w[]) wVarArr.clone();
        this.f43d = b0Var;
        this.f44e = yVar;
        this.f40a = r0VarArr.length;
    }

    public final boolean a(A a5, int i) {
        if (a5 == null) {
            return false;
        }
        r0 r0Var = this.f41b[i];
        r0 r0Var2 = a5.f41b[i];
        int i5 = AbstractC0370w.f5326a;
        return Objects.equals(r0Var, r0Var2) && Objects.equals(this.f42c[i], a5.f42c[i]);
    }

    public final boolean b(int i) {
        return this.f41b[i] != null;
    }
}
