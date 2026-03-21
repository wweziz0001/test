package t2;

import E2.o;
import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m.B0;
import y2.s;

/* JADX INFO: renamed from: t2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0861b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E2.a f10004c = new E2.a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10006b;

    public C0861b(byte[] bArr) throws GeneralSecurityException {
        if (!B0.f(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        o.a(bArr.length);
        this.f10005a = new SecretKeySpec(bArr, "AES");
        this.f10006b = true;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        int i = s.f10969a;
        Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        return (numValueOf == null || numValueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, length) : new IvParameterSpec(bArr, 0, length);
    }
}
