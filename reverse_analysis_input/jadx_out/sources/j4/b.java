package j4;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f7459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map f7460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f7461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ HashMap f7462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f7467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ P2.c f7468u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f7469v;

    public b(d dVar, String str, Map map, String str2, HashMap map2, int i, int i5, int i6, int i7, int i8, P2.c cVar) {
        this.f7469v = dVar;
        this.f7459l = str;
        this.f7460m = map;
        this.f7461n = str2;
        this.f7462o = map2;
        this.f7463p = i;
        this.f7464q = i5;
        this.f7465r = i6;
        this.f7466s = i7;
        this.f7467t = i8;
        this.f7468u = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // java.lang.Runnable
    public final void run() {
        Object objB;
        d dVar = this.f7469v;
        String str = this.f7459l;
        ?? r32 = 0;
        boolean z4 = false;
        try {
        } catch (Exception e5) {
            e = e5;
        }
        if (str.equals("file")) {
            objB = d.a(this.f7469v, this.f7461n, this.f7462o, (String) this.f7460m.get("path"), this.f7463p, this.f7464q, this.f7465r, this.f7466s, this.f7467t);
        } else {
            if (!str.equals("data")) {
                objB = null;
                r32 = objB;
                e = null;
                dVar.getClass();
                new Handler(Looper.getMainLooper()).post(new c(z4, this.f7468u, e, r32));
            }
            String str2 = this.f7461n;
            HashMap map = this.f7462o;
            int i = this.f7463p;
            int i5 = this.f7464q;
            int i6 = this.f7465r;
            int i7 = this.f7466s;
            int i8 = this.f7467t;
            dVar.getClass();
            objB = d.b(str2, map, i, i5, i6, i7, i8);
        }
        z4 = true;
        r32 = objB;
        e = null;
        dVar.getClass();
        new Handler(Looper.getMainLooper()).post(new c(z4, this.f7468u, e, r32));
    }
}
