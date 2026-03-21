package V;

import N3.h;
import androidx.fragment.app.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f2305l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, String str) {
        super(str);
        h.e(rVar, "fragment");
        this.f2305l = rVar;
    }
}
