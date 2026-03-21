package d1;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import c0.C0317b;

/* JADX INFO: renamed from: d1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0374d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A.c f5376c = new A.c(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0317b f5377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5378b;

    public C0374d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f2, int i, float f5, int i5, boolean z4, int i6, int i7) {
        boolean z5;
        int i8;
        if (z4) {
            i8 = i6;
            z5 = true;
        } else {
            z5 = false;
            i8 = -16777216;
        }
        this.f5377a = new C0317b(spannableStringBuilder, alignment, null, null, f2, 0, i, f5, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z5, i8, Integer.MIN_VALUE, 0.0f);
        this.f5378b = i7;
    }
}
