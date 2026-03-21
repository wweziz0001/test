package b2;

/* JADX INFO: renamed from: b2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0306b extends Throwable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4882l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0306b(String str, int i) {
        super(str);
        this.f4882l = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.f4882l;
        synchronized (this) {
            switch (i) {
            }
            return this;
        }
    }
}
