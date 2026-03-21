package j$.time;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f7149a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f7149a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7149a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
