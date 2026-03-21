package io.flutter.embedding.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: io.flutter.embedding.android.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0493l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0493l f6583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC0493l f6584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0493l[] f6585n;

    static {
        EnumC0493l enumC0493l = new EnumC0493l("opaque", 0);
        f6583l = enumC0493l;
        EnumC0493l enumC0493l2 = new EnumC0493l("transparent", 1);
        f6584m = enumC0493l2;
        f6585n = new EnumC0493l[]{enumC0493l, enumC0493l2};
    }

    public static EnumC0493l valueOf(String str) {
        return (EnumC0493l) Enum.valueOf(EnumC0493l.class, str);
    }

    public static EnumC0493l[] values() {
        return (EnumC0493l[]) f6585n.clone();
    }
}
