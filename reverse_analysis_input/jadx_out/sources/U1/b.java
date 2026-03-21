package U1;

import Q1.C0118a;
import Q1.C0120c;
import Q1.C0121d;
import Q1.q;
import Q1.r;
import R1.h;
import Z1.g;
import Z1.i;
import Z1.j;
import Z1.p;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f2273q = q.f("SystemJobScheduler");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f2274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final JobScheduler f2275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f2276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WorkDatabase f2277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0118a f2278p;

    public b(Context context, WorkDatabase workDatabase, C0118a c0118a) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context, (r) c0118a.f1801g);
        this.f2274l = context;
        this.f2275m = jobScheduler;
        this.f2276n = aVar;
        this.f2277o = workDatabase;
        this.f2278p = c0118a;
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            q.d().c(f2273q, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            q.d().c(f2273q, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // R1.h
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.f2274l;
        JobScheduler jobScheduler = this.f2275m;
        ArrayList<JobInfo> arrayListE = e(context, jobScheduler);
        if (arrayListE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListE) {
                j jVarF = f(jobInfo);
                if (jVarF != null && str.equals(jVarF.f3016a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((Integer) it.next()).intValue());
        }
        i iVarP = this.f2277o.p();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarP.f3012l;
        workDatabase_Impl.b();
        Z1.h hVar = (Z1.h) iVarP.f3015o;
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

    @Override // R1.h
    public final void b(p... pVarArr) {
        int iIntValue;
        C0118a c0118a = this.f2278p;
        WorkDatabase workDatabase = this.f2277o;
        final a2.j jVar = new a2.j(workDatabase, 0);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                p pVarM = workDatabase.t().m(pVar.f3046a);
                String str = f2273q;
                String str2 = pVar.f3046a;
                if (pVarM == null) {
                    q.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (pVarM.f3047b != 1) {
                    q.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j jVarZ = D1.b.z(pVar);
                    g gVarN = workDatabase.p().n(jVarZ);
                    if (gVarN != null) {
                        iIntValue = gVarN.f3010c;
                    } else {
                        c0118a.getClass();
                        final int i = c0118a.f1796b;
                        Object objN = jVar.f3551a.n(new Callable() { // from class: a2.i
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                j jVar2 = jVar;
                                N3.h.e(jVar2, "this$0");
                                WorkDatabase workDatabase2 = jVar2.f3551a;
                                Long lR = workDatabase2.l().r("next_job_scheduler_id");
                                int i5 = 0;
                                int iLongValue = lR != null ? (int) lR.longValue() : 0;
                                workDatabase2.l().s(new Z1.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase2.l().s(new Z1.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i5 = iLongValue;
                                }
                                return Integer.valueOf(i5);
                            }
                        });
                        N3.h.d(objN, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objN).intValue();
                    }
                    if (gVarN == null) {
                        workDatabase.p().q(new g(jVarZ.f3017b, jVarZ.f3016a, iIntValue));
                    }
                    g(pVar, iIntValue);
                    workDatabase.o();
                }
            } finally {
                workDatabase.k();
            }
        }
    }

    @Override // R1.h
    public final boolean d() {
        return true;
    }

    public final void g(p pVar, int i) {
        int i5;
        JobScheduler jobScheduler = this.f2275m;
        a aVar = this.f2276n;
        aVar.getClass();
        C0121d c0121d = pVar.f3054j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = pVar.f3046a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f3064t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, aVar.f2271a).setRequiresCharging(c0121d.f1809b);
        boolean z4 = c0121d.f1810c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z4).setExtras(persistableBundle);
        int i6 = Build.VERSION.SDK_INT;
        int i7 = c0121d.f1808a;
        if (i6 < 30 || i7 != 6) {
            int iB = O.i.b(i7);
            if (iB == 0) {
                i5 = 0;
            } else if (iB == 1) {
                i5 = 1;
            } else if (iB != 2) {
                i5 = 3;
                if (iB != 3) {
                    i5 = 4;
                    if (iB != 4 || i6 < 26) {
                        q.d().a(a.f2270c, "API version too low. Cannot convert network type value ".concat(AbstractC0307a.v(i7)));
                        i5 = 1;
                    }
                }
            } else {
                i5 = 2;
            }
            extras.setRequiredNetworkType(i5);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z4) {
            extras.setBackoffCriteria(pVar.f3057m, pVar.f3056l == 2 ? 0 : 1);
        }
        long jA = pVar.a();
        aVar.f2272b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i6 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.f3061q) {
            extras.setImportantWhileForeground(true);
        }
        Set<C0120c> set = c0121d.f1815h;
        if (!set.isEmpty()) {
            for (C0120c c0120c : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(c0120c.f1806a, c0120c.f1807b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c0121d.f1813f);
            extras.setTriggerContentMaxDelay(c0121d.f1814g);
        }
        extras.setPersisted(false);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            extras.setRequiresBatteryNotLow(c0121d.f1811d);
            extras.setRequiresStorageNotLow(c0121d.f1812e);
        }
        boolean z5 = pVar.f3055k > 0;
        boolean z6 = jMax > 0;
        if (i8 >= 31 && pVar.f3061q && !z5 && !z6) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        String str2 = f2273q;
        q.d().a(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                q.d().g(str2, "Unable to schedule work ID " + str);
                if (pVar.f3061q && pVar.f3062r == 1) {
                    pVar.f3061q = false;
                    q.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(pVar, i);
                }
            }
        } catch (IllegalStateException e5) {
            ArrayList arrayListE = e(this.f2274l, jobScheduler);
            String str3 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(arrayListE != null ? arrayListE.size() : 0), Integer.valueOf(this.f2277o.t().i().size()), Integer.valueOf(this.f2278p.f1798d));
            q.d().b(str2, str3);
            throw new IllegalStateException(str3, e5);
        } catch (Throwable th) {
            q.d().c(str2, "Unable to schedule " + pVar, th);
        }
    }
}
