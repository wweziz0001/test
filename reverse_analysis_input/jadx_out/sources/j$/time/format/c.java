package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f7064a;

    static {
        int[] iArr = new int[z.values().length];
        f7064a = iArr;
        try {
            iArr[z.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7064a[z.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7064a[z.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7064a[z.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
