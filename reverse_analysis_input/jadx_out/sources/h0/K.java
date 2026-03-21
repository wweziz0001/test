package h0;

import d0.AbstractC0360m;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5981e;

    public K(int i) {
        this.f5977a = i;
        byte[] bArr = new byte[131];
        this.f5981e = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i5) {
        if (this.f5978b) {
            int i6 = i5 - i;
            byte[] bArr2 = (byte[]) this.f5981e;
            int length = bArr2.length;
            int i7 = this.f5980d;
            if (length < i7 + i6) {
                this.f5981e = Arrays.copyOf(bArr2, (i7 + i6) * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f5981e, this.f5980d, i6);
            this.f5980d += i6;
        }
    }

    public boolean b(int i) {
        if (!this.f5978b) {
            return false;
        }
        this.f5980d -= i;
        this.f5978b = false;
        this.f5979c = true;
        return true;
    }

    public void c(int i) {
        this.f5978b |= i > 0;
        this.f5977a += i;
    }

    public void d() {
        this.f5978b = false;
        this.f5979c = false;
    }

    public void e(int i) {
        AbstractC0360m.h(!this.f5978b);
        boolean z4 = i == this.f5977a;
        this.f5978b = z4;
        if (z4) {
            this.f5980d = 3;
            this.f5979c = false;
        }
    }

    public K(i0 i0Var) {
        this.f5981e = i0Var;
    }
}
