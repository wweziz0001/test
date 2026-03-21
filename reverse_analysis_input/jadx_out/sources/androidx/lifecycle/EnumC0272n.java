package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0272n {
    private static final /* synthetic */ EnumC0272n[] $VALUES;
    public static final C0270l Companion;
    public static final EnumC0272n ON_ANY;
    public static final EnumC0272n ON_CREATE;
    public static final EnumC0272n ON_DESTROY;
    public static final EnumC0272n ON_PAUSE;
    public static final EnumC0272n ON_RESUME;
    public static final EnumC0272n ON_START;
    public static final EnumC0272n ON_STOP;

    static {
        EnumC0272n enumC0272n = new EnumC0272n("ON_CREATE", 0);
        ON_CREATE = enumC0272n;
        EnumC0272n enumC0272n2 = new EnumC0272n("ON_START", 1);
        ON_START = enumC0272n2;
        EnumC0272n enumC0272n3 = new EnumC0272n("ON_RESUME", 2);
        ON_RESUME = enumC0272n3;
        EnumC0272n enumC0272n4 = new EnumC0272n("ON_PAUSE", 3);
        ON_PAUSE = enumC0272n4;
        EnumC0272n enumC0272n5 = new EnumC0272n("ON_STOP", 4);
        ON_STOP = enumC0272n5;
        EnumC0272n enumC0272n6 = new EnumC0272n("ON_DESTROY", 5);
        ON_DESTROY = enumC0272n6;
        EnumC0272n enumC0272n7 = new EnumC0272n("ON_ANY", 6);
        ON_ANY = enumC0272n7;
        $VALUES = new EnumC0272n[]{enumC0272n, enumC0272n2, enumC0272n3, enumC0272n4, enumC0272n5, enumC0272n6, enumC0272n7};
        Companion = new C0270l();
    }

    public static EnumC0272n valueOf(String str) {
        return (EnumC0272n) Enum.valueOf(EnumC0272n.class, str);
    }

    public static EnumC0272n[] values() {
        return (EnumC0272n[]) $VALUES.clone();
    }

    public final EnumC0273o a() {
        switch (AbstractC0271m.f4533a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0273o.f4536n;
            case 3:
            case 4:
                return EnumC0273o.f4537o;
            case 5:
                return EnumC0273o.f4538p;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return EnumC0273o.f4534l;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
