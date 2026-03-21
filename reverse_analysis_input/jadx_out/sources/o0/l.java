package o0;

import a0.C0165P;
import a0.C0190p;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l f9042l = new l("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f9044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f9045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f9046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0190p f9047h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f9048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f9049k;

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, C0190p c0190p, List list7, boolean z4, Map map, List list8) {
        super(str, list, z4);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((k) list2.get(i)).f9036a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f9043d = Collections.unmodifiableList(arrayList);
        this.f9044e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f9045f = Collections.unmodifiableList(list4);
        this.f9046g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f9047h = c0190p;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f9048j = Collections.unmodifiableMap(map);
        this.f9049k = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((j) list.get(i)).f9033a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object obj = list.get(i5);
            int i6 = 0;
            while (true) {
                if (i6 < list2.size()) {
                    C0165P c0165p = (C0165P) list2.get(i6);
                    if (c0165p.f3234m == i && c0165p.f3235n == i5) {
                        arrayList.add(obj);
                        break;
                    }
                    i6++;
                }
            }
        }
        return arrayList;
    }

    @Override // s0.InterfaceC0784a
    public final Object a(List list) {
        return new l(this.f9050a, this.f9051b, c(this.f9044e, 0, list), Collections.emptyList(), c(this.f9045f, 1, list), c(this.f9046g, 2, list), Collections.emptyList(), this.f9047h, this.i, this.f9052c, this.f9048j, this.f9049k);
    }
}
