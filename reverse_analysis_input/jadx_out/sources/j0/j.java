package j0;

import a0.C0190p;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Exception {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7277m;

    public j(int i, int i5, int i6, int i7, C0190p c0190p, boolean z4, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(i7);
        sb.append(") ");
        sb.append(c0190p);
        sb.append(z4 ? " (recoverable)" : "");
        super(sb.toString(), runtimeException);
        this.f7276l = i;
        this.f7277m = z4;
    }
}
