package j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements j$.time.temporal.q, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f7154d = new t(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7157c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        e.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public static t b(int i) {
        if (i == 0) {
            return f7154d;
        }
        return new t(0, 0, i);
    }

    private t(int i, int i5, int i6) {
        this.f7155a = i;
        this.f7156b = i5;
        this.f7157c = i6;
    }

    public final int a() {
        return this.f7157c;
    }

    public final long d() {
        return (((long) this.f7155a) * 12) + ((long) this.f7156b);
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(j$.time.temporal.m mVar) {
        j$.time.chrono.l lVar = (j$.time.chrono.l) mVar.a(j$.time.temporal.s.a());
        if (lVar == null || j$.time.chrono.s.f7036d.equals(lVar)) {
            if (this.f7156b == 0) {
                int i = this.f7155a;
                if (i != 0) {
                    mVar = mVar.d(i, j$.time.temporal.b.YEARS);
                }
            } else {
                long jD = d();
                if (jD != 0) {
                    mVar = mVar.d(jD, j$.time.temporal.b.MONTHS);
                }
            }
            int i5 = this.f7157c;
            return i5 != 0 ? mVar.d(i5, j$.time.temporal.b.DAYS) : mVar;
        }
        throw new c("Chronology mismatch, expected: ISO, actual: " + lVar.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f7155a == tVar.f7155a && this.f7156b == tVar.f7156b && this.f7157c == tVar.f7157c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f7157c, 16) + Integer.rotateLeft(this.f7156b, 8) + this.f7155a;
    }

    public final String toString() {
        if (this == f7154d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.f7155a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i5 = this.f7156b;
        if (i5 != 0) {
            sb.append(i5);
            sb.append('M');
        }
        int i6 = this.f7157c;
        if (i6 != 0) {
            sb.append(i6);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f7155a);
        objectOutput.writeInt(this.f7156b);
        objectOutput.writeInt(this.f7157c);
    }

    static t c(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        int i5 = objectInput.readInt();
        int i6 = objectInput.readInt();
        if ((i | i5 | i6) == 0) {
            return f7154d;
        }
        return new t(i, i5, i6);
    }
}
