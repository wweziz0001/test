package androidx.activity;

import android.util.Log;
import androidx.fragment.app.C0246m;
import androidx.fragment.app.D;
import androidx.fragment.app.K;
import androidx.fragment.app.L;
import androidx.fragment.app.X;
import androidx.fragment.app.Y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends N3.i implements M3.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f3757n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(x xVar, int i) {
        super(1);
        this.f3756m = i;
        this.f3757n = xVar;
    }

    @Override // M3.l
    public final Object c(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f3756m) {
            case 0:
                b bVar = (b) obj;
                N3.h.e(bVar, "backEvent");
                x xVar = this.f3757n;
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
                D d5 = (D) objPrevious;
                xVar.f3777c = d5;
                if (d5 != null) {
                    switch (d5.f4228d) {
                        case 0:
                            boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                            L l3 = (L) d5.f4229e;
                            if (zIsLoggable) {
                                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + l3);
                            }
                            l3.w();
                            l3.x(new K(l3));
                            break;
                        default:
                            N3.h.e(bVar, "backEvent");
                            break;
                    }
                }
                return B3.g.f275a;
            default:
                b bVar2 = (b) obj;
                N3.h.e(bVar2, "backEvent");
                x xVar2 = this.f3757n;
                D d6 = xVar2.f3777c;
                if (d6 == null) {
                    C3.d dVar2 = xVar2.f3776b;
                    ListIterator listIterator2 = dVar2.listIterator(dVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((D) objPrevious2).f4225a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    d6 = (D) objPrevious2;
                }
                if (d6 != null) {
                    switch (d6.f4228d) {
                        case 0:
                            boolean zIsLoggable2 = Log.isLoggable("FragmentManager", 2);
                            L l4 = (L) d6.f4229e;
                            if (zIsLoggable2) {
                                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + l4);
                            }
                            if (l4.f4259h != null) {
                                for (C0246m c0246m : l4.f(new ArrayList(Collections.singletonList(l4.f4259h)), 0, 1)) {
                                    c0246m.getClass();
                                    N3.h.e(bVar2, "backEvent");
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar2.f3738c);
                                    }
                                    ArrayList arrayList = c0246m.f4393c;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        C3.l.S(arrayList2, ((Y) it.next()).f4336k);
                                    }
                                    List listX = C3.f.X(C3.f.Z(arrayList2));
                                    int size = listX.size();
                                    for (int i = 0; i < size; i++) {
                                        ((X) listX.get(i)).c(bVar2, c0246m.f4391a);
                                    }
                                }
                                Iterator it2 = l4.f4263m.iterator();
                                if (it2.hasNext()) {
                                    it2.next().getClass();
                                    throw new ClassCastException();
                                }
                            }
                            break;
                        default:
                            N3.h.e(bVar2, "backEvent");
                            break;
                    }
                }
                return B3.g.f275a;
        }
    }
}
