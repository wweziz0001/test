package l1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f8017f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f8022e;

    public final void a(byte[] bArr, int i, int i5) {
        if (this.f8018a) {
            int i6 = i5 - i;
            byte[] bArr2 = this.f8022e;
            int length = bArr2.length;
            int i7 = this.f8020c + i6;
            if (length < i7) {
                this.f8022e = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i, this.f8022e, this.f8020c, i6);
            this.f8020c += i6;
        }
    }
}
