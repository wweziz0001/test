package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0270l {
    public static EnumC0272n a(EnumC0273o enumC0273o) {
        N3.h.e(enumC0273o, "state");
        int iOrdinal = enumC0273o.ordinal();
        if (iOrdinal == 2) {
            return EnumC0272n.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC0272n.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC0272n.ON_PAUSE;
    }

    public static EnumC0272n b(EnumC0273o enumC0273o) {
        N3.h.e(enumC0273o, "state");
        int iOrdinal = enumC0273o.ordinal();
        if (iOrdinal == 1) {
            return EnumC0272n.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0272n.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0272n.ON_RESUME;
    }
}
