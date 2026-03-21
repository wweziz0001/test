package F2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f860a;

    public a(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f860a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f860a, this.f860a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f860a);
    }

    public final String toString() {
        return "Bytes(" + i4.a.s(this.f860a) + ")";
    }
}
