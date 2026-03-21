package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.chrono.s;
import j$.time.l;
import j$.time.n;
import j$.time.temporal.o;
import j$.time.z;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f7215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f7216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DayOfWeek f7217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f7218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f7220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z f7221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z f7222h;
    private final z i;

    e(n nVar, int i, DayOfWeek dayOfWeek, l lVar, boolean z4, d dVar, z zVar, z zVar2, z zVar3) {
        this.f7215a = nVar;
        this.f7216b = (byte) i;
        this.f7217c = dayOfWeek;
        this.f7218d = lVar;
        this.f7219e = z4;
        this.f7220f = dVar;
        this.f7221g = zVar;
        this.f7222h = zVar2;
        this.i = zVar3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        l lVar = this.f7218d;
        boolean z4 = this.f7219e;
        int iL0 = z4 ? 86400 : lVar.l0();
        int iY = this.f7221g.Y();
        z zVar = this.f7222h;
        int iY2 = zVar.Y() - iY;
        z zVar2 = this.i;
        int iY3 = zVar2.Y() - iY;
        int iS = iL0 % 3600 == 0 ? z4 ? 24 : lVar.S() : 31;
        int i = iY % 900 == 0 ? (iY / 900) + 128 : 255;
        int i5 = (iY2 == 0 || iY2 == 1800 || iY2 == 3600) ? iY2 / 1800 : 3;
        int i6 = (iY3 == 0 || iY3 == 1800 || iY3 == 3600) ? iY3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f7217c;
        objectOutput.writeInt((this.f7215a.p() << 28) + ((this.f7216b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.p()) << 19) + (iS << 14) + (this.f7220f.ordinal() << 12) + (i << 4) + (i5 << 2) + i6);
        if (iS == 31) {
            objectOutput.writeInt(iL0);
        }
        if (i == 255) {
            objectOutput.writeInt(iY);
        }
        if (i5 == 3) {
            objectOutput.writeInt(zVar.Y());
        }
        if (i6 == 3) {
            objectOutput.writeInt(zVar2.Y());
        }
    }

    static e b(ObjectInput objectInput) {
        int i = objectInput.readInt();
        n nVarR = n.R(i >>> 28);
        int i5 = ((264241152 & i) >>> 22) - 32;
        int i6 = (3670016 & i) >>> 19;
        DayOfWeek dayOfWeekR = i6 == 0 ? null : DayOfWeek.r(i6);
        int i7 = (507904 & i) >>> 14;
        d dVar = d.values()[(i & 12288) >>> 12];
        int i8 = (i & 4080) >>> 4;
        int i9 = (i & 12) >>> 2;
        int i10 = i & 3;
        l lVarD0 = i7 == 31 ? l.d0(objectInput.readInt()) : l.a0(i7 % 24);
        z zVarB0 = z.b0(i8 == 255 ? objectInput.readInt() : (i8 - 128) * 900);
        z zVarB02 = i9 == 3 ? z.b0(objectInput.readInt()) : z.b0((i9 * 1800) + zVarB0.Y());
        z zVarB03 = i10 == 3 ? z.b0(objectInput.readInt()) : z.b0((i10 * 1800) + zVarB0.Y());
        boolean z4 = i7 == 24;
        Objects.requireNonNull(nVarR, "month");
        Objects.requireNonNull(lVarD0, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        if (i5 < -28 || i5 > 31 || i5 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z4 && !lVarD0.equals(l.f7137g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (lVarD0.Y() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(nVarR, i5, dayOfWeekR, lVarD0, z4, dVar, zVarB0, zVarB02, zVarB03);
    }

    public final b a(int i) {
        j$.time.h hVarG0;
        n nVar = this.f7215a;
        DayOfWeek dayOfWeek = this.f7217c;
        byte b4 = this.f7216b;
        if (b4 < 0) {
            s.f7036d.getClass();
            hVarG0 = j$.time.h.g0(i, nVar, nVar.B(s.Y(i)) + 1 + b4);
            if (dayOfWeek != null) {
                hVarG0 = hVarG0.j(new o(dayOfWeek.p(), 1));
            }
        } else {
            hVarG0 = j$.time.h.g0(i, nVar, b4);
            if (dayOfWeek != null) {
                hVarG0 = hVarG0.j(new o(dayOfWeek.p(), 0));
            }
        }
        if (this.f7219e) {
            hVarG0 = hVarG0.k0(1L);
        }
        LocalDateTime localDateTimeG0 = LocalDateTime.g0(hVarG0, this.f7218d);
        int i5 = c.f7213a[this.f7220f.ordinal()];
        z zVar = this.f7222h;
        if (i5 == 1) {
            localDateTimeG0 = localDateTimeG0.j0(zVar.Y() - z.f7202f.Y());
        } else if (i5 == 2) {
            localDateTimeG0 = localDateTimeG0.j0(zVar.Y() - this.f7221g.Y());
        }
        return new b(localDateTimeG0, zVar, this.i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7215a == eVar.f7215a && this.f7216b == eVar.f7216b && this.f7217c == eVar.f7217c && this.f7220f == eVar.f7220f && this.f7218d.equals(eVar.f7218d) && this.f7219e == eVar.f7219e && this.f7221g.equals(eVar.f7221g) && this.f7222h.equals(eVar.f7222h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int iL0 = ((this.f7218d.l0() + (this.f7219e ? 1 : 0)) << 15) + (this.f7215a.ordinal() << 11) + ((this.f7216b + 32) << 5);
        DayOfWeek dayOfWeek = this.f7217c;
        return ((this.f7221g.hashCode() ^ (this.f7220f.ordinal() + (iL0 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f7222h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        z zVar = this.f7222h;
        z zVar2 = this.i;
        sb.append(zVar.compareTo(zVar2) > 0 ? "Gap " : "Overlap ");
        sb.append(zVar);
        sb.append(" to ");
        sb.append(zVar2);
        sb.append(", ");
        n nVar = this.f7215a;
        byte b4 = this.f7216b;
        DayOfWeek dayOfWeek = this.f7217c;
        if (dayOfWeek == null) {
            sb.append(nVar.name());
            sb.append(' ');
            sb.append((int) b4);
        } else if (b4 == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(nVar.name());
        } else if (b4 < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b4) - 1);
            sb.append(" of ");
            sb.append(nVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(nVar.name());
            sb.append(' ');
            sb.append((int) b4);
        }
        sb.append(" at ");
        sb.append(this.f7219e ? "24:00" : this.f7218d.toString());
        sb.append(" ");
        sb.append(this.f7220f);
        sb.append(", standard offset ");
        sb.append(this.f7221g);
        sb.append(']');
        return sb.toString();
    }
}
