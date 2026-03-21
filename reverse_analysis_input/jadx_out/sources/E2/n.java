package E2;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f669a = new a(3);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f669a.get()).nextBytes(bArr);
        return bArr;
    }
}
