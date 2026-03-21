package b0;

import d0.AbstractC0370w;
import java.util.Arrays;

/* JADX INFO: renamed from: b0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0298b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0298b f4829e = new C0298b(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4833d;

    public C0298b(int i, int i5, int i6) {
        this.f4830a = i;
        this.f4831b = i5;
        this.f4832c = i6;
        this.f4833d = AbstractC0370w.H(i6) ? AbstractC0370w.A(i6, i5) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0298b)) {
            return false;
        }
        C0298b c0298b = (C0298b) obj;
        return this.f4830a == c0298b.f4830a && this.f4831b == c0298b.f4831b && this.f4832c == c0298b.f4832c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4830a), Integer.valueOf(this.f4831b), Integer.valueOf(this.f4832c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4830a + ", channelCount=" + this.f4831b + ", encoding=" + this.f4832c + ']';
    }
}
