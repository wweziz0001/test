package j$.time.chrono;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements m, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f7045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final y[] f7046e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f7047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.h f7048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f7049c;

    static {
        y yVar = new y(-1, j$.time.h.f0(1868, 1, 1), "Meiji");
        f7045d = yVar;
        f7046e = new y[]{yVar, new y(0, j$.time.h.f0(1912, 7, 30), "Taisho"), new y(1, j$.time.h.f0(1926, 12, 25), "Showa"), new y(2, j$.time.h.f0(1989, 1, 8), "Heisei"), new y(3, j$.time.h.f0(2019, 5, 1), "Reiwa")};
    }

    static y r() {
        return f7046e[r0.length - 1];
    }

    static long z() {
        int iA0 = 1000000000 - r().f7048b.a0();
        y[] yVarArr = f7046e;
        int iA02 = yVarArr[0].f7048b.a0();
        for (int i = 1; i < yVarArr.length; i++) {
            y yVar = yVarArr[i];
            iA0 = Math.min(iA0, (yVar.f7048b.a0() - iA02) + 1);
            iA02 = yVar.f7048b.a0();
        }
        return iA0;
    }

    static long x() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.B().f();
        for (y yVar : f7046e) {
            jF = Math.min(jF, ((yVar.f7048b.c0() ? 366 : 365) - yVar.f7048b.Y()) + 1);
            if (yVar.v() != null) {
                jF = Math.min(jF, yVar.v().f7048b.Y() - 1);
            }
        }
        return jF;
    }

    private y(int i, j$.time.h hVar, String str) {
        this.f7047a = i;
        this.f7048b = hVar;
        this.f7049c = str;
    }

    final j$.time.h s() {
        return this.f7048b;
    }

    public static y w(int i) {
        int i5 = i + 1;
        if (i5 >= 0) {
            y[] yVarArr = f7046e;
            if (i5 < yVarArr.length) {
                return yVarArr[i5];
            }
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    public static y[] B() {
        y[] yVarArr = f7046e;
        return (y[]) Arrays.copyOf(yVarArr, yVarArr.length);
    }

    static y q(j$.time.h hVar) {
        if (hVar.b0(x.f7041d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        y[] yVarArr = f7046e;
        for (int length = yVarArr.length - 1; length >= 0; length--) {
            y yVar = yVarArr[length];
            if (hVar.compareTo(yVar.f7048b) >= 0) {
                return yVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final int p() {
        return this.f7047a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (rVar == aVar) {
            return v.f7039d.T(aVar);
        }
        return super.l(rVar);
    }

    final y v() {
        if (this == r()) {
            return null;
        }
        return w(this.f7047a + 1);
    }

    public final String toString() {
        return this.f7049c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 5, this);
    }

    final void C(DataOutput dataOutput) {
        dataOutput.writeByte(this.f7047a);
    }
}
