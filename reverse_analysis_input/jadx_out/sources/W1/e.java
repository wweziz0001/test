package W1;

import N3.h;
import Q1.q;
import Z1.p;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2467c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2468b;

    static {
        String strF = q.f("NetworkMeteredCtrlr");
        h.d(strF, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f2467c = strF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(X1.f fVar) {
        super(fVar);
        h.e(fVar, "tracker");
        this.f2468b = 7;
    }

    @Override // W1.d
    public final int a() {
        return this.f2468b;
    }

    @Override // W1.d
    public final boolean b(p pVar) {
        return pVar.f3054j.f1808a == 5;
    }

    @Override // W1.d
    public final boolean c(Object obj) {
        V1.d dVar = (V1.d) obj;
        h.e(dVar, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z4 = dVar.f2352a;
        if (i < 26) {
            q.d().a(f2467c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z4) {
                return false;
            }
        } else if (z4 && dVar.f2354c) {
            return false;
        }
        return true;
    }
}
