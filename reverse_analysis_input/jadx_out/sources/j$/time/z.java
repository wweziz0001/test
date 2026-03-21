package j$.time;

import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends ZoneId implements TemporalAccessor, j$.time.temporal.n, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f7200d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f7201e = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z f7202f = b0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z f7203g = b0(-64800);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z f7204h = b0(64800);
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f7206c;

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.z Z(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentHashMap r0 = j$.time.z.f7201e
            java.lang.Object r0 = r0.get(r7)
            j$.time.z r0 = (j$.time.z) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = c0(r7, r2, r3)
            int r1 = c0(r7, r6, r2)
            int r2 = c0(r7, r5, r2)
            goto L85
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = c0(r7, r2, r3)
            int r1 = c0(r7, r1, r3)
            int r2 = c0(r7, r4, r3)
            goto L85
        L50:
            int r0 = c0(r7, r2, r3)
            int r1 = c0(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = c0(r7, r2, r3)
            int r1 = c0(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = c0(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.z r7 = a0(r7, r0, r1)
            return r7
        La8:
            j$.time.z r7 = a0(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.z.Z(java.lang.String):j$.time.z");
    }

    private static int c0(String str, int i, boolean z4) {
        if (z4 && str.charAt(i - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i);
        char cCharAt2 = str.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static z a0(int i, int i5, int i6) {
        if (i < -18 || i > 18) {
            throw new c("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i5 < 0 || i6 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i5 > 0 || i6 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i5 > 0 && i6 < 0) || (i5 < 0 && i6 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i5 < -59 || i5 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i5 + " is not in the range -59 to 59");
        }
        if (i6 < -59 || i6 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i6 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i5 | i6) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return b0((i5 * 60) + (i * 3600) + i6);
    }

    public static z b0(int i) {
        if (i < -64800 || i > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i);
            ConcurrentHashMap concurrentHashMap = f7200d;
            z zVar = (z) concurrentHashMap.get(numValueOf);
            if (zVar != null) {
                return zVar;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new z(i));
            z zVar2 = (z) concurrentHashMap.get(numValueOf);
            f7201e.putIfAbsent(zVar2.f7206c, zVar2);
            return zVar2;
        }
        return new z(i);
    }

    private z(int i) {
        String string;
        this.f7205b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i5 = iAbs / 3600;
            int i6 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i5 < 10 ? "0" : "");
            sb.append(i5);
            sb.append(i6 < 10 ? ":0" : ":");
            sb.append(i6);
            int i7 = iAbs % 60;
            if (i7 != 0) {
                sb.append(i7 < 10 ? ":0" : ":");
                sb.append(i7);
            }
            string = sb.toString();
        }
        this.f7206c = string;
    }

    public final int Y() {
        return this.f7205b;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f7206c;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f r() {
        return j$.time.zone.f.h(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f7205b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return super.l(rVar).a(g(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f7205b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.f()) ? this : super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.b(this.f7205b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z zVar) {
        return zVar.f7205b - this.f7205b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f7205b == ((z) obj).f7205b;
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f7205b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f7206c;
    }

    private Object writeReplace() {
        return new u((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    final void S(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        e0(objectOutput);
    }

    final void e0(DataOutput dataOutput) {
        int i = this.f7205b;
        int i5 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i5);
        if (i5 == 127) {
            dataOutput.writeInt(i);
        }
    }

    static z d0(ObjectInput objectInput) throws IOException {
        byte b4 = objectInput.readByte();
        return b4 == 127 ? b0(objectInput.readInt()) : b0(b4 * 900);
    }
}
