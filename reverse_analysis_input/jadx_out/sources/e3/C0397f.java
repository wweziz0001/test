package e3;

import Z1.m;
import android.content.Context;
import f3.C0433a;
import io.flutter.plugin.platform.p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: e3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0397f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5635a = new ArrayList();

    public C0397f(Context context, String[] strArr) {
        h3.f fVar = (h3.f) m.z().f3024m;
        if (fVar.f6321a) {
            return;
        }
        fVar.c(context.getApplicationContext());
        fVar.a(context.getApplicationContext(), strArr);
    }

    public final C0394c a(C0396e c0396e) {
        C0394c c0394c;
        Context context = (Context) c0396e.f5631n;
        C0433a c0433aA = (C0433a) c0396e.f5632o;
        String str = (String) c0396e.f5633p;
        List<String> list = (List) c0396e.f5634q;
        p pVar = new p();
        boolean z4 = c0396e.f5629l;
        boolean z5 = c0396e.f5630m;
        if (c0433aA == null) {
            c0433aA = C0433a.a();
        }
        ArrayList arrayList = this.f5635a;
        if (arrayList.size() == 0) {
            c0394c = new C0394c(context, null, pVar, z4, z5);
            if (str != null) {
                c0394c.i.f8672a.a("setInitialRoute", str, null);
            }
            c0394c.f5607c.b(c0433aA, list);
        } else {
            C0394c c0394c2 = (C0394c) arrayList.get(0);
            if (!c0394c2.f5605a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j5 = C0394c.f5604x;
            c0394c = new C0394c(context, c0394c2.f5605a.spawn(c0433aA.f5746c, c0433aA.f5745b, str, list, j5), pVar, z4, z5);
        }
        arrayList.add(c0394c);
        c0394c.f5624u.add(new C0395d(this, c0394c));
        return c0394c;
    }
}
