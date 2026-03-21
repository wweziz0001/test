package a0;

import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: renamed from: a0.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0163N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0150A f3227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3232h;
    public final int i;

    static {
        AbstractC0307a.n(0, 1, 2, 3, 4);
        AbstractC0370w.G(5);
        AbstractC0370w.G(6);
    }

    public C0163N(Object obj, int i, C0150A c0150a, Object obj2, int i5, long j5, long j6, int i6, int i7) {
        this.f3225a = obj;
        this.f3226b = i;
        this.f3227c = c0150a;
        this.f3228d = obj2;
        this.f3229e = i5;
        this.f3230f = j5;
        this.f3231g = j6;
        this.f3232h = i6;
        this.i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0163N.class != obj.getClass()) {
            return false;
        }
        C0163N c0163n = (C0163N) obj;
        return this.f3226b == c0163n.f3226b && this.f3229e == c0163n.f3229e && this.f3230f == c0163n.f3230f && this.f3231g == c0163n.f3231g && this.f3232h == c0163n.f3232h && this.i == c0163n.i && i4.a.v(this.f3227c, c0163n.f3227c) && i4.a.v(this.f3225a, c0163n.f3225a) && i4.a.v(this.f3228d, c0163n.f3228d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3225a, Integer.valueOf(this.f3226b), this.f3227c, this.f3228d, Integer.valueOf(this.f3229e), Long.valueOf(this.f3230f), Long.valueOf(this.f3231g), Integer.valueOf(this.f3232h), Integer.valueOf(this.i)});
    }
}
