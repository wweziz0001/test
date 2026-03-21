package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocalDateTime f7210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f7211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f7212d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f7209a, ((b) obj).f7209a);
    }

    b(LocalDateTime localDateTime, z zVar, z zVar2) {
        this.f7209a = localDateTime.X(zVar);
        this.f7210b = localDateTime;
        this.f7211c = zVar;
        this.f7212d = zVar2;
    }

    b(long j5, z zVar, z zVar2) {
        this.f7209a = j5;
        this.f7210b = LocalDateTime.h0(j5, 0, zVar);
        this.f7211c = zVar;
        this.f7212d = zVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.f7209a, objectOutput);
        a.d(this.f7211c, objectOutput);
        a.d(this.f7212d, objectOutput);
    }

    public final long N() {
        return this.f7209a;
    }

    public final LocalDateTime r() {
        return this.f7210b;
    }

    public final z R() {
        return this.f7211c;
    }

    public final z I() {
        return this.f7212d;
    }

    public final Duration B() {
        return Duration.R(this.f7212d.Y() - this.f7211c.Y());
    }

    public final LocalDateTime p() {
        return this.f7210b.j0(this.f7212d.Y() - this.f7211c.Y());
    }

    public final boolean V() {
        return this.f7212d.Y() > this.f7211c.Y();
    }

    final List S() {
        return V() ? Collections.emptyList() : j$.time.e.a(new Object[]{this.f7211c, this.f7212d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7209a == bVar.f7209a && this.f7211c.equals(bVar.f7211c) && this.f7212d.equals(bVar.f7212d);
    }

    public final int hashCode() {
        return (this.f7210b.hashCode() ^ this.f7211c.hashCode()) ^ Integer.rotateLeft(this.f7212d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(V() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f7210b);
        sb.append(this.f7211c);
        sb.append(" to ");
        sb.append(this.f7212d);
        sb.append(']');
        return sb.toString();
    }
}
