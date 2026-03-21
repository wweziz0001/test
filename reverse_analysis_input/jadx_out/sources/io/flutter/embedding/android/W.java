package io.flutter.embedding.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W f6558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final W f6559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ W[] f6560n;

    static {
        W w4 = new W("opaque", 0);
        f6558l = w4;
        W w5 = new W("transparent", 1);
        f6559m = w5;
        f6560n = new W[]{w4, w5};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f6560n.clone();
    }
}
