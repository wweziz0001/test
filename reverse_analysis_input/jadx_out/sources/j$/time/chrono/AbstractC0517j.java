package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0517j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f7014a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f7014a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7014a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
