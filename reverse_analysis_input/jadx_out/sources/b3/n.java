package b3;

import Q1.C;

/* JADX INFO: loaded from: classes.dex */
public final class n extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4928d;

    public n(long j5, boolean z4) {
        this.f4927c = j5;
        this.f4928d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f4927c == nVar.f4927c && this.f4928d == nVar.f4928d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4928d) + (Long.hashCode(this.f4927c) * 31);
    }

    public final String toString() {
        return "Initialize(callbackDispatcherHandleKey=" + this.f4927c + ", isInDebugMode=" + this.f4928d + ')';
    }
}
