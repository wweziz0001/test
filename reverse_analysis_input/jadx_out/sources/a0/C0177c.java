package a0;

import android.media.AudioAttributes;
import b3.AbstractC0307a;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: a0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0177c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0177c f3322e = new C0177c(0, 0, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B0.d f3326d;

    static {
        AbstractC0307a.n(0, 1, 2, 3, 4);
    }

    public C0177c(int i, int i5, int i6) {
        this.f3323a = i;
        this.f3324b = i5;
        this.f3325c = i6;
    }

    public final B0.d a() {
        if (this.f3326d == null) {
            B0.d dVar = new B0.d();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f3323a).setFlags(this.f3324b).setUsage(this.f3325c);
            int i = AbstractC0370w.f5326a;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
            }
            dVar.f190l = usage.build();
            this.f3326d = dVar;
        }
        return this.f3326d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0177c.class != obj.getClass()) {
            return false;
        }
        C0177c c0177c = (C0177c) obj;
        return this.f3323a == c0177c.f3323a && this.f3324b == c0177c.f3324b && this.f3325c == c0177c.f3325c;
    }

    public final int hashCode() {
        return (((((((527 + this.f3323a) * 31) + this.f3324b) * 31) + this.f3325c) * 31) + 1) * 31;
    }
}
