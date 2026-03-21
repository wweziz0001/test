package j0;

import a0.C0190p;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Exception {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0190p f7280n;

    public k(int i, C0190p c0190p, boolean z4) {
        super(AbstractC0307a.i("AudioTrack write failed: ", i));
        this.f7279m = z4;
        this.f7278l = i;
        this.f7280n = c0190p;
    }
}
