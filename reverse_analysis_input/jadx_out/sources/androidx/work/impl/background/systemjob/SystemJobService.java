package androidx.work.impl.background.systemjob;

import A.n;
import Q1.q;
import Q1.r;
import R1.c;
import R1.f;
import R1.k;
import U1.d;
import Z1.e;
import Z1.i;
import Z1.j;
import Z1.l;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f4804p = q.f("SystemJobService");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public R1.q f4805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f4806m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f4807n = new e(5, (byte) 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f4808o;

    public static j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // R1.c
    public final void c(j jVar, boolean z4) {
        JobParameters jobParameters;
        q.d().a(f4804p, jVar.f3016a + " executed on JobScheduler");
        synchronized (this.f4806m) {
            jobParameters = (JobParameters) this.f4806m.remove(jVar);
        }
        this.f4807n.t(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z4);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            R1.q qVarE0 = R1.q.E0(getApplicationContext());
            this.f4805l = qVarE0;
            f fVar = qVarE0.f1915h;
            this.f4808o = new l(fVar, qVarE0.f1913f);
            fVar.a(this);
        } catch (IllegalStateException e5) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
            }
            q.d().g(f4804p, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        R1.q qVar = this.f4805l;
        if (qVar != null) {
            qVar.f1915h.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f4805l == null) {
            q.d().a(f4804p, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            q.d().b(f4804p, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f4806m) {
            try {
                if (this.f4806m.containsKey(jVarA)) {
                    q.d().a(f4804p, "Job is already being executed by SystemJobService: " + jVarA);
                    return false;
                }
                q.d().a(f4804p, "onStartJob for " + jVarA);
                this.f4806m.put(jVarA, jobParameters);
                int i = Build.VERSION.SDK_INT;
                r rVar = new r();
                if (U1.c.b(jobParameters) != null) {
                    Arrays.asList(U1.c.b(jobParameters));
                }
                if (U1.c.a(jobParameters) != null) {
                    Arrays.asList(U1.c.a(jobParameters));
                }
                if (i >= 28) {
                    d.a(jobParameters);
                }
                l lVar = this.f4808o;
                ((i) lVar.f3021m).h(new n((f) lVar.f3020l, this.f4807n.v(jVarA), rVar));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.f4805l == null) {
            q.d().a(f4804p, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            q.d().b(f4804p, "WorkSpec id not found!");
            return false;
        }
        q.d().a(f4804p, "onStopJob for " + jVarA);
        synchronized (this.f4806m) {
            this.f4806m.remove(jVarA);
        }
        k kVarT = this.f4807n.t(jVarA);
        if (kVarT != null) {
            int iA = Build.VERSION.SDK_INT >= 31 ? U1.e.a(jobParameters) : -512;
            l lVar = this.f4808o;
            lVar.getClass();
            lVar.e0(kVarT, iA);
        }
        f fVar = this.f4805l.f1915h;
        String str = jVarA.f3016a;
        synchronized (fVar.f1886k) {
            zContains = fVar.i.contains(str);
        }
        return !zContains;
    }
}
