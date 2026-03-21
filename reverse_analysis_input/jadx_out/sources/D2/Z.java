package D2;

import com.google.crypto.tink.shaded.protobuf.InterfaceC0344y;

/* JADX INFO: loaded from: classes.dex */
public enum Z implements InterfaceC0344y {
    f570m(0),
    f571n(1),
    f572o(2),
    f573p(3),
    f574q(-1);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f576l;

    Z(int i) {
        this.f576l = i;
    }

    public final int a() {
        if (this != f574q) {
            return this.f576l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
