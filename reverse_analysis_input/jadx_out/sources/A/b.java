package A;

import D.I;
import F0.p;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.L;
import androidx.lifecycle.C0283z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.Worker;
import b3.AbstractC0307a;
import io.flutter.embedding.android.r;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m.C0594i;
import m.T;
import m3.C0675i;
import o.C0711b;
import r1.AbstractC0776q;
import r1.C0761b;
import r1.C0765f;
import y1.C1002b;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f4m;

    public /* synthetic */ b(Object obj, int i) {
        this.f3l = i;
        this.f4m = obj;
    }

    public D3.i a() throws IOException {
        s1.f fVar = (s1.f) this.f4m;
        D3.i iVar = new D3.i();
        Cursor cursorM = fVar.f9571a.m(new p("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 3), null);
        while (cursorM.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(cursorM.getInt(0)));
            } finally {
            }
        }
        Z1.f.f(cursorM, null);
        D3.i iVarE = D1.b.e(iVar);
        if (!iVarE.f620l.isEmpty()) {
            if (((s1.f) this.f4m).f9577g == null) {
                throw new IllegalStateException("Required value was null.");
            }
            y1.h hVar = ((s1.f) this.f4m).f9577g;
            if (hVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            hVar.a();
        }
        return iVarE;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [B0.p, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C0594i c0594i;
        Set setA;
        switch (this.f3l) {
            case 0:
                Object obj2 = ((C0675i) this.f4m).f8712m;
                return;
            case 1:
                this.f4m.g();
                return;
            case 2:
                I.e eVar = (I.e) this.f4m;
                if (eVar.f1006z) {
                    boolean z4 = eVar.f1005x;
                    I.a aVar = eVar.f993l;
                    if (z4) {
                        eVar.f1005x = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f986e = jCurrentAnimationTimeMillis;
                        aVar.f988g = -1L;
                        aVar.f987f = jCurrentAnimationTimeMillis;
                        aVar.f989h = 0.5f;
                    }
                    if ((aVar.f988g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f988g + ((long) aVar.i)) || !eVar.e()) {
                        eVar.f1006z = false;
                        return;
                    }
                    boolean z5 = eVar.y;
                    ListView listView = eVar.f995n;
                    if (z5) {
                        eVar.y = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f987f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j5 = jCurrentAnimationTimeMillis2 - aVar.f987f;
                    aVar.f987f = jCurrentAnimationTimeMillis2;
                    eVar.f992B.scrollListBy((int) (j5 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f985d));
                    Field field = I.f300a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                Worker worker = (Worker) this.f4m;
                try {
                    worker.f4777p.j(worker.f());
                    return;
                } catch (Throwable th) {
                    worker.f4777p.k(th);
                    return;
                }
            case 4:
                r rVar = (r) this.f4m;
                if (rVar.f4428T != null) {
                    rVar.a().getClass();
                    return;
                }
                return;
            case 5:
                ((L) this.f4m).z(true);
                return;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                synchronized (((C0283z) this.f4m).f4555a) {
                    obj = ((C0283z) this.f4m).f4558d;
                    ((C0283z) this.f4m).f4558d = C0283z.f4554h;
                    break;
                }
                ((C0283z) this.f4m).a(obj);
                return;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                T t4 = (T) this.f4m;
                t4.f8333w = null;
                t4.drawableStateChanged();
                return;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                ActionMenuView actionMenuView = ((Toolbar) this.f4m).f3988l;
                if (actionMenuView == null || (c0594i = actionMenuView.f3857D) == null) {
                    return;
                }
                c0594i.h();
                return;
            case 9:
                C0765f c0765f = (C0765f) this.f4m;
                int i = c0765f.f9483v;
                ValueAnimator valueAnimator = c0765f.f9482u;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                c0765f.f9483v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 10:
                AbstractC0776q abstractC0776q = ((RecyclerView) this.f4m).f4710O;
                if (abstractC0776q != null) {
                    C0761b c0761b = (C0761b) abstractC0776q;
                    ArrayList arrayList = c0761b.f9449e;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0761b.f9451g;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0761b.f9452h;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0761b.f9450f;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!zIsEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0761b.f9453j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!zIsEmpty) {
                            AbstractC0307a.q(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            AbstractC0307a.q(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!zIsEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0761b.f9454k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!zIsEmpty) {
                            AbstractC0307a.q(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            AbstractC0307a.q(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (zIsEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0761b.i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
                        Math.max(!zIsEmpty2 ? c0761b.f9507c : 0L, zIsEmpty3 ? 0L : c0761b.f9508d);
                        arrayList9.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 11:
                ((StaggeredGridLayoutManager) this.f4m).J();
                return;
            default:
                ReentrantReadWriteLock.ReadLock lock = ((s1.f) this.f4m).f9571a.f4790h.readLock();
                N3.h.d(lock, "readWriteLock.readLock()");
                lock.lock();
                try {
                    try {
                    } catch (SQLiteException e5) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
                        setA = C3.p.f293l;
                    } catch (IllegalStateException e6) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
                        setA = C3.p.f293l;
                    }
                    if (((s1.f) this.f4m).a() && ((s1.f) this.f4m).f9575e.compareAndSet(true, false) && !((s1.f) this.f4m).f9571a.h().j().n()) {
                        C1002b c1002bJ = ((s1.f) this.f4m).f9571a.h().j();
                        c1002bJ.b();
                        try {
                            setA = a();
                            c1002bJ.r();
                            if (setA.isEmpty()) {
                                return;
                            }
                            s1.f fVar = (s1.f) this.f4m;
                            synchronized (fVar.i) {
                                Iterator it5 = fVar.i.iterator();
                                while (true) {
                                    C0711b c0711b = (C0711b) it5;
                                    if (c0711b.hasNext()) {
                                        ((s1.e) ((Map.Entry) c0711b.next()).getValue()).a(setA);
                                    }
                                }
                            }
                            return;
                        } finally {
                            c1002bJ.f();
                        }
                    }
                    return;
                } finally {
                    lock.unlock();
                    ((s1.f) this.f4m).getClass();
                }
        }
    }

    public b(C0675i c0675i, int i) {
        this.f3l = 0;
        this.f4m = c0675i;
    }
}
