package h0;

import a0.AbstractC0158I;
import a0.C0190p;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import m.B0;

/* JADX INFO: renamed from: h0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0464o extends AbstractC0158I {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6245n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0190p f6248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x0.H f6250s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f6251t;

    static {
        AbstractC0307a.n(1001, 1002, 1003, 1004, 1005);
        AbstractC0370w.G(1006);
    }

    public C0464o(int i, Exception exc, int i5) {
        this(i, exc, i5, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0464o(String str, Throwable th, int i, int i5, String str2, int i6, C0190p c0190p, int i7, x0.H h2, long j5, boolean z4) {
        super(str, th, i, j5);
        Bundle bundle = Bundle.EMPTY;
        AbstractC0360m.c(!z4 || i5 == 1);
        AbstractC0360m.c(th != null || i5 == 3);
        this.f6245n = i5;
        this.f6246o = str2;
        this.f6247p = i6;
        this.f6248q = c0190p;
        this.f6249r = i7;
        this.f6250s = h2;
        this.f6251t = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0464o(int i, Exception exc, int i5, String str, int i6, C0190p c0190p, int i7, boolean z4) {
        String string;
        String str2;
        if (i == 0) {
            string = "Source error";
        } else if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i6);
            sb.append(", format=");
            sb.append(c0190p);
            sb.append(", format_supported=");
            int i8 = AbstractC0370w.f5326a;
            if (i7 == 0) {
                str2 = "NO";
            } else if (i7 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i7 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i7 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i7 == 4) {
                str2 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str2);
            string = sb.toString();
        } else if (i != 3) {
            string = "Unexpected runtime error";
        } else {
            string = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? string : B0.h(string, ": null"), exc, i5, i, str, i6, c0190p, i7, null, SystemClock.elapsedRealtime(), z4);
    }
}
