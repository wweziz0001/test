package y0;

import a0.C0190p;
import d0.AbstractC0360m;
import f0.C0417l;
import f0.InterfaceC0413h;

/* JADX INFO: renamed from: y0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0993a extends l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f10831v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f10832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Z1.e f10833x;
    public int[] y;

    public AbstractC0993a(InterfaceC0413h interfaceC0413h, C0417l c0417l, C0190p c0190p, int i, Object obj, long j5, long j6, long j7, long j8, long j9) {
        super(interfaceC0413h, c0417l, c0190p, i, obj, j5, j6, j9);
        this.f10831v = j7;
        this.f10832w = j8;
    }

    public final int c(int i) {
        int[] iArr = this.y;
        AbstractC0360m.i(iArr);
        return iArr[i];
    }
}
