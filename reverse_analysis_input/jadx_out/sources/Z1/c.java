package Z1;

import D0.y;
import F0.M;
import Q.w;
import Q1.u;
import Q1.x;
import a0.C0180f;
import a0.e0;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0283z;
import androidx.lifecycle.E;
import androidx.work.impl.WorkDatabase_Impl;
import d0.C0363p;
import d0.C0368u;
import h0.C0458i;
import io.flutter.embedding.android.J;
import io.flutter.embedding.android.L;
import io.flutter.embedding.android.N;
import io.flutter.embedding.android.Q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import l1.B;
import l1.C;
import l1.InterfaceC0568A;
import m3.C0675i;
import m3.C0677k;
import n.C0681a;
import n.C0684d;
import n3.C0698h;
import n3.C0704n;
import n3.InterfaceC0692b;
import n3.InterfaceC0693c;
import n3.InterfaceC0694d;
import n3.InterfaceC0697g;
import n3.InterfaceC0699i;
import n3.InterfaceC0703m;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;
import r1.AbstractC0778s;
import r1.C0777r;
import r1.C0779t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements x, InterfaceC0699i, InterfaceC0568A, InterfaceC0705o, InterfaceC0693c, InterfaceC0694d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static c f2994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static N f2995o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f2997m;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f2996l = obj;
        this.f2997m = obj2;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z4) {
        w[] wVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
            for (w wVar : wVarArr) {
                int spanStart = editable.getSpanStart(wVar);
                int spanEnd = editable.getSpanEnd(wVar);
                if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l1.InterfaceC0568A
    public void b(C0363p c0363p) {
        C c5;
        if (c0363p.v() == 0 && (c0363p.v() & 128) != 0) {
            c0363p.I(6);
            int iA = c0363p.a() / 4;
            int i = 0;
            while (true) {
                c5 = (C) this.f2997m;
                if (i >= iA) {
                    break;
                }
                M m4 = (M) this.f2996l;
                c0363p.g(m4.f711b, 0, 4);
                m4.r(0);
                int i5 = m4.i(16);
                m4.u(3);
                if (i5 == 0) {
                    m4.u(13);
                } else {
                    int i6 = m4.i(13);
                    if (c5.f7903h.get(i6) == null) {
                        c5.f7903h.put(i6, new B(new a1.j(c5, i6)));
                        c5.f7908n++;
                    }
                }
                i++;
            }
            if (c5.f7896a != 2) {
                c5.f7903h.remove(0);
            }
        }
    }

    public void d(C0458i c0458i) {
        synchronized (c0458i) {
        }
        Handler handler = (Handler) this.f2996l;
        if (handler != null) {
            handler.post(new y(this, 16, c0458i));
        }
    }

    @Override // n3.InterfaceC0694d
    public void e(ByteBuffer byteBuffer, f3.g gVar) {
        i iVar = (i) this.f2997m;
        try {
            InterfaceC0692b interfaceC0692b = (InterfaceC0692b) this.f2996l;
            Object objA = ((InterfaceC0703m) iVar.f3014n).a(byteBuffer);
            l lVar = new l();
            lVar.f3021m = this;
            lVar.f3020l = gVar;
            interfaceC0692b.t(objA, lVar);
        } catch (RuntimeException e5) {
            Log.e("BasicMessageChannel#" + ((String) iVar.f3013m), "Failed to handle message", e5);
            gVar.a(null);
        }
    }

    public View f(int i, int i5, int i6, int i7) {
        int iS;
        int i8;
        int iT;
        View viewO;
        int left;
        int i9;
        int right;
        int i10;
        C0777r c0777r = (C0777r) this.f2996l;
        switch (c0777r.f9509a) {
            case 0:
                iS = c0777r.f9510b.s();
                break;
            default:
                iS = c0777r.f9510b.u();
                break;
        }
        switch (c0777r.f9509a) {
            case 0:
                AbstractC0778s abstractC0778s = c0777r.f9510b;
                i8 = abstractC0778s.f9516f;
                iT = abstractC0778s.t();
                break;
            default:
                AbstractC0778s abstractC0778s2 = c0777r.f9510b;
                i8 = abstractC0778s2.f9517g;
                iT = abstractC0778s2.r();
                break;
        }
        int i11 = i8 - iT;
        int i12 = i5 > i ? 1 : -1;
        View view = null;
        while (i != i5) {
            switch (c0777r.f9509a) {
                case 0:
                    viewO = c0777r.f9510b.o(i);
                    break;
                default:
                    viewO = c0777r.f9510b.o(i);
                    break;
            }
            switch (c0777r.f9509a) {
                case 0:
                    C0779t c0779t = (C0779t) viewO.getLayoutParams();
                    c0777r.f9510b.getClass();
                    left = viewO.getLeft() - ((C0779t) viewO.getLayoutParams()).f9518a.left;
                    i9 = ((ViewGroup.MarginLayoutParams) c0779t).leftMargin;
                    break;
                default:
                    C0779t c0779t2 = (C0779t) viewO.getLayoutParams();
                    c0777r.f9510b.getClass();
                    left = viewO.getTop() - ((C0779t) viewO.getLayoutParams()).f9518a.top;
                    i9 = ((ViewGroup.MarginLayoutParams) c0779t2).topMargin;
                    break;
            }
            int i13 = left - i9;
            switch (c0777r.f9509a) {
                case 0:
                    C0779t c0779t3 = (C0779t) viewO.getLayoutParams();
                    c0777r.f9510b.getClass();
                    right = viewO.getRight() + ((C0779t) viewO.getLayoutParams()).f9518a.right;
                    i10 = ((ViewGroup.MarginLayoutParams) c0779t3).rightMargin;
                    break;
                default:
                    C0779t c0779t4 = (C0779t) viewO.getLayoutParams();
                    c0777r.f9510b.getClass();
                    right = viewO.getBottom() + ((C0779t) viewO.getLayoutParams()).f9518a.bottom;
                    i10 = ((ViewGroup.MarginLayoutParams) c0779t4).bottomMargin;
                    break;
            }
            int i14 = right + i10;
            C0180f c0180f = (C0180f) this.f2997m;
            c0180f.f3338b = iS;
            c0180f.f3339c = i11;
            c0180f.f3340d = i13;
            c0180f.f3341e = i14;
            if (i6 != 0) {
                c0180f.f3337a = i6;
                if (c0180f.a()) {
                    return viewO;
                }
            }
            if (i7 != 0) {
                c0180f.f3337a = i7;
                if (c0180f.a()) {
                    view = viewO;
                }
            }
            i += i12;
        }
        return view;
    }

    public ArrayList g(String str) {
        s1.j jVarC = s1.j.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            jVarC.g(1);
        } else {
            jVarC.h(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2996l;
        workDatabase_Impl.b();
        Cursor cursorL0 = Q1.C.l0(workDatabase_Impl, jVarC, false);
        try {
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                arrayList.add(cursorL0.isNull(0) ? null : cursorL0.getString(0));
            }
            return arrayList;
        } finally {
            cursorL0.close();
            jVarC.f();
        }
    }

    public boolean h(CharSequence charSequence, int i, int i5, Q.p pVar) {
        if (pVar.f1734c == 0) {
            Q.d dVar = (Q.d) this.f2997m;
            R.a aVarC = pVar.c();
            int iA = aVarC.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarC.f376o).getShort(iA + aVarC.f373l);
            }
            dVar.getClass();
            ThreadLocal threadLocal = Q.d.f1704b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i5) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f1705a;
            String string = sb.toString();
            int i6 = w.e.f10406a;
            pVar.f1734c = w.d.a(textPaint, string) ? 2 : 1;
        }
        return pVar.f1734c == 2;
    }

    public void i(f fVar) {
        boolean z4;
        C0283z c0283z = (C0283z) this.f2996l;
        synchronized (c0283z.f4555a) {
            z4 = c0283z.f4558d == C0283z.f4554h;
            c0283z.f4558d = fVar;
        }
        if (z4) {
            C0681a c0681aX = C0681a.X();
            A.b bVar = c0283z.f4561g;
            C0684d c0684d = c0681aX.f8743a;
            if (c0684d.f8747c == null) {
                synchronized (c0684d.f8745a) {
                    try {
                        if (c0684d.f8747c == null) {
                            c0684d.f8747c = C0684d.X(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c0684d.f8747c.post(bVar);
        }
        if (fVar instanceof Q1.w) {
            ((b2.k) this.f2997m).j((Q1.w) fVar);
        } else if (fVar instanceof u) {
            ((b2.k) this.f2997m).k(((u) fVar).f1840q);
        }
    }

    public void j(A.h hVar) {
        int i = hVar.f21b;
        Handler handler = (Handler) this.f2997m;
        C0675i c0675i = (C0675i) this.f2996l;
        if (i != 0) {
            handler.post(new A.b(c0675i, i));
        } else {
            handler.post(new A.a(c0675i, 0, hVar.f20a));
        }
    }

    public MotionEvent k(Q q4) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j5;
        while (true) {
            priorityQueue = (PriorityQueue) this.f2997m;
            boolean zIsEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) this.f2996l;
            j5 = q4.f6545a;
            if (zIsEmpty || ((Long) priorityQueue.peek()).longValue() >= j5) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j5) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j5);
        longSparseArray.remove(j5);
        return motionEvent;
    }

    public void l(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.f2996l).send(messageObtain);
    }

    public void m(e0 e0Var) {
        Handler handler = (Handler) this.f2996l;
        if (handler != null) {
            handler.post(new y(this, 0, e0Var));
        }
    }

    @Override // n3.InterfaceC0699i
    public void onCancel(Object obj) {
        this.f2997m = null;
    }

    @Override // n3.InterfaceC0699i
    public void onListen(Object obj, InterfaceC0697g interfaceC0697g) {
        ArrayList arrayList = (ArrayList) this.f2996l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0698h) interfaceC0697g).success((Map) it.next());
        }
        arrayList.clear();
        this.f2997m = (C0698h) interfaceC0697g;
    }

    @Override // n3.InterfaceC0705o
    public void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        E e5 = (E) this.f2997m;
        if (((m) e5.f4474m) == null) {
            ((P2.c) interfaceC0706p).success((Map) this.f2996l);
            return;
        }
        String str = c0704n.f8938a;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            ((P2.c) interfaceC0706p).notImplemented();
            return;
        }
        try {
            this.f2996l = Collections.unmodifiableMap(((J) ((L[]) ((m) e5.f4474m).f3024m)[0]).f6533m);
        } catch (IllegalStateException e6) {
            ((P2.c) interfaceC0706p).error("error", e6.getMessage(), null);
        }
        ((P2.c) interfaceC0706p).success((Map) this.f2996l);
    }

    @Override // n3.InterfaceC0693c
    public void u(Object obj) {
        s sVar = (s) this.f2997m;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) sVar.f3085m;
        C0677k c0677k = (C0677k) this.f2996l;
        concurrentLinkedQueue.remove(c0677k);
        if (((ConcurrentLinkedQueue) sVar.f3085m).isEmpty()) {
            return;
        }
        Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(c0677k.f8720a));
    }

    public /* synthetic */ c(Object obj, Object obj2, boolean z4) {
        this.f2997m = obj;
        this.f2996l = obj2;
    }

    public c(int i) {
        switch (i) {
            case 5:
                this.f2996l = new C0283z();
                this.f2997m = new b2.k();
                i(x.f1842e);
                break;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                this.f2996l = new ArrayList();
                break;
            case 11:
                this.f2996l = new LongSparseArray();
                this.f2997m = new PriorityQueue();
                break;
            default:
                this.f2996l = new ReentrantLock();
                this.f2997m = new LinkedHashMap();
                break;
        }
    }

    public c(C0777r c0777r) {
        this.f2996l = c0777r;
        C0180f c0180f = new C0180f();
        c0180f.f3337a = 0;
        this.f2997m = c0180f;
    }

    @Override // l1.InterfaceC0568A
    public void c(C0368u c0368u, F0.s sVar, l1.E e5) {
    }
}
