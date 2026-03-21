package D0;

import a0.d0;
import android.util.Base64;
import h0.C0462m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements l2.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f472l;

    @Override // l2.h
    public final Object get() {
        switch (this.f472l) {
            case 0:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (d0) objInvoke;
                } catch (Exception e5) {
                    throw new IllegalStateException(e5);
                }
            case 1:
                return new C0462m(new B0.f(), 50000, 50000, 2500, 5000, -1, false, 0);
            case 2:
                byte[] bArr = new byte[12];
                i0.e.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                throw new IllegalStateException();
        }
    }
}
