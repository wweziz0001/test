package z2;

import D2.r0;
import Z1.s;
import a.AbstractC0149a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o implements r2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f11183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.b f11184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.b f11185c;

    public o(s sVar) {
        this.f11183a = sVar;
        boolean zIsEmpty = ((B2.a) sVar.f3087o).f263a.isEmpty();
        p1.b bVar = y2.o.f10960a;
        if (zIsEmpty) {
            this.f11184b = bVar;
            this.f11185c = bVar;
            return;
        }
        y2.e eVar = (y2.e) y2.f.f10939b.f10941a.get();
        eVar = eVar == null ? y2.f.f10940c : eVar;
        y2.o.a(sVar);
        eVar.getClass();
        this.f11184b = bVar;
        this.f11185c = bVar;
    }

    @Override // r2.j
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        p1.b bVar = this.f11185c;
        if (length <= 5) {
            bVar.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        s sVar = this.f11183a;
        for (r2.k kVar : sVar.H(bArrCopyOf)) {
            byte[] bArrJ = kVar.f9539e.equals(r0.f579o) ? AbstractC0149a.j(bArr2, p.f11187b) : bArr2;
            try {
                ((r2.j) kVar.f9536b).a(bArrCopyOfRange, bArrJ);
                int length2 = bArrJ.length;
                bVar.getClass();
                return;
            } catch (GeneralSecurityException e5) {
                p.f11186a.info("tag prefix matches a key, but cannot verify: " + e5);
            }
        }
        Iterator it = sVar.H(r2.b.f9523a).iterator();
        while (it.hasNext()) {
            try {
                ((r2.j) ((r2.k) it.next()).f9536b).a(bArr, bArr2);
                int length3 = bArr2.length;
                bVar.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        bVar.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // r2.j
    public final byte[] b(byte[] bArr) throws GeneralSecurityException {
        p1.b bVar = this.f11184b;
        s sVar = this.f11183a;
        if (((r2.k) sVar.f3086n).f9539e.equals(r0.f579o)) {
            bArr = AbstractC0149a.j(bArr, p.f11187b);
        }
        try {
            byte[] bArr2 = ((r2.k) sVar.f3086n).f9537c;
            byte[] bArrJ = AbstractC0149a.j(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((r2.j) ((r2.k) sVar.f3086n).f9536b).b(bArr));
            int i = ((r2.k) sVar.f3086n).f9540f;
            int length = bArr.length;
            bVar.getClass();
            return bArrJ;
        } catch (GeneralSecurityException e5) {
            bVar.getClass();
            throw e5;
        }
    }
}
