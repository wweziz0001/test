package w2;

import b3.AbstractC0307a;
import java.util.Objects;

/* JADX INFO: renamed from: w2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0947c extends r2.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0946b f10494c;

    public C0947c(int i, C0946b c0946b) {
        this.f10493b = i;
        this.f10494c = c0946b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0947c)) {
            return false;
        }
        C0947c c0947c = (C0947c) obj;
        return c0947c.f10493b == this.f10493b && c0947c.f10494c == this.f10494c;
    }

    public final int hashCode() {
        return Objects.hash(C0947c.class, Integer.valueOf(this.f10493b), this.f10494c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesSiv Parameters (variant: ");
        sb.append(this.f10494c);
        sb.append(", ");
        return AbstractC0307a.l(sb, this.f10493b, "-byte key)");
    }
}
