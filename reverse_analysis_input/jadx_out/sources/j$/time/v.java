package j$.time;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f7192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f7193b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f7193b = iArr;
        try {
            iArr[j$.time.temporal.b.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7193b[j$.time.temporal.b.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7193b[j$.time.temporal.b.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7193b[j$.time.temporal.b.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f7193b[j$.time.temporal.b.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f7192a = iArr2;
        try {
            iArr2[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f7192a[j$.time.temporal.a.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f7192a[j$.time.temporal.a.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
