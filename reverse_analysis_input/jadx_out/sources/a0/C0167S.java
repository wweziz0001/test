package a0;

import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: renamed from: a0.S, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0167S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0176b f3242g = C0176b.f3316c;

    static {
        AbstractC0307a.n(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i5) {
        C0175a c0175aA = this.f3242g.a(i);
        if (c0175aA.f3305a != -1) {
            return c0175aA.f3310f[i5];
        }
        return -9223372036854775807L;
    }

    public final int b(long j5) {
        int i;
        C0175a c0175aA;
        int i5;
        C0176b c0176b = this.f3242g;
        long j6 = this.f3239d;
        c0176b.getClass();
        if (j5 == Long.MIN_VALUE) {
            return -1;
        }
        if (j6 != -9223372036854775807L && j5 >= j6) {
            return -1;
        }
        int i6 = 0;
        while (true) {
            i = c0176b.f3318a;
            if (i6 >= i) {
                break;
            }
            c0176b.a(i6).getClass();
            c0176b.a(i6).getClass();
            if (0 > j5 && ((i5 = (c0175aA = c0176b.a(i6)).f3305a) == -1 || c0175aA.a(-1) < i5)) {
                break;
            }
            i6++;
        }
        if (i6 < i) {
            return i6;
        }
        return -1;
    }

    public final int c(long j5) {
        C0176b c0176b = this.f3242g;
        int i = c0176b.f3318a - 1;
        c0176b.b(i);
        while (i >= 0 && j5 != Long.MIN_VALUE) {
            c0176b.a(i).getClass();
            if (j5 >= 0) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            C0175a c0175aA = c0176b.a(i);
            int i5 = c0175aA.f3305a;
            if (i5 == -1) {
                return i;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = c0175aA.f3309e[i6];
                if (i7 == 0 || i7 == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final long d(int i) {
        this.f3242g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.f3242g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0167S.class.equals(obj.getClass())) {
            return false;
        }
        C0167S c0167s = (C0167S) obj;
        Object obj2 = this.f3236a;
        Object obj3 = c0167s.f3236a;
        int i = AbstractC0370w.f5326a;
        return Objects.equals(obj2, obj3) && Objects.equals(this.f3237b, c0167s.f3237b) && this.f3238c == c0167s.f3238c && this.f3239d == c0167s.f3239d && this.f3240e == c0167s.f3240e && this.f3241f == c0167s.f3241f && Objects.equals(this.f3242g, c0167s.f3242g);
    }

    public final boolean f(int i) {
        C0176b c0176b = this.f3242g;
        if (i != c0176b.f3318a - 1) {
            return false;
        }
        c0176b.b(i);
        return false;
    }

    public final boolean g(int i) {
        this.f3242g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j5, long j6, C0176b c0176b, boolean z4) {
        this.f3236a = obj;
        this.f3237b = obj2;
        this.f3238c = i;
        this.f3239d = j5;
        this.f3240e = j6;
        this.f3242g = c0176b;
        this.f3241f = z4;
    }

    public final int hashCode() {
        Object obj = this.f3236a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f3237b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f3238c) * 31;
        long j5 = this.f3239d;
        int i = (iHashCode2 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f3240e;
        return this.f3242g.hashCode() + ((((i + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f3241f ? 1 : 0)) * 31);
    }
}
