package T1;

import Q1.C0121d;
import Q1.q;
import Q1.r;
import R1.k;
import Z1.l;
import Z1.p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b3.AbstractC0307a;
import c2.ExecutorC0319a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements R1.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f2141q = q.f("CommandHandler");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f2142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f2143m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f2144n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f2145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Z1.e f2146p;

    public c(Context context, r rVar, Z1.e eVar) {
        this.f2142l = context;
        this.f2145o = rVar;
        this.f2146p = eVar;
    }

    public static Z1.j b(Intent intent) {
        return new Z1.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, Z1.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f3016a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f3017b);
    }

    public final void a(Intent intent, int i, j jVar) {
        List<k> listU;
        String action = intent.getAction();
        int i5 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            q.d().a(f2141q, "Handling constraints changed " + intent);
            e eVar = new e(this.f2142l, this.f2145o, i, jVar);
            ArrayList<p> arrayListI = jVar.f2180p.f1912e.t().i();
            String str = d.f2147a;
            Iterator it = arrayListI.iterator();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            while (it.hasNext()) {
                C0121d c0121d = ((p) it.next()).f3054j;
                z4 |= c0121d.f1811d;
                z5 |= c0121d.f1809b;
                z6 |= c0121d.f1812e;
                z7 |= c0121d.f1808a != 1;
                if (z4 && z5 && z6 && z7) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f4799a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.f2149a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z5).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z7);
            context.sendBroadcast(intent2);
            ArrayList<p> arrayList = new ArrayList(arrayListI.size());
            eVar.f2150b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (p pVar : arrayListI) {
                if (jCurrentTimeMillis >= pVar.a() && (!pVar.c() || eVar.f2152d.b(pVar))) {
                    arrayList.add(pVar);
                }
            }
            for (p pVar2 : arrayList) {
                String str3 = pVar2.f3046a;
                Z1.j jVarZ = D1.b.z(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, jVarZ);
                q.d().a(e.f2148e, AbstractC0307a.k("Creating a delay_met command for workSpec with id (", str3, ")"));
                ((ExecutorC0319a) jVar.f2177m.f3015o).execute(new i(jVar, intent3, eVar.f2151c, i5));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            q.d().a(f2141q, "Handling reschedule " + intent + ", " + i);
            jVar.f2180p.G0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            q.d().b(f2141q, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Z1.j jVarB = b(intent);
            String str4 = f2141q;
            q.d().a(str4, "Handling schedule work for " + jVarB);
            WorkDatabase workDatabase = jVar.f2180p.f1912e;
            workDatabase.c();
            try {
                p pVarM = workDatabase.t().m(jVarB.f3016a);
                if (pVarM == null) {
                    q.d().g(str4, "Skipping scheduling " + jVarB + " because it's no longer in the DB");
                } else if (AbstractC0307a.b(pVarM.f3047b)) {
                    q.d().g(str4, "Skipping scheduling " + jVarB + "because it is finished.");
                } else {
                    long jA = pVarM.a();
                    boolean zC = pVarM.c();
                    Context context2 = this.f2142l;
                    if (zC) {
                        q.d().a(str4, "Opportunistically setting an alarm for " + jVarB + "at " + jA);
                        b.b(context2, workDatabase, jVarB, jA);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((ExecutorC0319a) jVar.f2177m.f3015o).execute(new i(jVar, intent4, i, i5));
                    } else {
                        q.d().a(str4, "Setting up Alarms for " + jVarB + "at " + jA);
                        b.b(context2, workDatabase, jVarB, jA);
                    }
                    workDatabase.o();
                }
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f2144n) {
                try {
                    Z1.j jVarB2 = b(intent);
                    q qVarD = q.d();
                    String str5 = f2141q;
                    qVarD.a(str5, "Handing delay met for " + jVarB2);
                    if (this.f2143m.containsKey(jVarB2)) {
                        q.d().a(str5, "WorkSpec " + jVarB2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f2142l, i, jVar, this.f2146p.v(jVarB2));
                        this.f2143m.put(jVarB2, gVar);
                        gVar.d();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                q.d().g(f2141q, "Ignoring intent " + intent);
                return;
            }
            Z1.j jVarB3 = b(intent);
            boolean z8 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            q.d().a(f2141q, "Handling onExecutionCompleted " + intent + ", " + i);
            c(jVarB3, z8);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        Z1.e eVar2 = this.f2146p;
        if (zContainsKey) {
            int i6 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            k kVarT = eVar2.t(new Z1.j(string, i6));
            listU = arrayList2;
            if (kVarT != null) {
                arrayList2.add(kVarT);
                listU = arrayList2;
            }
        } else {
            listU = eVar2.u(string);
        }
        for (k kVar : listU) {
            q.d().a(f2141q, AbstractC0307a.j("Handing stopWork work for ", string));
            l lVar = jVar.f2185u;
            lVar.getClass();
            N3.h.e(kVar, "workSpecId");
            lVar.e0(kVar, -512);
            WorkDatabase workDatabase2 = jVar.f2180p.f1912e;
            String str6 = b.f2140a;
            Z1.i iVarP = workDatabase2.p();
            Z1.j jVar2 = kVar.f1894a;
            Z1.g gVarN = iVarP.n(jVar2);
            if (gVarN != null) {
                b.a(this.f2142l, jVar2, gVarN.f3010c);
                q.d().a(b.f2140a, "Removing SystemIdInfo for workSpecId (" + jVar2 + ")");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarP.f3012l;
                workDatabase_Impl.b();
                Z1.h hVar = (Z1.h) iVarP.f3014n;
                y1.h hVarA = hVar.a();
                String str7 = jVar2.f3016a;
                if (str7 == null) {
                    hVarA.g(1);
                } else {
                    hVarA.h(str7, 1);
                }
                hVarA.m(jVar2.f3017b, 2);
                workDatabase_Impl.c();
                try {
                    hVarA.a();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.k();
                    hVar.j(hVarA);
                }
            }
            jVar.c(jVar2, false);
        }
    }

    @Override // R1.c
    public final void c(Z1.j jVar, boolean z4) {
        synchronized (this.f2144n) {
            try {
                g gVar = (g) this.f2143m.remove(jVar);
                this.f2146p.t(jVar);
                if (gVar != null) {
                    gVar.f(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
