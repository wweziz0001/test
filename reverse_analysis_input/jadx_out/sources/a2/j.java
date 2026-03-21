package a2;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f3551a;

    public j(WorkDatabase workDatabase, int i) {
        switch (i) {
            case 1:
                this.f3551a = workDatabase;
                break;
            default:
                N3.h.e(workDatabase, "workDatabase");
                this.f3551a = workDatabase;
                break;
        }
    }
}
