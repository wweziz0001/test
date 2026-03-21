package androidx.fragment.app;

import a0.C0200z;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0273o;
import b3.AbstractC0307a;
import com.example.hqp_mobile_app.R;
import e.AbstractC0387i;
import e.C0384f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m.B0;
import q.C0740j;
import t.C0821j;
import v1.C0916f;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0200z f4238A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0384f f4239B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0384f f4240C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0384f f4241D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayDeque f4242E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f4243F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f4244G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f4245H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f4246I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f4247J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f4248K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f4249L;
    public ArrayList M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public O f4250N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final A.b f4251O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4253b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f4256e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.activity.x f4258g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f4263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z1.l f4264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f4265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B f4266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B f4267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B f4268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B f4269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final E f4270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0254v f4272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Z1.f f4273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r f4274x;
    public r y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final F f4275z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4252a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z1.i f4254c = new Z1.i(7);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f4255d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f4257f = new A(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0234a f4259h = null;
    public final D i = new D(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f4260j = new AtomicInteger();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f4261k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f4262l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.B] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.B] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.B] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.B] */
    public L() {
        Collections.synchronizedMap(new HashMap());
        this.f4263m = new ArrayList();
        N3.h.e(this, "fragmentManager");
        Z1.l lVar = new Z1.l();
        lVar.f3020l = this;
        lVar.f3021m = new CopyOnWriteArrayList();
        this.f4264n = lVar;
        this.f4265o = new CopyOnWriteArrayList();
        final int i = 0;
        this.f4266p = new C.a(this) { // from class: androidx.fragment.app.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L f4222b;

            {
                this.f4222b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        L l3 = this.f4222b;
                        if (l3.K()) {
                            l3.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        L l4 = this.f4222b;
                        if (l4.K() && num.intValue() == 80) {
                            l4.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0821j c0821j = (C0821j) obj;
                        L l5 = this.f4222b;
                        if (l5.K()) {
                            l5.n(c0821j.f9737a, false);
                        }
                        break;
                    default:
                        t.Y y = (t.Y) obj;
                        L l6 = this.f4222b;
                        if (l6.K()) {
                            l6.s(y.f9731a, false);
                        }
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f4267q = new C.a(this) { // from class: androidx.fragment.app.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L f4222b;

            {
                this.f4222b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        L l3 = this.f4222b;
                        if (l3.K()) {
                            l3.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        L l4 = this.f4222b;
                        if (l4.K() && num.intValue() == 80) {
                            l4.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0821j c0821j = (C0821j) obj;
                        L l5 = this.f4222b;
                        if (l5.K()) {
                            l5.n(c0821j.f9737a, false);
                        }
                        break;
                    default:
                        t.Y y = (t.Y) obj;
                        L l6 = this.f4222b;
                        if (l6.K()) {
                            l6.s(y.f9731a, false);
                        }
                        break;
                }
            }
        };
        final int i6 = 2;
        this.f4268r = new C.a(this) { // from class: androidx.fragment.app.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L f4222b;

            {
                this.f4222b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        L l3 = this.f4222b;
                        if (l3.K()) {
                            l3.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        L l4 = this.f4222b;
                        if (l4.K() && num.intValue() == 80) {
                            l4.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0821j c0821j = (C0821j) obj;
                        L l5 = this.f4222b;
                        if (l5.K()) {
                            l5.n(c0821j.f9737a, false);
                        }
                        break;
                    default:
                        t.Y y = (t.Y) obj;
                        L l6 = this.f4222b;
                        if (l6.K()) {
                            l6.s(y.f9731a, false);
                        }
                        break;
                }
            }
        };
        final int i7 = 3;
        this.f4269s = new C.a(this) { // from class: androidx.fragment.app.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ L f4222b;

            {
                this.f4222b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        L l3 = this.f4222b;
                        if (l3.K()) {
                            l3.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        L l4 = this.f4222b;
                        if (l4.K() && num.intValue() == 80) {
                            l4.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0821j c0821j = (C0821j) obj;
                        L l5 = this.f4222b;
                        if (l5.K()) {
                            l5.n(c0821j.f9737a, false);
                        }
                        break;
                    default:
                        t.Y y = (t.Y) obj;
                        L l6 = this.f4222b;
                        if (l6.K()) {
                            l6.s(y.f9731a, false);
                        }
                        break;
                }
            }
        };
        this.f4270t = new E(this);
        this.f4271u = -1;
        this.f4275z = new F(this);
        this.f4238A = new C0200z(2);
        this.f4242E = new ArrayDeque();
        this.f4251O = new A.b(this, 5);
    }

    public static HashSet E(C0234a c0234a) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c0234a.f4339a.size(); i++) {
            r rVar = ((U) c0234a.f4339a.get(i)).f4311b;
            if (rVar != null && c0234a.f4345g) {
                hashSet.add(rVar);
            }
        }
        return hashSet;
    }

    public static boolean J(r rVar) {
        rVar.getClass();
        boolean zJ = false;
        for (r rVar2 : rVar.f4415F.f4254c.l()) {
            if (rVar2 != null) {
                zJ = J(rVar2);
            }
            if (zJ) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(r rVar) {
        if (rVar == null) {
            return true;
        }
        return rVar.f4422N && (rVar.f4413D == null || L(rVar.f4416G));
    }

    public static boolean M(r rVar) {
        if (rVar == null) {
            return true;
        }
        L l3 = rVar.f4413D;
        return rVar.equals(l3.y) && M(l3.f4274x);
    }

    public static void a0(r rVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + rVar);
        }
        if (rVar.f4420K) {
            rVar.f4420K = false;
            rVar.f4429U = !rVar.f4429U;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0229 A[PHI: r14
      0x0229: PHI (r14v14 int) = (r14v13 int), (r14v15 int) binds: [B:107:0x0219, B:112:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.L.A(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final r B(int i) {
        Z1.i iVar = this.f4254c;
        ArrayList arrayList = (ArrayList) iVar.f3012l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r rVar = (r) arrayList.get(size);
            if (rVar != null && rVar.f4417H == i) {
                return rVar;
            }
        }
        for (T t4 : ((HashMap) iVar.f3013m).values()) {
            if (t4 != null) {
                r rVar2 = t4.f4307c;
                if (rVar2.f4417H == i) {
                    return rVar2;
                }
            }
        }
        return null;
    }

    public final r C(String str) {
        Z1.i iVar = this.f4254c;
        ArrayList arrayList = (ArrayList) iVar.f3012l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r rVar = (r) arrayList.get(size);
            if (rVar != null && str.equals(rVar.f4419J)) {
                return rVar;
            }
        }
        for (T t4 : ((HashMap) iVar.f3013m).values()) {
            if (t4 != null) {
                r rVar2 = t4.f4307c;
                if (str.equals(rVar2.f4419J)) {
                    return rVar2;
                }
            }
        }
        return null;
    }

    public final void D() {
        for (C0246m c0246m : e()) {
            if (c0246m.f4395e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0246m.f4395e = false;
                c0246m.f();
            }
        }
    }

    public final ViewGroup F(r rVar) {
        ViewGroup viewGroup = rVar.f4424P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rVar.f4418I > 0 && this.f4273w.E()) {
            View viewD = this.f4273w.D(rVar.f4418I);
            if (viewD instanceof ViewGroup) {
                return (ViewGroup) viewD;
            }
        }
        return null;
    }

    public final F G() {
        r rVar = this.f4274x;
        return rVar != null ? rVar.f4413D.G() : this.f4275z;
    }

    public final C0200z H() {
        r rVar = this.f4274x;
        return rVar != null ? rVar.f4413D.H() : this.f4238A;
    }

    public final void I(r rVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + rVar);
        }
        if (rVar.f4420K) {
            return;
        }
        rVar.f4420K = true;
        rVar.f4429U = true ^ rVar.f4429U;
        Z(rVar);
    }

    public final boolean K() {
        r rVar = this.f4274x;
        if (rVar == null) {
            return true;
        }
        return rVar.h() && this.f4274x.e().K();
    }

    public final void N(int i, boolean z4) {
        HashMap map;
        C0254v c0254v;
        if (this.f4272v == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i != this.f4271u) {
            this.f4271u = i;
            Z1.i iVar = this.f4254c;
            Iterator it = ((ArrayList) iVar.f3012l).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) iVar.f3013m;
                if (!zHasNext) {
                    break;
                }
                T t4 = (T) map.get(((r) it.next()).f4443p);
                if (t4 != null) {
                    t4.k();
                }
            }
            for (T t5 : map.values()) {
                if (t5 != null) {
                    t5.k();
                    r rVar = t5.f4307c;
                    if (rVar.f4450w && !rVar.j()) {
                        iVar.t(t5);
                    }
                }
            }
            b0();
            if (this.f4243F && (c0254v = this.f4272v) != null && this.f4271u == 7) {
                c0254v.f4462u.invalidateMenu();
                this.f4243F = false;
            }
        }
    }

    public final void O() {
        if (this.f4272v == null) {
            return;
        }
        this.f4244G = false;
        this.f4245H = false;
        this.f4250N.i = false;
        for (r rVar : this.f4254c.m()) {
            if (rVar != null) {
                rVar.f4415F.O();
            }
        }
    }

    public final boolean P() {
        z(false);
        y(true);
        r rVar = this.y;
        if (rVar != null && rVar.c().P()) {
            return true;
        }
        boolean zQ = Q(this.f4248K, this.f4249L);
        if (zQ) {
            this.f4253b = true;
            try {
                S(this.f4248K, this.f4249L);
            } finally {
                d();
            }
        }
        d0();
        if (this.f4247J) {
            this.f4247J = false;
            b0();
        }
        ((HashMap) this.f4254c.f3013m).values().removeAll(Collections.singleton(null));
        return zQ;
    }

    public final boolean Q(ArrayList arrayList, ArrayList arrayList2) {
        int size = this.f4255d.isEmpty() ? -1 : this.f4255d.size() - 1;
        if (size < 0) {
            return false;
        }
        for (int size2 = this.f4255d.size() - 1; size2 >= size; size2--) {
            arrayList.add((C0234a) this.f4255d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void R(r rVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + rVar + " nesting=" + rVar.f4412C);
        }
        boolean zJ = rVar.j();
        if (rVar.f4421L && zJ) {
            return;
        }
        Z1.i iVar = this.f4254c;
        synchronized (((ArrayList) iVar.f3012l)) {
            ((ArrayList) iVar.f3012l).remove(rVar);
        }
        rVar.f4449v = false;
        if (J(rVar)) {
            this.f4243F = true;
        }
        rVar.f4450w = true;
        Z(rVar);
    }

    public final void S(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i5 = 0;
        while (i < size) {
            if (!((C0234a) arrayList.get(i)).f4352o) {
                if (i5 != i) {
                    A(arrayList, arrayList2, i5, i);
                }
                i5 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0234a) arrayList.get(i5)).f4352o) {
                        i5++;
                    }
                }
                A(arrayList, arrayList2, i, i5);
                i = i5 - 1;
            }
            i++;
        }
        if (i5 != size) {
            A(arrayList, arrayList2, i5, size);
        }
    }

    public final void T(Bundle bundle) {
        int i;
        Z1.l lVar;
        int i5;
        T t4;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f4272v.f4459r.getClassLoader());
                this.f4262l.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f4272v.f4459r.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        Z1.i iVar = this.f4254c;
        HashMap map2 = (HashMap) iVar.f3014n;
        map2.clear();
        map2.putAll(map);
        N n4 = (N) bundle.getParcelable("state");
        if (n4 == null) {
            return;
        }
        HashMap map3 = (HashMap) iVar.f3013m;
        map3.clear();
        Iterator it = n4.f4276l.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i = 2;
            lVar = this.f4264n;
            if (!zHasNext) {
                break;
            }
            Bundle bundleF = iVar.F((String) it.next(), null);
            if (bundleF != null) {
                r rVar = (r) this.f4250N.f4285d.get(((Q) bundleF.getParcelable("state")).f4291m);
                if (rVar != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + rVar);
                    }
                    t4 = new T(lVar, iVar, rVar, bundleF);
                } else {
                    t4 = new T(this.f4264n, this.f4254c, this.f4272v.f4459r.getClassLoader(), G(), bundleF);
                }
                r rVar2 = t4.f4307c;
                rVar2.f4440m = bundleF;
                rVar2.f4413D = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + rVar2.f4443p + "): " + rVar2);
                }
                t4.m(this.f4272v.f4459r.getClassLoader());
                iVar.s(t4);
                t4.f4309e = this.f4271u;
            }
        }
        O o4 = this.f4250N;
        o4.getClass();
        for (r rVar3 : new ArrayList(o4.f4285d.values())) {
            if (map3.get(rVar3.f4443p) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + rVar3 + " that was not found in the set of active Fragments " + n4.f4276l);
                }
                this.f4250N.f(rVar3);
                rVar3.f4413D = this;
                T t5 = new T(lVar, iVar, rVar3);
                t5.f4309e = 1;
                t5.k();
                rVar3.f4450w = true;
                t5.k();
            }
        }
        ArrayList<String> arrayList = n4.f4277m;
        ((ArrayList) iVar.f3012l).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                r rVarI = iVar.i(str3);
                if (rVarI == null) {
                    throw new IllegalStateException(AbstractC0307a.k("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + rVarI);
                }
                iVar.a(rVarI);
            }
        }
        if (n4.f4278n != null) {
            this.f4255d = new ArrayList(n4.f4278n.length);
            int i6 = 0;
            while (true) {
                C0235b[] c0235bArr = n4.f4278n;
                if (i6 >= c0235bArr.length) {
                    break;
                }
                C0235b c0235b = c0235bArr[i6];
                c0235b.getClass();
                C0234a c0234a = new C0234a(this);
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    int[] iArr = c0235b.f4356l;
                    if (i7 >= iArr.length) {
                        break;
                    }
                    U u4 = new U();
                    int i9 = i7 + 1;
                    u4.f4310a = iArr[i7];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0234a + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    u4.f4317h = EnumC0273o.values()[c0235b.f4358n[i8]];
                    u4.i = EnumC0273o.values()[c0235b.f4359o[i8]];
                    int i10 = i7 + 2;
                    u4.f4312c = iArr[i9] != 0;
                    int i11 = iArr[i10];
                    u4.f4313d = i11;
                    int i12 = iArr[i7 + 3];
                    u4.f4314e = i12;
                    int i13 = i7 + 5;
                    int i14 = iArr[i7 + 4];
                    u4.f4315f = i14;
                    i7 += 6;
                    int i15 = iArr[i13];
                    u4.f4316g = i15;
                    c0234a.f4340b = i11;
                    c0234a.f4341c = i12;
                    c0234a.f4342d = i14;
                    c0234a.f4343e = i15;
                    c0234a.f4339a.add(u4);
                    u4.f4313d = c0234a.f4340b;
                    u4.f4314e = c0234a.f4341c;
                    u4.f4315f = c0234a.f4342d;
                    u4.f4316g = c0234a.f4343e;
                    i8++;
                    i = 2;
                }
                c0234a.f4344f = c0235b.f4360p;
                c0234a.f4346h = c0235b.f4361q;
                c0234a.f4345g = true;
                c0234a.i = c0235b.f4363s;
                c0234a.f4347j = c0235b.f4364t;
                c0234a.f4348k = c0235b.f4365u;
                c0234a.f4349l = c0235b.f4366v;
                c0234a.f4350m = c0235b.f4367w;
                c0234a.f4351n = c0235b.f4368x;
                c0234a.f4352o = c0235b.y;
                c0234a.f4355r = c0235b.f4362r;
                int i16 = 0;
                while (true) {
                    ArrayList arrayList2 = c0235b.f4357m;
                    if (i16 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i16);
                    if (str4 != null) {
                        ((U) c0234a.f4339a.get(i16)).f4311b = iVar.i(str4);
                    }
                    i16++;
                }
                c0234a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sbJ = B0.j(i6, "restoreAllState: back stack #", " (index ");
                    sbJ.append(c0234a.f4355r);
                    sbJ.append("): ");
                    sbJ.append(c0234a);
                    Log.v("FragmentManager", sbJ.toString());
                    PrintWriter printWriter = new PrintWriter(new W());
                    c0234a.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4255d.add(c0234a);
                i6++;
                i = 2;
            }
            i5 = 0;
        } else {
            i5 = 0;
            this.f4255d = new ArrayList();
        }
        this.f4260j.set(n4.f4279o);
        String str5 = n4.f4280p;
        if (str5 != null) {
            r rVarI2 = iVar.i(str5);
            this.y = rVarI2;
            r(rVarI2);
        }
        ArrayList arrayList3 = n4.f4281q;
        if (arrayList3 != null) {
            for (int i17 = i5; i17 < arrayList3.size(); i17++) {
                this.f4261k.put((String) arrayList3.get(i17), (C0236c) n4.f4282r.get(i17));
            }
        }
        this.f4242E = new ArrayDeque(n4.f4283s);
    }

    public final Bundle U() {
        ArrayList arrayList;
        C0235b[] c0235bArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        w();
        z(true);
        this.f4244G = true;
        this.f4250N.i = true;
        Z1.i iVar = this.f4254c;
        iVar.getClass();
        HashMap map = (HashMap) iVar.f3013m;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (T t4 : map.values()) {
            if (t4 != null) {
                r rVar = t4.f4307c;
                String str = rVar.f4443p;
                t4.getClass();
                Bundle bundle3 = new Bundle();
                r rVar2 = t4.f4307c;
                if (rVar2.f4439l == -1 && (bundle = rVar2.f4440m) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new Q(rVar2));
                if (rVar2.f4439l > -1) {
                    Bundle bundle4 = new Bundle();
                    io.flutter.embedding.android.r rVar3 = (io.flutter.embedding.android.r) rVar2;
                    if (rVar3.r("onSaveInstanceState")) {
                        rVar3.f6608g0.m(bundle4);
                    }
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    t4.f4305a.M(rVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    rVar2.f4436b0.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleU = rVar2.f4415F.U();
                    if (!bundleU.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleU);
                    }
                    if (rVar2.f4425Q != null) {
                        t4.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = rVar2.f4441n;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = rVar2.f4442o;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = rVar2.f4444q;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                iVar.F(str, bundle3);
                arrayList2.add(rVar.f4443p);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + rVar + ": " + rVar.f4440m);
                }
            }
        }
        HashMap map2 = (HashMap) this.f4254c.f3014n;
        if (!map2.isEmpty()) {
            Z1.i iVar2 = this.f4254c;
            synchronized (((ArrayList) iVar2.f3012l)) {
                try {
                    if (((ArrayList) iVar2.f3012l).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) iVar2.f3012l).size());
                        for (r rVar4 : (ArrayList) iVar2.f3012l) {
                            arrayList.add(rVar4.f4443p);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + rVar4.f4443p + "): " + rVar4);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f4255d.size();
            if (size > 0) {
                c0235bArr = new C0235b[size];
                for (int i = 0; i < size; i++) {
                    c0235bArr[i] = new C0235b((C0234a) this.f4255d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sbJ = B0.j(i, "saveAllState: adding back stack #", ": ");
                        sbJ.append(this.f4255d.get(i));
                        Log.v("FragmentManager", sbJ.toString());
                    }
                }
            } else {
                c0235bArr = null;
            }
            N n4 = new N();
            n4.f4280p = null;
            ArrayList arrayList3 = new ArrayList();
            n4.f4281q = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            n4.f4282r = arrayList4;
            n4.f4276l = arrayList2;
            n4.f4277m = arrayList;
            n4.f4278n = c0235bArr;
            n4.f4279o = this.f4260j.get();
            r rVar5 = this.y;
            if (rVar5 != null) {
                n4.f4280p = rVar5.f4443p;
            }
            arrayList3.addAll(this.f4261k.keySet());
            arrayList4.addAll(this.f4261k.values());
            n4.f4283s = new ArrayList(this.f4242E);
            bundle2.putParcelable("state", n4);
            for (String str2 : this.f4262l.keySet()) {
                bundle2.putBundle(AbstractC0307a.j("result_", str2), (Bundle) this.f4262l.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(AbstractC0307a.j("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle2;
    }

    public final void V() {
        synchronized (this.f4252a) {
            try {
                if (this.f4252a.size() == 1) {
                    this.f4272v.f4460s.removeCallbacks(this.f4251O);
                    this.f4272v.f4460s.post(this.f4251O);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W(r rVar, boolean z4) {
        ViewGroup viewGroupF = F(rVar);
        if (viewGroupF == null || !(viewGroupF instanceof C0257y)) {
            return;
        }
        ((C0257y) viewGroupF).setDrawDisappearingViewsLast(!z4);
    }

    public final void X(r rVar, EnumC0273o enumC0273o) {
        if (rVar.equals(this.f4254c.i(rVar.f4443p)) && (rVar.f4414E == null || rVar.f4413D == this)) {
            rVar.f4432X = enumC0273o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(r rVar) {
        if (rVar != null) {
            if (!rVar.equals(this.f4254c.i(rVar.f4443p)) || (rVar.f4414E != null && rVar.f4413D != this)) {
                throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        r rVar2 = this.y;
        this.y = rVar;
        r(rVar2);
        r(this.y);
    }

    public final void Z(r rVar) {
        ViewGroup viewGroupF = F(rVar);
        if (viewGroupF != null) {
            C0250q c0250q = rVar.f4428T;
            if ((c0250q == null ? 0 : c0250q.f4403e) + (c0250q == null ? 0 : c0250q.f4402d) + (c0250q == null ? 0 : c0250q.f4401c) + (c0250q == null ? 0 : c0250q.f4400b) > 0) {
                if (viewGroupF.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupF.setTag(R.id.visible_removing_fragment_view_tag, rVar);
                }
                r rVar2 = (r) viewGroupF.getTag(R.id.visible_removing_fragment_view_tag);
                C0250q c0250q2 = rVar.f4428T;
                boolean z4 = c0250q2 != null ? c0250q2.f4399a : false;
                if (rVar2.f4428T == null) {
                    return;
                }
                rVar2.a().f4399a = z4;
            }
        }
    }

    public final T a(r rVar) {
        String str = rVar.f4431W;
        if (str != null) {
            V.d.c(rVar, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + rVar);
        }
        T tG = g(rVar);
        rVar.f4413D = this;
        Z1.i iVar = this.f4254c;
        iVar.s(tG);
        if (!rVar.f4421L) {
            iVar.a(rVar);
            rVar.f4450w = false;
            if (rVar.f4425Q == null) {
                rVar.f4429U = false;
            }
            if (J(rVar)) {
                this.f4243F = true;
            }
        }
        return tG;
    }

    public final void b(C0254v c0254v, Z1.f fVar, r rVar) {
        if (this.f4272v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4272v = c0254v;
        this.f4273w = fVar;
        this.f4274x = rVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4265o;
        if (rVar != null) {
            copyOnWriteArrayList.add(new G(rVar));
        } else if (c0254v != null) {
            copyOnWriteArrayList.add(c0254v);
        }
        if (this.f4274x != null) {
            d0();
        }
        if (c0254v != null) {
            androidx.activity.x onBackPressedDispatcher = c0254v.f4462u.getOnBackPressedDispatcher();
            this.f4258g = onBackPressedDispatcher;
            onBackPressedDispatcher.a(rVar != null ? rVar : c0254v, this.i);
        }
        if (rVar != null) {
            O o4 = rVar.f4413D.f4250N;
            HashMap map = o4.f4286e;
            O o5 = (O) map.get(rVar.f4443p);
            if (o5 == null) {
                o5 = new O(o4.f4288g);
                map.put(rVar.f4443p, o5);
            }
            this.f4250N = o5;
        } else if (c0254v != null) {
            Z1.m mVar = new Z1.m(c0254v.f4462u.getViewModelStore(), O.f4284j);
            String canonicalName = O.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f4250N = (O) mVar.t(O.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        } else {
            this.f4250N = new O(false);
        }
        O o6 = this.f4250N;
        o6.i = this.f4244G || this.f4245H;
        this.f4254c.f3015o = o6;
        C0254v c0254v2 = this.f4272v;
        if (c0254v2 != null && rVar == null) {
            C0916f savedStateRegistry = c0254v2.f4462u.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C0251s(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                T(bundleA);
            }
        }
        C0254v c0254v3 = this.f4272v;
        if (c0254v3 != null) {
            AbstractC0387i activityResultRegistry = c0254v3.f4462u.getActivityResultRegistry();
            String strJ = AbstractC0307a.j("FragmentManager:", rVar != null ? B0.i(new StringBuilder(), rVar.f4443p, ":") : "");
            this.f4239B = activityResultRegistry.c(B0.h(strJ, "StartActivityForResult"), new H(2), new C(this, 1));
            this.f4240C = activityResultRegistry.c(B0.h(strJ, "StartIntentSenderForResult"), new H(0), new C(this, 2));
            this.f4241D = activityResultRegistry.c(B0.h(strJ, "RequestPermissions"), new H(1), new C(this, 0));
        }
        C0254v c0254v4 = this.f4272v;
        if (c0254v4 != null) {
            c0254v4.addOnConfigurationChangedListener(this.f4266p);
        }
        C0254v c0254v5 = this.f4272v;
        if (c0254v5 != null) {
            c0254v5.f4462u.addOnTrimMemoryListener(this.f4267q);
        }
        C0254v c0254v6 = this.f4272v;
        if (c0254v6 != null) {
            c0254v6.f4462u.addOnMultiWindowModeChangedListener(this.f4268r);
        }
        C0254v c0254v7 = this.f4272v;
        if (c0254v7 != null) {
            c0254v7.f4462u.addOnPictureInPictureModeChangedListener(this.f4269s);
        }
        C0254v c0254v8 = this.f4272v;
        if (c0254v8 == null || rVar != null) {
            return;
        }
        c0254v8.f4462u.addMenuProvider(this.f4270t);
    }

    public final void b0() {
        for (T t4 : this.f4254c.k()) {
            r rVar = t4.f4307c;
            if (rVar.f4426R) {
                if (this.f4253b) {
                    this.f4247J = true;
                } else {
                    rVar.f4426R = false;
                    t4.k();
                }
            }
        }
    }

    public final void c(r rVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + rVar);
        }
        if (rVar.f4421L) {
            rVar.f4421L = false;
            if (rVar.f4449v) {
                return;
            }
            this.f4254c.a(rVar);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + rVar);
            }
            if (J(rVar)) {
                this.f4243F = true;
            }
        }
    }

    public final void c0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new W());
        C0254v c0254v = this.f4272v;
        if (c0254v == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e5) {
                Log.e("FragmentManager", "Failed dumping state", e5);
                throw illegalStateException;
            }
        }
        try {
            c0254v.f4462u.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e6) {
            Log.e("FragmentManager", "Failed dumping state", e6);
            throw illegalStateException;
        }
    }

    public final void d() {
        this.f4253b = false;
        this.f4249L.clear();
        this.f4248K.clear();
    }

    public final void d0() {
        synchronized (this.f4252a) {
            try {
                if (!this.f4252a.isEmpty()) {
                    this.i.c(true);
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z4 = this.f4255d.size() + (this.f4259h != null ? 1 : 0) > 0 && M(this.f4274x);
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z4);
                }
                this.i.c(z4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        C0246m c0246m;
        HashSet hashSet = new HashSet();
        Iterator it = this.f4254c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((T) it.next()).f4307c.f4424P;
            if (viewGroup != null) {
                N3.h.e(H(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0246m) {
                    c0246m = (C0246m) tag;
                } else {
                    c0246m = new C0246m(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0246m);
                }
                hashSet.add(c0246m);
            }
        }
        return hashSet;
    }

    public final HashSet f(ArrayList arrayList, int i, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i5) {
            Iterator it = ((C0234a) arrayList.get(i)).f4339a.iterator();
            while (it.hasNext()) {
                r rVar = ((U) it.next()).f4311b;
                if (rVar != null && (viewGroup = rVar.f4424P) != null) {
                    hashSet.add(C0246m.j(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final T g(r rVar) {
        String str = rVar.f4443p;
        Z1.i iVar = this.f4254c;
        T t4 = (T) ((HashMap) iVar.f3013m).get(str);
        if (t4 != null) {
            return t4;
        }
        T t5 = new T(this.f4264n, iVar, rVar);
        t5.m(this.f4272v.f4459r.getClassLoader());
        t5.f4309e = this.f4271u;
        return t5;
    }

    public final void h(r rVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + rVar);
        }
        if (rVar.f4421L) {
            return;
        }
        rVar.f4421L = true;
        if (rVar.f4449v) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + rVar);
            }
            Z1.i iVar = this.f4254c;
            synchronized (((ArrayList) iVar.f3012l)) {
                ((ArrayList) iVar.f3012l).remove(rVar);
            }
            rVar.f4449v = false;
            if (J(rVar)) {
                this.f4243F = true;
            }
            Z(rVar);
        }
    }

    public final void i(boolean z4) {
        if (z4 && this.f4272v != null) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (r rVar : this.f4254c.m()) {
            if (rVar != null) {
                rVar.f4423O = true;
                if (z4) {
                    rVar.f4415F.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f4271u < 1) {
            return false;
        }
        for (r rVar : this.f4254c.m()) {
            if (rVar != null) {
                if (!rVar.f4420K ? rVar.f4415F.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f4271u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (r rVar : this.f4254c.m()) {
            if (rVar != null && L(rVar)) {
                if (!rVar.f4420K ? rVar.f4415F.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(rVar);
                    z4 = true;
                }
            }
        }
        if (this.f4256e != null) {
            for (int i = 0; i < this.f4256e.size(); i++) {
                r rVar2 = (r) this.f4256e.get(i);
                if (arrayList == null || !arrayList.contains(rVar2)) {
                    rVar2.getClass();
                }
            }
        }
        this.f4256e = arrayList;
        return z4;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.f4246I = true;
        z(true);
        w();
        C0254v c0254v = this.f4272v;
        Z1.i iVar = this.f4254c;
        if (c0254v != null) {
            zIsChangingConfigurations = ((O) iVar.f3015o).f4289h;
        } else {
            AbstractActivityC0255w abstractActivityC0255w = c0254v.f4459r;
            if (abstractActivityC0255w != null) {
                zIsChangingConfigurations = true ^ abstractActivityC0255w.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f4261k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0236c) it.next()).f4369l.iterator();
                while (it2.hasNext()) {
                    ((O) iVar.f3015o).d((String) it2.next(), false);
                }
            }
        }
        u(-1);
        C0254v c0254v2 = this.f4272v;
        if (c0254v2 != null) {
            c0254v2.f4462u.removeOnTrimMemoryListener(this.f4267q);
        }
        C0254v c0254v3 = this.f4272v;
        if (c0254v3 != null) {
            c0254v3.removeOnConfigurationChangedListener(this.f4266p);
        }
        C0254v c0254v4 = this.f4272v;
        if (c0254v4 != null) {
            c0254v4.f4462u.removeOnMultiWindowModeChangedListener(this.f4268r);
        }
        C0254v c0254v5 = this.f4272v;
        if (c0254v5 != null) {
            c0254v5.f4462u.removeOnPictureInPictureModeChangedListener(this.f4269s);
        }
        C0254v c0254v6 = this.f4272v;
        if (c0254v6 != null && this.f4274x == null) {
            c0254v6.f4462u.removeMenuProvider(this.f4270t);
        }
        this.f4272v = null;
        this.f4273w = null;
        this.f4274x = null;
        if (this.f4258g != null) {
            Iterator it3 = this.i.f4226b.iterator();
            while (it3.hasNext()) {
                ((androidx.activity.c) it3.next()).cancel();
            }
            this.f4258g = null;
        }
        C0384f c0384f = this.f4239B;
        if (c0384f != null) {
            c0384f.f5469c.e(c0384f.f5467a);
            C0384f c0384f2 = this.f4240C;
            c0384f2.f5469c.e(c0384f2.f5467a);
            C0384f c0384f3 = this.f4241D;
            c0384f3.f5469c.e(c0384f3.f5467a);
        }
    }

    public final void m(boolean z4) {
        if (z4 && this.f4272v != null) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (r rVar : this.f4254c.m()) {
            if (rVar != null) {
                rVar.f4423O = true;
                if (z4) {
                    rVar.f4415F.m(true);
                }
            }
        }
    }

    public final void n(boolean z4, boolean z5) {
        if (z5 && this.f4272v != null) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (r rVar : this.f4254c.m()) {
            if (rVar != null && z5) {
                rVar.f4415F.n(z4, true);
            }
        }
    }

    public final void o() {
        for (r rVar : this.f4254c.l()) {
            if (rVar != null) {
                rVar.i();
                rVar.f4415F.o();
            }
        }
    }

    public final boolean p() {
        if (this.f4271u < 1) {
            return false;
        }
        for (r rVar : this.f4254c.m()) {
            if (rVar != null) {
                if (!rVar.f4420K ? rVar.f4415F.p() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f4271u < 1) {
            return;
        }
        for (r rVar : this.f4254c.m()) {
            if (rVar != null && !rVar.f4420K) {
                rVar.f4415F.q();
            }
        }
    }

    public final void r(r rVar) {
        if (rVar != null) {
            if (rVar.equals(this.f4254c.i(rVar.f4443p))) {
                rVar.f4413D.getClass();
                boolean zM = M(rVar);
                Boolean bool = rVar.f4448u;
                if (bool == null || bool.booleanValue() != zM) {
                    rVar.f4448u = Boolean.valueOf(zM);
                    M m4 = rVar.f4415F;
                    m4.d0();
                    m4.r(m4.y);
                }
            }
        }
    }

    public final void s(boolean z4, boolean z5) {
        if (z5 && this.f4272v != null) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (r rVar : this.f4254c.m()) {
            if (rVar != null && z5) {
                rVar.f4415F.s(z4, true);
            }
        }
    }

    public final boolean t() {
        if (this.f4271u < 1) {
            return false;
        }
        boolean z4 = false;
        for (r rVar : this.f4254c.m()) {
            if (rVar != null && L(rVar)) {
                if (!rVar.f4420K ? rVar.f4415F.t() : false) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        r rVar = this.f4274x;
        if (rVar != null) {
            sb.append(rVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4274x)));
            sb.append("}");
        } else {
            C0254v c0254v = this.f4272v;
            if (c0254v != null) {
                sb.append(c0254v.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4272v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.f4253b = true;
            for (T t4 : ((HashMap) this.f4254c.f3013m).values()) {
                if (t4 != null) {
                    t4.f4309e = i;
                }
            }
            N(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0246m) it.next()).i();
            }
            this.f4253b = false;
            z(true);
        } catch (Throwable th) {
            this.f4253b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strH = B0.h(str, "    ");
        Z1.i iVar = this.f4254c;
        iVar.getClass();
        String str3 = str + "    ";
        HashMap map = (HashMap) iVar.f3013m;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (T t4 : map.values()) {
                printWriter.print(str);
                if (t4 != null) {
                    r rVar = t4.f4307c;
                    printWriter.println(rVar);
                    rVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(rVar.f4417H));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(rVar.f4418I));
                    printWriter.print(" mTag=");
                    printWriter.println(rVar.f4419J);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(rVar.f4439l);
                    printWriter.print(" mWho=");
                    printWriter.print(rVar.f4443p);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(rVar.f4412C);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(rVar.f4449v);
                    printWriter.print(" mRemoving=");
                    printWriter.print(rVar.f4450w);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(rVar.y);
                    printWriter.print(" mInLayout=");
                    printWriter.println(rVar.f4452z);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(rVar.f4420K);
                    printWriter.print(" mDetached=");
                    printWriter.print(rVar.f4421L);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(rVar.f4422N);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(rVar.M);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(rVar.f4427S);
                    if (rVar.f4413D != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(rVar.f4413D);
                    }
                    if (rVar.f4414E != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(rVar.f4414E);
                    }
                    if (rVar.f4416G != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(rVar.f4416G);
                    }
                    if (rVar.f4444q != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(rVar.f4444q);
                    }
                    if (rVar.f4440m != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(rVar.f4440m);
                    }
                    if (rVar.f4441n != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(rVar.f4441n);
                    }
                    if (rVar.f4442o != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(rVar.f4442o);
                    }
                    Object objI = rVar.f4445r;
                    if (objI == null) {
                        L l3 = rVar.f4413D;
                        objI = (l3 == null || (str2 = rVar.f4446s) == null) ? null : l3.f4254c.i(str2);
                    }
                    if (objI != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(objI);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(rVar.f4447t);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0250q c0250q = rVar.f4428T;
                    printWriter.println(c0250q == null ? false : c0250q.f4399a);
                    C0250q c0250q2 = rVar.f4428T;
                    if ((c0250q2 == null ? 0 : c0250q2.f4400b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0250q c0250q3 = rVar.f4428T;
                        printWriter.println(c0250q3 == null ? 0 : c0250q3.f4400b);
                    }
                    C0250q c0250q4 = rVar.f4428T;
                    if ((c0250q4 == null ? 0 : c0250q4.f4401c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0250q c0250q5 = rVar.f4428T;
                        printWriter.println(c0250q5 == null ? 0 : c0250q5.f4401c);
                    }
                    C0250q c0250q6 = rVar.f4428T;
                    if ((c0250q6 == null ? 0 : c0250q6.f4402d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0250q c0250q7 = rVar.f4428T;
                        printWriter.println(c0250q7 == null ? 0 : c0250q7.f4402d);
                    }
                    C0250q c0250q8 = rVar.f4428T;
                    if ((c0250q8 == null ? 0 : c0250q8.f4403e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0250q c0250q9 = rVar.f4428T;
                        printWriter.println(c0250q9 == null ? 0 : c0250q9.f4403e);
                    }
                    if (rVar.f4424P != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(rVar.f4424P);
                    }
                    if (rVar.f4425Q != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(rVar.f4425Q);
                    }
                    if (rVar.getContext() != null) {
                        Z1.m mVar = new Z1.m(rVar.getViewModelStore(), X.b.f2483e);
                        String canonicalName = X.b.class.getCanonicalName();
                        if (canonicalName == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        C0740j c0740j = ((X.b) mVar.t(X.b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f2484d;
                        if (c0740j.f9241n > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (c0740j.f9241n > 0) {
                                if (c0740j.f9240m[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(c0740j.f9239l[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + rVar.f4415F + ":");
                    rVar.f4415F.v(B0.h(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) iVar.f3012l;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                r rVar2 = (r) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(rVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f4256e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size; i5++) {
                r rVar3 = (r) this.f4256e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(rVar3.toString());
            }
        }
        int size3 = this.f4255d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size3; i6++) {
                C0234a c0234a = (C0234a) this.f4255d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(c0234a.toString());
                c0234a.e(strH, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4260j.get());
        synchronized (this.f4252a) {
            try {
                int size4 = this.f4252a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj = (J) this.f4252a.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4272v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4273w);
        if (this.f4274x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4274x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4271u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4244G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4245H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4246I);
        if (this.f4243F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4243F);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0246m) it.next()).i();
        }
    }

    public final void x(J j5) {
        if (this.f4272v == null) {
            if (!this.f4246I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (this.f4244G || this.f4245H) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        synchronized (this.f4252a) {
            try {
                if (this.f4272v == null) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.f4252a.add(j5);
                V();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z4) {
        if (this.f4253b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4272v == null) {
            if (!this.f4246I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4272v.f4460s.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && (this.f4244G || this.f4245H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4248K == null) {
            this.f4248K = new ArrayList();
            this.f4249L = new ArrayList();
        }
    }

    public final boolean z(boolean z4) {
        boolean zA;
        y(z4);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f4248K;
            ArrayList arrayList2 = this.f4249L;
            synchronized (this.f4252a) {
                if (this.f4252a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f4252a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((J) this.f4252a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            z5 = true;
            this.f4253b = true;
            try {
                S(this.f4248K, this.f4249L);
            } finally {
                d();
            }
        }
        d0();
        if (this.f4247J) {
            this.f4247J = false;
            b0();
        }
        ((HashMap) this.f4254c.f3013m).values().removeAll(Collections.singleton(null));
        return z5;
    }
}
