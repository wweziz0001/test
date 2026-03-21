package Q2;

import Z1.l;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import b3.AbstractC0307a;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l {
    @Override // Z1.l
    public final String C() {
        return ((Context) this.f3021m).getPackageName() + ".FlutterSecureStoragePluginKeyOAEP";
    }

    @Override // Z1.l
    public final AlgorithmParameterSpec R() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }

    @Override // Z1.l
    public final Cipher T() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
    }

    @Override // Z1.l
    public final KeyGenParameterSpec V(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f3020l;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(AbstractC0307a.j("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
