package a0;

import a.AbstractC0149a;
import android.text.TextUtils;
import d0.AbstractC0360m;

/* JADX INFO: renamed from: a0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0180f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3337a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3338b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3339c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3340d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3341e = -1;

    public static C0180f c(String str) {
        AbstractC0360m.c(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            String strI = AbstractC0149a.I(strArrSplit[i8].trim());
            strI.getClass();
            switch (strI) {
                case "end":
                    i5 = i8;
                    break;
                case "text":
                    i6 = i8;
                    break;
                case "start":
                    i = i8;
                    break;
                case "style":
                    i7 = i8;
                    break;
            }
        }
        if (i == -1 || i5 == -1 || i6 == -1) {
            return null;
        }
        int length = strArrSplit.length;
        C0180f c0180f = new C0180f();
        c0180f.f3337a = i;
        c0180f.f3338b = i5;
        c0180f.f3339c = i7;
        c0180f.f3340d = i6;
        c0180f.f3341e = length;
        return c0180f;
    }

    public boolean a() {
        int i = this.f3337a;
        int i5 = 2;
        if ((i & 7) != 0) {
            int i6 = this.f3340d;
            int i7 = this.f3338b;
            if (((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i8 = this.f3340d;
            int i9 = this.f3339c;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i10 = this.f3341e;
            int i11 = this.f3338b;
            if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i12 = this.f3341e;
            int i13 = this.f3339c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public C0181g b() {
        return new C0181g(this.f3337a, this.f3338b, this.f3339c, this.f3340d, this.f3341e, null);
    }

    public void d(int i) {
        this.f3341e = i;
    }

    public void e(int i) {
        this.f3338b = i;
    }

    public void f(int i) {
        this.f3337a = i;
    }

    public void g(int i) {
        this.f3339c = i;
    }

    public void h(int i) {
        this.f3340d = i;
    }
}
