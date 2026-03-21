package androidx.datastore.preferences.protobuf;

import b3.AbstractC0307a;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0214f extends C0215g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4142q;

    public C0214f(byte[] bArr, int i, int i5) {
        super(bArr);
        C0215g.g(i, i + i5, bArr.length);
        this.f4141p = i;
        this.f4142q = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.C0215g
    public final byte f(int i) {
        int i5 = this.f4142q;
        if (((i5 - (i + 1)) | i) >= 0) {
            return this.f4147m[this.f4141p + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0307a.i("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0307a.g(i, i5, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0215g
    public final void i(int i, byte[] bArr) {
        System.arraycopy(this.f4147m, this.f4141p, bArr, 0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.C0215g
    public final int j() {
        return this.f4141p;
    }

    @Override // androidx.datastore.preferences.protobuf.C0215g
    public final byte k(int i) {
        return this.f4147m[this.f4141p + i];
    }

    @Override // androidx.datastore.preferences.protobuf.C0215g
    public final int size() {
        return this.f4142q;
    }
}
