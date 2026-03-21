package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0506a extends AbstractC0507b implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final C0506a f6988b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ZoneId f6989a;

    static {
        System.currentTimeMillis();
        f6988b = new C0506a(z.f7202f);
    }

    C0506a(ZoneId zoneId) {
        this.f6989a = zoneId;
    }

    @Override // j$.time.AbstractC0507b
    public final ZoneId a() {
        return this.f6989a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0506a)) {
            return false;
        }
        return this.f6989a.equals(((C0506a) obj).f6989a);
    }

    public final int hashCode() {
        return this.f6989a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f6989a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
