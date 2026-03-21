package Q2;

import Z1.s;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class d extends s {
    @Override // Z1.s
    public final String A() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override // Z1.s
    public final Cipher B() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    @Override // Z1.s
    public final int F() {
        return 12;
    }

    @Override // Z1.s
    public final AlgorithmParameterSpec G(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }
}
