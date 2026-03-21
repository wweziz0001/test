package E2;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f637a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f637a) {
            case 0:
                try {
                    return (Cipher) j.f663b.f665a.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
            case 1:
                try {
                    return (Cipher) j.f663b.f665a.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 2:
                try {
                    return (Cipher) j.f663b.f665a.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            case 3:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 4:
                return new Random();
            case 5:
                try {
                    return (Cipher) j.f663b.f665a.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            default:
                try {
                    return (Cipher) j.f663b.f665a.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
        }
    }
}
