package r2;

import D2.W;
import D2.X;
import D2.Y;
import D2.b0;
import D2.d0;
import D2.e0;
import D2.f0;
import D2.g0;
import D2.r0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0321a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0342w;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0332l;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import y2.s;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f9527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f9528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f9529e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9531b;

    static {
        int i = 0;
        f9527c = new f("ENABLED", i);
        f9528d = new f("DISABLED", i);
        f9529e = new f("DESTROYED", i);
    }

    public /* synthetic */ f(Object obj, int i) {
        this.f9530a = i;
        this.f9531b = obj;
    }

    public synchronized void a(b0 b0Var) {
        f0 f0VarB;
        synchronized (this) {
            f0VarB = b(n.e(b0Var), b0Var.C());
        }
        d0 d0Var = (d0) this.f9531b;
        d0Var.e();
        g0.z((g0) d0Var.f5252m, f0VarB);
    }

    public synchronized f0 b(Y y, r0 r0Var) {
        int iA;
        synchronized (this) {
            iA = s.a();
            while (d(iA)) {
                iA = s.a();
            }
        }
        return (f0) e0VarH.b();
        if (r0Var == r0.f577m) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        e0 e0VarH = f0.H();
        e0VarH.e();
        f0.y((f0) e0VarH.f5252m, y);
        e0VarH.e();
        f0.B((f0) e0VarH.f5252m, iA);
        e0VarH.e();
        f0.A((f0) e0VarH.f5252m);
        e0VarH.e();
        f0.z((f0) e0VarH.f5252m, r0Var);
        return (f0) e0VarH.b();
    }

    public synchronized Z1.m c() {
        return Z1.m.s((g0) ((d0) this.f9531b).b());
    }

    public synchronized boolean d(int i) {
        Iterator it = Collections.unmodifiableList(((g0) ((d0) this.f9531b).f5252m).C()).iterator();
        while (it.hasNext()) {
            if (((f0) it.next()).D() == i) {
                return true;
            }
        }
        return false;
    }

    public Y e(AbstractC0329i abstractC0329i) throws GeneralSecurityException {
        s1.l lVar = (s1.l) this.f9531b;
        try {
            L0.e eVarG = lVar.g();
            AbstractC0321a abstractC0321aM = eVarG.m(abstractC0329i);
            eVarG.o(abstractC0321aM);
            AbstractC0321a abstractC0321aA = eVarG.a(abstractC0321aM);
            W wF = Y.F();
            String strE = lVar.e();
            wF.e();
            Y.y((Y) wF.f5252m, strE);
            try {
                int iB = ((AbstractC0342w) abstractC0321aA).b(null);
                byte[] bArr = new byte[iB];
                C0332l c0332l = new C0332l(iB, bArr);
                abstractC0321aA.f(c0332l);
                if (c0332l.f5227s - c0332l.f5228t != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                C0328h c0328h = new C0328h(bArr);
                wF.e();
                Y.z((Y) wF.f5252m, c0328h);
                X xH = lVar.h();
                wF.e();
                Y.A((Y) wF.f5252m, xH);
                return (Y) wF.b();
            } catch (IOException e5) {
                throw new RuntimeException(abstractC0321aA.c("ByteString"), e5);
            }
        } catch (C e6) {
            throw new GeneralSecurityException("Unexpected proto", e6);
        }
    }

    public String toString() {
        switch (this.f9530a) {
            case 0:
                return (String) this.f9531b;
            default:
                return super.toString();
        }
    }

    public f(s1.l lVar, Class cls) {
        this.f9530a = 2;
        if (((Map) lVar.f9609b).keySet().contains(cls) || Void.class.equals(cls)) {
            this.f9531b = lVar;
            return;
        }
        throw new IllegalArgumentException("Given internalKeyMananger " + lVar.toString() + " does not support primitive class " + cls.getName());
    }
}
