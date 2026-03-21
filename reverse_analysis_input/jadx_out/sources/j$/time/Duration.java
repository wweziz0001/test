package j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements j$.time.temporal.q, Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f6974c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6976b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f6975a, duration2.f6975a);
        return iCompare != 0 ? iCompare : this.f6976b - duration2.f6976b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration R(long j5) {
        return r(j5, 0);
    }

    public static Duration S(long j5, long j6) {
        return r(Math.addExact(j5, Math.floorDiv(j6, 1000000000L)), (int) Math.floorMod(j6, 1000000000L));
    }

    public static Duration ofMillis(long j5) {
        long j6 = j5 / 1000;
        int i = (int) (j5 % 1000);
        if (i < 0) {
            i += 1000;
            j6--;
        }
        return r(j6, i * 1000000);
    }

    private static Duration r(long j5, int i) {
        if ((((long) i) | j5) == 0) {
            return f6974c;
        }
        return new Duration(j5, i);
    }

    private Duration(long j5, int i) {
        this.f6975a = j5;
        this.f6976b = i;
    }

    public final long I() {
        return this.f6975a;
    }

    public final int B() {
        return this.f6976b;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(j$.time.temporal.m mVar) {
        long j5 = this.f6975a;
        if (j5 != 0) {
            mVar = mVar.d(j5, j$.time.temporal.b.SECONDS);
        }
        int i = this.f6976b;
        return i != 0 ? mVar.d(i, j$.time.temporal.b.NANOS) : mVar;
    }

    public long toMillis() {
        long j5 = this.f6976b;
        long j6 = this.f6975a;
        if (j6 < 0) {
            j6++;
            j5 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j6, 1000), j5 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f6975a == duration.f6975a && this.f6976b == duration.f6976b;
    }

    public final int hashCode() {
        long j5 = this.f6975a;
        return (this.f6976b * 51) + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        if (this == f6974c) {
            return "PT0S";
        }
        long j5 = this.f6975a;
        int i = this.f6976b;
        long j6 = (j5 >= 0 || i <= 0) ? j5 : 1 + j5;
        long j7 = j6 / 3600;
        int i5 = (int) ((j6 % 3600) / 60);
        int i6 = (int) (j6 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j7 != 0) {
            sb.append(j7);
            sb.append('H');
        }
        if (i5 != 0) {
            sb.append(i5);
            sb.append('M');
        }
        if (i6 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j5 < 0 && i > 0 && i6 == 0) {
            sb.append("-0");
        } else {
            sb.append(i6);
        }
        if (i > 0) {
            int length = sb.length();
            if (j5 < 0) {
                sb.append(2000000000 - ((long) i));
            } else {
                sb.append(((long) i) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f6975a);
        objectOutput.writeInt(this.f6976b);
    }
}
