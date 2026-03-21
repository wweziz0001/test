package s2;

import D2.C0035g;
import D2.C0036h;
import D2.C0038j;
import D2.C0039k;
import D2.C0040l;
import D2.C0042n;
import D2.C0044p;
import D2.C0045q;
import D2.C0047t;
import D2.C0049v;
import D2.C0050w;
import D2.C0051x;
import D2.C0053z;
import D2.D;
import D2.E;
import D2.F;
import D2.G;
import D2.H;
import D2.I;
import D2.J;
import D2.L;
import D2.O;
import D2.P;
import D2.Q;
import D2.T;
import D2.V;
import D2.l0;
import D2.m0;
import D2.n0;
import D2.o0;
import D2.p0;
import D2.q0;
import D2.t0;
import D2.u0;
import D2.v0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0321a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0335o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z2.C1067c;

/* JADX INFO: renamed from: s2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0799h extends L0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9622b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1.l f9623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar, byte b4, byte b5) {
        super(n0.class);
        this.f9623c = iVar;
    }

    @Override // L0.e
    public final AbstractC0321a a(AbstractC0321a abstractC0321a) {
        switch (this.f9622b) {
            case 0:
                C0038j c0038j = (C0038j) abstractC0321a;
                C0798g[] c0798gArr = {new C0798g(E2.k.class, 1)};
                HashMap map = new HashMap();
                for (C0798g c0798g : c0798gArr) {
                    boolean zContainsKey = map.containsKey(c0798g.f9620a);
                    Class cls = c0798g.f9620a;
                    if (zContainsKey) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                    map.put(cls, c0798g);
                }
                if (c0798gArr.length > 0) {
                    Class cls2 = c0798gArr[0].f9620a;
                }
                Collections.unmodifiableMap(map);
                C0042n c0042nA = c0038j.A();
                C0039k c0039kF = C0040l.F();
                C0044p c0044pC = c0042nA.C();
                c0039kF.e();
                C0040l.z((C0040l) c0039kF.f5252m, c0044pC);
                byte[] bArrA = E2.n.a(c0042nA.B());
                C0328h c0328hH = AbstractC0329i.h(bArrA, 0, bArrA.length);
                c0039kF.e();
                C0040l.A((C0040l) c0039kF.f5252m, c0328hH);
                c0039kF.e();
                C0040l.y((C0040l) c0039kF.f5252m);
                C0040l c0040l = (C0040l) c0039kF.b();
                C0798g[] c0798gArr2 = {new C0798g(r2.j.class, 11)};
                HashMap map2 = new HashMap();
                for (C0798g c0798g2 : c0798gArr2) {
                    boolean zContainsKey2 = map2.containsKey(c0798g2.f9620a);
                    Class cls3 = c0798g2.f9620a;
                    if (zContainsKey2) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                    map2.put(cls3, c0798g2);
                }
                if (c0798gArr2.length > 0) {
                    Class cls4 = c0798gArr2[0].f9620a;
                }
                Collections.unmodifiableMap(map2);
                T tB = c0038j.B();
                P pF = Q.F();
                pF.e();
                Q.y((Q) pF.f5252m);
                V vC = tB.C();
                pF.e();
                Q.z((Q) pF.f5252m, vC);
                byte[] bArrA2 = E2.n.a(tB.B());
                C0328h c0328hH2 = AbstractC0329i.h(bArrA2, 0, bArrA2.length);
                pF.e();
                Q.A((Q) pF.f5252m, c0328hH2);
                Q q4 = (Q) pF.b();
                C0035g c0035gE = C0036h.E();
                c0035gE.e();
                C0036h.z((C0036h) c0035gE.f5252m, c0040l);
                c0035gE.e();
                C0036h.A((C0036h) c0035gE.f5252m, q4);
                ((i) this.f9623c).getClass();
                c0035gE.e();
                C0036h.y((C0036h) c0035gE.f5252m);
                return (C0036h) c0035gE.b();
            case 1:
                C0042n c0042n = (C0042n) abstractC0321a;
                C0039k c0039kF2 = C0040l.F();
                C0044p c0044pC2 = c0042n.C();
                c0039kF2.e();
                C0040l.z((C0040l) c0039kF2.f5252m, c0044pC2);
                byte[] bArrA3 = E2.n.a(c0042n.B());
                C0328h c0328hH3 = AbstractC0329i.h(bArrA3, 0, bArrA3.length);
                c0039kF2.e();
                C0040l.A((C0040l) c0039kF2.f5252m, c0328hH3);
                ((i) this.f9623c).getClass();
                c0039kF2.e();
                C0040l.y((C0040l) c0039kF2.f5252m);
                return (C0040l) c0039kF2.b();
            case 2:
                C0047t c0047t = (C0047t) abstractC0321a;
                C0045q c0045qE = D2.r.E();
                byte[] bArrA4 = E2.n.a(c0047t.A());
                C0328h c0328hH4 = AbstractC0329i.h(bArrA4, 0, bArrA4.length);
                c0045qE.e();
                D2.r.A((D2.r) c0045qE.f5252m, c0328hH4);
                C0049v c0049vB = c0047t.B();
                c0045qE.e();
                D2.r.z((D2.r) c0045qE.f5252m, c0049vB);
                ((i) this.f9623c).getClass();
                c0045qE.e();
                D2.r.y((D2.r) c0045qE.f5252m);
                return (D2.r) c0045qE.b();
            case 3:
                C0050w c0050wC = C0051x.C();
                byte[] bArrA5 = E2.n.a(((C0053z) abstractC0321a).z());
                C0328h c0328hH5 = AbstractC0329i.h(bArrA5, 0, bArrA5.length);
                c0050wC.e();
                C0051x.z((C0051x) c0050wC.f5252m, c0328hH5);
                ((i) this.f9623c).getClass();
                c0050wC.e();
                C0051x.y((C0051x) c0050wC.f5252m);
                return (C0051x) c0050wC.b();
            case 4:
                D2.A aC = D2.B.C();
                byte[] bArrA6 = E2.n.a(((D) abstractC0321a).z());
                C0328h c0328hH6 = AbstractC0329i.h(bArrA6, 0, bArrA6.length);
                aC.e();
                D2.B.z((D2.B) aC.f5252m, c0328hH6);
                ((i) this.f9623c).getClass();
                aC.e();
                D2.B.y((D2.B) aC.f5252m);
                return (D2.B) aC.b();
            case 5:
                I iC = J.C();
                ((i) this.f9623c).getClass();
                iC.e();
                J.y((J) iC.f5252m);
                byte[] bArrA7 = E2.n.a(32);
                C0328h c0328hH7 = AbstractC0329i.h(bArrA7, 0, bArrA7.length);
                iC.e();
                J.z((J) iC.f5252m, c0328hH7);
                return (J) iC.b();
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                l0 l0VarC = m0.C();
                l0VarC.e();
                m0.z((m0) l0VarC.f5252m, (n0) abstractC0321a);
                ((i) this.f9623c).getClass();
                l0VarC.e();
                m0.y((m0) l0VarC.f5252m);
                return (m0) l0VarC.b();
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                o0 o0VarC = p0.C();
                o0VarC.e();
                p0.z((p0) o0VarC.f5252m, (q0) abstractC0321a);
                ((i) this.f9623c).getClass();
                o0VarC.e();
                p0.y((p0) o0VarC.f5252m);
                return (p0) o0VarC.b();
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                t0 t0VarC = u0.C();
                ((i) this.f9623c).getClass();
                t0VarC.e();
                u0.y((u0) t0VarC.f5252m);
                byte[] bArrA8 = E2.n.a(32);
                C0328h c0328hH8 = AbstractC0329i.h(bArrA8, 0, bArrA8.length);
                t0VarC.e();
                u0.z((u0) t0VarC.f5252m, c0328hH8);
                return (u0) t0VarC.b();
            case 9:
                E eC = F.C();
                byte[] bArrA9 = E2.n.a(((H) abstractC0321a).z());
                C0328h c0328hH9 = AbstractC0329i.h(bArrA9, 0, bArrA9.length);
                eC.e();
                F.z((F) eC.f5252m, c0328hH9);
                ((i) this.f9623c).getClass();
                eC.e();
                F.y((F) eC.f5252m);
                return (F) eC.b();
            default:
                T t4 = (T) abstractC0321a;
                P pF2 = Q.F();
                ((C1067c) this.f9623c).getClass();
                pF2.e();
                Q.y((Q) pF2.f5252m);
                V vC2 = t4.C();
                pF2.e();
                Q.z((Q) pF2.f5252m, vC2);
                byte[] bArrA10 = E2.n.a(t4.B());
                C0328h c0328hH10 = AbstractC0329i.h(bArrA10, 0, bArrA10.length);
                pF2.e();
                Q.A((Q) pF2.f5252m, c0328hH10);
                return (Q) pF2.b();
        }
    }

    @Override // L0.e
    public Map k() {
        switch (this.f9622b) {
            case 0:
                HashMap map = new HashMap();
                map.put("AES128_CTR_HMAC_SHA256", i.m(16, 16, 1));
                map.put("AES128_CTR_HMAC_SHA256_RAW", i.m(16, 16, 3));
                map.put("AES256_CTR_HMAC_SHA256", i.m(32, 32, 1));
                map.put("AES256_CTR_HMAC_SHA256_RAW", i.m(32, 32, 3));
                return Collections.unmodifiableMap(map);
            case 1:
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                return super.k();
            case 2:
                HashMap map2 = new HashMap();
                map2.put("AES128_EAX", i.l(16, 1));
                map2.put("AES128_EAX_RAW", i.l(16, 3));
                map2.put("AES256_EAX", i.l(32, 1));
                map2.put("AES256_EAX_RAW", i.l(32, 3));
                return Collections.unmodifiableMap(map2);
            case 3:
                HashMap map3 = new HashMap();
                map3.put("AES128_GCM", i.n(16, 1));
                map3.put("AES128_GCM_RAW", i.n(16, 3));
                map3.put("AES256_GCM", i.n(32, 1));
                map3.put("AES256_GCM_RAW", i.n(32, 3));
                return Collections.unmodifiableMap(map3);
            case 4:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM_SIV", i.o(16, 1));
                map4.put("AES128_GCM_SIV_RAW", i.o(16, 3));
                map4.put("AES256_GCM_SIV", i.o(32, 1));
                map4.put("AES256_GCM_SIV_RAW", i.o(32, 3));
                return Collections.unmodifiableMap(map4);
            case 5:
                HashMap map5 = new HashMap();
                map5.put("CHACHA20_POLY1305", new y2.d(L.y(), 1));
                map5.put("CHACHA20_POLY1305_RAW", new y2.d(L.y(), 3));
                return Collections.unmodifiableMap(map5);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                HashMap map6 = new HashMap();
                map6.put("XCHACHA20_POLY1305", new y2.d(v0.y(), 1));
                map6.put("XCHACHA20_POLY1305_RAW", new y2.d(v0.y(), 3));
                return Collections.unmodifiableMap(map6);
            case 9:
                HashMap map7 = new HashMap();
                G gA = H.A();
                gA.e();
                H.y((H) gA.f5252m);
                map7.put("AES256_SIV", new y2.d((H) gA.b(), 1));
                G gA2 = H.A();
                gA2.e();
                H.y((H) gA2.f5252m);
                map7.put("AES256_SIV_RAW", new y2.d((H) gA2.b(), 3));
                return Collections.unmodifiableMap(map7);
            case 10:
                HashMap map8 = new HashMap();
                O o4 = O.f556p;
                map8.put("HMAC_SHA256_128BITTAG", C1067c.l(32, 16, o4, 1));
                map8.put("HMAC_SHA256_128BITTAG_RAW", C1067c.l(32, 16, o4, 3));
                map8.put("HMAC_SHA256_256BITTAG", C1067c.l(32, 32, o4, 1));
                map8.put("HMAC_SHA256_256BITTAG_RAW", C1067c.l(32, 32, o4, 3));
                O o5 = O.f557q;
                map8.put("HMAC_SHA512_128BITTAG", C1067c.l(64, 16, o5, 1));
                map8.put("HMAC_SHA512_128BITTAG_RAW", C1067c.l(64, 16, o5, 3));
                map8.put("HMAC_SHA512_256BITTAG", C1067c.l(64, 32, o5, 1));
                map8.put("HMAC_SHA512_256BITTAG_RAW", C1067c.l(64, 32, o5, 3));
                map8.put("HMAC_SHA512_512BITTAG", C1067c.l(64, 64, o5, 1));
                map8.put("HMAC_SHA512_512BITTAG_RAW", C1067c.l(64, 64, o5, 3));
                return Collections.unmodifiableMap(map8);
        }
    }

    @Override // L0.e
    public final AbstractC0321a m(AbstractC0329i abstractC0329i) {
        switch (this.f9622b) {
            case 0:
                return C0038j.D(abstractC0329i, C0335o.a());
            case 1:
                return C0042n.E(abstractC0329i, C0335o.a());
            case 2:
                return C0047t.D(abstractC0329i, C0335o.a());
            case 3:
                return C0053z.B(abstractC0329i, C0335o.a());
            case 4:
                return D.B(abstractC0329i, C0335o.a());
            case 5:
                return L.z(abstractC0329i, C0335o.a());
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return n0.A(abstractC0329i, C0335o.a());
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return q0.C(abstractC0329i, C0335o.a());
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return v0.z(abstractC0329i, C0335o.a());
            case 9:
                return H.B(abstractC0329i, C0335o.a());
            default:
                return T.E(abstractC0329i, C0335o.a());
        }
    }

    @Override // L0.e
    public final void o(AbstractC0321a abstractC0321a) throws GeneralSecurityException {
        switch (this.f9622b) {
            case 0:
                C0038j c0038j = (C0038j) abstractC0321a;
                C0798g[] c0798gArr = {new C0798g(E2.k.class, 1)};
                HashMap map = new HashMap();
                for (C0798g c0798g : c0798gArr) {
                    boolean zContainsKey = map.containsKey(c0798g.f9620a);
                    Class cls = c0798g.f9620a;
                    if (zContainsKey) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                    map.put(cls, c0798g);
                }
                if (c0798gArr.length > 0) {
                    Class cls2 = c0798gArr[0].f9620a;
                }
                Collections.unmodifiableMap(map);
                C0042n c0042nA = c0038j.A();
                E2.o.a(c0042nA.B());
                C0044p c0044pC = c0042nA.C();
                if (c0044pC.A() < 12 || c0044pC.A() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                C0798g[] c0798gArr2 = {new C0798g(r2.j.class, 11)};
                HashMap map2 = new HashMap();
                for (C0798g c0798g2 : c0798gArr2) {
                    boolean zContainsKey2 = map2.containsKey(c0798g2.f9620a);
                    Class cls3 = c0798g2.f9620a;
                    if (zContainsKey2) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                    map2.put(cls3, c0798g2);
                }
                if (c0798gArr2.length > 0) {
                    Class cls4 = c0798gArr2[0].f9620a;
                }
                Collections.unmodifiableMap(map2);
                T tB = c0038j.B();
                if (tB.B() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C1067c.n(tB.C());
                E2.o.a(c0038j.A().B());
                return;
            case 1:
                C0042n c0042n = (C0042n) abstractC0321a;
                E2.o.a(c0042n.B());
                C0044p c0044pC2 = c0042n.C();
                ((i) this.f9623c).getClass();
                if (c0044pC2.A() < 12 || c0044pC2.A() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                return;
            case 2:
                C0047t c0047t = (C0047t) abstractC0321a;
                E2.o.a(c0047t.A());
                if (c0047t.B().A() != 12 && c0047t.B().A() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                E2.o.a(((C0053z) abstractC0321a).z());
                return;
            case 4:
                E2.o.a(((D) abstractC0321a).z());
                return;
            case 5:
                return;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                q0 q0Var = (q0) abstractC0321a;
                if (q0Var.A().isEmpty() || !q0Var.B()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return;
            case 9:
                H h2 = (H) abstractC0321a;
                if (h2.z() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + h2.z() + ". Valid keys must have 64 bytes.");
            default:
                T t4 = (T) abstractC0321a;
                if (t4.B() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C1067c.n(t4.C());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar, byte b4, char c5) {
        super(q0.class);
        this.f9623c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar, int i) {
        super(C0053z.class);
        this.f9623c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar, byte b4, boolean z4) {
        super(L.class);
        this.f9623c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar, char c5) {
        super(C0047t.class);
        this.f9623c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar, short s4) {
        super(D.class);
        this.f9623c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar, byte b4) {
        super(C0042n.class);
        this.f9623c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar, byte b4, int i) {
        super(v0.class);
        this.f9623c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar, byte b4, short s4) {
        super(H.class);
        this.f9623c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(i iVar) {
        super(C0038j.class);
        this.f9623c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799h(C1067c c1067c) {
        super(T.class);
        this.f9623c = c1067c;
    }
}
