package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0264f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4529a;

    static {
        int[] iArr = new int[EnumC0272n.values().length];
        try {
            iArr[EnumC0272n.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0272n.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0272n.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0272n.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC0272n.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC0272n.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC0272n.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f4529a = iArr;
    }
}
