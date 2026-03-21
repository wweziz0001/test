package l1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f7996e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f8000d;

    public final void a(byte[] bArr, int i, int i5) {
        if (this.f7997a) {
            int i6 = i5 - i;
            byte[] bArr2 = this.f8000d;
            int length = bArr2.length;
            int i7 = this.f7998b + i6;
            if (length < i7) {
                this.f8000d = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i, this.f8000d, this.f7998b, i6);
            this.f7998b += i6;
        }
    }
}
