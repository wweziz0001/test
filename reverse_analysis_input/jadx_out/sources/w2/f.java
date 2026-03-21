package w2;

import Z1.s;
import a.AbstractC0149a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import r2.k;
import y2.o;

/* JADX INFO: loaded from: classes.dex */
public final class f implements r2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f10500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.b f10501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.b f10502c;

    public f(s sVar) {
        this.f10500a = sVar;
        boolean zIsEmpty = ((B2.a) sVar.f3087o).f263a.isEmpty();
        p1.b bVar = o.f10960a;
        if (zIsEmpty) {
            this.f10501b = bVar;
            this.f10502c = bVar;
            return;
        }
        y2.e eVar = (y2.e) y2.f.f10939b.f10941a.get();
        eVar = eVar == null ? y2.f.f10940c : eVar;
        o.a(sVar);
        eVar.getClass();
        this.f10501b = bVar;
        this.f10502c = bVar;
    }

    @Override // r2.c
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        p1.b bVar = this.f10501b;
        s sVar = this.f10500a;
        try {
            byte[] bArr3 = ((k) sVar.f3086n).f9537c;
            byte[] bArrJ = AbstractC0149a.j(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((r2.c) ((k) sVar.f3086n).f9536b).a(bArr, bArr2));
            int i = ((k) sVar.f3086n).f9540f;
            bVar.getClass();
            return bArrJ;
        } catch (GeneralSecurityException e5) {
            bVar.getClass();
            throw e5;
        }
    }

    @Override // r2.c
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        s sVar = this.f10500a;
        p1.b bVar = this.f10502c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = sVar.H(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((r2.c) ((k) it.next()).f9536b).b(bArrCopyOfRange, bArr2);
                    bVar.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e5) {
                    g.f10503a.info("ciphertext prefix matches a key, but cannot decrypt: " + e5);
                }
            }
        }
        Iterator it2 = sVar.H(r2.b.f9523a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((r2.c) ((k) it2.next()).f9536b).b(bArr, bArr2);
                bVar.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        bVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
