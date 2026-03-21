package z2;

import D2.C0030b;
import D2.C0032d;
import D2.C0034f;
import D2.O;
import D2.Q;
import D2.S;
import D2.T;
import D2.U;
import D2.V;
import D2.X;
import com.google.crypto.tink.shaded.protobuf.AbstractC0321a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import java.security.GeneralSecurityException;
import s2.C0798g;
import s2.C0799h;
import y3.C1013H;

/* JADX INFO: renamed from: z2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1067c extends s1.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y2.k f11148e = new y2.k(C1065a.class, new C1013H(21));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y2.k f11149f = new y2.k(j.class, new C1013H(23));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11150d = 1;

    public /* synthetic */ C1067c(Class cls, C0798g[] c0798gArr) {
        super(cls, c0798gArr);
    }

    public static y2.d l(int i, int i5, O o4, int i6) {
        S sD = T.D();
        U uD = V.D();
        uD.e();
        V.y((V) uD.f5252m, o4);
        uD.e();
        V.z((V) uD.f5252m, i5);
        V v4 = (V) uD.b();
        sD.e();
        T.y((T) sD.f5252m, v4);
        sD.e();
        T.z((T) sD.f5252m, i);
        return new y2.d((T) sD.b(), i6);
    }

    public static void m(C0034f c0034f) throws GeneralSecurityException {
        if (c0034f.A() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c0034f.A() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void n(V v4) {
        if (v4.C() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = v4.B().ordinal();
        if (iOrdinal == 1) {
            if (v4.C() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (v4.C() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (v4.C() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (v4.C() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (v4.C() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // s1.l
    public int d() {
        switch (this.f11150d) {
            case 1:
                return 2;
            default:
                return super.d();
        }
    }

    @Override // s1.l
    public final String e() {
        switch (this.f11150d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // s1.l
    public final L0.e g() {
        switch (this.f11150d) {
            case 0:
                return new C1066b(C0032d.class);
            default:
                return new C0799h(this);
        }
    }

    @Override // s1.l
    public final X h() {
        switch (this.f11150d) {
        }
        return X.f563n;
    }

    @Override // s1.l
    public final AbstractC0321a i(AbstractC0329i abstractC0329i) {
        switch (this.f11150d) {
            case 0:
                return C0030b.F(abstractC0329i, C0335o.a());
            default:
                return Q.G(abstractC0329i, C0335o.a());
        }
    }

    @Override // s1.l
    public final void k(AbstractC0321a abstractC0321a) throws GeneralSecurityException {
        switch (this.f11150d) {
            case 0:
                C0030b c0030b = (C0030b) abstractC0321a;
                E2.o.c(c0030b.D());
                if (c0030b.B().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                m(c0030b.C());
                return;
            default:
                Q q4 = (Q) abstractC0321a;
                E2.o.c(q4.E());
                if (q4.C().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                n(q4.D());
                return;
        }
    }

    public C1067c() {
        super(Q.class, new C0798g(r2.j.class, 11));
    }
}
