package u1;

import N3.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: u1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0892d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10246d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public C0892d(String str, boolean z4, List list, List list2) {
        h.e(list, "columns");
        h.e(list2, "orders");
        this.f10243a = str;
        this.f10244b = z4;
        this.f10245c = list;
        this.f10246d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.f10246d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0892d)) {
            return false;
        }
        C0892d c0892d = (C0892d) obj;
        if (this.f10244b != c0892d.f10244b || !h.a(this.f10245c, c0892d.f10245c) || !h.a(this.f10246d, c0892d.f10246d)) {
            return false;
        }
        String str = this.f10243a;
        boolean zStartsWith = str.startsWith("index_");
        String str2 = c0892d.f10243a;
        return zStartsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f10243a;
        return this.f10246d.hashCode() + ((this.f10245c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f10244b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f10243a + "', unique=" + this.f10244b + ", columns=" + this.f10245c + ", orders=" + this.f10246d + "'}";
    }
}
