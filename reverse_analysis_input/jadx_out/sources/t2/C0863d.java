package t2;

import Q1.C;
import androidx.datastore.preferences.protobuf.AbstractC0218j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;
import m.B0;

/* JADX INFO: renamed from: t2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0863d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0218j f10008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0218j f10009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10010c;

    public C0863d(int i, byte[] bArr) throws GeneralSecurityException {
        this.f10010c = i;
        if (!B0.e(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f10008a = d(1, bArr);
        this.f10009b = d(0, bArr);
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i5 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i5);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public final byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f10009b.a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(C.h(bArr4, c(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            AbstractC0218j abstractC0218j = this.f10008a;
            abstractC0218j.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            abstractC0218j.k(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e5) {
            throw new AEADBadTagException(e5.toString());
        }
    }

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        AbstractC0218j abstractC0218j = this.f10008a;
        abstractC0218j.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        abstractC0218j.k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.f10009b.a(0, bArr).get(bArr4);
        byte[] bArrH = C.h(bArr4, c(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrH);
    }

    public final AbstractC0218j d(int i, byte[] bArr) {
        switch (this.f10010c) {
            case 0:
                return new C0862c(bArr, i, 0);
            default:
                return new C0862c(bArr, i, 1);
        }
    }
}
