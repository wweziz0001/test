package A0;

import a0.C0170V;
import d0.AbstractC0360m;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0170V f158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f159b;

    public v(C0170V c0170v, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC0360m.m("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f158a = c0170v;
        this.f159b = iArr;
    }
}
