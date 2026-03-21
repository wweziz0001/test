package w1;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: renamed from: w1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0944d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10488a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        f10488a = new Object();
    }
}
