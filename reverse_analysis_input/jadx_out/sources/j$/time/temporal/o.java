package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7177b;

    public /* synthetic */ o(int i, int i5) {
        this.f7176a = i5;
        this.f7177b = i;
    }

    @Override // j$.time.temporal.n
    public final m c(m mVar) {
        switch (this.f7176a) {
            case 0:
                int i = mVar.i(a.DAY_OF_WEEK);
                int i5 = this.f7177b;
                if (i == i5) {
                    return mVar;
                }
                return mVar.d(i - i5 >= 0 ? 7 - r0 : -r0, b.DAYS);
            default:
                int i6 = mVar.i(a.DAY_OF_WEEK);
                int i7 = this.f7177b;
                if (i6 == i7) {
                    return mVar;
                }
                return mVar.e(i7 - i6 >= 0 ? 7 - r1 : -r1, b.DAYS);
        }
    }
}
