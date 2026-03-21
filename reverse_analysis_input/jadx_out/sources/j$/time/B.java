package j$.time;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f6971a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f6971a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6971a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
