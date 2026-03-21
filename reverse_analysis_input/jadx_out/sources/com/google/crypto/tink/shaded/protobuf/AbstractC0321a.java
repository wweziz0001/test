package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0321a implements Q {
    protected int memoizedHashCode;

    public abstract int b(c0 c0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract AbstractC0340u d();

    public final byte[] e() {
        try {
            int iB = ((AbstractC0342w) this).b(null);
            byte[] bArr = new byte[iB];
            C0332l c0332l = new C0332l(iB, bArr);
            f(c0332l);
            if (iB - c0332l.f5228t == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e5) {
            throw new RuntimeException(c("byte array"), e5);
        }
    }

    public abstract void f(C0332l c0332l);
}
