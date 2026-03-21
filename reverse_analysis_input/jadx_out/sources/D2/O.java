package D2;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0344y;

/* JADX INFO: loaded from: classes.dex */
public enum O implements InterfaceC0344y {
    f553m(0),
    f554n(1),
    f555o(2),
    f556p(3),
    f557q(4),
    f558r(5),
    f559s(-1);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f561l;

    O(int i) {
        this.f561l = i;
    }

    public final int a() {
        if (this != f559s) {
            return this.f561l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
