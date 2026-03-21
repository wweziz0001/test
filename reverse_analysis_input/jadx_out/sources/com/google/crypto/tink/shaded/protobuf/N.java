package com.google.crypto.tink.shaded.protobuf;

import b3.AbstractC0307a;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class N {
    public static void a(Object obj) {
        AbstractC0307a.q(obj);
        throw null;
    }

    public static void b(Object obj, Object obj2) {
        M m4 = (M) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (m4.isEmpty()) {
            return;
        }
        Iterator it = m4.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static boolean c(Object obj) {
        return !((M) obj).f5150l;
    }

    public static M d(Object obj, Object obj2) {
        M mC = (M) obj;
        M m4 = (M) obj2;
        if (!m4.isEmpty()) {
            if (!mC.f5150l) {
                mC = mC.c();
            }
            mC.b();
            if (!m4.isEmpty()) {
                mC.putAll(m4);
            }
        }
        return mC;
    }

    public static M e() {
        return M.f5149m.c();
    }

    public static void f(Object obj) {
        ((M) obj).f5150l = false;
    }
}
