package a0;

import a.AbstractC0149a;
import android.net.Uri;
import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.List;
import java.util.Objects;
import m2.C0639F;

/* JADX INFO: renamed from: a0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0197w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f3460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m2.I f3463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3465f;

    static {
        AbstractC0307a.n(0, 1, 2, 3, 4);
        AbstractC0370w.G(5);
        AbstractC0370w.G(6);
        AbstractC0370w.G(7);
    }

    public C0197w(Uri uri, String str, AbstractC0149a abstractC0149a, List list, m2.I i, String str2, long j5) {
        this.f3460a = uri;
        this.f3461b = AbstractC0156G.m(str);
        this.f3462c = list;
        this.f3463d = i;
        C0639F c0639fN = m2.I.n();
        for (int i5 = 0; i5 < i.size(); i5++) {
            ((C0199y) i.get(i5)).getClass();
            new C0200z(0);
            c0639fN.c(new C0199y());
        }
        c0639fN.g();
        this.f3464e = str2;
        this.f3465f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0197w)) {
            return false;
        }
        C0197w c0197w = (C0197w) obj;
        return this.f3460a.equals(c0197w.f3460a) && Objects.equals(this.f3461b, c0197w.f3461b) && Objects.equals(null, null) && this.f3462c.equals(c0197w.f3462c) && this.f3463d.equals(c0197w.f3463d) && Objects.equals(this.f3464e, c0197w.f3464e) && Long.valueOf(this.f3465f).equals(Long.valueOf(c0197w.f3465f));
    }

    public final int hashCode() {
        int iHashCode = this.f3460a.hashCode() * 31;
        String str = this.f3461b;
        int iHashCode2 = (this.f3463d.hashCode() + ((this.f3462c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31;
        String str2 = this.f3464e;
        return (int) ((((long) (iHashCode2 + (str2 != null ? str2.hashCode() : 0))) * 31) + this.f3465f);
    }
}
