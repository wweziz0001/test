package u1;

import N3.h;
import b3.AbstractC0307a;
import java.util.List;

/* JADX INFO: renamed from: u1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0890b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10238e;

    public C0890b(String str, String str2, String str3, List list, List list2) {
        h.e(list, "columnNames");
        h.e(list2, "referenceColumnNames");
        this.f10234a = str;
        this.f10235b = str2;
        this.f10236c = str3;
        this.f10237d = list;
        this.f10238e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0890b)) {
            return false;
        }
        C0890b c0890b = (C0890b) obj;
        if (h.a(this.f10234a, c0890b.f10234a) && h.a(this.f10235b, c0890b.f10235b) && h.a(this.f10236c, c0890b.f10236c) && h.a(this.f10237d, c0890b.f10237d)) {
            return h.a(this.f10238e, c0890b.f10238e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10238e.hashCode() + ((this.f10237d.hashCode() + AbstractC0307a.e(AbstractC0307a.e(this.f10234a.hashCode() * 31, this.f10235b, 31), this.f10236c, 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f10234a + "', onDelete='" + this.f10235b + " +', onUpdate='" + this.f10236c + "', columnNames=" + this.f10237d + ", referenceColumnNames=" + this.f10238e + '}';
    }
}
