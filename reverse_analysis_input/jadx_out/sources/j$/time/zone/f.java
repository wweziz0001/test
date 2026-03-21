package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.z;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {
    private static final long[] i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final e[] f7223j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final LocalDateTime[] f7224k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b[] f7225l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f7226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z[] f7227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f7228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LocalDateTime[] f7229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z[] f7230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e[] f7231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeZone f7232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient ConcurrentHashMap f7233h = new ConcurrentHashMap();

    public static f h(z zVar) {
        Objects.requireNonNull(zVar, "offset");
        return new f(zVar);
    }

    private f(long[] jArr, z[] zVarArr, long[] jArr2, z[] zVarArr2, e[] eVarArr) {
        this.f7226a = jArr;
        this.f7227b = zVarArr;
        this.f7228c = jArr2;
        this.f7230e = zVarArr2;
        this.f7231f = eVarArr;
        if (jArr2.length == 0) {
            this.f7229d = f7224k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (i5 < jArr2.length) {
                int i6 = i5 + 1;
                b bVar = new b(jArr2[i5], zVarArr2[i5], zVarArr2[i6]);
                if (bVar.V()) {
                    arrayList.add(bVar.r());
                    arrayList.add(bVar.p());
                } else {
                    arrayList.add(bVar.p());
                    arrayList.add(bVar.r());
                }
                i5 = i6;
            }
            this.f7229d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f7232g = null;
    }

    private f(z zVar) {
        z[] zVarArr = {zVar};
        this.f7227b = zVarArr;
        long[] jArr = i;
        this.f7226a = jArr;
        this.f7228c = jArr;
        this.f7229d = f7224k;
        this.f7230e = zVarArr;
        this.f7231f = f7223j;
        this.f7232g = null;
    }

    f(TimeZone timeZone) {
        z[] zVarArr = {i(timeZone.getRawOffset())};
        this.f7227b = zVarArr;
        long[] jArr = i;
        this.f7226a = jArr;
        this.f7228c = jArr;
        this.f7229d = f7224k;
        this.f7230e = zVarArr;
        this.f7231f = f7223j;
        this.f7232g = timeZone;
    }

    private static z i(int i5) {
        return z.b0(i5 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f7232g != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        long[] jArr = this.f7226a;
        objectOutput.writeInt(jArr.length);
        for (long j5 : jArr) {
            a.c(j5, objectOutput);
        }
        for (z zVar : this.f7227b) {
            a.d(zVar, objectOutput);
        }
        long[] jArr2 = this.f7228c;
        objectOutput.writeInt(jArr2.length);
        for (long j6 : jArr2) {
            a.c(j6, objectOutput);
        }
        for (z zVar2 : this.f7230e) {
            a.d(zVar2, objectOutput);
        }
        e[] eVarArr = this.f7231f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    final void k(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f7232g.getID());
    }

    static f j(ObjectInput objectInput) throws IOException {
        int i5 = objectInput.readInt();
        long[] jArr = i;
        long[] jArr2 = i5 == 0 ? jArr : new long[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            jArr2[i6] = a.a(objectInput);
        }
        int i7 = i5 + 1;
        z[] zVarArr = new z[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            zVarArr[i8] = a.b(objectInput);
        }
        int i9 = objectInput.readInt();
        if (i9 != 0) {
            jArr = new long[i9];
        }
        long[] jArr3 = jArr;
        for (int i10 = 0; i10 < i9; i10++) {
            jArr3[i10] = a.a(objectInput);
        }
        int i11 = i9 + 1;
        z[] zVarArr2 = new z[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            zVarArr2[i12] = a.b(objectInput);
        }
        int i13 = objectInput.readByte();
        e[] eVarArr = i13 == 0 ? f7223j : new e[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            eVarArr[i14] = e.b(objectInput);
        }
        return new f(jArr2, zVarArr, jArr3, zVarArr2, eVarArr);
    }

    public final z d(Instant instant) {
        TimeZone timeZone = this.f7232g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f7228c;
        if (jArr.length == 0) {
            return this.f7227b[0];
        }
        long jB = instant.B();
        int length = this.f7231f.length;
        z[] zVarArr = this.f7230e;
        if (length > 0 && jB > jArr[jArr.length - 1]) {
            b[] bVarArrB = b(c(jB, zVarArr[zVarArr.length - 1]));
            b bVar = null;
            for (int i5 = 0; i5 < bVarArrB.length; i5++) {
                bVar = bVarArrB[i5];
                if (jB < bVar.N()) {
                    return bVar.R();
                }
            }
            return bVar.I();
        }
        int iBinarySearch = Arrays.binarySearch(jArr, jB);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return zVarArr[iBinarySearch + 1];
    }

    public final List g(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return ((b) objE).S();
        }
        return Collections.singletonList((z) objE);
    }

    public final b f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return (b) objE;
        }
        return null;
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        z[] zVarArr = this.f7227b;
        int i5 = 0;
        TimeZone timeZone = this.f7232g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.b0());
            if (bVarArrB.length == 0) {
                return i(timeZone.getOffset(localDateTime.X(zVarArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i5 < length) {
                b bVar = bVarArrB[i5];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.R())) {
                    return objA;
                }
                i5++;
                obj = objA;
            }
            return obj;
        }
        if (this.f7228c.length == 0) {
            return zVarArr[0];
        }
        int length2 = this.f7231f.length;
        LocalDateTime[] localDateTimeArr = this.f7229d;
        if (length2 > 0 && localDateTime.c0(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.b0());
            int length3 = bVarArrB2.length;
            while (i5 < length3) {
                b bVar2 = bVarArrB2[i5];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.R())) {
                    return objA2;
                }
                i5++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        z[] zVarArr2 = this.f7230e;
        if (iBinarySearch == -1) {
            return zVarArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i6 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i6])) {
                iBinarySearch = i6;
            }
        }
        if ((iBinarySearch & 1) == 0) {
            LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
            int i7 = iBinarySearch / 2;
            z zVar = zVarArr2[i7];
            z zVar2 = zVarArr2[i7 + 1];
            if (zVar2.Y() > zVar.Y()) {
                return new b(localDateTime2, zVar, zVar2);
            }
            return new b(localDateTime3, zVar, zVar2);
        }
        return zVarArr2[(iBinarySearch / 2) + 1];
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTimeR = bVar.r();
        if (bVar.V()) {
            if (localDateTime.d0(localDateTimeR)) {
                return bVar.R();
            }
            return localDateTime.d0(bVar.p()) ? bVar : bVar.I();
        }
        if (localDateTime.d0(localDateTimeR)) {
            return localDateTime.d0(bVar.p()) ? bVar.R() : bVar;
        }
        return bVar.I();
    }

    private b[] b(int i5) {
        long j5;
        Integer numValueOf = Integer.valueOf(i5);
        ConcurrentHashMap concurrentHashMap = this.f7233h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f7232g;
        if (timeZone != null) {
            b[] bVarArr2 = f7225l;
            if (i5 < 1800) {
                return bVarArr2;
            }
            long jX = LocalDateTime.e0(i5 - 1).X(this.f7227b[0]);
            int offset = timeZone.getOffset(jX * 1000);
            long j6 = 31968000 + jX;
            while (jX < j6) {
                long j7 = 7776000 + jX;
                long j8 = jX;
                if (offset != timeZone.getOffset(j7 * 1000)) {
                    jX = j8;
                    while (j7 - jX > 1) {
                        int i6 = offset;
                        long j9 = j6;
                        long jFloorDiv = Math.floorDiv(j7 + jX, 2L);
                        if (timeZone.getOffset(jFloorDiv * 1000) == i6) {
                            jX = jFloorDiv;
                        } else {
                            j7 = jFloorDiv;
                        }
                        offset = i6;
                        j6 = j9;
                    }
                    j5 = j6;
                    int i7 = offset;
                    if (timeZone.getOffset(jX * 1000) == i7) {
                        jX = j7;
                    }
                    z zVarI = i(i7);
                    offset = timeZone.getOffset(jX * 1000);
                    z zVarI2 = i(offset);
                    if (c(jX, zVarI2) == i5) {
                        bVarArr2 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr2[bVarArr2.length - 1] = new b(jX, zVarI, zVarI2);
                    }
                } else {
                    j5 = j6;
                    jX = j7;
                }
                j6 = j5;
            }
            if (1916 <= i5 && i5 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        e[] eVarArr = this.f7231f;
        b[] bVarArr3 = new b[eVarArr.length];
        for (int i8 = 0; i8 < eVarArr.length; i8++) {
            bVarArr3[i8] = eVarArr[i8].a(i5);
        }
        if (i5 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j5, z zVar) {
        return j$.time.h.h0(Math.floorDiv(j5 + ((long) zVar.Y()), 86400)).a0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f7232g, fVar.f7232g) && Arrays.equals(this.f7226a, fVar.f7226a) && Arrays.equals(this.f7227b, fVar.f7227b) && Arrays.equals(this.f7228c, fVar.f7228c) && Arrays.equals(this.f7230e, fVar.f7230e) && Arrays.equals(this.f7231f, fVar.f7231f);
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f7232g) ^ Arrays.hashCode(this.f7226a)) ^ Arrays.hashCode(this.f7227b)) ^ Arrays.hashCode(this.f7228c)) ^ Arrays.hashCode(this.f7230e)) ^ Arrays.hashCode(this.f7231f);
    }

    public final String toString() {
        TimeZone timeZone = this.f7232g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f7227b[r1.length - 1] + "]";
    }
}
