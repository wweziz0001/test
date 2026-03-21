package l0;

import a0.C0165P;
import a0.C0195u;
import android.net.Uri;
import d0.AbstractC0370w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import s0.InterfaceC0784a;

/* JADX INFO: renamed from: l0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0564c implements InterfaceC0784a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7829h;
    public final Z1.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0195u f7830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f7831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f7832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f7833m;

    public C0564c(long j5, long j6, long j7, boolean z4, long j8, long j9, long j10, long j11, i iVar, Z1.e eVar, C0195u c0195u, Uri uri, ArrayList arrayList) {
        this.f7822a = j5;
        this.f7823b = j6;
        this.f7824c = j7;
        this.f7825d = z4;
        this.f7826e = j8;
        this.f7827f = j9;
        this.f7828g = j10;
        this.f7829h = j11;
        this.f7832l = iVar;
        this.i = eVar;
        this.f7831k = uri;
        this.f7830j = c0195u;
        this.f7833m = arrayList;
    }

    @Override // s0.InterfaceC0784a
    public final Object a(List list) {
        ArrayList arrayList;
        long j5;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C0165P());
        ArrayList arrayList3 = new ArrayList();
        long j6 = 0;
        int i = 0;
        while (i < this.f7833m.size()) {
            if (((C0165P) linkedList.peek()).f3233l != i) {
                long jC = c(i);
                if (jC != -9223372036854775807L) {
                    j6 += jC;
                }
                arrayList2 = arrayList3;
            } else {
                h hVarB = b(i);
                List list2 = hVarB.f7855c;
                C0165P c0165p = (C0165P) linkedList.poll();
                int i5 = c0165p.f3233l;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i6 = c0165p.f3234m;
                    C0562a c0562a = (C0562a) list2.get(i6);
                    List list3 = c0562a.f7814c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((m) list3.get(c0165p.f3235n));
                        c0165p = (C0165P) linkedList.poll();
                        if (c0165p.f3233l != i5) {
                            break;
                        }
                    } while (c0165p.f3234m == i6);
                    arrayList = arrayList3;
                    j5 = j6;
                    arrayList4.add(new C0562a(c0562a.f7812a, c0562a.f7813b, arrayList5, c0562a.f7815d, c0562a.f7816e, c0562a.f7817f));
                    if (c0165p.f3233l != i5) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j6 = j5;
                }
                linkedList.addFirst(c0165p);
                arrayList2 = arrayList;
                arrayList2.add(new h(hVarB.f7853a, hVarB.f7854b - j5, arrayList4, hVarB.f7856d));
                j6 = j5;
            }
            i++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList6 = arrayList3;
        long j7 = j6;
        long j8 = this.f7823b;
        return new C0564c(this.f7822a, j8 != -9223372036854775807L ? j8 - j7 : -9223372036854775807L, this.f7824c, this.f7825d, this.f7826e, this.f7827f, this.f7828g, this.f7829h, this.f7832l, this.i, this.f7830j, this.f7831k, arrayList6);
    }

    public final h b(int i) {
        return (h) this.f7833m.get(i);
    }

    public final long c(int i) {
        long j5;
        long j6;
        List list = this.f7833m;
        if (i == list.size() - 1) {
            j5 = this.f7823b;
            if (j5 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j6 = ((h) list.get(i)).f7854b;
        } else {
            j5 = ((h) list.get(i + 1)).f7854b;
            j6 = ((h) list.get(i)).f7854b;
        }
        return j5 - j6;
    }

    public final long d(int i) {
        return AbstractC0370w.M(c(i));
    }
}
