package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0335o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0335o f5232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0335o f5233b;

    static {
        C0335o c0335o = new C0335o();
        Collections.emptyMap();
        f5233b = c0335o;
    }

    public static C0335o a() {
        C0335o c0335o = f5232a;
        if (c0335o == null) {
            synchronized (C0335o.class) {
                try {
                    c0335o = f5232a;
                    if (c0335o == null) {
                        Class cls = AbstractC0334n.f5230a;
                        C0335o c0335o2 = null;
                        if (cls != null) {
                            try {
                                c0335o2 = (C0335o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0335o2 == null) {
                            c0335o2 = f5233b;
                        }
                        f5232a = c0335o2;
                        c0335o = c0335o2;
                    }
                } finally {
                }
            }
        }
        return c0335o;
    }
}
