package s2;

import D2.C0036h;
import D2.C0037i;
import D2.C0038j;
import D2.C0040l;
import D2.C0041m;
import D2.C0042n;
import D2.C0043o;
import D2.C0044p;
import D2.C0046s;
import D2.C0047t;
import D2.C0048u;
import D2.C0049v;
import D2.C0051x;
import D2.C0052y;
import D2.C0053z;
import D2.D;
import D2.F;
import D2.J;
import D2.O;
import D2.Q;
import D2.S;
import D2.T;
import D2.U;
import D2.V;
import D2.X;
import D2.m0;
import D2.p0;
import D2.u0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0321a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import r2.InterfaceC0781a;
import z2.C1067c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends s1.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i) {
        super(C0036h.class, new C0798g(InterfaceC0781a.class, 0));
        this.f9624d = i;
        switch (i) {
            case 1:
                super(C0040l.class, new C0798g(E2.k.class, 1));
                break;
            case 2:
                super(D2.r.class, new C0798g(InterfaceC0781a.class, 2));
                break;
            case 3:
                super(C0051x.class, new C0798g(InterfaceC0781a.class, 3));
                break;
            case 4:
                super(D2.B.class, new C0798g(InterfaceC0781a.class, 4));
                break;
            case 5:
                super(J.class, new C0798g(InterfaceC0781a.class, 5));
                break;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                super(m0.class, new C0798g(InterfaceC0781a.class, 6));
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                super(p0.class, new C0798g(InterfaceC0781a.class, 7));
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                super(u0.class, new C0798g(InterfaceC0781a.class, 8));
                break;
            case 9:
                super(F.class, new C0798g(r2.c.class, 9));
                break;
            default:
                break;
        }
    }

    public static y2.d l(int i, int i5) {
        C0046s c0046sC = C0047t.C();
        c0046sC.e();
        C0047t.z((C0047t) c0046sC.f5252m, i);
        C0048u c0048uB = C0049v.B();
        c0048uB.e();
        C0049v.y((C0049v) c0048uB.f5252m);
        C0049v c0049v = (C0049v) c0048uB.b();
        c0046sC.e();
        C0047t.y((C0047t) c0046sC.f5252m, c0049v);
        return new y2.d((C0047t) c0046sC.b(), i5);
    }

    public static y2.d m(int i, int i5, int i6) {
        O o4 = O.f556p;
        C0041m c0041mD = C0042n.D();
        C0043o c0043oB = C0044p.B();
        c0043oB.e();
        C0044p.y((C0044p) c0043oB.f5252m);
        C0044p c0044p = (C0044p) c0043oB.b();
        c0041mD.e();
        C0042n.y((C0042n) c0041mD.f5252m, c0044p);
        c0041mD.e();
        C0042n.z((C0042n) c0041mD.f5252m, i);
        C0042n c0042n = (C0042n) c0041mD.b();
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
        T.z((T) sD.f5252m, 32);
        T t4 = (T) sD.b();
        C0037i c0037iC = C0038j.C();
        c0037iC.e();
        C0038j.y((C0038j) c0037iC.f5252m, c0042n);
        c0037iC.e();
        C0038j.z((C0038j) c0037iC.f5252m, t4);
        return new y2.d((C0038j) c0037iC.b(), i6);
    }

    public static y2.d n(int i, int i5) {
        C0052y c0052yA = C0053z.A();
        c0052yA.e();
        C0053z.y((C0053z) c0052yA.f5252m, i);
        return new y2.d((C0053z) c0052yA.b(), i5);
    }

    public static y2.d o(int i, int i5) {
        D2.C cA = D.A();
        cA.e();
        D.y((D) cA.f5252m, i);
        return new y2.d((D) cA.b(), i5);
    }

    @Override // s1.l
    public int d() {
        switch (this.f9624d) {
            case 0:
                return 2;
            case 3:
                return 2;
            default:
                return super.d();
        }
    }

    @Override // s1.l
    public final String e() {
        switch (this.f9624d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    @Override // s1.l
    public final L0.e g() {
        switch (this.f9624d) {
            case 0:
                return new C0799h(this);
            case 1:
                return new C0799h(this, (byte) 0);
            case 2:
                return new C0799h(this, (char) 0);
            case 3:
                return new C0799h(this, 0);
            case 4:
                return new C0799h(this, (short) 0);
            case 5:
                return new C0799h(this, (byte) 0, false);
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0799h(this, (byte) 0, (byte) 0);
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0799h(this, (byte) 0, (char) 0);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return new C0799h(this, (byte) 0, 0);
            default:
                return new C0799h(this, (byte) 0, (short) 0);
        }
    }

    @Override // s1.l
    public final X h() {
        switch (this.f9624d) {
        }
        return X.f563n;
    }

    @Override // s1.l
    public final AbstractC0321a i(AbstractC0329i abstractC0329i) {
        switch (this.f9624d) {
            case 0:
                return C0036h.F(abstractC0329i, C0335o.a());
            case 1:
                return C0040l.G(abstractC0329i, C0335o.a());
            case 2:
                return D2.r.F(abstractC0329i, C0335o.a());
            case 3:
                return C0051x.D(abstractC0329i, C0335o.a());
            case 4:
                return D2.B.D(abstractC0329i, C0335o.a());
            case 5:
                return J.D(abstractC0329i, C0335o.a());
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return m0.D(abstractC0329i, C0335o.a());
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return p0.D(abstractC0329i, C0335o.a());
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return u0.D(abstractC0329i, C0335o.a());
            default:
                return F.D(abstractC0329i, C0335o.a());
        }
    }

    @Override // s1.l
    public final void k(AbstractC0321a abstractC0321a) throws GeneralSecurityException {
        switch (this.f9624d) {
            case 0:
                C0036h c0036h = (C0036h) abstractC0321a;
                E2.o.c(c0036h.D());
                C0798g[] c0798gArr = {new C0798g(E2.k.class, 1)};
                HashMap map = new HashMap();
                for (int i = 0; i < 1; i++) {
                    C0798g c0798g = c0798gArr[i];
                    boolean zContainsKey = map.containsKey(c0798g.f9620a);
                    Class cls = c0798g.f9620a;
                    if (zContainsKey) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                    map.put(cls, c0798g);
                }
                Class cls2 = c0798gArr[0].f9620a;
                Collections.unmodifiableMap(map);
                C0040l c0040lB = c0036h.B();
                E2.o.c(c0040lB.E());
                E2.o.a(c0040lB.C().size());
                C0044p c0044pD = c0040lB.D();
                if (c0044pD.A() < 12 || c0044pD.A() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                C0798g[] c0798gArr2 = {new C0798g(r2.j.class, 11)};
                HashMap map2 = new HashMap();
                C0798g c0798g2 = c0798gArr2[0];
                boolean zContainsKey2 = map2.containsKey(c0798g2.f9620a);
                Class cls3 = c0798g2.f9620a;
                if (zContainsKey2) {
                    throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                }
                map2.put(cls3, c0798g2);
                Class cls4 = c0798gArr2[0].f9620a;
                Collections.unmodifiableMap(map2);
                Q qC = c0036h.C();
                E2.o.c(qC.E());
                if (qC.C().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C1067c.n(qC.D());
                return;
            case 1:
                C0040l c0040l = (C0040l) abstractC0321a;
                E2.o.c(c0040l.E());
                E2.o.a(c0040l.C().size());
                C0044p c0044pD2 = c0040l.D();
                if (c0044pD2.A() < 12 || c0044pD2.A() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                return;
            case 2:
                D2.r rVar = (D2.r) abstractC0321a;
                E2.o.c(rVar.D());
                E2.o.a(rVar.B().size());
                if (rVar.C().A() != 12 && rVar.C().A() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                C0051x c0051x = (C0051x) abstractC0321a;
                E2.o.c(c0051x.B());
                E2.o.a(c0051x.A().size());
                return;
            case 4:
                D2.B b4 = (D2.B) abstractC0321a;
                E2.o.c(b4.B());
                E2.o.a(b4.A().size());
                return;
            case 5:
                J j5 = (J) abstractC0321a;
                E2.o.c(j5.B());
                if (j5.A().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                E2.o.c(((m0) abstractC0321a).B());
                return;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                E2.o.c(((p0) abstractC0321a).B());
                return;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                u0 u0Var = (u0) abstractC0321a;
                E2.o.c(u0Var.B());
                if (u0Var.A().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                F f2 = (F) abstractC0321a;
                E2.o.c(f2.B());
                if (f2.A().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + f2.A().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
