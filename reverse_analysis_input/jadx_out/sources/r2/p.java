package r2;

import D2.Z;
import D2.f0;
import D2.g0;
import D2.h0;
import D2.i0;
import D2.j0;
import D2.k0;
import D2.r0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9549a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static k0 a(g0 g0Var) {
        h0 h0VarB = k0.B();
        int iD = g0Var.D();
        h0VarB.e();
        k0.y((k0) h0VarB.f5252m, iD);
        for (f0 f0Var : g0Var.C()) {
            i0 i0VarD = j0.D();
            String strD = f0Var.C().D();
            i0VarD.e();
            j0.y((j0) i0VarD.f5252m, strD);
            Z zF = f0Var.F();
            i0VarD.e();
            j0.A((j0) i0VarD.f5252m, zF);
            r0 r0VarE = f0Var.E();
            i0VarD.e();
            j0.z((j0) i0VarD.f5252m, r0VarE);
            int iD2 = f0Var.D();
            i0VarD.e();
            j0.B((j0) i0VarD.f5252m, iD2);
            j0 j0Var = (j0) i0VarD.b();
            h0VarB.e();
            k0.z((k0) h0VarB.f5252m, j0Var);
        }
        return (k0) h0VarB.b();
    }
}
