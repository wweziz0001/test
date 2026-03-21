package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0515h implements j$.time.temporal.q, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7008e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f7009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f7010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f7011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f7012d;

    static {
        j$.time.e.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    C0515h(l lVar, int i, int i5, int i6) {
        this.f7009a = lVar;
        this.f7010b = i;
        this.f7011c = i5;
        this.f7012d = i6;
    }

    public final String toString() {
        l lVar = this.f7009a;
        int i = this.f7012d;
        int i5 = this.f7011c;
        int i6 = this.f7010b;
        if (i6 != 0 || i5 != 0 || i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(((AbstractC0508a) lVar).getId());
            sb.append(" P");
            if (i6 != 0) {
                sb.append(i6);
                sb.append('Y');
            }
            if (i5 != 0) {
                sb.append(i5);
                sb.append('M');
            }
            if (i != 0) {
                sb.append(i);
                sb.append('D');
            }
            return sb.toString();
        }
        return ((AbstractC0508a) lVar).getId() + " P0D";
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(j$.time.temporal.m mVar) {
        l lVar = (l) mVar.a(j$.time.temporal.s.a());
        l lVar2 = this.f7009a;
        if (lVar == null || ((AbstractC0508a) lVar2).equals(lVar)) {
            int i = this.f7010b;
            int i5 = this.f7011c;
            if (i5 != 0) {
                j$.time.temporal.w wVarT = lVar2.T(j$.time.temporal.a.MONTH_OF_YEAR);
                long jD = (wVarT.g() && wVarT.h()) ? (wVarT.d() - wVarT.e()) + 1 : -1L;
                if (jD > 0) {
                    mVar = mVar.d((((long) i) * jD) + ((long) i5), j$.time.temporal.b.MONTHS);
                } else {
                    if (i != 0) {
                        mVar = mVar.d(i, j$.time.temporal.b.YEARS);
                    }
                    mVar = mVar.d(i5, j$.time.temporal.b.MONTHS);
                }
            } else if (i != 0) {
                mVar = mVar.d(i, j$.time.temporal.b.YEARS);
            }
            int i6 = this.f7012d;
            return i6 != 0 ? mVar.d(i6, j$.time.temporal.b.DAYS) : mVar;
        }
        throw new j$.time.c("Chronology mismatch, expected: " + lVar2.getId() + ", actual: " + lVar.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0515h)) {
            return false;
        }
        C0515h c0515h = (C0515h) obj;
        if (this.f7010b == c0515h.f7010b && this.f7011c == c0515h.f7011c && this.f7012d == c0515h.f7012d) {
            if (((AbstractC0508a) this.f7009a).equals(c0515h.f7009a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC0508a) this.f7009a).hashCode() ^ (Integer.rotateLeft(this.f7012d, 16) + (Integer.rotateLeft(this.f7011c, 8) + this.f7010b));
    }

    protected Object writeReplace() {
        return new E((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f7009a.getId());
        objectOutput.writeInt(this.f7010b);
        objectOutput.writeInt(this.f7011c);
        objectOutput.writeInt(this.f7012d);
    }
}
