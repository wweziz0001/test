package a0;

import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Collections;
import java.util.Objects;
import m2.C0640G;

/* JADX INFO: renamed from: a0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0197w f3154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0196v f3155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0153D f3156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0194t f3157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0198x f3158f;

    static {
        F0.u uVar = new F0.u();
        C0640G c0640g = m2.I.f8549m;
        m2.b0 b0Var = m2.b0.f8583p;
        Collections.emptyList();
        m2.b0 b0Var2 = m2.b0.f8583p;
        C0195u c0195u = new C0195u();
        C0198x c0198x = C0198x.f3466a;
        uVar.a();
        c0195u.a();
        C0153D c0153d = C0153D.f3185B;
        AbstractC0307a.n(0, 1, 2, 3, 4);
        AbstractC0370w.G(5);
    }

    public C0150A(String str, C0194t c0194t, C0197w c0197w, C0196v c0196v, C0153D c0153d, C0198x c0198x) {
        this.f3153a = str;
        this.f3154b = c0197w;
        this.f3155c = c0196v;
        this.f3156d = c0153d;
        this.f3157e = c0194t;
        this.f3158f = c0198x;
    }

    public final C0192r a() {
        C0192r c0192r = new C0192r();
        c0192r.f3441d = new F0.u();
        c0192r.f3442e = new A0.b();
        c0192r.f3443f = Collections.emptyList();
        c0192r.f3444g = m2.b0.f8583p;
        c0192r.f3447k = new C0195u();
        c0192r.f3448l = C0198x.f3466a;
        c0192r.i = -9223372036854775807L;
        C0194t c0194t = this.f3157e;
        F0.u uVar = new F0.u();
        uVar.f817a = c0194t.f3449a;
        c0192r.f3441d = uVar;
        c0192r.f3438a = this.f3153a;
        c0192r.f3446j = this.f3156d;
        c0192r.f3447k = this.f3155c.a();
        c0192r.f3448l = this.f3158f;
        C0197w c0197w = this.f3154b;
        if (c0197w != null) {
            c0192r.f3440c = c0197w.f3461b;
            c0192r.f3439b = c0197w.f3460a;
            c0192r.f3443f = c0197w.f3462c;
            c0192r.f3444g = c0197w.f3463d;
            c0192r.f3445h = c0197w.f3464e;
            c0192r.f3442e = new A0.b();
            c0192r.i = c0197w.f3465f;
        }
        return c0192r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0150A)) {
            return false;
        }
        C0150A c0150a = (C0150A) obj;
        String str = c0150a.f3153a;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(this.f3153a, str) && this.f3157e.equals(c0150a.f3157e) && Objects.equals(this.f3154b, c0150a.f3154b) && this.f3155c.equals(c0150a.f3155c) && Objects.equals(this.f3156d, c0150a.f3156d) && Objects.equals(this.f3158f, c0150a.f3158f);
    }

    public final int hashCode() {
        int iHashCode = this.f3153a.hashCode() * 31;
        C0197w c0197w = this.f3154b;
        int iHashCode2 = (this.f3156d.hashCode() + ((this.f3157e.hashCode() + ((this.f3155c.hashCode() + ((iHashCode + (c0197w != null ? c0197w.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f3158f.getClass();
        return iHashCode2;
    }
}
