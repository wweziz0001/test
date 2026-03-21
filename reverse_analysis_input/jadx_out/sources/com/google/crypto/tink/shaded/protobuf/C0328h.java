package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0212d;
import java.util.Iterator;
import m.B0;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0328h extends AbstractC0329i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f5203o;

    public C0328h(byte[] bArr) {
        this.f5207l = 0;
        bArr.getClass();
        this.f5203o = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0329i) || size() != ((AbstractC0329i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0328h)) {
            return obj.equals(this);
        }
        C0328h c0328h = (C0328h) obj;
        int i = this.f5207l;
        int i5 = c0328h.f5207l;
        if (i != 0 && i5 != 0 && i != i5) {
            return false;
        }
        int size = size();
        if (size > c0328h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0328h.size()) {
            StringBuilder sbJ = B0.j(size, "Ran off end of other: 0, ", ", ");
            sbJ.append(c0328h.size());
            throw new IllegalArgumentException(sbJ.toString());
        }
        int iK = k() + size;
        int iK2 = k();
        int iK3 = c0328h.k();
        while (iK2 < iK) {
            if (this.f5203o[iK2] != c0328h.f5203o[iK3]) {
                return false;
            }
            iK2++;
            iK3++;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0329i
    public byte f(int i) {
        return this.f5203o[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0329i
    public void i(int i, byte[] bArr) {
        System.arraycopy(this.f5203o, 0, bArr, 0, i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0212d(this);
    }

    public int k() {
        return 0;
    }

    public byte l(int i) {
        return this.f5203o[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0329i
    public int size() {
        return this.f5203o.length;
    }
}
