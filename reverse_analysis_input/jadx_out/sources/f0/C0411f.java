package f0;

import a0.C0157H;
import android.net.Uri;
import android.util.Base64;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: f0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0411f extends AbstractC0408c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0417l f5668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f5669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5671s;

    @Override // f0.InterfaceC0413h
    public final void close() {
        if (this.f5669q != null) {
            this.f5669q = null;
            c();
        }
        this.f5668p = null;
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) throws C0157H, C0414i {
        d();
        this.f5668p = c0417l;
        Uri uriNormalizeScheme = c0417l.f5686a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC0360m.b("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = AbstractC0370w.f5326a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new C0157H("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f5669q = Base64.decode(str, 0);
            } catch (IllegalArgumentException e5) {
                throw new C0157H(AbstractC0307a.j("Error while parsing Base64 encoded string: ", str), e5, true, 0);
            }
        } else {
            this.f5669q = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        byte[] bArr = this.f5669q;
        long length = bArr.length;
        long j5 = c0417l.f5690e;
        if (j5 > length) {
            this.f5669q = null;
            throw new C0414i(2008);
        }
        int i5 = (int) j5;
        this.f5670r = i5;
        int length2 = bArr.length - i5;
        this.f5671s = length2;
        long j6 = c0417l.f5691f;
        if (j6 != -1) {
            this.f5671s = (int) Math.min(length2, j6);
        }
        i(c0417l);
        return j6 != -1 ? j6 : this.f5671s;
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        C0417l c0417l = this.f5668p;
        if (c0417l != null) {
            return c0417l.f5686a;
        }
        return null;
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f5671s;
        if (i6 == 0) {
            return -1;
        }
        int iMin = Math.min(i5, i6);
        byte[] bArr2 = this.f5669q;
        int i7 = AbstractC0370w.f5326a;
        System.arraycopy(bArr2, this.f5670r, bArr, i, iMin);
        this.f5670r += iMin;
        this.f5671s -= iMin;
        a(iMin);
        return iMin;
    }
}
