package t0;

import a0.C0157H;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: t0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0845b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9852d;

    public C0845b(int i, int i5, int i6, String str) {
        this.f9849a = i;
        this.f9850b = str;
        this.f9851c = i5;
        this.f9852d = i6;
    }

    public static C0845b a(String str) throws C0157H {
        int i = AbstractC0370w.f5326a;
        String[] strArrSplit = str.split(" ", 2);
        AbstractC0360m.c(strArrSplit.length == 2);
        String str2 = strArrSplit[0];
        Pattern pattern = y.f9989a;
        try {
            int i5 = Integer.parseInt(str2);
            int i6 = -1;
            String[] strArrSplit2 = strArrSplit[1].trim().split("/", -1);
            AbstractC0360m.c(strArrSplit2.length >= 2);
            String str3 = strArrSplit2[1];
            try {
                int i7 = Integer.parseInt(str3);
                if (strArrSplit2.length == 3) {
                    String str4 = strArrSplit2[2];
                    try {
                        i6 = Integer.parseInt(str4);
                    } catch (NumberFormatException e5) {
                        throw C0157H.b(str4, e5);
                    }
                }
                return new C0845b(i5, i7, i6, strArrSplit2[0]);
            } catch (NumberFormatException e6) {
                throw C0157H.b(str3, e6);
            }
        } catch (NumberFormatException e7) {
            throw C0157H.b(str2, e7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0845b.class != obj.getClass()) {
            return false;
        }
        C0845b c0845b = (C0845b) obj;
        return this.f9849a == c0845b.f9849a && this.f9850b.equals(c0845b.f9850b) && this.f9851c == c0845b.f9851c && this.f9852d == c0845b.f9852d;
    }

    public final int hashCode() {
        return ((AbstractC0307a.e((217 + this.f9849a) * 31, this.f9850b, 31) + this.f9851c) * 31) + this.f9852d;
    }
}
