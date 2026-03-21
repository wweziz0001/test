package m3;

import android.util.DisplayMetrics;

/* JADX INFO: renamed from: m3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0677k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f8719c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f8721b;

    public C0677k(DisplayMetrics displayMetrics) {
        int i = f8719c;
        f8719c = i + 1;
        this.f8720a = i;
        this.f8721b = displayMetrics;
    }
}
