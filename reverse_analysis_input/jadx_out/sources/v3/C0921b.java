package v3;

import F0.u;
import a0.C0150A;
import a0.C0153D;
import a0.C0194t;
import a0.C0195u;
import a0.C0196v;
import a0.C0197w;
import a0.C0198x;
import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m2.b0;
import x0.C0979u;
import x0.C0980v;
import x0.G;

/* JADX INFO: renamed from: v3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0921b extends L0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10365d;

    public C0921b(String str, int i, HashMap map, String str2) {
        super(str);
        this.f10363b = i;
        this.f10364c = map;
        this.f10365d = str2;
    }

    @Override // L0.e
    public final C0150A f() {
        u uVar = new u();
        new A0.b();
        List listEmptyList = Collections.emptyList();
        b0 b0Var = b0.f8583p;
        C0195u c0195u = new C0195u();
        C0198x c0198x = C0198x.f3466a;
        String str = (String) this.f1479a;
        Uri uri = str == null ? null : Uri.parse(str);
        int iB = O.i.b(this.f10363b);
        String str2 = iB != 1 ? iB != 2 ? iB != 3 ? null : "application/x-mpegURL" : "application/dash+xml" : "application/vnd.ms-sstr+xml";
        if (str2 == null) {
            str2 = null;
        }
        return new C0150A("", new C0194t(uVar), uri != null ? new C0197w(uri, str2, null, listEmptyList, b0Var, null, -9223372036854775807L) : null, new C0196v(c0195u), C0153D.f3185B, c0198x);
    }

    @Override // L0.e
    public final G g(Context context) {
        a1.e eVar = new a1.e(1);
        eVar.f3492p = this.f10365d;
        eVar.f3490n = true;
        HashMap map = this.f10364c;
        if (!map.isEmpty()) {
            eVar.d(map);
        }
        Z1.e eVar2 = new Z1.e(context, eVar);
        C0980v c0980v = new C0980v(context);
        c0980v.f10804b = eVar2;
        C0979u c0979u = c0980v.f10803a;
        if (eVar2 != c0979u.f10800d) {
            c0979u.f10800d = eVar2;
            c0979u.f10798b.clear();
            c0979u.f10799c.clear();
        }
        return c0980v;
    }
}
