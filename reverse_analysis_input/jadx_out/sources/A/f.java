package A;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f15c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f16d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17e;

    public /* synthetic */ f(String str, Context context, e eVar, int i, int i5) {
        this.f13a = i5;
        this.f14b = str;
        this.f15c = context;
        this.f16d = eVar;
        this.f17e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13a) {
            case 0:
                return i.a(this.f14b, this.f15c, this.f16d, this.f17e);
            default:
                try {
                    return i.a(this.f14b, this.f15c, this.f16d, this.f17e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
