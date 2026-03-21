package r1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: r1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0779t extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f9518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9519b;

    public C0779t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9518a = new Rect();
        this.f9519b = true;
    }

    public C0779t(int i, int i5) {
        super(i, i5);
        this.f9518a = new Rect();
        this.f9519b = true;
    }

    public C0779t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f9518a = new Rect();
        this.f9519b = true;
    }

    public C0779t(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9518a = new Rect();
        this.f9519b = true;
    }

    public C0779t(C0779t c0779t) {
        super((ViewGroup.LayoutParams) c0779t);
        this.f9518a = new Rect();
        this.f9519b = true;
    }
}
