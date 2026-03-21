package w0;

import a0.C0165P;
import a0.C0190p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s0.InterfaceC0784a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0784a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0940a f10446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f10447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10449h;

    public c(int i, int i5, long j5, long j6, int i6, boolean z4, C0940a c0940a, b[] bVarArr) {
        this.f10442a = i;
        this.f10443b = i5;
        this.f10448g = j5;
        this.f10449h = j6;
        this.f10444c = i6;
        this.f10445d = z4;
        this.f10446e = c0940a;
        this.f10447f = bVarArr;
    }

    @Override // s0.InterfaceC0784a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            C0165P c0165p = (C0165P) arrayList.get(i);
            b bVar2 = this.f10447f[c0165p.f3234m];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((C0190p[]) arrayList3.toArray(new C0190p[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f10435j[c0165p.f3235n]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((C0190p[]) arrayList3.toArray(new C0190p[0])));
        }
        return new c(this.f10442a, this.f10443b, this.f10448g, this.f10449h, this.f10444c, this.f10445d, this.f10446e, (b[]) arrayList2.toArray(new b[0]));
    }
}
