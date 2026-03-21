package F0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f702d;

    public J(int i, int i5, int i6, byte[] bArr) {
        this.f699a = i;
        this.f700b = bArr;
        this.f701c = i5;
        this.f702d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j5 = (J) obj;
        return this.f699a == j5.f699a && this.f701c == j5.f701c && this.f702d == j5.f702d && Arrays.equals(this.f700b, j5.f700b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f700b) + (this.f699a * 31)) * 31) + this.f701c) * 31) + this.f702d;
    }
}
