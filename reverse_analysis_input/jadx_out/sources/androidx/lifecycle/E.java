package androidx.lifecycle;

import D.C0015o;
import a0.AbstractC0179e;
import a0.C0200z;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import d0.AbstractC0360m;
import g0.InterfaceC0435a;
import h0.C0452c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l.C0546d;
import l.InterfaceC0556n;
import l.MenuC0550h;
import l.MenuItemC0551i;
import l.SubMenuC0561s;
import l.ViewOnKeyListenerC0547e;
import m.AbstractC0602m;
import m.C0594i;
import m.InterfaceC0589f0;
import m.InterfaceC0625y;
import m3.C0679m;
import m3.C0680n;
import n3.C0702l;
import n3.C0707q;
import n3.InterfaceC0692b;
import n3.InterfaceC0694d;
import n3.InterfaceC0695e;
import n3.InterfaceC0696f;
import n3.InterfaceC0705o;

/* JADX INFO: loaded from: classes.dex */
public class E implements InterfaceC0694d, InterfaceC0696f, InterfaceC0589f0, k0.h, InterfaceC0556n, InterfaceC0625y, InterfaceC0692b, InterfaceC0705o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4473l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f4474m;

    public /* synthetic */ E() {
        this.f4473l = 4;
    }

    public static boolean F(int i) {
        return (48 <= i && i <= 57) || i == 35 || i == 42;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Type inference failed for: r1v48, types: [io.flutter.embedding.android.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [io.flutter.embedding.android.j, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H(n3.C0704n r13, n3.InterfaceC0706p r14) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.E.H(n3.n, n3.p):void");
    }

    public KeyListener A(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((Z1.c) ((B0.d) this.f4474m).f190l).getClass();
        if (keyListener instanceof S.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new S.e(keyListener);
    }

    @Override // k0.h
    public long B(long j5, long j6) {
        return -9223372036854775807L;
    }

    @Override // k0.h
    public l0.j C(long j5) {
        return (l0.j) this.f4474m;
    }

    public UUID D() {
        return AbstractC0179e.f3328a;
    }

    public int E() {
        return 1;
    }

    public void G(Exception exc) {
        AbstractC0360m.m("MediaCodecAudioRenderer", "Audio sink error", exc);
        Z1.c cVar = ((j0.x) this.f4474m).f7413O0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new j0.f(cVar, exc, 4));
        }
    }

    public boolean J(String str) {
        return false;
    }

    public void K(int i, C0679m c0679m) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f4474m;
        iVar.d();
        iVar.f6723f = c0679m;
        iVar.f6722e = new C0015o(2, i, 6);
        iVar.f6725h.e(iVar);
        Z1.i iVar2 = c0679m.f8732j;
        iVar.f6725h = new io.flutter.plugin.editing.f(iVar2 != null ? (C0680n) iVar2.f3014n : null, iVar.f6718a);
        iVar.e(c0679m);
        iVar.i = true;
        if (iVar.f6722e.f360b == 3) {
            iVar.f6732p = false;
        }
        iVar.f6729m = null;
        iVar.f6725h.a(iVar);
    }

    public void L(double d5, double d6, double[] dArr) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f4474m;
        iVar.getClass();
        double[] dArr2 = new double[4];
        boolean z4 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d7 = dArr[12];
        double d8 = dArr[15];
        double d9 = d7 / d8;
        dArr2[1] = d9;
        dArr2[0] = d9;
        double d10 = dArr[13] / d8;
        dArr2[3] = d10;
        dArr2[2] = d10;
        C0452c c0452c = new C0452c();
        c0452c.f6101a = z4;
        c0452c.f6102b = dArr;
        c0452c.f6103c = dArr2;
        c0452c.a(d5, 0.0d);
        c0452c.a(d5, d6);
        c0452c.a(0.0d, d6);
        double d11 = iVar.f6718a.getContext().getResources().getDisplayMetrics().density;
        iVar.f6729m = new Rect((int) (dArr2[0] * d11), (int) (dArr2[2] * d11), (int) Math.ceil(dArr2[1] * d11), (int) Math.ceil(dArr2[3] * d11));
    }

    public void M(C0680n c0680n) {
        C0680n c0680n2;
        int i;
        int i5;
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f4474m;
        View view = iVar.f6718a;
        if (!iVar.i && (c0680n2 = iVar.f6731o) != null && (i = c0680n2.f8739d) >= 0 && (i5 = c0680n2.f8740e) > i) {
            int i6 = i5 - i;
            int i7 = c0680n.f8740e;
            int i8 = c0680n.f8739d;
            boolean z4 = true;
            if (i6 == i7 - i8) {
                int i9 = 0;
                while (true) {
                    if (i9 >= i6) {
                        z4 = false;
                        break;
                    } else if (c0680n2.f8736a.charAt(i9 + i) != c0680n.f8736a.charAt(i9 + i8)) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            iVar.i = z4;
        }
        iVar.f6731o = c0680n;
        iVar.f6725h.f(c0680n);
        if (iVar.i) {
            iVar.f6719b.restartInput(view);
            iVar.i = false;
        }
    }

    public void N(boolean z4) {
        S.i iVar = (S.i) ((Z1.c) ((B0.d) this.f4474m).f190l).f2997m;
        if (iVar.f1982n != z4) {
            if (iVar.f1981m != null) {
                Q.j jVarA = Q.j.a();
                S.h hVar = iVar.f1981m;
                jVarA.getClass();
                D1.b.n(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f1714a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f1715b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f1982n = z4;
            if (z4) {
                S.i.a(iVar.f1980l, Q.j.a().b());
            }
        }
    }

    @Override // k0.h
    public long a(long j5) {
        return 0L;
    }

    @Override // l.InterfaceC0556n
    public void b(MenuC0550h menuC0550h, boolean z4) {
        if (menuC0550h instanceof SubMenuC0561s) {
            ((SubMenuC0561s) menuC0550h).f7810v.j().c(false);
        }
        InterfaceC0556n interfaceC0556n = ((C0594i) this.f4474m).f8421p;
        if (interfaceC0556n != null) {
            interfaceC0556n.b(menuC0550h, z4);
        }
    }

    @Override // k0.h
    public long c(long j5, long j6) {
        return 0L;
    }

    @Override // n3.InterfaceC0696f
    public void d(String str, InterfaceC0694d interfaceC0694d, C0200z c0200z) {
        ((f3.j) this.f4474m).d(str, interfaceC0694d, c0200z);
    }

    @Override // n3.InterfaceC0694d
    public void e(ByteBuffer byteBuffer, f3.g gVar) {
        n3.y.f8949b.getClass();
        n3.y.c(byteBuffer);
        ((f3.b) this.f4474m).getClass();
    }

    @Override // m.InterfaceC0589f0
    public void f(MenuC0550h menuC0550h, MenuItemC0551i menuItemC0551i) {
        ViewOnKeyListenerC0547e viewOnKeyListenerC0547e = (ViewOnKeyListenerC0547e) this.f4474m;
        viewOnKeyListenerC0547e.f7719q.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0547e.f7721s;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0550h == ((C0546d) arrayList.get(i)).f7702b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i5 = i + 1;
        viewOnKeyListenerC0547e.f7719q.postAtTime(new T2.m(this, i5 < arrayList.size() ? (C0546d) arrayList.get(i5) : null, menuItemC0551i, menuC0550h, 1), menuC0550h, SystemClock.uptimeMillis() + 200);
    }

    @Override // l.InterfaceC0556n
    public boolean g(MenuC0550h menuC0550h) {
        C0594i c0594i = (C0594i) this.f4474m;
        if (menuC0550h == c0594i.f8419n) {
            return false;
        }
        ((SubMenuC0561s) menuC0550h).f7811w.getClass();
        c0594i.getClass();
        InterfaceC0556n interfaceC0556n = c0594i.f8421p;
        if (interfaceC0556n != null) {
            return interfaceC0556n.g(menuC0550h);
        }
        return false;
    }

    @Override // n3.InterfaceC0696f
    public void h(String str, ByteBuffer byteBuffer, InterfaceC0695e interfaceC0695e) {
        ((f3.j) this.f4474m).h(str, byteBuffer, interfaceC0695e);
    }

    @Override // k0.h
    public boolean i() {
        return true;
    }

    @Override // n3.InterfaceC0696f
    public C0200z j(C0702l c0702l) {
        return ((f3.j) this.f4474m).j(c0702l);
    }

    @Override // n3.InterfaceC0696f
    public void k(String str, InterfaceC0694d interfaceC0694d) {
        ((f3.j) this.f4474m).d(str, interfaceC0694d, null);
    }

    @Override // n3.InterfaceC0696f
    public void l(String str, ByteBuffer byteBuffer) {
        ((f3.j) this.f4474m).h(str, byteBuffer, null);
    }

    @Override // k0.h
    public long n() {
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // n3.InterfaceC0705o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(n3.C0704n r40, n3.InterfaceC0706p r41) {
        /*
            Method dump skipped, instruction units count: 2000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.E.onMethodCall(n3.n, n3.p):void");
    }

    @Override // m.InterfaceC0589f0
    public void r(MenuC0550h menuC0550h, MenuItemC0551i menuItemC0551i) {
        ((ViewOnKeyListenerC0547e) this.f4474m).f7719q.removeCallbacksAndMessages(menuC0550h);
    }

    @Override // k0.h
    public long s(long j5) {
        return 1L;
    }

    @Override // n3.InterfaceC0692b
    public void t(Object obj, Z1.l lVar) {
        HashMap map;
        HashMap map2;
        Z1.m mVar = (Z1.m) this.f4474m;
        if (((io.flutter.view.a) mVar.f3026o) == null) {
            lVar.u(null);
            return;
        }
        map = (HashMap) obj;
        String str = (String) map.get("type");
        map2 = (HashMap) map.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) map2.get("message");
                if (str2 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) mVar.f3026o;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.k kVar = (io.flutter.view.k) aVar.f6843a;
                        AccessibilityEvent accessibilityEventD = kVar.d(0, 32);
                        accessibilityEventD.getText().add(str2);
                        kVar.h(accessibilityEventD);
                    } else {
                        aVar.getClass();
                    }
                    break;
                }
                break;
            case "announce":
                String str3 = (String) map2.get("message");
                if (str3 != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) mVar.f3026o;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.k) aVar2.f6843a).f6929a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) map.get("nodeId");
                if (num != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) mVar.f3026o;
                    ((io.flutter.view.k) aVar3.f6843a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) map.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.a aVar4 = (io.flutter.view.a) mVar.f3026o;
                    ((io.flutter.view.k) aVar4.f6843a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) map.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.a aVar5 = (io.flutter.view.a) mVar.f3026o;
                    ((io.flutter.view.k) aVar5.f6843a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        lVar.u(null);
    }

    @Override // k0.h
    public long u(long j5, long j6) {
        return 1L;
    }

    @Override // k0.h
    public long v(long j5, long j6) {
        return 0L;
    }

    public m2.Y x() {
        Map mapF = ((m2.r) this.f4474m).f();
        m2.X x4 = new m2.X();
        m2.Y y = new m2.Y(mapF);
        y.f8575q = x4;
        return y;
    }

    public InterfaceC0435a y() {
        return null;
    }

    public m0.c z() {
        return (m0.c) this.f4474m;
    }

    public /* synthetic */ E(Object obj, int i) {
        this.f4473l = i;
        this.f4474m = obj;
    }

    public E(f3.b bVar) {
        this.f4473l = 26;
        new C0707q(bVar, "flutter/mousecursor", n3.x.f8947a, null).b(new E(this, 25));
    }

    public E(AbstractC0602m abstractC0602m) {
        this.f4473l = 17;
        B0.d dVar = new B0.d();
        Z1.c cVar = new Z1.c();
        cVar.f2996l = abstractC0602m;
        S.i iVar = new S.i(abstractC0602m);
        cVar.f2997m = iVar;
        abstractC0602m.addTextChangedListener(iVar);
        if (S.a.f1964b == null) {
            synchronized (S.a.f1963a) {
                try {
                    if (S.a.f1964b == null) {
                        S.a aVar = new S.a();
                        try {
                            S.a.f1965c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, S.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        S.a.f1964b = aVar;
                    }
                } finally {
                }
            }
        }
        abstractC0602m.setEditableFactory(S.a.f1964b);
        dVar.f190l = cVar;
        this.f4474m = dVar;
    }

    public E(InterfaceC0696f interfaceC0696f) {
        this.f4473l = 23;
        Z1.c cVar = new Z1.c();
        cVar.f2997m = this;
        cVar.f2996l = new HashMap();
        new C0707q(interfaceC0696f, "flutter/keyboard", n3.x.f8947a, null).b(cVar);
    }

    public void I(m0.e eVar) {
    }

    @Override // m.InterfaceC0625y
    public void o(int i) {
    }

    @Override // m.InterfaceC0625y
    public void p(int i) {
    }

    public void w(m0.e eVar) {
    }

    @Override // k0.h
    public long m(long j5, long j6) {
        return j6;
    }
}
