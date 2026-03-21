package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f7189d;

    public static w j(long j5, long j6) {
        if (j5 > j6) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new w(j5, j5, j6, j6);
    }

    public static w k(long j5, long j6) {
        if (j5 > j6) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j6) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new w(1L, 1L, j5, j6);
    }

    private w(long j5, long j6, long j7, long j8) {
        this.f7186a = j5;
        this.f7187b = j6;
        this.f7188c = j7;
        this.f7189d = j8;
    }

    public final boolean g() {
        return this.f7186a == this.f7187b && this.f7188c == this.f7189d;
    }

    public final long e() {
        return this.f7186a;
    }

    public final long f() {
        return this.f7188c;
    }

    public final long d() {
        return this.f7189d;
    }

    public final boolean h() {
        return this.f7186a >= -2147483648L && this.f7189d <= 2147483647L;
    }

    public final boolean i(long j5) {
        return j5 >= this.f7186a && j5 <= this.f7189d;
    }

    public final int a(long j5, r rVar) {
        if (h() && i(j5)) {
            return (int) j5;
        }
        throw new j$.time.c(c(j5, rVar));
    }

    public final void b(long j5, r rVar) {
        if (!i(j5)) {
            throw new j$.time.c(c(j5, rVar));
        }
    }

    private String c(long j5, r rVar) {
        if (rVar != null) {
            return "Invalid value for " + rVar + " (valid values " + this + "): " + j5;
        }
        return "Invalid value (valid values " + this + "): " + j5;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j5 = this.f7186a;
        long j6 = this.f7187b;
        if (j5 > j6) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j7 = this.f7188c;
        long j8 = this.f7189d;
        if (j7 > j8) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j6 > j8) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f7186a == wVar.f7186a && this.f7187b == wVar.f7187b && this.f7188c == wVar.f7188c && this.f7189d == wVar.f7189d;
    }

    public final int hashCode() {
        long j5 = this.f7187b;
        long j6 = this.f7186a + (j5 << 16) + (j5 >> 48);
        long j7 = this.f7188c;
        long j8 = j6 + (j7 << 32) + (j7 >> 32);
        long j9 = this.f7189d;
        long j10 = j8 + (j9 << 48) + (j9 >> 16);
        return (int) ((j10 >>> 32) ^ j10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j5 = this.f7186a;
        sb.append(j5);
        long j6 = this.f7187b;
        if (j5 != j6) {
            sb.append('/');
            sb.append(j6);
        }
        sb.append(" - ");
        long j7 = this.f7188c;
        sb.append(j7);
        long j8 = this.f7189d;
        if (j7 != j8) {
            sb.append('/');
            sb.append(j8);
        }
        return sb.toString();
    }
}
