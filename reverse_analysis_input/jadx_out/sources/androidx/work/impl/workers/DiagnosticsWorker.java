package androidx.work.impl.workers;

import D1.b;
import N3.h;
import Q1.C;
import Q1.C0121d;
import Q1.g;
import Q1.n;
import Q1.r;
import R1.q;
import Z1.i;
import Z1.l;
import Z1.p;
import Z1.s;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import d2.AbstractC0377b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import s1.j;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.e(context, "context");
        h.e(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final n f() throws Throwable {
        j jVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        int iC14;
        i iVar;
        l lVar;
        s sVar;
        int i;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        q qVarE0 = q.E0(this.f1832l);
        WorkDatabase workDatabase = qVarE0.f1912e;
        h.d(workDatabase, "workManager.workDatabase");
        Z1.q qVarT = workDatabase.t();
        l lVarR = workDatabase.r();
        s sVarU = workDatabase.u();
        i iVarP = workDatabase.p();
        ((r) qVarE0.f1911d.f1801g).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        qVarT.getClass();
        j jVarC = j.c("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        jVarC.m(jCurrentTimeMillis, 1);
        WorkDatabase_Impl workDatabase_Impl = qVarT.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            iC = b.C(cursorL0, "id");
            iC2 = b.C(cursorL0, "state");
            iC3 = b.C(cursorL0, "worker_class_name");
            iC4 = b.C(cursorL0, "input_merger_class_name");
            iC5 = b.C(cursorL0, "input");
            iC6 = b.C(cursorL0, "output");
            iC7 = b.C(cursorL0, "initial_delay");
            iC8 = b.C(cursorL0, "interval_duration");
            iC9 = b.C(cursorL0, "flex_duration");
            iC10 = b.C(cursorL0, "run_attempt_count");
            iC11 = b.C(cursorL0, "backoff_policy");
            iC12 = b.C(cursorL0, "backoff_delay_duration");
            iC13 = b.C(cursorL0, "last_enqueue_time");
            iC14 = b.C(cursorL0, "minimum_retention_duration");
            jVar = jVarC;
        } catch (Throwable th) {
            th = th;
            jVar = jVarC;
        }
        try {
            int iC15 = b.C(cursorL0, "schedule_requested_at");
            int iC16 = b.C(cursorL0, "run_in_foreground");
            int iC17 = b.C(cursorL0, "out_of_quota_policy");
            int iC18 = b.C(cursorL0, "period_count");
            int iC19 = b.C(cursorL0, "generation");
            int iC20 = b.C(cursorL0, "next_schedule_time_override");
            int iC21 = b.C(cursorL0, "next_schedule_time_override_generation");
            int iC22 = b.C(cursorL0, "stop_reason");
            int iC23 = b.C(cursorL0, "required_network_type");
            int iC24 = b.C(cursorL0, "requires_charging");
            int iC25 = b.C(cursorL0, "requires_device_idle");
            int iC26 = b.C(cursorL0, "requires_battery_not_low");
            int iC27 = b.C(cursorL0, "requires_storage_not_low");
            int iC28 = b.C(cursorL0, "trigger_content_update_delay");
            int iC29 = b.C(cursorL0, "trigger_max_content_delay");
            int iC30 = b.C(cursorL0, "content_uri_triggers");
            int i9 = iC14;
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                byte[] blob = null;
                String string = cursorL0.isNull(iC) ? null : cursorL0.getString(iC);
                int iE0 = C.e0(cursorL0.getInt(iC2));
                String string2 = cursorL0.isNull(iC3) ? null : cursorL0.getString(iC3);
                String string3 = cursorL0.isNull(iC4) ? null : cursorL0.getString(iC4);
                g gVarA = g.a(cursorL0.isNull(iC5) ? null : cursorL0.getBlob(iC5));
                g gVarA2 = g.a(cursorL0.isNull(iC6) ? null : cursorL0.getBlob(iC6));
                long j5 = cursorL0.getLong(iC7);
                long j6 = cursorL0.getLong(iC8);
                long j7 = cursorL0.getLong(iC9);
                int i10 = cursorL0.getInt(iC10);
                int iB0 = C.b0(cursorL0.getInt(iC11));
                long j8 = cursorL0.getLong(iC12);
                long j9 = cursorL0.getLong(iC13);
                int i11 = i9;
                long j10 = cursorL0.getLong(i11);
                int i12 = iC;
                int i13 = iC15;
                long j11 = cursorL0.getLong(i13);
                iC15 = i13;
                int i14 = iC16;
                if (cursorL0.getInt(i14) != 0) {
                    iC16 = i14;
                    i = iC17;
                    z4 = true;
                } else {
                    iC16 = i14;
                    i = iC17;
                    z4 = false;
                }
                int iD0 = C.d0(cursorL0.getInt(i));
                iC17 = i;
                int i15 = iC18;
                int i16 = cursorL0.getInt(i15);
                iC18 = i15;
                int i17 = iC19;
                int i18 = cursorL0.getInt(i17);
                iC19 = i17;
                int i19 = iC20;
                long j12 = cursorL0.getLong(i19);
                iC20 = i19;
                int i20 = iC21;
                int i21 = cursorL0.getInt(i20);
                iC21 = i20;
                int i22 = iC22;
                int i23 = cursorL0.getInt(i22);
                iC22 = i22;
                int i24 = iC23;
                int iC0 = C.c0(cursorL0.getInt(i24));
                iC23 = i24;
                int i25 = iC24;
                if (cursorL0.getInt(i25) != 0) {
                    iC24 = i25;
                    i5 = iC25;
                    z5 = true;
                } else {
                    iC24 = i25;
                    i5 = iC25;
                    z5 = false;
                }
                if (cursorL0.getInt(i5) != 0) {
                    iC25 = i5;
                    i6 = iC26;
                    z6 = true;
                } else {
                    iC25 = i5;
                    i6 = iC26;
                    z6 = false;
                }
                if (cursorL0.getInt(i6) != 0) {
                    iC26 = i6;
                    i7 = iC27;
                    z7 = true;
                } else {
                    iC26 = i6;
                    i7 = iC27;
                    z7 = false;
                }
                if (cursorL0.getInt(i7) != 0) {
                    iC27 = i7;
                    i8 = iC28;
                    z8 = true;
                } else {
                    iC27 = i7;
                    i8 = iC28;
                    z8 = false;
                }
                long j13 = cursorL0.getLong(i8);
                iC28 = i8;
                int i26 = iC29;
                long j14 = cursorL0.getLong(i26);
                iC29 = i26;
                int i27 = iC30;
                if (!cursorL0.isNull(i27)) {
                    blob = cursorL0.getBlob(i27);
                }
                iC30 = i27;
                arrayList.add(new p(string, iE0, string2, string3, gVarA, gVarA2, j5, j6, j7, new C0121d(iC0, z5, z6, z7, z8, j13, j14, C.e(blob)), i10, iB0, j8, j9, j10, j11, z4, iD0, i16, i18, j12, i21, i23));
                iC = i12;
                i9 = i11;
            }
            cursorL0.close();
            jVar.f();
            ArrayList arrayListH = qVarT.h();
            ArrayList arrayListD = qVarT.d();
            if (arrayList.isEmpty()) {
                iVar = iVarP;
                lVar = lVarR;
                sVar = sVarU;
            } else {
                Q1.q qVarD = Q1.q.d();
                String str = AbstractC0377b.f5426a;
                qVarD.e(str, "Recently completed work:\n\n");
                iVar = iVarP;
                lVar = lVarR;
                sVar = sVarU;
                Q1.q.d().e(str, AbstractC0377b.a(lVar, sVar, iVar, arrayList));
            }
            if (!arrayListH.isEmpty()) {
                Q1.q qVarD2 = Q1.q.d();
                String str2 = AbstractC0377b.f5426a;
                qVarD2.e(str2, "Running work:\n\n");
                Q1.q.d().e(str2, AbstractC0377b.a(lVar, sVar, iVar, arrayListH));
            }
            if (!arrayListD.isEmpty()) {
                Q1.q qVarD3 = Q1.q.d();
                String str3 = AbstractC0377b.f5426a;
                qVarD3.e(str3, "Enqueued work:\n\n");
                Q1.q.d().e(str3, AbstractC0377b.a(lVar, sVar, iVar, arrayListD));
            }
            return new n(g.f1823c);
        } catch (Throwable th2) {
            th = th2;
            cursorL0.close();
            jVar.f();
            throw th;
        }
    }
}
