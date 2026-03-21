package androidx.fragment.app;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public N3.g f4227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4229e;

    public D(boolean z4) {
        this.f4225a = z4;
        this.f4226b = new CopyOnWriteArrayList();
    }

    public void a() {
        switch (this.f4228d) {
            case 0:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                L l3 = (L) this.f4229e;
                if (zIsLoggable) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + l3);
                }
                C0234a c0234a = l3.f4259h;
                if (c0234a != null) {
                    c0234a.f4354q = false;
                    c0234a.d();
                    l3.z(true);
                    l3.D();
                    Iterator it = l3.f4263m.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
                l3.f4259h = null;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [M3.a, N3.g] */
    public final void c(boolean z4) {
        this.f4225a = z4;
        ?? r12 = this.f4227c;
        if (r12 != 0) {
            r12.d();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D(L l3) {
        this(false);
        this.f4228d = 0;
        this.f4229e = l3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D(io.flutter.embedding.android.r rVar) {
        this(true);
        this.f4228d = 1;
        this.f4229e = rVar;
    }

    public final void b() {
    }
}
