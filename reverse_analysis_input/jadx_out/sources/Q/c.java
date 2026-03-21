package Q;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes.dex */
public final class c extends A0.b {
    @Override // A0.b
    public final Signature[] q(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
