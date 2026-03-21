package io.flutter.embedding.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final S f6546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final S f6547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ S[] f6548n;

    static {
        S s4 = new S("surface", 0);
        f6546l = s4;
        S s5 = new S("texture", 1);
        f6547m = s5;
        f6548n = new S[]{s4, s5, new S("image", 2)};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) f6548n.clone();
    }
}
