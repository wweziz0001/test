package D0;

import D.I;
import F0.C0062i;
import F0.C0066m;
import F0.InterfaceC0063j;
import a.AbstractC0149a;
import a0.C0157H;
import a0.C0190p;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.lifecycle.E;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import d0.C0368u;
import h.AbstractC0441a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l2.C0577c;
import m.C0604n;
import m.I0;
import m.M;
import m2.AbstractC0636C;
import m2.C0640G;
import m2.J;
import m2.K;
import m2.e0;
import m2.g0;
import m2.q0;
import m3.C0675i;
import t0.C0855l;
import t0.C0856m;
import y1.C1002b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements T2.h, InterfaceC0063j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f396n;

    public /* synthetic */ d(int i, boolean z4) {
        this.f394l = i;
    }

    public static void g(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z4 ? i : length);
            boolean z5 = cCharAt < ' ' || cCharAt == ' ';
            if (z4) {
                if (!z5) {
                    break;
                } else {
                    length--;
                }
            } else if (z5) {
                i++;
            } else {
                z4 = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e5) {
            Log.w("SupportSQLite", "delete failed: ", e5);
        }
    }

    @Override // T2.h
    public void b() {
        HandlerThread handlerThread = (HandlerThread) this.f395m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f395m = null;
            this.f396n = null;
        }
    }

    @Override // T2.h
    public void c(T2.f fVar) {
        ((Handler) this.f396n).post(fVar.f2206b);
    }

    public void d() {
        I0 i02;
        ImageView imageView = (ImageView) this.f395m;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            M.a(drawable);
        }
        if (drawable == null || (i02 = (I0) this.f396n) == null) {
            return;
        }
        C0604n.c(drawable, i02, imageView.getDrawableState());
    }

    @Override // F0.InterfaceC0063j
    public C0062i e(C0066m c0066m, long j5) {
        long j6 = c0066m.f799o;
        int iMin = (int) Math.min(112800, c0066m.f798n - j6);
        C0363p c0363p = (C0363p) this.f396n;
        c0363p.E(iMin);
        c0066m.t(c0363p.f5313a, 0, iMin, false);
        int i = c0363p.f5315c;
        long j7 = -1;
        long j8 = -1;
        long j9 = -9223372036854775807L;
        while (c0363p.a() >= 188) {
            byte[] bArr = c0363p.f5313a;
            int i5 = c0363p.f5314b;
            while (i5 < i && bArr[i5] != 71) {
                i5++;
            }
            int i6 = i5 + 188;
            if (i6 > i) {
                break;
            }
            long jG = Z1.f.G(c0363p, i5, this.f394l);
            if (jG != -9223372036854775807L) {
                long jB = ((C0368u) this.f395m).b(jG);
                if (jB > j5) {
                    return j9 == -9223372036854775807L ? new C0062i(-1, jB, j6) : new C0062i(0, -9223372036854775807L, j6 + j8);
                }
                if (100000 + jB > j5) {
                    return new C0062i(0, -9223372036854775807L, j6 + ((long) i5));
                }
                j8 = i5;
                j9 = jB;
            }
            c0363p.H(i6);
            j7 = i6;
        }
        return j9 != -9223372036854775807L ? new C0062i(-2, j9, j6 + j7) : C0062i.f779d;
    }

    public g0 f() {
        K k4 = (K) this.f396n;
        if (k4 != null) {
            throw k4.a();
        }
        g0 g0VarB = g0.b(this.f394l, (Object[]) this.f395m, this);
        K k5 = (K) this.f396n;
        if (k5 == null) {
            return g0VarB;
        }
        throw k5.a();
    }

    public Object h(int i) {
        SparseArray sparseArray;
        if (this.f394l == -1) {
            this.f394l = 0;
        }
        while (true) {
            int i5 = this.f394l;
            sparseArray = (SparseArray) this.f395m;
            if (i5 <= 0 || i >= sparseArray.keyAt(i5)) {
                break;
            }
            this.f394l--;
        }
        while (this.f394l < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f394l + 1)) {
            this.f394l++;
        }
        return sparseArray.valueAt(this.f394l);
    }

    public t0.z i(int i, String str, Map map, Uri uri) {
        C0855l c0855l = (C0855l) this.f396n;
        String str2 = c0855l.f9917n;
        int i5 = this.f394l;
        this.f394l = i5 + 1;
        C0675i c0675i = new C0675i(i5, str2, str);
        if (c0855l.y != null) {
            AbstractC0360m.i(c0855l.f9924u);
            try {
                c0675i.c("Authorization", c0855l.y.b(c0855l.f9924u, uri, i));
            } catch (C0157H e5) {
                C0855l.c(c0855l, new K3.b(e5));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            c0675i.c((String) entry.getKey(), (String) entry.getValue());
        }
        return new t0.z(uri, i, new C0856m(c0675i), "");
    }

    public void j(int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f395m;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0441a.f5886e;
        Z1.s sVarM = Z1.s.M(context, null, iArr, i);
        I.c(imageView, imageView.getContext(), iArr, null, (TypedArray) sVarM.f3086n, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) sVarM.f3086n;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0149a.u(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                M.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                I.d.c(imageView, sVarM.C(2));
            }
            if (typedArray.hasValue(3)) {
                I.d.d(imageView, M.c(typedArray.getInt(3, -1), null));
            }
            sVarM.O();
        } catch (Throwable th) {
            sVarM.O();
            throw th;
        }
    }

    public void k(C1002b c1002b) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(y1.C1002b r5) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r0 = r5.p(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L17
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            r1 = 1
            goto L18
        L15:
            r5 = move-exception
            goto L6d
        L17:
            r1 = r2
        L18:
            r3 = 0
            Z1.f.f(r0, r3)
            java.lang.Object r0 = r4.f396n
            B0.d r0 = (B0.d) r0
            B0.d.g(r5)
            if (r1 != 0) goto L46
            a0.m r1 = B0.d.m(r5)
            boolean r3 = r1.f3362a
            if (r3 == 0) goto L2e
            goto L46
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.Object r1 = r1.f3363b
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L46:
            java.lang.String r1 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r5.k(r1)
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')"
            r5.k(r1)
            java.lang.Object r5 = r0.f190l
            androidx.work.impl.WorkDatabase_Impl r5 = (androidx.work.impl.WorkDatabase_Impl) r5
            java.util.ArrayList r0 = r5.f4788f
            if (r0 == 0) goto L6c
            int r0 = r0.size()
        L5c:
            if (r2 >= r0) goto L6c
            java.util.ArrayList r1 = r5.f4788f
            java.lang.Object r1 = r1.get(r2)
            R1.b r1 = (R1.b) r1
            r1.getClass()
            int r2 = r2 + 1
            goto L5c
        L6c:
            return
        L6d:
            throw r5     // Catch: java.lang.Throwable -> L6e
        L6e:
            r1 = move-exception
            Z1.f.f(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.d.l(y1.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(y1.C1002b r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.d.m(y1.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0041 A[EDGE_INSN: B:108:0x0041->B:17:0x0041 BREAK  A[LOOP:3: B:11:0x002a->B:111:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(y1.C1002b r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.d.n(y1.b, int, int):void");
    }

    public void o(Object obj, Object obj2) {
        int i = (this.f394l + 1) * 2;
        Object[] objArr = (Object[]) this.f395m;
        if (i > objArr.length) {
            this.f395m = Arrays.copyOf(objArr, AbstractC0636C.f(objArr.length, i));
        }
        m2.r.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.f395m;
        int i5 = this.f394l;
        int i6 = i5 * 2;
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        this.f394l = i5 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p() {
        AbstractC0360m.i((t0.z) this.f395m);
        C0856m c0856m = ((t0.z) this.f395m).f9999c;
        HashMap map = new HashMap();
        J j5 = c0856m.f9929a;
        q0 q0VarL = ((e0) j5.f8550o.keySet()).iterator();
        while (true) {
            C0640G c0640g = (C0640G) q0VarL;
            if (!c0640g.hasNext()) {
                t0.z zVar = (t0.z) this.f395m;
                r(i(zVar.f9998b, ((C0855l) this.f396n).f9925v, map, zVar.f9997a));
                return;
            }
            String str = (String) c0640g.next();
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                map.put(str, (String) m2.r.l(j5.d(str)));
            }
        }
    }

    public void q(Uri uri, String str) {
        r(i(2, str, g0.b(1, new Object[]{"Accept", "application/sdp"}, null), uri));
    }

    public void r(t0.z zVar) {
        String strC = zVar.f9999c.c("CSeq");
        strC.getClass();
        int i = Integer.parseInt(strC);
        C0855l c0855l = (C0855l) this.f396n;
        AbstractC0360m.h(c0855l.f9920q.get(i) == null);
        c0855l.f9920q.append(i, zVar);
        c0855l.f9923t.b(t0.y.g(zVar));
        this.f395m = zVar;
    }

    public List s(CharSequence charSequence) {
        charSequence.getClass();
        E e5 = (E) this.f396n;
        e5.getClass();
        l2.g gVar = new l2.g(e5, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (gVar.hasNext()) {
            arrayList.add((String) gVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // T2.h
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f394l);
        this.f395m = handlerThread;
        handlerThread.start();
        this.f396n = new Handler(((HandlerThread) this.f395m).getLooper());
    }

    @Override // F0.InterfaceC0063j
    public void t() {
        byte[] bArr = AbstractC0370w.f5331f;
        C0363p c0363p = (C0363p) this.f396n;
        c0363p.getClass();
        c0363p.F(bArr.length, bArr);
    }

    public d(int i, C0856m c0856m, String str) {
        this.f394l = i;
        this.f395m = c0856m;
        this.f396n = str;
    }

    public d(ImageView imageView) {
        this.f394l = 0;
        this.f395m = imageView;
    }

    public d(E e5) {
        this.f396n = e5;
        this.f395m = C0577c.f8207l;
        this.f394l = Integer.MAX_VALUE;
    }

    public d(int i) {
        this.f395m = new Object[i * 2];
        this.f394l = 0;
    }

    public d(C0190p c0190p, int i, String str) {
        this.f395m = c0190p;
        this.f394l = i;
        this.f396n = str;
    }
}
