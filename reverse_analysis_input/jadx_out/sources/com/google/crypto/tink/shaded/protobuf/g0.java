package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0218j;
import androidx.datastore.preferences.protobuf.C0219k;
import androidx.datastore.preferences.protobuf.C0232y;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static f0 a(Object obj) {
        AbstractC0342w abstractC0342w = (AbstractC0342w) obj;
        f0 f0Var = abstractC0342w.unknownFields;
        if (f0Var != f0.f5195f) {
            return f0Var;
        }
        f0 f0VarC = f0.c();
        abstractC0342w.unknownFields = f0VarC;
        return f0VarC;
    }

    public static void b(Object obj) {
        ((AbstractC0342w) obj).unknownFields.f5200e = false;
    }

    public static boolean c(Object obj, C0219k c0219k) throws C0232y, C {
        int i = c0219k.f4172b;
        int i5 = i >>> 3;
        int i6 = i & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) c0219k.f4175e;
        if (i6 == 0) {
            c0219k.R(0);
            ((f0) obj).d(i5 << 3, Long.valueOf(abstractC0218j.v()));
            return true;
        }
        if (i6 == 1) {
            c0219k.R(1);
            ((f0) obj).d((i5 << 3) | 1, Long.valueOf(abstractC0218j.s()));
            return true;
        }
        if (i6 == 2) {
            ((f0) obj).d((i5 << 3) | 2, c0219k.j());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 5) {
                throw C.c();
            }
            c0219k.R(5);
            ((f0) obj).d((i5 << 3) | 5, Integer.valueOf(abstractC0218j.r()));
            return true;
        }
        f0 f0VarC = f0.c();
        int i7 = i5 << 3;
        int i8 = i7 | 4;
        while (c0219k.b() != Integer.MAX_VALUE && c(f0VarC, c0219k)) {
        }
        if (i8 != c0219k.f4172b) {
            throw new C("Protocol message end-group tag did not match expected tag.");
        }
        f0VarC.f5200e = false;
        ((f0) obj).d(i7 | 3, f0VarC);
        return true;
    }
}
