package androidx.activity;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f3746l;

    public h(m mVar) {
        this.f3746l = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e5) {
            if (!TextUtils.equals(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e5;
            }
        } catch (NullPointerException e6) {
            if (!TextUtils.equals(e6.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e6;
            }
        }
    }
}
