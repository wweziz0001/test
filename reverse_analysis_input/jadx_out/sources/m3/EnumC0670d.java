package m3;

import b3.AbstractC0307a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0670d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC0670d f8678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0670d[] f8679n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f8680l;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0670d EF0;

    static {
        EnumC0670d enumC0670d = new EnumC0670d("PLAIN_TEXT", 0);
        enumC0670d.f8680l = "text/plain";
        f8678m = enumC0670d;
        f8679n = new EnumC0670d[]{enumC0670d};
    }

    public static EnumC0670d a(String str) {
        for (EnumC0670d enumC0670d : values()) {
            if (enumC0670d.f8680l.equals(str)) {
                return enumC0670d;
            }
        }
        throw new NoSuchFieldException(AbstractC0307a.j("No such ClipboardContentFormat: ", str));
    }

    public static EnumC0670d valueOf(String str) {
        return (EnumC0670d) Enum.valueOf(EnumC0670d.class, str);
    }

    public static EnumC0670d[] values() {
        return (EnumC0670d[]) f8679n.clone();
    }
}
