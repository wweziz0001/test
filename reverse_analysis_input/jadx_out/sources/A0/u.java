package A0;

import a0.C0170V;
import a0.C0172X;
import a0.C0177c;
import a0.C0190p;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Pair;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import h0.N;
import h0.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import m2.C0663w;
import m2.I;
import m2.a0;
import m2.b0;
import x0.q0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends z implements p0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a0 f151j = new C0663w(new A.c(2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f157h;
    public C0177c i;

    public u(Context context) {
        b bVar = new b(0);
        int i = m.f110A;
        m mVar = new m(new l(context));
        this.f152c = new Object();
        this.f153d = context.getApplicationContext();
        this.f154e = bVar;
        this.f156g = mVar;
        this.i = C0177c.f3322e;
        boolean zK = AbstractC0370w.K(context);
        this.f155f = zK;
        if (!zK && AbstractC0370w.f5326a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f157h = audioManager == null ? null : new p(audioManager.getSpatializer());
        }
        boolean z4 = this.f156g.f115v;
    }

    public static int b(int i, int i5) {
        if (i == 0 || i != i5) {
            return Integer.bitCount(i & i5);
        }
        return Integer.MAX_VALUE;
    }

    public static int c(C0190p c0190p, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(c0190p.f3415d)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(c0190p.f3415d);
        if (strF2 == null || strF == null) {
            return (z4 && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        int i = AbstractC0370w.f5326a;
        return strF2.split("-", 2)[0].equals(strF.split("-", 2)[0]) ? 2 : 0;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean g(m mVar, int i, C0190p c0190p) {
        if ((i & 3584) == 0) {
            return false;
        }
        C0172X c0172x = mVar.f3300m;
        if (c0172x.f3272c && (i & 2048) == 0) {
            return false;
        }
        if (c0172x.f3271b) {
            return !(c0190p.f3405F != 0 || c0190p.f3406G != 0) || ((i & 1024) != 0);
        }
        return true;
    }

    public static Pair h(int i, y yVar, int[][][] iArr, r rVar, Comparator comparator) {
        RandomAccess randomAccessU;
        boolean z4;
        y yVar2 = yVar;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < yVar2.f160a) {
            if (i == ((int[]) yVar2.f161b)[i5]) {
                q0 q0Var = ((q0[]) yVar2.f163d)[i5];
                for (int i6 = 0; i6 < q0Var.f10776a; i6++) {
                    C0170V c0170vA = q0Var.a(i6);
                    b0 b0VarA = rVar.a(i5, c0170vA, iArr[i5][i6]);
                    int i7 = c0170vA.f3261a;
                    boolean[] zArr = new boolean[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        s sVar = (s) b0VarA.get(i8);
                        int iA = sVar.a();
                        if (!zArr[i8] && iA != 0) {
                            if (iA == 1) {
                                randomAccessU = I.u(sVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(sVar);
                                for (int i9 = i8 + 1; i9 < i7; i9++) {
                                    s sVar2 = (s) b0VarA.get(i9);
                                    if (sVar2.a() == 2 && sVar.b(sVar2)) {
                                        arrayList2.add(sVar2);
                                        z4 = true;
                                        zArr[i9] = true;
                                    } else {
                                        z4 = true;
                                    }
                                }
                                randomAccessU = arrayList2;
                            }
                            arrayList.add(randomAccessU);
                        }
                    }
                }
            }
            i5++;
            yVar2 = yVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((s) list.get(i10)).f135n;
        }
        s sVar3 = (s) list.get(0);
        return Pair.create(new v(sVar3.f134m, iArr2), Integer.valueOf(sVar3.f133l));
    }

    @Override // A0.z
    public final void a(C0177c c0177c) {
        boolean zEquals;
        synchronized (this.f152c) {
            zEquals = this.i.equals(c0177c);
            this.i = c0177c;
        }
        if (zEquals) {
            return;
        }
        e();
    }

    public final m d() {
        m mVar;
        synchronized (this.f152c) {
            mVar = this.f156g;
        }
        return mVar;
    }

    public final void e() {
        boolean z4;
        N n4;
        p pVar;
        synchronized (this.f152c) {
            try {
                z4 = this.f156g.f115v && !this.f155f && AbstractC0370w.f5326a >= 32 && (pVar = this.f157h) != null && pVar.f120a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z4 || (n4 = this.f166a) == null) {
            return;
        }
        n4.f6032t.e(10);
    }

    public final void i(m mVar) {
        boolean zEquals;
        synchronized (this.f152c) {
            zEquals = this.f156g.equals(mVar);
            this.f156g = mVar;
        }
        if (zEquals) {
            return;
        }
        if (mVar.f115v && this.f153d == null) {
            AbstractC0360m.y("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        N n4 = this.f166a;
        if (n4 != null) {
            n4.f6032t.e(10);
        }
    }
}
