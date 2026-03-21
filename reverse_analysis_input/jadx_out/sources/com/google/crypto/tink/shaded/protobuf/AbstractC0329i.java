package com.google.crypto.tink.shaded.protobuf;

import a.AbstractC0149a;
import b3.AbstractC0307a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import m.B0;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0329i implements Iterable, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0328h f5205m = new C0328h(A.f5129b);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0326f f5206n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5207l;

    static {
        f5206n = AbstractC0323c.a() ? new C0326f(1) : new C0326f(0);
    }

    public static int g(int i, int i5, int i6) {
        int i7 = i5 - i;
        if ((i | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC0307a.h(i, "Beginning index: ", " < 0"));
        }
        if (i5 < i) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0307a.g(i5, i6, "End index: ", " >= "));
    }

    public static C0328h h(byte[] bArr, int i, int i5) {
        byte[] bArrCopyOfRange;
        g(i, i + i5, bArr.length);
        switch (f5206n.f5194a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i5 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i5];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i5);
                break;
        }
        return new C0328h(bArrCopyOfRange);
    }

    public abstract byte f(int i);

    public final int hashCode() {
        int i = this.f5207l;
        if (i == 0) {
            int size = size();
            C0328h c0328h = (C0328h) this;
            int iK = c0328h.k();
            int i5 = size;
            for (int i6 = iK; i6 < iK + size; i6++) {
                i5 = (i5 * 31) + c0328h.f5203o[i6];
            }
            i = i5 == 0 ? 1 : i5;
            this.f5207l = i;
        }
        return i;
    }

    public abstract void i(int i, byte[] bArr);

    public final byte[] j() {
        int size = size();
        if (size == 0) {
            return A.f5129b;
        }
        byte[] bArr = new byte[size];
        i(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        C0328h c0327g;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC0149a.r(this);
        } else {
            StringBuilder sb = new StringBuilder();
            C0328h c0328h = (C0328h) this;
            int iG = g(0, 47, c0328h.size());
            if (iG == 0) {
                c0327g = f5205m;
            } else {
                c0327g = new C0327g(c0328h.f5203o, c0328h.k(), iG);
            }
            sb.append(AbstractC0149a.r(c0327g));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return B0.i(sb2, string, "\">");
    }
}
