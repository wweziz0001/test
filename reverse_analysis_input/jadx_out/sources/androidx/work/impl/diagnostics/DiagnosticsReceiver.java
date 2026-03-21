package androidx.work.impl.diagnostics;

import Q1.q;
import Q1.s;
import Q1.t;
import R1.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4809a = q.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        q qVarD = q.d();
        String str = f4809a;
        qVarD.a(str, "Requesting diagnostics");
        try {
            R1.q qVarE0 = R1.q.E0(context);
            List listSingletonList = Collections.singletonList((t) new s(DiagnosticsWorker.class).c());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new l(qVarE0, null, 2, listSingletonList).Q();
        } catch (IllegalStateException e5) {
            q.d().c(str, "WorkManager is not initialized", e5);
        }
    }
}
