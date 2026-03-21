package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f4570a;

    public B(int i, String str, int i5) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f4570a = new E(i, str, i5);
            return;
        }
        D d5 = new D(i, str, i5);
        S2.b.o(i, str, i5);
        this.f4570a = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        return this.f4570a.equals(((B) obj).f4570a);
    }

    public final int hashCode() {
        return this.f4570a.hashCode();
    }

    public B(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                this.f4570a = new D(remoteUserInfo.getPid(), remoteUserInfo.getPackageName(), remoteUserInfo.getUid());
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
