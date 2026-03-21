package m2;

import java.util.Map;

/* JADX INFO: renamed from: m2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661u extends AbstractC0654m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0662v f8656n;

    public C0661u(C0662v c0662v, int i) {
        this.f8656n = c0662v;
        Object obj = C0662v.f8657u;
        this.f8654l = c0662v.j()[i];
        this.f8655m = i;
    }

    public final void a() {
        int i = this.f8655m;
        Object obj = this.f8654l;
        C0662v c0662v = this.f8656n;
        if (i != -1 && i < c0662v.size()) {
            if (i4.a.v(obj, c0662v.j()[this.f8655m])) {
                return;
            }
        }
        Object obj2 = C0662v.f8657u;
        this.f8655m = c0662v.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8654l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0662v c0662v = this.f8656n;
        Map mapC = c0662v.c();
        if (mapC != null) {
            return mapC.get(this.f8654l);
        }
        a();
        int i = this.f8655m;
        if (i == -1) {
            return null;
        }
        return c0662v.k()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0662v c0662v = this.f8656n;
        Map mapC = c0662v.c();
        Object obj2 = this.f8654l;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.f8655m;
        if (i == -1) {
            c0662v.put(obj2, obj);
            return null;
        }
        Object obj3 = c0662v.k()[i];
        c0662v.k()[this.f8655m] = obj;
        return obj3;
    }
}
