package r1;

import b3.AbstractC0307a;
import java.util.ArrayList;

/* JADX INFO: renamed from: r1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0761b extends AbstractC0776q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f9449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f9450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f9451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f9452h;
    public ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f9453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f9454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f9455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f9456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f9457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f9458o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // r1.AbstractC0776q
    public final void a() {
        ArrayList arrayList = this.f9451g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            AbstractC0307a.q(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f9449e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f9505a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f9450f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList4 = this.f9452h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            AbstractC0307a.q(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.f9453j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    AbstractC0307a.q(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList9 = this.f9454k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    AbstractC0307a.q(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f9457n);
            c(this.f9456m);
            c(this.f9455l);
            c(this.f9458o);
            ArrayList arrayList11 = this.f9506b;
            if (arrayList11.size() > 0) {
                AbstractC0307a.q(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // r1.AbstractC0776q
    public final boolean b() {
        return (this.f9450f.isEmpty() && this.f9452h.isEmpty() && this.f9451g.isEmpty() && this.f9449e.isEmpty() && this.f9456m.isEmpty() && this.f9457n.isEmpty() && this.f9455l.isEmpty() && this.f9458o.isEmpty() && this.f9453j.isEmpty() && this.i.isEmpty() && this.f9454k.isEmpty()) ? false : true;
    }
}
