package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f7152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f7153b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        z zVar = sVar.f7153b;
        z zVar2 = this.f7153b;
        boolean zEquals = zVar2.equals(zVar);
        l lVar = sVar.f7152a;
        l lVar2 = this.f7152a;
        if (zEquals) {
            return lVar2.compareTo(lVar);
        }
        int iCompare = Long.compare(lVar2.k0() - (((long) zVar2.Y()) * 1000000000), lVar.k0() - (((long) sVar.f7153b.Y()) * 1000000000));
        return iCompare == 0 ? lVar2.compareTo(lVar) : iCompare;
    }

    static {
        l lVar = l.f7135e;
        z zVar = z.f7204h;
        lVar.getClass();
        r(lVar, zVar);
        l lVar2 = l.f7136f;
        z zVar2 = z.f7203g;
        lVar2.getClass();
        r(lVar2, zVar2);
    }

    public static s r(l lVar, z zVar) {
        return new s(lVar, zVar);
    }

    private s(l lVar, z zVar) {
        Objects.requireNonNull(lVar, "time");
        this.f7152a = lVar;
        Objects.requireNonNull(zVar, "offset");
        this.f7153b = zVar;
    }

    private s R(l lVar, z zVar) {
        return (this.f7152a == lVar && this.f7153b.equals(zVar)) ? this : new s(lVar, zVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).a0() || rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).B();
            }
            return this.f7152a.l(rVar);
        }
        return rVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f7153b.Y();
            }
            return this.f7152a.g(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(h hVar) {
        return (s) hVar.c(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m b(long j5, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            l lVar = this.f7152a;
            if (rVar == aVar) {
                return R(lVar, z.b0(((j$.time.temporal.a) rVar).Y(j5)));
            }
            return R(lVar.b(j5, rVar), this.f7153b);
        }
        return (s) rVar.p(this, j5);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final s d(long j5, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return R(this.f7152a.d(j5, uVar), this.f7153b);
        }
        return (s) uVar.p(this, j5);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1L, uVar) : d(-j5, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.f()) {
            return this.f7153b;
        }
        if (((tVar == j$.time.temporal.s.g()) || (tVar == j$.time.temporal.s.a())) || tVar == j$.time.temporal.s.b()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.c()) {
            return this.f7152a;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.b(this.f7152a.k0(), j$.time.temporal.a.NANO_OF_DAY).b(this.f7153b.Y(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f7152a.equals(sVar.f7152a) && this.f7153b.equals(sVar.f7153b);
    }

    public final int hashCode() {
        return this.f7152a.hashCode() ^ this.f7153b.hashCode();
    }

    public final String toString() {
        return this.f7152a.toString() + this.f7153b.toString();
    }

    private Object writeReplace() {
        return new u((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f7152a.o0(objectOutput);
        this.f7153b.e0(objectOutput);
    }

    static s I(ObjectInput objectInput) {
        return new s(l.j0(objectInput), z.d0(objectInput));
    }
}
