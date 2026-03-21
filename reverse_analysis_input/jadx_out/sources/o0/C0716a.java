package o0;

import android.net.Uri;
import android.os.SystemClock;
import d0.AbstractC0370w;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: o0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0716a implements q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f8965l;

    public C0716a(c cVar) {
        this.f8965l = cVar;
    }

    @Override // o0.q
    public final void a() {
        this.f8965l.f8983p.remove(this);
    }

    @Override // o0.q
    public final boolean d(Uri uri, A.j jVar, boolean z4) {
        HashMap map;
        b bVar;
        c cVar = this.f8965l;
        if (cVar.f8990w == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f8988u;
            int i = AbstractC0370w.f5326a;
            List list = lVar.f9044e;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int size = list.size();
                map = cVar.f8982o;
                if (i5 >= size) {
                    break;
                }
                b bVar2 = (b) map.get(((k) list.get(i5)).f9036a);
                if (bVar2 != null && jElapsedRealtime < bVar2.f8973s) {
                    i6++;
                }
                i5++;
            }
            B0.j jVar2 = new B0.j(1, 0, cVar.f8988u.f9044e.size(), i6);
            cVar.f8981n.getClass();
            B0.k kVarM = A0.b.m(jVar2, jVar);
            if (kVarM != null && kVarM.f226a == 2 && (bVar = (b) map.get(uri)) != null) {
                b.a(bVar, kVarM.f227b);
            }
        }
        return false;
    }
}
