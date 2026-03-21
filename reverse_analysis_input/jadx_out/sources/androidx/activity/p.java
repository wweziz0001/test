package androidx.activity;

import androidx.fragment.app.D;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class p extends N3.i implements M3.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f3759n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i) {
        super(0);
        this.f3758m = i;
        this.f3759n = xVar;
    }

    @Override // M3.a
    public final Object d() {
        Object objPrevious;
        switch (this.f3758m) {
            case 0:
                this.f3759n.b();
                break;
            case 1:
                x xVar = this.f3759n;
                D d5 = xVar.f3777c;
                if (d5 == null) {
                    C3.d dVar = xVar.f3776b;
                    ListIterator listIterator = dVar.listIterator(dVar.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            if (((D) objPrevious).f4225a) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    d5 = (D) objPrevious;
                }
                xVar.f3777c = null;
                if (d5 != null) {
                    d5.a();
                }
                break;
            default:
                this.f3759n.b();
                break;
        }
        return B3.g.f275a;
    }
}
