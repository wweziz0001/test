package a2;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.i f3577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R1.f f3578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z1.q f3579c;

    static {
        Q1.q.f("WMFgUpdater");
    }

    public w(WorkDatabase workDatabase, R1.f fVar, Z1.i iVar) {
        this.f3578b = fVar;
        this.f3577a = iVar;
        this.f3579c = workDatabase.t();
    }
}
