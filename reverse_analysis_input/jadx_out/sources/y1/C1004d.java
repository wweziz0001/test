package y1;

import b3.AbstractC0307a;

/* JADX INFO: renamed from: y1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1004d extends RuntimeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Throwable f10916m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004d(int i, Throwable th) {
        super(th);
        AbstractC0307a.r("callbackName", i);
        this.f10915l = i;
        this.f10916m = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f10916m;
    }
}
