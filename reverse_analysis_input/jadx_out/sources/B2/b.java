package B2;

import java.util.Objects;
import r2.f;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f267d;

    public b(f fVar, int i, String str, String str2) {
        this.f264a = fVar;
        this.f265b = i;
        this.f266c = str;
        this.f267d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f264a == bVar.f264a && this.f265b == bVar.f265b && this.f266c.equals(bVar.f266c) && this.f267d.equals(bVar.f267d);
    }

    public final int hashCode() {
        return Objects.hash(this.f264a, Integer.valueOf(this.f265b), this.f266c, this.f267d);
    }

    public final String toString() {
        return "(status=" + this.f264a + ", keyId=" + this.f265b + ", keyType='" + this.f266c + "', keyPrefix='" + this.f267d + "')";
    }
}
