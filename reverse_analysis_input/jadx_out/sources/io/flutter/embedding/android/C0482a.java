package io.flutter.embedding.android;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: io.flutter.embedding.android.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0482a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Matrix f6561f = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.l f6562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.c f6563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f6565d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6566e;

    public C0482a(io.flutter.embedding.engine.renderer.l lVar, boolean z4) {
        this.f6562a = lVar;
        if (Z1.c.f2994n == null) {
            Z1.c.f2994n = new Z1.c(11);
        }
        this.f6563b = Z1.c.f2994n;
        this.f6564c = z4;
    }

    public static int b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    public final void a(MotionEvent motionEvent, int i, int i5, int i6, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i7;
        long buttonState;
        int i8;
        int i9;
        long jIncrementAndGet;
        double min;
        double max;
        MotionEvent motionEvent2;
        int i10;
        double d5;
        double d6;
        double scaledVerticalScrollFactor;
        C0482a c0482a;
        float fC;
        InputDevice.MotionRange motionRange;
        if (i5 == -1) {
            return;
        }
        int i11 = 3;
        int pointerId = (motionEvent.getPointerId(i) << 3) | (motionEvent.getToolType(i) & 7);
        int toolType = motionEvent.getToolType(i);
        if (toolType == 1) {
            i11 = 0;
        } else if (toolType == 2) {
            i11 = 2;
        } else if (toolType == 3) {
            i11 = 1;
        } else if (toolType != 4) {
            i11 = 5;
        }
        float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
        matrix.mapPoints(fArr);
        HashMap map = this.f6565d;
        if (i11 == 1) {
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194) {
                i7 = 4;
                if (i5 == 4) {
                    map.put(Integer.valueOf(pointerId), fArr);
                }
            } else {
                i7 = 4;
            }
        } else {
            i7 = 4;
            buttonState = i11 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = map.containsKey(Integer.valueOf(pointerId));
        if (zContainsKey) {
            i8 = i5 == i7 ? 7 : i5 == 5 ? 8 : (i5 == 6 || i5 == 0) ? 9 : -1;
            if (i8 == -1) {
                return;
            }
        } else {
            i8 = -1;
        }
        if (this.f6564c) {
            Z1.c cVar = this.f6563b;
            cVar.getClass();
            i9 = pointerId;
            jIncrementAndGet = Q.f6544b.incrementAndGet();
            ((LongSparseArray) cVar.f2996l).put(jIncrementAndGet, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) cVar.f2997m).add(Long.valueOf(jIncrementAndGet));
        } else {
            i9 = pointerId;
            jIncrementAndGet = 0;
        }
        int i12 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(jIncrementAndGet);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            byteBuffer.putLong(i8);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i5);
            byteBuffer.putLong(i11);
        }
        byteBuffer.putLong(i12);
        int i13 = i9;
        byteBuffer.putLong(i13);
        byteBuffer.putLong(0L);
        if (zContainsKey) {
            float[] fArr2 = (float[]) map.get(Integer.valueOf(i13));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(buttonState);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            min = 0.0d;
            max = 1.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (i11 == 2) {
            motionEvent2 = motionEvent;
            i10 = i;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i10));
            byteBuffer.putDouble(0.0d);
        } else {
            motionEvent2 = motionEvent;
            i10 = i;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i));
        byteBuffer.putDouble(motionEvent.getToolMajor(i));
        byteBuffer.putDouble(motionEvent.getToolMinor(i));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i10));
        if (i11 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i10));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i6);
        if (i12 == 1) {
            if (context != null) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 26) {
                    fC = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c0482a = this;
                } else {
                    c0482a = this;
                    fC = c0482a.c(context);
                }
                d6 = fC;
                scaledVerticalScrollFactor = i14 >= 26 ? ViewConfiguration.get(context).getScaledVerticalScrollFactor() : c0482a.c(context);
            } else {
                d6 = 48.0d;
                scaledVerticalScrollFactor = 48.0d;
            }
            double d7 = d6 * ((double) (-motionEvent2.getAxisValue(10, i10)));
            double d8 = scaledVerticalScrollFactor * ((double) (-motionEvent2.getAxisValue(9, i10)));
            byteBuffer.putDouble(d7);
            byteBuffer.putDouble(d8);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (zContainsKey) {
            float[] fArr3 = (float[]) map.get(Integer.valueOf(i13));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d5 = 0.0d;
        } else {
            d5 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d5);
        byteBuffer.putLong(0L);
        if (zContainsKey && i8 == 9) {
            map.remove(Integer.valueOf(i13));
        }
    }

    public final int c(Context context) {
        if (this.f6566e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f6566e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f6566e;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037 A[PHI: r5
      0x0037: PHI (r5v6 char) = (r5v5 char), (r5v7 char) binds: [B:17:0x002e, B:21:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.MotionEvent r16, android.graphics.Matrix r17) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.C0482a.d(android.view.MotionEvent, android.graphics.Matrix):void");
    }
}
