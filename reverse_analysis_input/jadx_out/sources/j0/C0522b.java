package j0;

import a0.AbstractC0156G;
import a0.C0177c;
import a0.C0190p;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.util.Pair;
import android.util.SparseArray;
import androidx.lifecycle.E;
import d0.AbstractC0370w;
import java.util.Objects;
import m2.C0639F;
import m2.I;
import m2.M;
import m2.b0;
import m2.g0;

/* JADX INFO: renamed from: j0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0522b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0522b f7250c = new C0522b(I.u(C0521a.f7246d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f7251d = I.w(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f7252e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f7253a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7254b;

    static {
        D0.d dVar = new D0.d(4);
        dVar.o(5, 6);
        dVar.o(17, 6);
        dVar.o(7, 6);
        dVar.o(30, 10);
        dVar.o(18, 6);
        dVar.o(6, 8);
        dVar.o(8, 8);
        dVar.o(14, 8);
        f7252e = dVar.f();
    }

    public C0522b(b0 b0Var) {
        for (int i = 0; i < b0Var.f8585o; i++) {
            C0521a c0521a = (C0521a) b0Var.get(i);
            this.f7253a.put(c0521a.f7247a, c0521a);
        }
        int iMax = 0;
        for (int i5 = 0; i5 < this.f7253a.size(); i5++) {
            iMax = Math.max(iMax, ((C0521a) this.f7253a.valueAt(i5)).f7248b);
        }
        this.f7254b = iMax;
    }

    public static b0 a(int[] iArr, int i) {
        C0639F c0639fN = I.n();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i5 : iArr) {
            c0639fN.a(new C0521a(i5, i));
        }
        return c0639fN.g();
    }

    public static C0522b b(Context context, C0177c c0177c, E e5) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0177c, e5);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j0.C0522b c(android.content.Context r16, android.content.Intent r17, a0.C0177c r18, androidx.lifecycle.E r19) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0522b.c(android.content.Context, android.content.Intent, a0.c, androidx.lifecycle.E):j0.b");
    }

    public final Pair d(C0177c c0177c, C0190p c0190p) {
        String str = c0190p.f3424n;
        str.getClass();
        int iC = AbstractC0156G.c(str, c0190p.f3421k);
        Integer numValueOf = Integer.valueOf(iC);
        g0 g0Var = f7252e;
        if (!g0Var.containsKey(numValueOf)) {
            return null;
        }
        if (iC == 18 && !e(18)) {
            iC = 6;
        } else if ((iC == 8 && !e(8)) || (iC == 30 && !e(30))) {
            iC = 7;
        }
        if (!e(iC)) {
            return null;
        }
        C0521a c0521a = (C0521a) this.f7253a.get(iC);
        c0521a.getClass();
        int i = 0;
        zContains = false;
        boolean zContains = false;
        int i5 = 10;
        int iIntValue = c0521a.f7248b;
        M m4 = c0521a.f7249c;
        int i6 = c0190p.f3402C;
        if (i6 == -1 || iC == 18) {
            int i7 = c0190p.f3403D;
            if (i7 == -1) {
                i7 = 48000;
            }
            if (m4 == null) {
                int i8 = AbstractC0370w.f5326a;
                int i9 = c0521a.f7247a;
                if (i8 >= 29) {
                    while (true) {
                        if (i5 <= 0) {
                            break;
                        }
                        int iR = AbstractC0370w.r(i5);
                        if (iR != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i7).setChannelMask(iR).build(), (AudioAttributes) c0177c.a().f190l)) {
                            i = i5;
                            break;
                        }
                        i5--;
                    }
                    iIntValue = i;
                } else {
                    Object obj = g0Var.get(Integer.valueOf(i9));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i6 = iIntValue;
        } else if (!c0190p.f3424n.equals("audio/vnd.dts.uhd;profile=p2") || AbstractC0370w.f5326a >= 33) {
            if (m4 != null) {
                int iR2 = AbstractC0370w.r(i6);
                if (iR2 != 0) {
                    zContains = m4.contains(Integer.valueOf(iR2));
                }
            } else if (i6 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i6 > 10) {
            return null;
        }
        int i10 = AbstractC0370w.f5326a;
        if (i10 <= 28) {
            if (i6 == 7) {
                i6 = 8;
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                i6 = 6;
            }
        }
        if (i10 <= 26 && "fugu".equals(AbstractC0370w.f5327b) && i6 == 1) {
            i6 = 2;
        }
        int iR3 = AbstractC0370w.r(i6);
        if (iR3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iR3));
    }

    public final boolean e(int i) {
        SparseArray sparseArray = this.f7253a;
        int i5 = AbstractC0370w.f5326a;
        return sparseArray.indexOfKey(i) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[EDGE_INSN: B:13:0x0019->B:27:0x004a BREAK  A[LOOP:0: B:21:0x0032->B:25:0x0047]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof j0.C0522b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j0.b r9 = (j0.C0522b) r9
            android.util.SparseArray r1 = r8.f7253a
            android.util.SparseArray r3 = r9.f7253a
            int r4 = d0.AbstractC0370w.f5326a
            if (r1 != 0) goto L17
            if (r3 != 0) goto L19
            goto L49
        L17:
            if (r3 != 0) goto L1b
        L19:
            r1 = r2
            goto L4a
        L1b:
            int r4 = d0.AbstractC0370w.f5326a
            r5 = 31
            if (r4 < r5) goto L26
            boolean r1 = S2.c.v(r1, r3)
            goto L4a
        L26:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L31
            goto L19
        L31:
            r5 = r2
        L32:
            if (r5 >= r4) goto L49
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L47
            goto L19
        L47:
            int r5 = r5 + r0
            goto L32
        L49:
            r1 = r0
        L4a:
            if (r1 == 0) goto L53
            int r1 = r8.f7254b
            int r9 = r9.f7254b
            if (r1 != r9) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0522b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.f7253a;
        if (AbstractC0370w.f5326a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i = 0; i < sparseArray.size(); i++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i)) + ((sparseArray.keyAt(i) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f7254b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f7254b + ", audioProfiles=" + this.f7253a + "]";
    }
}
