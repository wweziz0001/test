package Z1;

import Q1.C;
import Q1.C0121d;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f3068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f3070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f3071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f3072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f3073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f3074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f3075h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f3076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f3077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f3078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f3079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f3080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h f3081o;

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f3068a = workDatabase_Impl;
        this.f3069b = new b(workDatabase_Impl, 5);
        this.f3070c = new h(workDatabase_Impl, 12);
        this.f3071d = new h(workDatabase_Impl, 13);
        this.f3072e = new h(workDatabase_Impl, 14);
        this.f3073f = new h(workDatabase_Impl, 15);
        this.f3074g = new h(workDatabase_Impl, 16);
        this.f3075h = new h(workDatabase_Impl, 17);
        this.i = new h(workDatabase_Impl, 18);
        this.f3076j = new h(workDatabase_Impl, 19);
        this.f3077k = new h(workDatabase_Impl, 4);
        new h(workDatabase_Impl, 5);
        this.f3078l = new h(workDatabase_Impl, 6);
        this.f3079m = new h(workDatabase_Impl, 7);
        this.f3080n = new h(workDatabase_Impl, 8);
        new h(workDatabase_Impl, 9);
        new h(workDatabase_Impl, 10);
        this.f3081o = new h(workDatabase_Impl, 11);
    }

    public final void a(HashMap map) {
        int i;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap map2 = new HashMap(999);
            loop0: while (true) {
                i = 0;
                for (String str : setKeySet) {
                    map2.put(str, (ArrayList) map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                a(map2);
                map2 = new HashMap(999);
            }
            if (i > 0) {
                a(map2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        f.c(size, sb);
        sb.append(")");
        s1.j jVarC = s1.j.c(sb.toString(), size);
        int i5 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                jVarC.g(i5);
            } else {
                jVarC.h(str2, i5);
            }
            i5++;
        }
        Cursor cursorL0 = C.l0(this.f3068a, jVarC, false);
        try {
            int iB = D1.b.B(cursorL0, "work_spec_id");
            if (iB == -1) {
                return;
            }
            while (cursorL0.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorL0.getString(iB));
                if (arrayList != null) {
                    arrayList.add(Q1.g.a(cursorL0.isNull(0) ? null : cursorL0.getBlob(0)));
                }
            }
        } finally {
            cursorL0.close();
        }
    }

    public final void b(HashMap map) {
        int i;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap map2 = new HashMap(999);
            loop0: while (true) {
                i = 0;
                for (String str : setKeySet) {
                    map2.put(str, (ArrayList) map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                b(map2);
                map2 = new HashMap(999);
            }
            if (i > 0) {
                b(map2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        f.c(size, sb);
        sb.append(")");
        s1.j jVarC = s1.j.c(sb.toString(), size);
        int i5 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                jVarC.g(i5);
            } else {
                jVarC.h(str2, i5);
            }
            i5++;
        }
        Cursor cursorL0 = C.l0(this.f3068a, jVarC, false);
        try {
            int iB = D1.b.B(cursorL0, "work_spec_id");
            if (iB == -1) {
                return;
            }
            while (cursorL0.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorL0.getString(iB));
                if (arrayList != null) {
                    arrayList.add(cursorL0.isNull(0) ? null : cursorL0.getString(0));
                }
            }
        } finally {
            cursorL0.close();
        }
    }

    public final void c(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        h hVar = this.f3071d;
        y1.h hVarA = hVar.a();
        if (str == null) {
            hVarA.g(1);
        } else {
            hVarA.h(str, 1);
        }
        workDatabase_Impl.c();
        try {
            hVarA.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.j(hVarA);
        }
    }

    public final ArrayList d() throws Throwable {
        s1.j jVar;
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
        s1.j jVarC = s1.j.c("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        jVarC.m(200, 1);
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            int iC = D1.b.C(cursorL0, "id");
            int iC2 = D1.b.C(cursorL0, "state");
            int iC3 = D1.b.C(cursorL0, "worker_class_name");
            int iC4 = D1.b.C(cursorL0, "input_merger_class_name");
            int iC5 = D1.b.C(cursorL0, "input");
            int iC6 = D1.b.C(cursorL0, "output");
            int iC7 = D1.b.C(cursorL0, "initial_delay");
            int iC8 = D1.b.C(cursorL0, "interval_duration");
            int iC9 = D1.b.C(cursorL0, "flex_duration");
            int iC10 = D1.b.C(cursorL0, "run_attempt_count");
            int iC11 = D1.b.C(cursorL0, "backoff_policy");
            int iC12 = D1.b.C(cursorL0, "backoff_delay_duration");
            int iC13 = D1.b.C(cursorL0, "last_enqueue_time");
            int iC14 = D1.b.C(cursorL0, "minimum_retention_duration");
            jVar = jVarC;
            try {
                int iC15 = D1.b.C(cursorL0, "schedule_requested_at");
                int iC16 = D1.b.C(cursorL0, "run_in_foreground");
                int iC17 = D1.b.C(cursorL0, "out_of_quota_policy");
                int iC18 = D1.b.C(cursorL0, "period_count");
                int iC19 = D1.b.C(cursorL0, "generation");
                int iC20 = D1.b.C(cursorL0, "next_schedule_time_override");
                int iC21 = D1.b.C(cursorL0, "next_schedule_time_override_generation");
                int iC22 = D1.b.C(cursorL0, "stop_reason");
                int iC23 = D1.b.C(cursorL0, "required_network_type");
                int iC24 = D1.b.C(cursorL0, "requires_charging");
                int iC25 = D1.b.C(cursorL0, "requires_device_idle");
                int iC26 = D1.b.C(cursorL0, "requires_battery_not_low");
                int iC27 = D1.b.C(cursorL0, "requires_storage_not_low");
                int iC28 = D1.b.C(cursorL0, "trigger_content_update_delay");
                int iC29 = D1.b.C(cursorL0, "trigger_max_content_delay");
                int iC30 = D1.b.C(cursorL0, "content_uri_triggers");
                int i9 = iC14;
                ArrayList arrayList = new ArrayList(cursorL0.getCount());
                while (cursorL0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL0.isNull(iC) ? null : cursorL0.getString(iC);
                    int iE0 = C.e0(cursorL0.getInt(iC2));
                    String string2 = cursorL0.isNull(iC3) ? null : cursorL0.getString(iC3);
                    String string3 = cursorL0.isNull(iC4) ? null : cursorL0.getString(iC4);
                    Q1.g gVarA = Q1.g.a(cursorL0.isNull(iC5) ? null : cursorL0.getBlob(iC5));
                    Q1.g gVarA2 = Q1.g.a(cursorL0.isNull(iC6) ? null : cursorL0.getBlob(iC6));
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
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL0.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = jVarC;
        }
    }

    public final ArrayList e() {
        s1.j jVarC = s1.j.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                arrayList.add(cursorL0.isNull(0) ? null : cursorL0.getString(0));
            }
            return arrayList;
        } finally {
            cursorL0.close();
            jVarC.f();
        }
    }

    public final ArrayList f(int i) throws Throwable {
        s1.j jVar;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        s1.j jVarC = s1.j.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        jVarC.m(i, 1);
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            int iC = D1.b.C(cursorL0, "id");
            int iC2 = D1.b.C(cursorL0, "state");
            int iC3 = D1.b.C(cursorL0, "worker_class_name");
            int iC4 = D1.b.C(cursorL0, "input_merger_class_name");
            int iC5 = D1.b.C(cursorL0, "input");
            int iC6 = D1.b.C(cursorL0, "output");
            int iC7 = D1.b.C(cursorL0, "initial_delay");
            int iC8 = D1.b.C(cursorL0, "interval_duration");
            int iC9 = D1.b.C(cursorL0, "flex_duration");
            int iC10 = D1.b.C(cursorL0, "run_attempt_count");
            int iC11 = D1.b.C(cursorL0, "backoff_policy");
            int iC12 = D1.b.C(cursorL0, "backoff_delay_duration");
            int iC13 = D1.b.C(cursorL0, "last_enqueue_time");
            int iC14 = D1.b.C(cursorL0, "minimum_retention_duration");
            jVar = jVarC;
            try {
                int iC15 = D1.b.C(cursorL0, "schedule_requested_at");
                int iC16 = D1.b.C(cursorL0, "run_in_foreground");
                int iC17 = D1.b.C(cursorL0, "out_of_quota_policy");
                int iC18 = D1.b.C(cursorL0, "period_count");
                int iC19 = D1.b.C(cursorL0, "generation");
                int iC20 = D1.b.C(cursorL0, "next_schedule_time_override");
                int iC21 = D1.b.C(cursorL0, "next_schedule_time_override_generation");
                int iC22 = D1.b.C(cursorL0, "stop_reason");
                int iC23 = D1.b.C(cursorL0, "required_network_type");
                int iC24 = D1.b.C(cursorL0, "requires_charging");
                int iC25 = D1.b.C(cursorL0, "requires_device_idle");
                int iC26 = D1.b.C(cursorL0, "requires_battery_not_low");
                int iC27 = D1.b.C(cursorL0, "requires_storage_not_low");
                int iC28 = D1.b.C(cursorL0, "trigger_content_update_delay");
                int iC29 = D1.b.C(cursorL0, "trigger_max_content_delay");
                int iC30 = D1.b.C(cursorL0, "content_uri_triggers");
                int i10 = iC14;
                ArrayList arrayList = new ArrayList(cursorL0.getCount());
                while (cursorL0.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL0.isNull(iC) ? null : cursorL0.getString(iC);
                    int iE0 = C.e0(cursorL0.getInt(iC2));
                    String string2 = cursorL0.isNull(iC3) ? null : cursorL0.getString(iC3);
                    String string3 = cursorL0.isNull(iC4) ? null : cursorL0.getString(iC4);
                    Q1.g gVarA = Q1.g.a(cursorL0.isNull(iC5) ? null : cursorL0.getBlob(iC5));
                    Q1.g gVarA2 = Q1.g.a(cursorL0.isNull(iC6) ? null : cursorL0.getBlob(iC6));
                    long j5 = cursorL0.getLong(iC7);
                    long j6 = cursorL0.getLong(iC8);
                    long j7 = cursorL0.getLong(iC9);
                    int i11 = cursorL0.getInt(iC10);
                    int iB0 = C.b0(cursorL0.getInt(iC11));
                    long j8 = cursorL0.getLong(iC12);
                    long j9 = cursorL0.getLong(iC13);
                    int i12 = i10;
                    long j10 = cursorL0.getLong(i12);
                    int i13 = iC;
                    int i14 = iC15;
                    long j11 = cursorL0.getLong(i14);
                    iC15 = i14;
                    int i15 = iC16;
                    if (cursorL0.getInt(i15) != 0) {
                        iC16 = i15;
                        i5 = iC17;
                        z4 = true;
                    } else {
                        iC16 = i15;
                        i5 = iC17;
                        z4 = false;
                    }
                    int iD0 = C.d0(cursorL0.getInt(i5));
                    iC17 = i5;
                    int i16 = iC18;
                    int i17 = cursorL0.getInt(i16);
                    iC18 = i16;
                    int i18 = iC19;
                    int i19 = cursorL0.getInt(i18);
                    iC19 = i18;
                    int i20 = iC20;
                    long j12 = cursorL0.getLong(i20);
                    iC20 = i20;
                    int i21 = iC21;
                    int i22 = cursorL0.getInt(i21);
                    iC21 = i21;
                    int i23 = iC22;
                    int i24 = cursorL0.getInt(i23);
                    iC22 = i23;
                    int i25 = iC23;
                    int iC0 = C.c0(cursorL0.getInt(i25));
                    iC23 = i25;
                    int i26 = iC24;
                    if (cursorL0.getInt(i26) != 0) {
                        iC24 = i26;
                        i6 = iC25;
                        z5 = true;
                    } else {
                        iC24 = i26;
                        i6 = iC25;
                        z5 = false;
                    }
                    if (cursorL0.getInt(i6) != 0) {
                        iC25 = i6;
                        i7 = iC26;
                        z6 = true;
                    } else {
                        iC25 = i6;
                        i7 = iC26;
                        z6 = false;
                    }
                    if (cursorL0.getInt(i7) != 0) {
                        iC26 = i7;
                        i8 = iC27;
                        z7 = true;
                    } else {
                        iC26 = i7;
                        i8 = iC27;
                        z7 = false;
                    }
                    if (cursorL0.getInt(i8) != 0) {
                        iC27 = i8;
                        i9 = iC28;
                        z8 = true;
                    } else {
                        iC27 = i8;
                        i9 = iC28;
                        z8 = false;
                    }
                    long j13 = cursorL0.getLong(i9);
                    iC28 = i9;
                    int i27 = iC29;
                    long j14 = cursorL0.getLong(i27);
                    iC29 = i27;
                    int i28 = iC30;
                    if (!cursorL0.isNull(i28)) {
                        blob = cursorL0.getBlob(i28);
                    }
                    iC30 = i28;
                    arrayList.add(new p(string, iE0, string2, string3, gVarA, gVarA2, j5, j6, j7, new C0121d(iC0, z5, z6, z7, z8, j13, j14, C.e(blob)), i11, iB0, j8, j9, j10, j11, z4, iD0, i17, i19, j12, i22, i24));
                    iC = i13;
                    i10 = i12;
                }
                cursorL0.close();
                jVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL0.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = jVarC;
        }
    }

    public final ArrayList g() throws Throwable {
        s1.j jVar;
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
        s1.j jVarC = s1.j.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            iC = D1.b.C(cursorL0, "id");
            iC2 = D1.b.C(cursorL0, "state");
            iC3 = D1.b.C(cursorL0, "worker_class_name");
            iC4 = D1.b.C(cursorL0, "input_merger_class_name");
            iC5 = D1.b.C(cursorL0, "input");
            iC6 = D1.b.C(cursorL0, "output");
            iC7 = D1.b.C(cursorL0, "initial_delay");
            iC8 = D1.b.C(cursorL0, "interval_duration");
            iC9 = D1.b.C(cursorL0, "flex_duration");
            iC10 = D1.b.C(cursorL0, "run_attempt_count");
            iC11 = D1.b.C(cursorL0, "backoff_policy");
            iC12 = D1.b.C(cursorL0, "backoff_delay_duration");
            iC13 = D1.b.C(cursorL0, "last_enqueue_time");
            iC14 = D1.b.C(cursorL0, "minimum_retention_duration");
            jVar = jVarC;
        } catch (Throwable th) {
            th = th;
            jVar = jVarC;
        }
        try {
            int iC15 = D1.b.C(cursorL0, "schedule_requested_at");
            int iC16 = D1.b.C(cursorL0, "run_in_foreground");
            int iC17 = D1.b.C(cursorL0, "out_of_quota_policy");
            int iC18 = D1.b.C(cursorL0, "period_count");
            int iC19 = D1.b.C(cursorL0, "generation");
            int iC20 = D1.b.C(cursorL0, "next_schedule_time_override");
            int iC21 = D1.b.C(cursorL0, "next_schedule_time_override_generation");
            int iC22 = D1.b.C(cursorL0, "stop_reason");
            int iC23 = D1.b.C(cursorL0, "required_network_type");
            int iC24 = D1.b.C(cursorL0, "requires_charging");
            int iC25 = D1.b.C(cursorL0, "requires_device_idle");
            int iC26 = D1.b.C(cursorL0, "requires_battery_not_low");
            int iC27 = D1.b.C(cursorL0, "requires_storage_not_low");
            int iC28 = D1.b.C(cursorL0, "trigger_content_update_delay");
            int iC29 = D1.b.C(cursorL0, "trigger_max_content_delay");
            int iC30 = D1.b.C(cursorL0, "content_uri_triggers");
            int i9 = iC14;
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                byte[] blob = null;
                String string = cursorL0.isNull(iC) ? null : cursorL0.getString(iC);
                int iE0 = C.e0(cursorL0.getInt(iC2));
                String string2 = cursorL0.isNull(iC3) ? null : cursorL0.getString(iC3);
                String string3 = cursorL0.isNull(iC4) ? null : cursorL0.getString(iC4);
                Q1.g gVarA = Q1.g.a(cursorL0.isNull(iC5) ? null : cursorL0.getBlob(iC5));
                Q1.g gVarA2 = Q1.g.a(cursorL0.isNull(iC6) ? null : cursorL0.getBlob(iC6));
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
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorL0.close();
            jVar.f();
            throw th;
        }
    }

    public final ArrayList h() throws Throwable {
        s1.j jVar;
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
        s1.j jVarC = s1.j.c("SELECT * FROM workspec WHERE state=1", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            iC = D1.b.C(cursorL0, "id");
            iC2 = D1.b.C(cursorL0, "state");
            iC3 = D1.b.C(cursorL0, "worker_class_name");
            iC4 = D1.b.C(cursorL0, "input_merger_class_name");
            iC5 = D1.b.C(cursorL0, "input");
            iC6 = D1.b.C(cursorL0, "output");
            iC7 = D1.b.C(cursorL0, "initial_delay");
            iC8 = D1.b.C(cursorL0, "interval_duration");
            iC9 = D1.b.C(cursorL0, "flex_duration");
            iC10 = D1.b.C(cursorL0, "run_attempt_count");
            iC11 = D1.b.C(cursorL0, "backoff_policy");
            iC12 = D1.b.C(cursorL0, "backoff_delay_duration");
            iC13 = D1.b.C(cursorL0, "last_enqueue_time");
            iC14 = D1.b.C(cursorL0, "minimum_retention_duration");
            jVar = jVarC;
        } catch (Throwable th) {
            th = th;
            jVar = jVarC;
        }
        try {
            int iC15 = D1.b.C(cursorL0, "schedule_requested_at");
            int iC16 = D1.b.C(cursorL0, "run_in_foreground");
            int iC17 = D1.b.C(cursorL0, "out_of_quota_policy");
            int iC18 = D1.b.C(cursorL0, "period_count");
            int iC19 = D1.b.C(cursorL0, "generation");
            int iC20 = D1.b.C(cursorL0, "next_schedule_time_override");
            int iC21 = D1.b.C(cursorL0, "next_schedule_time_override_generation");
            int iC22 = D1.b.C(cursorL0, "stop_reason");
            int iC23 = D1.b.C(cursorL0, "required_network_type");
            int iC24 = D1.b.C(cursorL0, "requires_charging");
            int iC25 = D1.b.C(cursorL0, "requires_device_idle");
            int iC26 = D1.b.C(cursorL0, "requires_battery_not_low");
            int iC27 = D1.b.C(cursorL0, "requires_storage_not_low");
            int iC28 = D1.b.C(cursorL0, "trigger_content_update_delay");
            int iC29 = D1.b.C(cursorL0, "trigger_max_content_delay");
            int iC30 = D1.b.C(cursorL0, "content_uri_triggers");
            int i9 = iC14;
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                byte[] blob = null;
                String string = cursorL0.isNull(iC) ? null : cursorL0.getString(iC);
                int iE0 = C.e0(cursorL0.getInt(iC2));
                String string2 = cursorL0.isNull(iC3) ? null : cursorL0.getString(iC3);
                String string3 = cursorL0.isNull(iC4) ? null : cursorL0.getString(iC4);
                Q1.g gVarA = Q1.g.a(cursorL0.isNull(iC5) ? null : cursorL0.getBlob(iC5));
                Q1.g gVarA2 = Q1.g.a(cursorL0.isNull(iC6) ? null : cursorL0.getBlob(iC6));
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
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorL0.close();
            jVar.f();
            throw th;
        }
    }

    public final ArrayList i() {
        s1.j jVar;
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
        s1.j jVarC = s1.j.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            iC = D1.b.C(cursorL0, "id");
            iC2 = D1.b.C(cursorL0, "state");
            iC3 = D1.b.C(cursorL0, "worker_class_name");
            iC4 = D1.b.C(cursorL0, "input_merger_class_name");
            iC5 = D1.b.C(cursorL0, "input");
            iC6 = D1.b.C(cursorL0, "output");
            iC7 = D1.b.C(cursorL0, "initial_delay");
            iC8 = D1.b.C(cursorL0, "interval_duration");
            iC9 = D1.b.C(cursorL0, "flex_duration");
            iC10 = D1.b.C(cursorL0, "run_attempt_count");
            iC11 = D1.b.C(cursorL0, "backoff_policy");
            iC12 = D1.b.C(cursorL0, "backoff_delay_duration");
            iC13 = D1.b.C(cursorL0, "last_enqueue_time");
            iC14 = D1.b.C(cursorL0, "minimum_retention_duration");
            jVar = jVarC;
        } catch (Throwable th) {
            th = th;
            jVar = jVarC;
        }
        try {
            int iC15 = D1.b.C(cursorL0, "schedule_requested_at");
            int iC16 = D1.b.C(cursorL0, "run_in_foreground");
            int iC17 = D1.b.C(cursorL0, "out_of_quota_policy");
            int iC18 = D1.b.C(cursorL0, "period_count");
            int iC19 = D1.b.C(cursorL0, "generation");
            int iC20 = D1.b.C(cursorL0, "next_schedule_time_override");
            int iC21 = D1.b.C(cursorL0, "next_schedule_time_override_generation");
            int iC22 = D1.b.C(cursorL0, "stop_reason");
            int iC23 = D1.b.C(cursorL0, "required_network_type");
            int iC24 = D1.b.C(cursorL0, "requires_charging");
            int iC25 = D1.b.C(cursorL0, "requires_device_idle");
            int iC26 = D1.b.C(cursorL0, "requires_battery_not_low");
            int iC27 = D1.b.C(cursorL0, "requires_storage_not_low");
            int iC28 = D1.b.C(cursorL0, "trigger_content_update_delay");
            int iC29 = D1.b.C(cursorL0, "trigger_max_content_delay");
            int iC30 = D1.b.C(cursorL0, "content_uri_triggers");
            int i9 = iC14;
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                byte[] blob = null;
                String string = cursorL0.isNull(iC) ? null : cursorL0.getString(iC);
                int iE0 = C.e0(cursorL0.getInt(iC2));
                String string2 = cursorL0.isNull(iC3) ? null : cursorL0.getString(iC3);
                String string3 = cursorL0.isNull(iC4) ? null : cursorL0.getString(iC4);
                Q1.g gVarA = Q1.g.a(cursorL0.isNull(iC5) ? null : cursorL0.getBlob(iC5));
                Q1.g gVarA2 = Q1.g.a(cursorL0.isNull(iC6) ? null : cursorL0.getBlob(iC6));
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
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorL0.close();
            jVar.f();
            throw th;
        }
    }

    public final int j(String str) {
        s1.j jVarC = s1.j.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            jVarC.g(1);
        } else {
            jVarC.h(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        int iE0 = 0;
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            if (cursorL0.moveToFirst()) {
                Integer numValueOf = cursorL0.isNull(0) ? null : Integer.valueOf(cursorL0.getInt(0));
                if (numValueOf != null) {
                    iE0 = C.e0(numValueOf.intValue());
                }
            }
            return iE0;
        } finally {
            cursorL0.close();
            jVarC.f();
        }
    }

    public final ArrayList k(String str) {
        s1.j jVarC = s1.j.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            jVarC.g(1);
        } else {
            jVarC.h(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                arrayList.add(cursorL0.isNull(0) ? null : cursorL0.getString(0));
            }
            return arrayList;
        } finally {
            cursorL0.close();
            jVarC.f();
        }
    }

    public final ArrayList l(String str) {
        s1.j jVarC = s1.j.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        jVarC.h(str, 1);
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                arrayList.add(cursorL0.isNull(0) ? null : cursorL0.getString(0));
            }
            return arrayList;
        } finally {
            cursorL0.close();
            jVarC.f();
        }
    }

    public final p m(String str) {
        s1.j jVar;
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
        s1.j jVarC = s1.j.c("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            jVarC.g(1);
        } else {
            jVarC.h(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            int iC = D1.b.C(cursorL0, "id");
            int iC2 = D1.b.C(cursorL0, "state");
            int iC3 = D1.b.C(cursorL0, "worker_class_name");
            int iC4 = D1.b.C(cursorL0, "input_merger_class_name");
            int iC5 = D1.b.C(cursorL0, "input");
            int iC6 = D1.b.C(cursorL0, "output");
            int iC7 = D1.b.C(cursorL0, "initial_delay");
            int iC8 = D1.b.C(cursorL0, "interval_duration");
            int iC9 = D1.b.C(cursorL0, "flex_duration");
            int iC10 = D1.b.C(cursorL0, "run_attempt_count");
            int iC11 = D1.b.C(cursorL0, "backoff_policy");
            int iC12 = D1.b.C(cursorL0, "backoff_delay_duration");
            int iC13 = D1.b.C(cursorL0, "last_enqueue_time");
            int iC14 = D1.b.C(cursorL0, "minimum_retention_duration");
            jVar = jVarC;
            try {
                int iC15 = D1.b.C(cursorL0, "schedule_requested_at");
                int iC16 = D1.b.C(cursorL0, "run_in_foreground");
                int iC17 = D1.b.C(cursorL0, "out_of_quota_policy");
                int iC18 = D1.b.C(cursorL0, "period_count");
                int iC19 = D1.b.C(cursorL0, "generation");
                int iC20 = D1.b.C(cursorL0, "next_schedule_time_override");
                int iC21 = D1.b.C(cursorL0, "next_schedule_time_override_generation");
                int iC22 = D1.b.C(cursorL0, "stop_reason");
                int iC23 = D1.b.C(cursorL0, "required_network_type");
                int iC24 = D1.b.C(cursorL0, "requires_charging");
                int iC25 = D1.b.C(cursorL0, "requires_device_idle");
                int iC26 = D1.b.C(cursorL0, "requires_battery_not_low");
                int iC27 = D1.b.C(cursorL0, "requires_storage_not_low");
                int iC28 = D1.b.C(cursorL0, "trigger_content_update_delay");
                int iC29 = D1.b.C(cursorL0, "trigger_max_content_delay");
                int iC30 = D1.b.C(cursorL0, "content_uri_triggers");
                p pVar = null;
                byte[] blob = null;
                if (cursorL0.moveToFirst()) {
                    String string = cursorL0.isNull(iC) ? null : cursorL0.getString(iC);
                    int iE0 = C.e0(cursorL0.getInt(iC2));
                    String string2 = cursorL0.isNull(iC3) ? null : cursorL0.getString(iC3);
                    String string3 = cursorL0.isNull(iC4) ? null : cursorL0.getString(iC4);
                    Q1.g gVarA = Q1.g.a(cursorL0.isNull(iC5) ? null : cursorL0.getBlob(iC5));
                    Q1.g gVarA2 = Q1.g.a(cursorL0.isNull(iC6) ? null : cursorL0.getBlob(iC6));
                    long j5 = cursorL0.getLong(iC7);
                    long j6 = cursorL0.getLong(iC8);
                    long j7 = cursorL0.getLong(iC9);
                    int i9 = cursorL0.getInt(iC10);
                    int iB0 = C.b0(cursorL0.getInt(iC11));
                    long j8 = cursorL0.getLong(iC12);
                    long j9 = cursorL0.getLong(iC13);
                    long j10 = cursorL0.getLong(iC14);
                    long j11 = cursorL0.getLong(iC15);
                    if (cursorL0.getInt(iC16) != 0) {
                        i = iC17;
                        z4 = true;
                    } else {
                        i = iC17;
                        z4 = false;
                    }
                    int iD0 = C.d0(cursorL0.getInt(i));
                    int i10 = cursorL0.getInt(iC18);
                    int i11 = cursorL0.getInt(iC19);
                    long j12 = cursorL0.getLong(iC20);
                    int i12 = cursorL0.getInt(iC21);
                    int i13 = cursorL0.getInt(iC22);
                    int iC0 = C.c0(cursorL0.getInt(iC23));
                    if (cursorL0.getInt(iC24) != 0) {
                        i5 = iC25;
                        z5 = true;
                    } else {
                        i5 = iC25;
                        z5 = false;
                    }
                    if (cursorL0.getInt(i5) != 0) {
                        i6 = iC26;
                        z6 = true;
                    } else {
                        i6 = iC26;
                        z6 = false;
                    }
                    if (cursorL0.getInt(i6) != 0) {
                        i7 = iC27;
                        z7 = true;
                    } else {
                        i7 = iC27;
                        z7 = false;
                    }
                    if (cursorL0.getInt(i7) != 0) {
                        i8 = iC28;
                        z8 = true;
                    } else {
                        i8 = iC28;
                        z8 = false;
                    }
                    long j13 = cursorL0.getLong(i8);
                    long j14 = cursorL0.getLong(iC29);
                    if (!cursorL0.isNull(iC30)) {
                        blob = cursorL0.getBlob(iC30);
                    }
                    pVar = new p(string, iE0, string2, string3, gVarA, gVarA2, j5, j6, j7, new C0121d(iC0, z5, z6, z7, z8, j13, j14, C.e(blob)), i9, iB0, j8, j9, j10, j11, z4, iD0, i10, i11, j12, i12, i13);
                }
                cursorL0.close();
                jVar.f();
                return pVar;
            } catch (Throwable th) {
                th = th;
                cursorL0.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = jVarC;
        }
    }

    public final ArrayList n(String str) {
        s1.j jVarC = s1.j.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            jVarC.g(1);
        } else {
            jVarC.h(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        Cursor cursorL0 = C.l0(workDatabase_Impl, jVarC, false);
        try {
            ArrayList arrayList = new ArrayList(cursorL0.getCount());
            while (cursorL0.moveToNext()) {
                String string = cursorL0.isNull(0) ? null : cursorL0.getString(0);
                int iE0 = C.e0(cursorL0.getInt(1));
                N3.h.e(string, "id");
                n nVar = new n();
                nVar.f3027a = string;
                nVar.f3028b = iE0;
                arrayList.add(nVar);
            }
            return arrayList;
        } finally {
            cursorL0.close();
            jVarC.f();
        }
    }

    public final void o(String str, long j5) {
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        h hVar = this.f3079m;
        y1.h hVarA = hVar.a();
        hVarA.m(j5, 1);
        if (str == null) {
            hVarA.g(2);
        } else {
            hVarA.h(str, 2);
        }
        workDatabase_Impl.c();
        try {
            hVarA.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.j(hVarA);
        }
    }

    public final void p(String str, int i) {
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        h hVar = this.f3078l;
        y1.h hVarA = hVar.a();
        if (str == null) {
            hVarA.g(1);
        } else {
            hVarA.h(str, 1);
        }
        hVarA.m(i, 2);
        workDatabase_Impl.c();
        try {
            hVarA.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.j(hVarA);
        }
    }

    public final void q(String str, long j5) {
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        h hVar = this.i;
        y1.h hVarA = hVar.a();
        hVarA.m(j5, 1);
        if (str == null) {
            hVarA.g(2);
        } else {
            hVarA.h(str, 2);
        }
        workDatabase_Impl.c();
        try {
            hVarA.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.j(hVarA);
        }
    }

    public final void r(String str, Q1.g gVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        h hVar = this.f3075h;
        y1.h hVarA = hVar.a();
        byte[] bArrB = Q1.g.b(gVar);
        if (bArrB == null) {
            hVarA.g(1);
        } else {
            hVarA.e(1, bArrB);
        }
        if (str == null) {
            hVarA.g(2);
        } else {
            hVarA.h(str, 2);
        }
        workDatabase_Impl.c();
        try {
            hVarA.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.j(hVarA);
        }
    }

    public final void s(String str, int i) {
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        h hVar = this.f3072e;
        y1.h hVarA = hVar.a();
        hVarA.m(C.v0(i), 1);
        if (str == null) {
            hVarA.g(2);
        } else {
            hVarA.h(str, 2);
        }
        workDatabase_Impl.c();
        try {
            hVarA.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.j(hVarA);
        }
    }

    public final void t(String str, int i) {
        WorkDatabase_Impl workDatabase_Impl = this.f3068a;
        workDatabase_Impl.b();
        h hVar = this.f3081o;
        y1.h hVarA = hVar.a();
        hVarA.m(i, 1);
        if (str == null) {
            hVarA.g(2);
        } else {
            hVarA.h(str, 2);
        }
        workDatabase_Impl.c();
        try {
            hVarA.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.j(hVarA);
        }
    }
}
