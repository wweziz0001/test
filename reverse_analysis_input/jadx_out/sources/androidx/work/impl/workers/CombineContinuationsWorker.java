package androidx.work.impl.workers;

import N3.h;
import Q1.n;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.e(context, "context");
        h.e(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public final n f() {
        return new n(this.f1833m.f4779b);
    }
}
