package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static c0 a(Object obj) {
        AbstractC0229v abstractC0229v = (AbstractC0229v) obj;
        c0 c0Var = abstractC0229v.unknownFields;
        if (c0Var != c0.f4130f) {
            return c0Var;
        }
        c0 c0Var2 = new c0(0, new int[8], new Object[8], true);
        abstractC0229v.unknownFields = c0Var2;
        return c0Var2;
    }

    public static void b(Object obj) {
        c0 c0Var = ((AbstractC0229v) obj).unknownFields;
        if (c0Var.f4135e) {
            c0Var.f4135e = false;
        }
    }

    public static boolean c(int i, C0219k c0219k, Object obj) throws C0233z, com.google.crypto.tink.shaded.protobuf.B {
        int i5 = c0219k.f4172b;
        int i6 = i5 >>> 3;
        int i7 = i5 & 7;
        AbstractC0218j abstractC0218j = (AbstractC0218j) c0219k.f4175e;
        if (i7 == 0) {
            c0219k.R(0);
            ((c0) obj).c(i6 << 3, Long.valueOf(abstractC0218j.v()));
            return true;
        }
        if (i7 == 1) {
            c0219k.R(1);
            ((c0) obj).c((i6 << 3) | 1, Long.valueOf(abstractC0218j.s()));
            return true;
        }
        if (i7 == 2) {
            ((c0) obj).c((i6 << 3) | 2, c0219k.i());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw C0233z.b();
            }
            c0219k.R(5);
            ((c0) obj).c(5 | (i6 << 3), Integer.valueOf(abstractC0218j.r()));
            return true;
        }
        c0 c0Var = new c0(0, new int[8], new Object[8], true);
        int i8 = i6 << 3;
        int i9 = i8 | 4;
        int i10 = i + 1;
        if (i10 >= 100) {
            throw new C0233z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0219k.b() != Integer.MAX_VALUE && c(i10, c0219k, c0Var)) {
        }
        if (i9 != c0219k.f4172b) {
            throw new C0233z("Protocol message end-group tag did not match expected tag.");
        }
        if (c0Var.f4135e) {
            c0Var.f4135e = false;
        }
        ((c0) obj).c(i8 | 3, c0Var);
        return true;
    }
}
