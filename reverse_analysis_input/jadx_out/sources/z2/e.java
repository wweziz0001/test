package z2;

import b3.AbstractC0307a;
import java.util.Objects;
import s2.AbstractC0794c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0794c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f11167d;

    public e(int i, int i5, d dVar) {
        this.f11165b = i;
        this.f11166c = i5;
        this.f11167d = dVar;
    }

    public final int b() {
        d dVar = d.f11154f;
        int i = this.f11166c;
        d dVar2 = this.f11167d;
        if (dVar2 == dVar) {
            return i;
        }
        if (dVar2 == d.f11151c) {
            return i + 5;
        }
        if (dVar2 == d.f11152d) {
            return i + 5;
        }
        if (dVar2 == d.f11153e) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f11165b == this.f11165b && eVar.b() == b() && eVar.f11167d == this.f11167d;
    }

    public final int hashCode() {
        return Objects.hash(e.class, Integer.valueOf(this.f11165b), Integer.valueOf(this.f11166c), this.f11167d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f11167d);
        sb.append(", ");
        sb.append(this.f11166c);
        sb.append("-byte tags, and ");
        return AbstractC0307a.l(sb, this.f11165b, "-byte key)");
    }
}
