package Q1;

import android.os.Bundle;
import b3.AbstractC0307a;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1790d;

    public D(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        N3.h.d(uuidRandomUUID, "randomUUID()");
        this.f1788b = uuidRandomUUID;
        String string = ((UUID) this.f1788b).toString();
        N3.h.d(string, "id.toString()");
        this.f1789c = new Z1.p(string, 0, cls.getName(), (String) null, (g) null, (g) null, 0L, 0L, 0L, (C0121d) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(C3.r.b0(1));
        C3.e.Y(strArr, linkedHashSet);
        this.f1790d = linkedHashSet;
    }

    public void a(Bundle bundle) {
        if (this.f1787a) {
            bundle.putCharSequence("android.summaryText", (CharSequence) this.f1790d);
        }
        CharSequence charSequence = (CharSequence) this.f1789c;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strE = e();
        if (strE != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strE);
        }
    }

    public abstract void b(a1.j jVar);

    public E c() {
        E eD = d();
        C0121d c0121d = ((Z1.p) this.f1789c).f3054j;
        boolean z4 = !c0121d.f1815h.isEmpty() || c0121d.f1811d || c0121d.f1809b || c0121d.f1810c;
        Z1.p pVar = (Z1.p) this.f1789c;
        if (pVar.f3061q) {
            if (z4) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f3052g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        N3.h.d(uuidRandomUUID, "randomUUID()");
        this.f1788b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        N3.h.d(string, "id.toString()");
        Z1.p pVar2 = (Z1.p) this.f1789c;
        N3.h.e(pVar2, "other");
        this.f1789c = new Z1.p(string, pVar2.f3047b, pVar2.f3048c, pVar2.f3049d, new g(pVar2.f3050e), new g(pVar2.f3051f), pVar2.f3052g, pVar2.f3053h, pVar2.i, new C0121d(pVar2.f3054j), pVar2.f3055k, pVar2.f3056l, pVar2.f3057m, pVar2.f3058n, pVar2.f3059o, pVar2.f3060p, pVar2.f3061q, pVar2.f3062r, pVar2.f3063s, pVar2.f3065u, pVar2.f3066v, pVar2.f3067w, 524288);
        return eD;
    }

    public abstract E d();

    public String e() {
        return null;
    }

    public abstract D f();

    public void g(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f1790d = bundle.getCharSequence("android.summaryText");
            this.f1787a = true;
        }
        this.f1789c = bundle.getCharSequence("android.title.big");
    }

    public void h(int i, long j5, TimeUnit timeUnit) {
        AbstractC0307a.r("backoffPolicy", i);
        N3.h.e(timeUnit, "timeUnit");
        this.f1787a = true;
        Z1.p pVar = (Z1.p) this.f1789c;
        pVar.f3056l = i;
        long millis = timeUnit.toMillis(j5);
        String str = Z1.p.f3045x;
        if (millis > 18000000) {
            q.d().g(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            q.d().g(str, "Backoff delay duration less than minimum value");
        }
        pVar.f3057m = Z1.f.h(millis, 10000L, 18000000L);
    }

    public D i(long j5, TimeUnit timeUnit) {
        N3.h.e(timeUnit, "timeUnit");
        ((Z1.p) this.f1789c).f3052g = timeUnit.toMillis(j5);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((Z1.p) this.f1789c).f3052g) {
            return f();
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    public D() {
        this.f1787a = false;
    }
}
