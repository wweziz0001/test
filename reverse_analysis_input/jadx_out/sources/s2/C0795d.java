package s2;

import a.AbstractC0149a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import r2.InterfaceC0781a;

/* JADX INFO: renamed from: s2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0795d implements InterfaceC0781a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.s f9615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.b f9616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.b f9617c;

    public C0795d(Z1.s sVar) {
        this.f9615a = sVar;
        boolean zIsEmpty = ((B2.a) sVar.f3087o).f263a.isEmpty();
        p1.b bVar = y2.o.f10960a;
        if (zIsEmpty) {
            this.f9616b = bVar;
            this.f9617c = bVar;
            return;
        }
        y2.e eVar = (y2.e) y2.f.f10939b.f10941a.get();
        eVar = eVar == null ? y2.f.f10940c : eVar;
        y2.o.a(sVar);
        eVar.getClass();
        this.f9616b = bVar;
        this.f9617c = bVar;
    }

    @Override // r2.InterfaceC0781a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        p1.b bVar = this.f9616b;
        Z1.s sVar = this.f9615a;
        try {
            byte[] bArr3 = ((r2.k) sVar.f3086n).f9537c;
            byte[] bArrJ = AbstractC0149a.j(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((InterfaceC0781a) ((r2.k) sVar.f3086n).f9536b).a(bArr, bArr2));
            int i = ((r2.k) sVar.f3086n).f9540f;
            int length = bArr.length;
            bVar.getClass();
            return bArrJ;
        } catch (GeneralSecurityException e5) {
            bVar.getClass();
            throw e5;
        }
    }

    @Override // r2.InterfaceC0781a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        Z1.s sVar = this.f9615a;
        p1.b bVar = this.f9617c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = sVar.H(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((InterfaceC0781a) ((r2.k) it.next()).f9536b).b(bArrCopyOfRange, bArr2);
                    bVar.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e5) {
                    C0796e.f9618a.info("ciphertext prefix matches a key, but cannot decrypt: " + e5);
                }
            }
        }
        Iterator it2 = sVar.H(r2.b.f9523a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((InterfaceC0781a) ((r2.k) it2.next()).f9536b).b(bArr, bArr2);
                bVar.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        bVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
