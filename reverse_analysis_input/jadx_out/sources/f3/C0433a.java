package f3;

import Z1.m;
import m.B0;

/* JADX INFO: renamed from: f3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0433a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5746c;

    public C0433a(String str, String str2) {
        this.f5744a = str;
        this.f5745b = null;
        this.f5746c = str2;
    }

    public static C0433a a() {
        h3.f fVar = (h3.f) m.z().f3024m;
        if (fVar.f6321a) {
            return new C0433a(fVar.f6324d.f6308b, "main");
        }
        throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0433a.class != obj.getClass()) {
            return false;
        }
        C0433a c0433a = (C0433a) obj;
        if (this.f5744a.equals(c0433a.f5744a)) {
            return this.f5746c.equals(c0433a.f5746c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5746c.hashCode() + (this.f5744a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f5744a);
        sb.append(", function: ");
        return B0.i(sb, this.f5746c, " )");
    }

    public C0433a(String str, String str2, String str3) {
        this.f5744a = str;
        this.f5745b = str2;
        this.f5746c = str3;
    }
}
