package n0;

import android.net.Uri;
import f0.C0415j;
import f0.C0417l;
import f0.InterfaceC0403A;
import f0.InterfaceC0413h;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: n0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0685a implements InterfaceC0413h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0413h f8748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f8749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f8750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CipherInputStream f8751o;

    public C0685a(InterfaceC0413h interfaceC0413h, byte[] bArr, byte[] bArr2) {
        this.f8748l = interfaceC0413h;
        this.f8749m = bArr;
        this.f8750n = bArr2;
    }

    @Override // f0.InterfaceC0413h
    public final void b(InterfaceC0403A interfaceC0403A) {
        interfaceC0403A.getClass();
        this.f8748l.b(interfaceC0403A);
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
        if (this.f8751o != null) {
            this.f8751o = null;
            this.f8748l.close();
        }
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f8749m, "AES"), new IvParameterSpec(this.f8750n));
                C0415j c0415j = new C0415j(this.f8748l, c0417l);
                this.f8751o = new CipherInputStream(c0415j, cipher);
                if (c0415j.f5677o) {
                    return -1L;
                }
                c0415j.f5674l.p(c0415j.f5675m);
                c0415j.f5677o = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e5) {
                throw new RuntimeException(e5);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        return this.f8748l.r();
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) throws IOException {
        this.f8751o.getClass();
        int i6 = this.f8751o.read(bArr, i, i5);
        if (i6 < 0) {
            return -1;
        }
        return i6;
    }

    @Override // f0.InterfaceC0413h
    public final Map y() {
        return this.f8748l.y();
    }
}
