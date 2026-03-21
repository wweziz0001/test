package h0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6046c;

    public T(S s4) {
        this.f6044a = s4.f6041a;
        this.f6045b = s4.f6042b;
        this.f6046c = s4.f6043c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t4 = (T) obj;
        return this.f6044a == t4.f6044a && this.f6045b == t4.f6045b && this.f6046c == t4.f6046c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6044a), Float.valueOf(this.f6045b), Long.valueOf(this.f6046c)});
    }
}
