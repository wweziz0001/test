package Q;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class m extends i4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4.a f1728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1729c;

    public m(i4.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1728b = aVar;
        this.f1729c = threadPoolExecutor;
    }

    @Override // i4.a
    public final void I(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1729c;
        try {
            this.f1728b.I(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // i4.a
    public final void J(Z1.i iVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1729c;
        try {
            this.f1728b.J(iVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
