package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0273o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0273o f4534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC0273o f4535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC0273o f4536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0273o f4537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0273o f4538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0273o[] f4539q;

    static {
        EnumC0273o enumC0273o = new EnumC0273o("DESTROYED", 0);
        f4534l = enumC0273o;
        EnumC0273o enumC0273o2 = new EnumC0273o("INITIALIZED", 1);
        f4535m = enumC0273o2;
        EnumC0273o enumC0273o3 = new EnumC0273o("CREATED", 2);
        f4536n = enumC0273o3;
        EnumC0273o enumC0273o4 = new EnumC0273o("STARTED", 3);
        f4537o = enumC0273o4;
        EnumC0273o enumC0273o5 = new EnumC0273o("RESUMED", 4);
        f4538p = enumC0273o5;
        f4539q = new EnumC0273o[]{enumC0273o, enumC0273o2, enumC0273o3, enumC0273o4, enumC0273o5};
    }

    public static EnumC0273o valueOf(String str) {
        return (EnumC0273o) Enum.valueOf(EnumC0273o.class, str);
    }

    public static EnumC0273o[] values() {
        return (EnumC0273o[]) f4539q.clone();
    }
}
