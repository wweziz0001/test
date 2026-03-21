package E2;

import b3.AbstractC0307a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import m.B0;
import r2.InterfaceC0781a;
import t2.C0861b;
import t2.C0863d;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0781a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f649b;

    public d(int i, byte[] bArr) throws GeneralSecurityException {
        this.f648a = i;
        switch (i) {
            case 1:
                this.f649b = new C0863d(0, bArr);
                return;
            case 2:
                this.f649b = new C0863d(1, bArr);
                return;
            default:
                if (!B0.f(2)) {
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                this.f649b = new C0861b(bArr);
                return;
        }
    }

    @Override // r2.InterfaceC0781a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f648a) {
            case 0:
                byte[] bArrA = n.a(12);
                C0861b c0861b = (C0861b) this.f649b;
                c0861b.getClass();
                if (bArrA.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                boolean z4 = c0861b.f10006b;
                byte[] bArr3 = new byte[z4 ? bArr.length + 28 : bArr.length + 16];
                if (z4) {
                    System.arraycopy(bArrA, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecA = C0861b.a(bArrA);
                a aVar = C0861b.f10004c;
                ((Cipher) aVar.get()).init(1, c0861b.f10005a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) aVar.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, z4 ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(AbstractC0307a.h(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = n.a(12);
                byteBufferAllocate.put(bArrA2);
                ((C0863d) this.f649b).b(byteBufferAllocate, bArrA2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = n.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((C0863d) this.f649b).b(byteBufferAllocate2, bArrA3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // r2.InterfaceC0781a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f648a) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                C0861b c0861b = (C0861b) this.f649b;
                c0861b.getClass();
                if (bArrCopyOf.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                boolean z4 = c0861b.f10006b;
                if (bArr.length < (z4 ? 28 : 16)) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (z4 && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec algorithmParameterSpecA = C0861b.a(bArrCopyOf);
                a aVar = C0861b.f10004c;
                ((Cipher) aVar.get()).init(2, c0861b.f10005a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) aVar.get()).updateAAD(bArr2);
                }
                int i = z4 ? 12 : 0;
                int length = bArr.length;
                if (z4) {
                    length -= 12;
                }
                return ((Cipher) aVar.get()).doFinal(bArr, i, length);
            case 1:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((C0863d) this.f649b).a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((C0863d) this.f649b).a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }
}
