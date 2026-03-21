package A0;

import D.AbstractC0025z;
import D.I;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import d0.AbstractC0370w;
import d0.C0363p;
import h.AbstractC0441a;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import m.C0604n;
import m.I0;
import m.M;
import x0.q0;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f165f;

    public y(View view) {
        C0604n c0604n;
        this.f160a = -1;
        this.f161b = view;
        PorterDuff.Mode mode = C0604n.f8454b;
        synchronized (C0604n.class) {
            try {
                if (C0604n.f8455c == null) {
                    C0604n.b();
                }
                c0604n = C0604n.f8455c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f162c = c0604n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r8 < r0.f5550m) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r8, d0.C0363p r10) {
        /*
            r7 = this;
            int r0 = r7.f160a
            if (r0 == 0) goto La1
            java.lang.Object r1 = r7.f164e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -1
            if (r0 == r2) goto L23
            int r0 = r1.size()
            int r3 = r7.f160a
            if (r0 < r3) goto L23
            java.lang.Object r0 = r1.peek()
            e0.o r0 = (e0.o) r0
            int r3 = d0.AbstractC0370w.f5326a
            long r3 = r0.f5550m
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L23
            goto La1
        L23:
            java.lang.Object r0 = r7.f162c
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L33
            d0.p r0 = new d0.p
            r0.<init>()
            goto L39
        L33:
            java.lang.Object r0 = r0.pop()
            d0.p r0 = (d0.C0363p) r0
        L39:
            int r3 = r10.a()
            r0.E(r3)
            byte[] r3 = r10.f5313a
            int r10 = r10.f5314b
            byte[] r4 = r0.f5313a
            int r5 = r0.a()
            r6 = 0
            java.lang.System.arraycopy(r3, r10, r4, r6, r5)
            java.lang.Object r10 = r7.f165f
            e0.o r10 = (e0.o) r10
            if (r10 == 0) goto L60
            long r3 = r10.f5550m
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L60
            java.util.ArrayList r8 = r10.f5549l
            r8.add(r0)
            return
        L60:
            java.lang.Object r10 = r7.f163d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L70
            e0.o r10 = new e0.o
            r10.<init>()
            goto L76
        L70:
            java.lang.Object r10 = r10.pop()
            e0.o r10 = (e0.o) r10
        L76:
            r10.getClass()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L83
            r6 = 1
        L83:
            d0.AbstractC0360m.c(r6)
            java.util.ArrayList r3 = r10.f5549l
            boolean r4 = r3.isEmpty()
            d0.AbstractC0360m.h(r4)
            r10.f5550m = r8
            r3.add(r0)
            r1.add(r10)
            r7.f165f = r10
            int r8 = r7.f160a
            if (r8 == r2) goto La0
            r7.c(r8)
        La0:
            return
        La1:
            java.lang.Object r0 = r7.f161b
            e0.p r0 = (e0.p) r0
            r0.d(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.y.a(long, d0.p):void");
    }

    public void b() {
        View view = (View) this.f161b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((I0) this.f163d) != null) {
                if (((I0) this.f165f) == null) {
                    this.f165f = new I0();
                }
                I0 i02 = (I0) this.f165f;
                i02.f8278a = null;
                i02.f8281d = false;
                i02.f8279b = null;
                i02.f8280c = false;
                Field field = I.f300a;
                ColorStateList colorStateListG = AbstractC0025z.g(view);
                if (colorStateListG != null) {
                    i02.f8281d = true;
                    i02.f8278a = colorStateListG;
                }
                PorterDuff.Mode modeH = AbstractC0025z.h(view);
                if (modeH != null) {
                    i02.f8280c = true;
                    i02.f8279b = modeH;
                }
                if (i02.f8281d || i02.f8280c) {
                    C0604n.c(background, i02, view.getDrawableState());
                    return;
                }
            }
            I0 i03 = (I0) this.f164e;
            if (i03 != null) {
                C0604n.c(background, i03, view.getDrawableState());
                return;
            }
            I0 i04 = (I0) this.f163d;
            if (i04 != null) {
                C0604n.c(background, i04, view.getDrawableState());
            }
        }
    }

    public void c(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f164e;
            if (priorityQueue.size() <= i) {
                return;
            }
            e0.o oVar = (e0.o) priorityQueue.poll();
            int i5 = AbstractC0370w.f5326a;
            int i6 = 0;
            while (true) {
                int size = oVar.f5549l.size();
                arrayList = oVar.f5549l;
                if (i6 >= size) {
                    break;
                }
                ((e0.p) this.f161b).d(oVar.f5550m, (C0363p) arrayList.get(i6));
                ((ArrayDeque) this.f162c).push((C0363p) arrayList.get(i6));
                i6++;
            }
            arrayList.clear();
            e0.o oVar2 = (e0.o) this.f165f;
            if (oVar2 != null && oVar2.f5550m == oVar.f5550m) {
                this.f165f = null;
            }
            ((ArrayDeque) this.f163d).push(oVar);
        }
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = (View) this.f161b;
        Context context = view.getContext();
        int[] iArr = AbstractC0441a.f5901u;
        Z1.s sVarM = Z1.s.M(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) sVarM.f3086n;
        View view2 = (View) this.f161b;
        I.c(view2, view2.getContext(), iArr, attributeSet, (TypedArray) sVarM.f3086n, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f160a = typedArray.getResourceId(0, -1);
                C0604n c0604n = (C0604n) this.f162c;
                Context context2 = view.getContext();
                int i5 = this.f160a;
                synchronized (c0604n) {
                    colorStateListF = c0604n.f8456a.f(context2, i5);
                }
                if (colorStateListF != null) {
                    f(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0025z.q(view, sVarM.C(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0025z.r(view, M.c(typedArray.getInt(2, -1), null));
            }
        } finally {
            sVarM.O();
        }
    }

    public void e(int i) {
        ColorStateList colorStateListF;
        this.f160a = i;
        C0604n c0604n = (C0604n) this.f162c;
        if (c0604n != null) {
            Context context = ((View) this.f161b).getContext();
            synchronized (c0604n) {
                colorStateListF = c0604n.f8456a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        f(colorStateListF);
        b();
    }

    public void f(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((I0) this.f163d) == null) {
                this.f163d = new I0();
            }
            I0 i02 = (I0) this.f163d;
            i02.f8278a = colorStateList;
            i02.f8281d = true;
        } else {
            this.f163d = null;
        }
        b();
    }

    public void g(ColorStateList colorStateList) {
        if (((I0) this.f164e) == null) {
            this.f164e = new I0();
        }
        I0 i02 = (I0) this.f164e;
        i02.f8278a = colorStateList;
        i02.f8281d = true;
        b();
    }

    public void h(PorterDuff.Mode mode) {
        if (((I0) this.f164e) == null) {
            this.f164e = new I0();
        }
        I0 i02 = (I0) this.f164e;
        i02.f8279b = mode;
        i02.f8280c = true;
        b();
    }

    public y(e0.p pVar) {
        this.f161b = pVar;
        this.f162c = new ArrayDeque();
        this.f163d = new ArrayDeque();
        this.f164e = new PriorityQueue();
        this.f160a = -1;
    }

    public y(int[] iArr, q0[] q0VarArr, int[] iArr2, int[][][] iArr3, q0 q0Var) {
        this.f161b = iArr;
        this.f163d = q0VarArr;
        this.f164e = iArr3;
        this.f162c = iArr2;
        this.f165f = q0Var;
        this.f160a = iArr.length;
    }
}
