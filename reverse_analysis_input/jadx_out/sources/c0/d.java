package c0;

import android.os.Bundle;
import android.text.Spanned;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f5014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5015e;

    static {
        int i = AbstractC0370w.f5326a;
        f5011a = Integer.toString(0, 36);
        f5012b = Integer.toString(1, 36);
        f5013c = Integer.toString(2, 36);
        f5014d = Integer.toString(3, 36);
        f5015e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f5011a, spanned.getSpanStart(obj));
        bundle2.putInt(f5012b, spanned.getSpanEnd(obj));
        bundle2.putInt(f5013c, spanned.getSpanFlags(obj));
        bundle2.putInt(f5014d, i);
        if (bundle != null) {
            bundle2.putBundle(f5015e, bundle);
        }
        return bundle2;
    }
}
