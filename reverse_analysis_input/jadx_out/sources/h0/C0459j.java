package h0;

import a0.C0190p;
import android.text.TextUtils;
import b3.AbstractC0307a;
import d0.AbstractC0360m;

/* JADX INFO: renamed from: h0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0459j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0190p f6194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0190p f6195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6197e;

    public C0459j(String str, C0190p c0190p, C0190p c0190p2, int i, int i5) {
        AbstractC0360m.c(i == 0 || i5 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f6193a = str;
        c0190p.getClass();
        this.f6194b = c0190p;
        c0190p2.getClass();
        this.f6195c = c0190p2;
        this.f6196d = i;
        this.f6197e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0459j.class != obj.getClass()) {
            return false;
        }
        C0459j c0459j = (C0459j) obj;
        return this.f6196d == c0459j.f6196d && this.f6197e == c0459j.f6197e && this.f6193a.equals(c0459j.f6193a) && this.f6194b.equals(c0459j.f6194b) && this.f6195c.equals(c0459j.f6195c);
    }

    public final int hashCode() {
        return this.f6195c.hashCode() + ((this.f6194b.hashCode() + AbstractC0307a.e((((527 + this.f6196d) * 31) + this.f6197e) * 31, this.f6193a, 31)) * 31);
    }
}
