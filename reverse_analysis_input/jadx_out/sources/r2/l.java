package r2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f9543l;

    public l(byte[] bArr) {
        this.f9543l = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        byte[] bArr = this.f9543l;
        int length = bArr.length;
        byte[] bArr2 = lVar.f9543l;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b4 = bArr[i];
            byte b5 = lVar.f9543l[i];
            if (b4 != b5) {
                return b4 - b5;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Arrays.equals(this.f9543l, ((l) obj).f9543l);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9543l);
    }

    public final String toString() {
        return i4.a.s(this.f9543l);
    }
}
