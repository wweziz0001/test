package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0222n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0222n f4185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0222n f4186b;

    static {
        C0222n c0222n = new C0222n();
        Collections.emptyMap();
        f4186b = c0222n;
    }

    public static C0222n a() {
        S s4 = S.f4099c;
        C0222n c0222n = f4185a;
        if (c0222n == null) {
            synchronized (C0222n.class) {
                try {
                    c0222n = f4185a;
                    if (c0222n == null) {
                        Class cls = AbstractC0221m.f4184a;
                        C0222n c0222n2 = null;
                        if (cls != null) {
                            try {
                                c0222n2 = (C0222n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0222n2 == null) {
                            c0222n2 = f4186b;
                        }
                        f4185a = c0222n2;
                        c0222n = c0222n2;
                    }
                } finally {
                }
            }
        }
        return c0222n;
    }
}
