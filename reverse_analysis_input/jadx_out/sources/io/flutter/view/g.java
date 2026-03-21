package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import b3.AbstractC0307a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f6876A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f6879D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f6880E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f6881F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f6882G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f6883H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f6884I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f6885J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f6886K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f6887L;
    public float M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f6888N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float[] f6889O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public g f6890P;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ArrayList f6893S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public e f6894T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public e f6895U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float[] f6897W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float[] f6899Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Rect f6900Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f6901a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6908h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f6911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f6912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f6914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f6915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f6916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f6917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f6918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f6919t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f6920u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f6921v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f6922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f6923x;
    public ArrayList y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f6924z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6902b = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f6877B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f6878C = false;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f6891Q = new ArrayList();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final ArrayList f6892R = new ArrayList();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f6896V = true;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f6898X = true;

    public g(k kVar) {
        this.f6901a = kVar;
    }

    public static boolean a(g gVar, d dVar) {
        return (gVar.f6904d & dVar.f6869l) != 0;
    }

    public static CharSequence b(g gVar) {
        CharSequence[] charSequenceArr = {e(gVar.f6917r, gVar.f6918s), gVar.f(), e(gVar.f6923x, gVar.y)};
        CharSequence charSequenceConcat = null;
        for (int i = 0; i < 3; i++) {
            CharSequence charSequence = charSequenceArr[i];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static boolean c(g gVar, d dVar) {
        return (gVar.f6880E & dVar.f6869l) != 0;
    }

    public static SpannableString e(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                int iB = O.i.b(iVar.f6927c);
                if (iB == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), iVar.f6925a, iVar.f6926b, 0);
                } else if (iB == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((f) iVar).f6875d)), iVar.f6925a, iVar.f6926b, 0);
                } else if (iB == 2) {
                    spannableString.setSpan(new URLSpan(((j) iVar).f6928d), iVar.f6925a, iVar.f6926b, 0);
                }
            }
        }
        return spannableString;
    }

    public static ArrayList h(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            int i8 = O.i.c(3)[byteBuffer.getInt()];
            int iB = O.i.b(i8);
            if (iB == 0) {
                byteBuffer.getInt();
                h hVar = new h();
                hVar.f6925a = i6;
                hVar.f6926b = i7;
                hVar.f6927c = i8;
                arrayList.add(hVar);
            } else if (iB == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                f fVar = new f();
                fVar.f6925a = i6;
                fVar.f6926b = i7;
                fVar.f6927c = i8;
                fVar.f6875d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public static void l(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public final void d(ArrayList arrayList) {
        if (i(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f6891Q.iterator();
        while (it.hasNext()) {
            ((g) it.next()).d(arrayList);
        }
    }

    public final SpannableString f() {
        ArrayList arrayList = this.f6916q;
        String str = this.f6876A;
        if (str != null && str.length() > 0) {
            arrayList = arrayList == null ? new ArrayList() : new ArrayList(arrayList);
            j jVar = new j();
            jVar.f6925a = 0;
            jVar.f6926b = this.f6915p.length();
            jVar.f6928d = this.f6876A;
            jVar.f6927c = 3;
            arrayList.add(jVar);
        }
        return e(this.f6915p, arrayList);
    }

    public final String g() {
        String str;
        if (i(13) && (str = this.f6915p) != null && !str.isEmpty()) {
            return this.f6915p;
        }
        Iterator it = this.f6891Q.iterator();
        while (it.hasNext()) {
            String strG = ((g) it.next()).g();
            if (strG != null && !strG.isEmpty()) {
                return strG;
            }
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.f6903c & ((long) AbstractC0307a.c(i))) != 0;
    }

    public final g j(float[] fArr, boolean z4) {
        float f2 = fArr[3];
        boolean z5 = false;
        float f5 = fArr[0] / f2;
        float f6 = fArr[1] / f2;
        if (f5 < this.f6886K || f5 >= this.M || f6 < this.f6887L || f6 >= this.f6888N) {
            return null;
        }
        float[] fArr2 = new float[4];
        for (g gVar : this.f6892R) {
            if (!gVar.i(14)) {
                if (gVar.f6896V) {
                    gVar.f6896V = false;
                    if (gVar.f6897W == null) {
                        gVar.f6897W = new float[16];
                    }
                    if (!Matrix.invertM(gVar.f6897W, 0, gVar.f6889O, 0)) {
                        Arrays.fill(gVar.f6897W, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, gVar.f6897W, 0, fArr, 0);
                g gVarJ = gVar.j(fArr2, z4);
                if (gVarJ != null) {
                    return gVarJ;
                }
            }
        }
        if (z4 && this.i != -1) {
            z5 = true;
        }
        if (k() || z5) {
            return this;
        }
        return null;
    }

    public final boolean k() {
        String str;
        String str2;
        String str3;
        if (i(12)) {
            return false;
        }
        if (i(22)) {
            return true;
        }
        int i = this.f6904d;
        int i5 = k.y;
        return ((i & (-61)) == 0 && (this.f6903c & ((long) 10682871)) == 0 && ((str = this.f6915p) == null || str.isEmpty()) && (((str2 = this.f6917r) == null || str2.isEmpty()) && ((str3 = this.f6923x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void m(float[] fArr, HashSet hashSet, boolean z4) {
        hashSet.add(this);
        if (this.f6898X) {
            z4 = true;
        }
        if (z4) {
            if (this.f6899Y == null) {
                this.f6899Y = new float[16];
            }
            if (this.f6889O == null) {
                this.f6889O = new float[16];
            }
            Matrix.multiplyMM(this.f6899Y, 0, fArr, 0, this.f6889O, 0);
            float[] fArr2 = {this.f6886K, this.f6887L, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            l(fArr3, this.f6899Y, fArr2);
            fArr2[0] = this.M;
            fArr2[1] = this.f6887L;
            l(fArr4, this.f6899Y, fArr2);
            fArr2[0] = this.M;
            fArr2[1] = this.f6888N;
            l(fArr5, this.f6899Y, fArr2);
            fArr2[0] = this.f6886K;
            fArr2[1] = this.f6888N;
            l(fArr6, this.f6899Y, fArr2);
            if (this.f6900Z == null) {
                this.f6900Z = new Rect();
            }
            this.f6900Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f6898X = false;
        }
        int i = -1;
        for (g gVar : this.f6891Q) {
            gVar.f6877B = i;
            i = gVar.f6902b;
            gVar.m(this.f6899Y, hashSet, z4);
        }
    }
}
