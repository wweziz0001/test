package com.google.crypto.tink.shaded.protobuf;

import b3.AbstractC0307a;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0327g extends C0328h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5202q;

    public C0327g(byte[] bArr, int i, int i5) {
        super(bArr);
        AbstractC0329i.g(i, i + i5, bArr.length);
        this.f5201p = i;
        this.f5202q = i5;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0328h, com.google.crypto.tink.shaded.protobuf.AbstractC0329i
    public final byte f(int i) {
        int i5 = this.f5202q;
        if (((i5 - (i + 1)) | i) >= 0) {
            return this.f5203o[this.f5201p + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0307a.i("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0307a.g(i, i5, "Index > length: ", ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0328h, com.google.crypto.tink.shaded.protobuf.AbstractC0329i
    public final void i(int i, byte[] bArr) {
        System.arraycopy(this.f5203o, this.f5201p, bArr, 0, i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0328h
    public final int k() {
        return this.f5201p;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0328h
    public final byte l(int i) {
        return this.f5203o[this.f5201p + i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0328h, com.google.crypto.tink.shaded.protobuf.AbstractC0329i
    public final int size() {
        return this.f5202q;
    }
}
