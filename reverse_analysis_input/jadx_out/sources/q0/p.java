package q0;

import a0.C0190p;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Exception {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f9297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f9298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f9299o;

    public p(C0190p c0190p, v vVar, boolean z4, int i) {
        this("Decoder init failed: [" + i + "], " + c0190p, vVar, c0190p.f3424n, z4, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public p(String str, Throwable th, String str2, boolean z4, o oVar, String str3) {
        super(str, th);
        this.f9296l = str2;
        this.f9297m = z4;
        this.f9298n = oVar;
        this.f9299o = str3;
    }
}
