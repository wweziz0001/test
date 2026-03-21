package s1;

import D2.B;
import D2.C0030b;
import D2.C0036h;
import D2.C0040l;
import D2.C0051x;
import D2.F;
import D2.J;
import D2.O;
import D2.Q;
import D2.X;
import D2.m0;
import D2.p0;
import D2.r;
import D2.u0;
import E2.m;
import androidx.work.impl.WorkDatabase;
import com.google.crypto.tink.shaded.protobuf.AbstractC0321a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import d0.C0362o;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.spec.SecretKeySpec;
import s2.C0798g;
import s2.z;
import u2.C0894a;
import z2.C1067c;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f9610c;

    public l(WorkDatabase workDatabase) {
        N3.h.e(workDatabase, "database");
        this.f9608a = workDatabase;
        this.f9609b = new AtomicBoolean(false);
        this.f9610c = new B3.e(new G1.a(this, 6));
    }

    public y1.h a() {
        ((WorkDatabase) this.f9608a).a();
        return ((AtomicBoolean) this.f9609b).compareAndSet(false, true) ? (y1.h) ((B3.e) this.f9610c).a() : b();
    }

    public y1.h b() {
        String strC = c();
        WorkDatabase workDatabase = (WorkDatabase) this.f9608a;
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().j().c(strC);
    }

    public abstract String c();

    public int d() {
        return 1;
    }

    public abstract String e();

    public Object f(AbstractC0321a abstractC0321a, Class cls) throws GeneralSecurityException {
        C0798g c0798g = (C0798g) ((Map) this.f9609b).get(cls);
        if (c0798g == null) {
            throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
        }
        switch (c0798g.f9621b) {
            case 0:
                C0036h c0036h = (C0036h) abstractC0321a;
                return new E2.h((E2.k) new s2.i(1).f(c0036h.B(), E2.k.class), (r2.j) new C1067c().f(c0036h.C(), r2.j.class), c0036h.C().D().C());
            case 1:
                C0040l c0040l = (C0040l) abstractC0321a;
                return new E2.b(c0040l.D().A(), c0040l.C().j());
            case 2:
                r rVar = (r) abstractC0321a;
                return new E2.c(rVar.C().A(), rVar.B().j());
            case 3:
                return new E2.d(0, ((C0051x) abstractC0321a).A().j());
            case 4:
                return new C0894a(((B) abstractC0321a).A().j());
            case 5:
                return new E2.d(1, ((J) abstractC0321a).A().j());
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                String strZ = ((m0) abstractC0321a).A().z();
                return r2.i.a(strZ).c(strZ);
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                p0 p0Var = (p0) abstractC0321a;
                String strA = p0Var.A().A();
                return new z(p0Var.A().z(), r2.i.a(strA).c(strA));
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return new E2.d(2, ((u0) abstractC0321a).A().j());
            case 9:
                return new E2.e(((F) abstractC0321a).A().j());
            case 10:
                C0030b c0030b = (C0030b) abstractC0321a;
                return new m(new Z1.m(c0030b.B().j()), c0030b.C().A());
            default:
                Q q4 = (Q) abstractC0321a;
                O oB = q4.D().B();
                SecretKeySpec secretKeySpec = new SecretKeySpec(q4.C().j(), "HMAC");
                int iC = q4.D().C();
                int iOrdinal = oB.ordinal();
                if (iOrdinal == 1) {
                    return new m(new C0362o("HMACSHA1", secretKeySpec), iC);
                }
                if (iOrdinal == 2) {
                    return new m(new C0362o("HMACSHA384", secretKeySpec), iC);
                }
                if (iOrdinal == 3) {
                    return new m(new C0362o("HMACSHA256", secretKeySpec), iC);
                }
                if (iOrdinal == 4) {
                    return new m(new C0362o("HMACSHA512", secretKeySpec), iC);
                }
                if (iOrdinal == 5) {
                    return new m(new C0362o("HMACSHA224", secretKeySpec), iC);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }

    public abstract L0.e g();

    public abstract X h();

    public abstract AbstractC0321a i(AbstractC0329i abstractC0329i);

    public void j(y1.h hVar) {
        N3.h.e(hVar, "statement");
        if (hVar == ((y1.h) ((B3.e) this.f9610c).a())) {
            ((AtomicBoolean) this.f9609b).set(false);
        }
    }

    public abstract void k(AbstractC0321a abstractC0321a);

    public l(Class cls, C0798g... c0798gArr) {
        this.f9608a = cls;
        HashMap map = new HashMap();
        for (C0798g c0798g : c0798gArr) {
            boolean zContainsKey = map.containsKey(c0798g.f9620a);
            Class cls2 = c0798g.f9620a;
            if (!zContainsKey) {
                map.put(cls2, c0798g);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
        }
        if (c0798gArr.length > 0) {
            this.f9610c = c0798gArr[0].f9620a;
        } else {
            this.f9610c = Void.class;
        }
        this.f9609b = Collections.unmodifiableMap(map);
    }
}
