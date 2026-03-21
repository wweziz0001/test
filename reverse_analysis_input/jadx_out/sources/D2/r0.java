package D2;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0344y;

/* JADX INFO: loaded from: classes.dex */
public enum r0 implements InterfaceC0344y {
    f577m(0),
    f578n(1),
    f579o(2),
    f580p(3),
    f581q(4),
    f582r(-1);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f584l;

    r0(int i) {
        this.f584l = i;
    }

    public static r0 a(int i) {
        if (i == 0) {
            return f577m;
        }
        if (i == 1) {
            return f578n;
        }
        if (i == 2) {
            return f579o;
        }
        if (i == 3) {
            return f580p;
        }
        if (i != 4) {
            return null;
        }
        return f581q;
    }

    public final int b() {
        if (this != f582r) {
            return this.f584l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
