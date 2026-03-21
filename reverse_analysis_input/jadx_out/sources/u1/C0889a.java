package u1;

import N3.h;
import U3.l;
import a.AbstractC0149a;
import java.util.Locale;
import m.B0;

/* JADX INFO: renamed from: u1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0889a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10233g;

    public C0889a(int i, int i5, String str, String str2, String str3, boolean z4) {
        this.f10227a = str;
        this.f10228b = str2;
        this.f10229c = z4;
        this.f10230d = i;
        this.f10231e = str3;
        this.f10232f = i5;
        Locale locale = Locale.US;
        h.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        h.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f10233g = l.c0(upperCase, "INT") ? 3 : (l.c0(upperCase, "CHAR") || l.c0(upperCase, "CLOB") || l.c0(upperCase, "TEXT")) ? 2 : l.c0(upperCase, "BLOB") ? 5 : (l.c0(upperCase, "REAL") || l.c0(upperCase, "FLOA") || l.c0(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0889a)) {
            return false;
        }
        C0889a c0889a = (C0889a) obj;
        if (this.f10230d != c0889a.f10230d) {
            return false;
        }
        if (!this.f10227a.equals(c0889a.f10227a) || this.f10229c != c0889a.f10229c) {
            return false;
        }
        int i = c0889a.f10232f;
        String str = c0889a.f10231e;
        String str2 = this.f10231e;
        int i5 = this.f10232f;
        if (i5 == 1 && i == 2 && str2 != null && !AbstractC0149a.n(str2, str)) {
            return false;
        }
        if (i5 != 2 || i != 1 || str == null || AbstractC0149a.n(str, str2)) {
            return (i5 == 0 || i5 != i || (str2 == null ? str == null : AbstractC0149a.n(str2, str))) && this.f10233g == c0889a.f10233g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10227a.hashCode() * 31) + this.f10233g) * 31) + (this.f10229c ? 1231 : 1237)) * 31) + this.f10230d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f10227a);
        sb.append("', type='");
        sb.append(this.f10228b);
        sb.append("', affinity='");
        sb.append(this.f10233g);
        sb.append("', notNull=");
        sb.append(this.f10229c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f10230d);
        sb.append(", defaultValue='");
        String str = this.f10231e;
        if (str == null) {
            str = "undefined";
        }
        return B0.i(sb, str, "'}");
    }
}
