package androidx.datastore.preferences.protobuf;

import a.AbstractC0149a;
import com.google.crypto.tink.shaded.protobuf.C0328h;
import com.google.crypto.tink.shaded.protobuf.C0330j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import t2.AbstractC0860a;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0218j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4169b;

    public static int d(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long e(long j5) {
        return (-(j5 & 1)) ^ (j5 >>> 1);
    }

    public static C0330j h(byte[] bArr, int i, int i5, boolean z4) {
        C0330j c0330j = new C0330j(bArr, i, i5, z4);
        try {
            c0330j.l(i5);
            return c0330j;
        } catch (com.google.crypto.tink.shaded.protobuf.C e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i);

    public void G() {
        int iC;
        do {
            iC = C();
            if (iC == 0) {
                return;
            }
            int i = this.f4168a;
            if (i >= 100) {
                throw new C0233z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f4168a = i + 1;
            this.f4168a--;
        } while (F(iC));
    }

    public ByteBuffer a(int i, byte[] bArr) {
        int[] iArrC = c(AbstractC0860a.c(bArr), i);
        int[] iArr = (int[]) iArrC.clone();
        AbstractC0860a.b(iArr);
        for (int i5 = 0; i5 < iArrC.length; i5++) {
            iArrC[i5] = iArrC[i5] + iArr[i5];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public abstract void b(int i);

    public abstract int[] c(int[] iArr, int i);

    public abstract int f();

    public abstract boolean g();

    public abstract int i();

    public abstract void j(int i);

    public void k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != i()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + i());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i5 = i + 1;
        for (int i6 = 0; i6 < i5; i6++) {
            ByteBuffer byteBufferA = a(this.f4168a + i6, bArr);
            if (i6 == i) {
                AbstractC0149a.M(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                AbstractC0149a.M(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int l(int i);

    public abstract boolean m();

    public abstract C0215g n();

    public abstract C0328h o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
