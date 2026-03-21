package m;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8304b;

    public P0(P0 p02) {
        super((ViewGroup.MarginLayoutParams) p02);
        this.f8303a = 0;
        this.f8303a = p02.f8303a;
    }

    public P0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f8303a = 0;
    }
}
