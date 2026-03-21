package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import m.I;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TypedValue f3868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TypedValue f3869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TypedValue f3870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TypedValue f3871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TypedValue f3872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TypedValue f3873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f3874r;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3874r = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3872p == null) {
            this.f3872p = new TypedValue();
        }
        return this.f3872p;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3873q == null) {
            this.f3873q = new TypedValue();
        }
        return this.f3873q;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3870n == null) {
            this.f3870n = new TypedValue();
        }
        return this.f3870n;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3871o == null) {
            this.f3871o = new TypedValue();
        }
        return this.f3871o;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3868l == null) {
            this.f3868l = new TypedValue();
        }
        return this.f3868l;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3869m == null) {
            this.f3869m = new TypedValue();
        }
        return this.f3869m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(I i) {
    }
}
