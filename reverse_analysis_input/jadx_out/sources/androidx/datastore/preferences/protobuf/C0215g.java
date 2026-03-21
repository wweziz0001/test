package androidx.datastore.preferences.protobuf;

import a.AbstractC0149a;
import b3.AbstractC0307a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import m.B0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0215g implements Iterable, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0215g f4144n = new C0215g(AbstractC0231x.f4218b);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0213e f4145o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4146l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f4147m;

    static {
        f4145o = AbstractC0211c.a() ? new C0213e(1) : new C0213e(0);
    }

    public C0215g(byte[] bArr) {
        bArr.getClass();
        this.f4147m = bArr;
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

    public static C0215g h(byte[] bArr, int i, int i5) {
        byte[] bArrCopyOfRange;
        g(i, i + i5, bArr.length);
        switch (f4145o.f4140a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i5 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i5];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i5);
                break;
        }
        return new C0215g(bArrCopyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0215g) || size() != ((C0215g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0215g)) {
            return obj.equals(this);
        }
        C0215g c0215g = (C0215g) obj;
        int i = this.f4146l;
        int i5 = c0215g.f4146l;
        if (i != 0 && i5 != 0 && i != i5) {
            return false;
        }
        int size = size();
        if (size > c0215g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0215g.size()) {
            StringBuilder sbJ = B0.j(size, "Ran off end of other: 0, ", ", ");
            sbJ.append(c0215g.size());
            throw new IllegalArgumentException(sbJ.toString());
        }
        int iJ = j() + size;
        int iJ2 = j();
        int iJ3 = c0215g.j();
        while (iJ2 < iJ) {
            if (this.f4147m[iJ2] != c0215g.f4147m[iJ3]) {
                return false;
            }
            iJ2++;
            iJ3++;
        }
        return true;
    }

    public byte f(int i) {
        return this.f4147m[i];
    }

    public final int hashCode() {
        int i = this.f4146l;
        if (i == 0) {
            int size = size();
            int iJ = j();
            int i5 = size;
            for (int i6 = iJ; i6 < iJ + size; i6++) {
                i5 = (i5 * 31) + this.f4147m[i6];
            }
            i = i5 == 0 ? 1 : i5;
            this.f4146l = i;
        }
        return i;
    }

    public void i(int i, byte[] bArr) {
        System.arraycopy(this.f4147m, 0, bArr, 0, i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0212d(this);
    }

    public int j() {
        return 0;
    }

    public byte k(int i) {
        return this.f4147m[i];
    }

    public int size() {
        return this.f4147m.length;
    }

    public final String toString() {
        C0215g c0214f;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC0149a.q(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iG = g(0, 47, size());
            if (iG == 0) {
                c0214f = f4144n;
            } else {
                c0214f = new C0214f(this.f4147m, j(), iG);
            }
            sb.append(AbstractC0149a.q(c0214f));
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
