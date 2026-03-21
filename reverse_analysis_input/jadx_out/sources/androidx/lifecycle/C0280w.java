package androidx.lifecycle;

import android.os.Looper;
import b3.AbstractC0307a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import n.C0681a;
import o.C0710a;
import o.C0712c;
import v1.C0912b;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0280w extends AbstractC0274p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0710a f4544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC0273o f4545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f4546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f4550h;
    public final Y3.v i;

    public C0280w(InterfaceC0278u interfaceC0278u) {
        new AtomicReference();
        this.f4543a = true;
        this.f4544b = new C0710a();
        EnumC0273o enumC0273o = EnumC0273o.f4535m;
        this.f4545c = enumC0273o;
        this.f4550h = new ArrayList();
        this.f4546d = new WeakReference(interfaceC0278u);
        this.i = new Y3.v(enumC0273o);
    }

    @Override // androidx.lifecycle.AbstractC0274p
    public final void a(InterfaceC0277t interfaceC0277t) {
        InterfaceC0276s c0265g;
        InterfaceC0278u interfaceC0278u;
        ArrayList arrayList = this.f4550h;
        int i = 2;
        Object obj = null;
        d("addObserver");
        EnumC0273o enumC0273o = this.f4545c;
        EnumC0273o enumC0273o2 = EnumC0273o.f4534l;
        if (enumC0273o != enumC0273o2) {
            enumC0273o2 = EnumC0273o.f4535m;
        }
        C0279v c0279v = new C0279v();
        HashMap map = AbstractC0282y.f4552a;
        boolean z4 = interfaceC0277t instanceof InterfaceC0276s;
        boolean z5 = interfaceC0277t instanceof InterfaceC0263e;
        if (z4 && z5) {
            c0265g = new C0265g((InterfaceC0263e) interfaceC0277t, i, (InterfaceC0276s) interfaceC0277t);
        } else if (z5) {
            c0265g = new C0265g((InterfaceC0263e) interfaceC0277t, i, obj);
        } else if (z4) {
            c0265g = (InterfaceC0276s) interfaceC0277t;
        } else {
            Class<?> cls = interfaceC0277t.getClass();
            if (AbstractC0282y.b(cls) == 2) {
                Object obj2 = AbstractC0282y.f4553b.get(cls);
                N3.h.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0282y.a((Constructor) list.get(0), interfaceC0277t);
                    throw null;
                }
                int size = list.size();
                InterfaceC0267i[] interfaceC0267iArr = new InterfaceC0267i[size];
                if (size > 0) {
                    AbstractC0282y.a((Constructor) list.get(0), interfaceC0277t);
                    throw null;
                }
                c0265g = new C0912b(interfaceC0267iArr, i);
            } else {
                c0265g = new C0265g(interfaceC0277t);
            }
        }
        c0279v.f4542b = c0265g;
        c0279v.f4541a = enumC0273o2;
        C0710a c0710a = this.f4544b;
        C0712c c0712cF = c0710a.f(interfaceC0277t);
        if (c0712cF != null) {
            obj = c0712cF.f8955m;
        } else {
            HashMap map2 = c0710a.f8950p;
            C0712c c0712c = new C0712c(interfaceC0277t, c0279v);
            c0710a.f8964o++;
            C0712c c0712c2 = c0710a.f8962m;
            if (c0712c2 == null) {
                c0710a.f8961l = c0712c;
                c0710a.f8962m = c0712c;
            } else {
                c0712c2.f8956n = c0712c;
                c0712c.f8957o = c0712c2;
                c0710a.f8962m = c0712c;
            }
            map2.put(interfaceC0277t, c0712c);
        }
        if (((C0279v) obj) == null && (interfaceC0278u = (InterfaceC0278u) this.f4546d.get()) != null) {
            i = (this.f4547e != 0 || this.f4548f) ? 1 : 0;
            EnumC0273o enumC0273oC = c(interfaceC0277t);
            this.f4547e++;
            while (c0279v.f4541a.compareTo(enumC0273oC) < 0 && this.f4544b.f8950p.containsKey(interfaceC0277t)) {
                arrayList.add(c0279v.f4541a);
                C0270l c0270l = EnumC0272n.Companion;
                EnumC0273o enumC0273o3 = c0279v.f4541a;
                c0270l.getClass();
                EnumC0272n enumC0272nB = C0270l.b(enumC0273o3);
                if (enumC0272nB == null) {
                    throw new IllegalStateException("no event up from " + c0279v.f4541a);
                }
                c0279v.a(interfaceC0278u, enumC0272nB);
                arrayList.remove(arrayList.size() - 1);
                enumC0273oC = c(interfaceC0277t);
            }
            if (i == 0) {
                h();
            }
            this.f4547e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0274p
    public final void b(InterfaceC0277t interfaceC0277t) {
        N3.h.e(interfaceC0277t, "observer");
        d("removeObserver");
        this.f4544b.g(interfaceC0277t);
    }

    public final EnumC0273o c(InterfaceC0277t interfaceC0277t) {
        C0279v c0279v;
        HashMap map = this.f4544b.f8950p;
        C0712c c0712c = map.containsKey(interfaceC0277t) ? ((C0712c) map.get(interfaceC0277t)).f8957o : null;
        EnumC0273o enumC0273o = (c0712c == null || (c0279v = (C0279v) c0712c.f8955m) == null) ? null : c0279v.f4541a;
        ArrayList arrayList = this.f4550h;
        EnumC0273o enumC0273o2 = arrayList.isEmpty() ? null : (EnumC0273o) arrayList.get(arrayList.size() - 1);
        EnumC0273o enumC0273o3 = this.f4545c;
        N3.h.e(enumC0273o3, "state1");
        if (enumC0273o == null || enumC0273o.compareTo(enumC0273o3) >= 0) {
            enumC0273o = enumC0273o3;
        }
        return (enumC0273o2 == null || enumC0273o2.compareTo(enumC0273o) >= 0) ? enumC0273o : enumC0273o2;
    }

    public final void d(String str) {
        if (this.f4543a) {
            C0681a.X().f8743a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0307a.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0272n enumC0272n) {
        N3.h.e(enumC0272n, "event");
        d("handleLifecycleEvent");
        f(enumC0272n.a());
    }

    public final void f(EnumC0273o enumC0273o) {
        EnumC0273o enumC0273o2 = this.f4545c;
        if (enumC0273o2 == enumC0273o) {
            return;
        }
        EnumC0273o enumC0273o3 = EnumC0273o.f4535m;
        EnumC0273o enumC0273o4 = EnumC0273o.f4534l;
        if (enumC0273o2 == enumC0273o3 && enumC0273o == enumC0273o4) {
            throw new IllegalStateException(("no event down from " + this.f4545c + " in component " + this.f4546d.get()).toString());
        }
        this.f4545c = enumC0273o;
        if (this.f4548f || this.f4547e != 0) {
            this.f4549g = true;
            return;
        }
        this.f4548f = true;
        h();
        this.f4548f = false;
        if (this.f4545c == enumC0273o4) {
            this.f4544b = new C0710a();
        }
    }

    public final void g() {
        EnumC0273o enumC0273o = EnumC0273o.f4536n;
        d("setCurrentState");
        f(enumC0273o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.f4549g = false;
        r0 = r7.f4545c;
        r1 = r7.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r0 = Z3.q.f3135a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        r1.c(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0280w.h():void");
    }
}
