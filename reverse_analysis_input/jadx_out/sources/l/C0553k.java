package l;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0553k implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0555m f7781l;

    public C0553k(C0555m c0555m) {
        this.f7781l = c0555m;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7781l.c();
    }
}
