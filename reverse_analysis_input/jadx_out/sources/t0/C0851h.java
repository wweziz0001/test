package t0;

import a.AbstractC0149a;
import d0.AbstractC0370w;
import java.util.Locale;

/* JADX INFO: renamed from: t0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0851h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f9893g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f9895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f9899f;

    public C0851h(C0850g c0850g) {
        this.f9894a = c0850g.f9886a;
        this.f9895b = c0850g.f9887b;
        this.f9896c = c0850g.f9888c;
        this.f9897d = c0850g.f9889d;
        this.f9898e = c0850g.f9890e;
        int length = c0850g.f9891f.length;
        this.f9899f = c0850g.f9892g;
    }

    public static int a(int i) {
        return AbstractC0149a.A(i + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0851h.class != obj.getClass()) {
            return false;
        }
        C0851h c0851h = (C0851h) obj;
        return this.f9895b == c0851h.f9895b && this.f9896c == c0851h.f9896c && this.f9894a == c0851h.f9894a && this.f9897d == c0851h.f9897d && this.f9898e == c0851h.f9898e;
    }

    public final int hashCode() {
        int i = (((((527 + this.f9895b) * 31) + this.f9896c) * 31) + (this.f9894a ? 1 : 0)) * 31;
        long j5 = this.f9897d;
        return ((i + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f9898e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f9895b), Integer.valueOf(this.f9896c), Long.valueOf(this.f9897d), Integer.valueOf(this.f9898e), Boolean.valueOf(this.f9894a)};
        int i = AbstractC0370w.f5326a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
