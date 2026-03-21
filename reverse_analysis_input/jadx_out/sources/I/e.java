package I;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import m.T;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f990C = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f991A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final T f992B;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AccelerateInterpolator f994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ListView f995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A.b f996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f1001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f1002u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f1003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1005x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1006z;

    public e(T t4) {
        a aVar = new a();
        aVar.f986e = Long.MIN_VALUE;
        aVar.f988g = -1L;
        aVar.f987f = 0L;
        this.f993l = aVar;
        this.f994m = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f997p = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f998q = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1001t = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1002u = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1003v = fArr5;
        this.f995n = t4;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        float f6 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f6;
        fArr4[1] = f6;
        this.f999r = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1000s = f990C;
        aVar.f982a = 500;
        aVar.f983b = 500;
        this.f992B = t4;
    }

    public static float b(float f2, float f5, float f6) {
        return f2 > f6 ? f6 : f2 < f5 ? f5 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f997p
            r0 = r0[r4]
            float[] r1 = r3.f998q
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f994m
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f1001t
            r0 = r0[r4]
            float[] r1 = r3.f1002u
            r1 = r1[r4]
            float[] r2 = r3.f1003v
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I.e.a(int, float, float, float):float");
    }

    public final float c(float f2, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i = this.f999r;
        if (i == 0 || i == 1) {
            if (f2 < f5) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f5);
                }
                if (this.f1006z && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f5);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f1005x) {
            this.f1006z = false;
            return;
        }
        a aVar = this.f993l;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i5 = (int) (jCurrentAnimationTimeMillis - aVar.f986e);
        int i6 = aVar.f983b;
        if (i5 > i6) {
            i = i6;
        } else if (i5 >= 0) {
            i = i5;
        }
        aVar.i = i;
        aVar.f989h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f988g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        T t4;
        int count;
        a aVar = this.f993l;
        float f2 = aVar.f985d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f984c);
        if (iAbs == 0 || (count = (t4 = this.f992B).getCount()) == 0) {
            return false;
        }
        int childCount = t4.getChildCount();
        int firstVisiblePosition = t4.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i >= count && t4.getChildAt(childCount - 1).getBottom() <= t4.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && t4.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 2
            boolean r1 = r7.f991A
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r0) goto L1e
            r8 = 3
            if (r1 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.y = r3
            r7.f1004w = r2
        L1e:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.f995n
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r2, r1, r4, r6)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r3, r9, r8, r4)
            I.a r9 = r7.f993l
            r9.f984c = r1
            r9.f985d = r8
            boolean r8 = r7.f1006z
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            A.b r8 = r7.f996o
            if (r8 != 0) goto L5f
            A.b r8 = new A.b
            r8.<init>(r7, r0)
            r7.f996o = r8
        L5f:
            r7.f1006z = r3
            r7.f1005x = r3
            boolean r8 = r7.f1004w
            if (r8 != 0) goto L74
            int r8 = r7.f1000s
            if (r8 <= 0) goto L74
            A.b r9 = r7.f996o
            long r0 = (long) r8
            java.lang.reflect.Field r8 = D.I.f300a
            r5.postOnAnimationDelayed(r9, r0)
            goto L79
        L74:
            A.b r8 = r7.f996o
            r8.run()
        L79:
            r7.f1004w = r3
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: I.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
