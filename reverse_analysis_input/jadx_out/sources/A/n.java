package A;

import Q1.A;
import Q1.B;
import Q1.C;
import Q1.C0121d;
import Q1.r;
import Z1.o;
import Z1.p;
import Z1.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f36l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f37m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f38n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f39o;

    public /* synthetic */ n() {
        this.f36l = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList a() {
        int i;
        ArrayList arrayList;
        long jF;
        q qVarT = ((R1.q) this.f38n).f1912e.t();
        qVarT.getClass();
        int i5 = 1;
        s1.j jVarC = s1.j.c("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        jVarC.h((String) this.f39o, 1);
        WorkDatabase_Impl workDatabase_Impl = qVarT.f3068a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, true);
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                while (true) {
                    i = 0;
                    if (!cursorL0.moveToNext()) {
                        break;
                    }
                    String string = cursorL0.getString(0);
                    if (((ArrayList) map.get(string)) == null) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorL0.getString(0);
                    if (((ArrayList) map2.get(string2)) == null) {
                        map2.put(string2, new ArrayList());
                    }
                }
                cursorL0.moveToPosition(-1);
                qVarT.b(map);
                qVarT.a(map2);
                ArrayList arrayList2 = new ArrayList(cursorL0.getCount());
                while (cursorL0.moveToNext()) {
                    String string3 = cursorL0.isNull(0) ? null : cursorL0.getString(0);
                    int iE0 = C.e0(cursorL0.getInt(1));
                    Q1.g gVarA = Q1.g.a(cursorL0.isNull(2) ? null : cursorL0.getBlob(2));
                    int i6 = cursorL0.getInt(3);
                    int i7 = cursorL0.getInt(4);
                    long j5 = cursorL0.getLong(13);
                    long j6 = cursorL0.getLong(14);
                    long j7 = cursorL0.getLong(15);
                    int iB0 = C.b0(cursorL0.getInt(16));
                    long j8 = cursorL0.getLong(17);
                    long j9 = cursorL0.getLong(18);
                    int i8 = cursorL0.getInt(19);
                    long j10 = cursorL0.getLong(20);
                    int i9 = cursorL0.getInt(21);
                    C0121d c0121d = new C0121d(C.c0(cursorL0.getInt(5)), cursorL0.getInt(6) != 0, cursorL0.getInt(7) != 0, cursorL0.getInt(8) != 0, cursorL0.getInt(9) != 0, cursorL0.getLong(10), cursorL0.getLong(11), C.e(cursorL0.isNull(12) ? null : cursorL0.getBlob(12)));
                    ArrayList arrayList3 = (ArrayList) map.get(cursorL0.getString(0));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    ArrayList arrayList4 = arrayList3;
                    ArrayList arrayList5 = (ArrayList) map2.get(cursorL0.getString(0));
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList2.add(new o(string3, iE0, gVarA, j5, j6, j7, c0121d, i6, iB0, j8, j9, i8, i7, j10, i9, arrayList4, arrayList5));
                }
                workDatabase_Impl.o();
                cursorL0.close();
                jVarC.f();
                workDatabase_Impl.k();
                p.y.getClass();
                ArrayList arrayList6 = new ArrayList(C3.h.R(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    ArrayList arrayList7 = oVar.f3044q;
                    Q1.g gVar = !arrayList7.isEmpty() ? (Q1.g) arrayList7.get(i) : Q1.g.f1823c;
                    UUID uuidFromString = UUID.fromString(oVar.f3029a);
                    N3.h.d(uuidFromString, "fromString(id)");
                    HashSet hashSet = new HashSet(oVar.f3043p);
                    N3.h.d(gVar, "progress");
                    long j11 = oVar.f3033e;
                    A a5 = j11 != 0 ? new A(j11, oVar.f3034f) : null;
                    int i10 = oVar.f3036h;
                    Iterator it2 = it;
                    long j12 = oVar.f3032d;
                    int i11 = oVar.f3030b;
                    if (i11 == i5) {
                        String str = p.f3045x;
                        arrayList = arrayList6;
                        jF = i4.a.f((i11 != i5 || i10 <= 0) ? 0 : i5, i10, oVar.i, oVar.f3037j, oVar.f3038k, oVar.f3039l, j11 != 0 ? i5 : 0, j12, oVar.f3034f, j11, oVar.f3041n);
                    } else {
                        arrayList = arrayList6;
                        jF = Long.MAX_VALUE;
                    }
                    long j13 = jF;
                    Q1.g gVar2 = gVar;
                    B b4 = new B(uuidFromString, oVar.f3030b, hashSet, oVar.f3031c, gVar2, i10, oVar.f3040m, oVar.f3035g, j12, a5, j13, oVar.f3042o);
                    ArrayList arrayList8 = arrayList;
                    arrayList8.add(b4);
                    arrayList6 = arrayList8;
                    it = it2;
                    i5 = 1;
                    i = 0;
                }
                return arrayList6;
            } catch (Throwable th) {
                cursorL0.close();
                jVarC.f();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.k();
            throw th2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.n.run():void");
    }

    public /* synthetic */ n(Object obj, Object obj2, InterfaceC0706p interfaceC0706p, int i) {
        this.f36l = i;
        this.f39o = obj;
        this.f37m = obj2;
        this.f38n = interfaceC0706p;
    }

    public n(R1.f fVar, R1.k kVar, r rVar) {
        this.f36l = 4;
        N3.h.e(fVar, "processor");
        this.f37m = fVar;
        this.f38n = kVar;
        this.f39o = rVar;
    }

    public n(R1.q qVar, String str) {
        this.f36l = 5;
        this.f38n = qVar;
        this.f39o = str;
        this.f37m = new b2.k();
    }

    public n(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
        this.f36l = 2;
        this.f37m = intent;
        this.f38n = context;
        this.f39o = pendingResult;
    }
}
