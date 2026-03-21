package A;

import A0.q;
import A0.t;
import A0.u;
import B0.v;
import a0.C0190p;
import d1.C0374d;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k1.C0533c;
import k1.C0534d;
import l0.C0563b;
import m2.AbstractC0666z;
import m2.C0664x;
import m2.a0;
import m3.C0669c;
import t0.C0852i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5l;

    public /* synthetic */ c(int i) {
        this.f5l = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5l) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b4 = bArr[i];
                    byte b5 = bArr2[i];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return 0;
            case 1:
                return ((C0190p) obj2).f3420j - ((C0190p) obj).f3420j;
            case 2:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 3:
                return Integer.compare(((A0.j) ((List) obj).get(0)).f99q, ((A0.j) ((List) obj2).get(0)).f99q);
            case 4:
                return ((A0.i) Collections.max((List) obj)).compareTo((A0.i) Collections.max((List) obj2));
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0664x.f(t.c((t) Collections.max(list, new c(7)), (t) Collections.max(list2, new c(7)))).a(list.size(), list2.size()).b((t) Collections.max(list, new c(8)), (t) Collections.max(list2, new c(8)), new c(8)).e();
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((q) ((List) obj).get(0)).compareTo((q) ((List) obj2).get(0));
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return t.c((t) obj, (t) obj2);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                t tVar = (t) obj;
                t tVar2 = (t) obj2;
                a0 a0VarA = (tVar.f141p && tVar.f144s) ? u.f151j : u.f151j.a();
                C0664x c0664x = AbstractC0666z.f8669a;
                tVar.f142q.getClass();
                return c0664x.b(Integer.valueOf(tVar.f147v), Integer.valueOf(tVar2.f147v), a0VarA).b(Integer.valueOf(tVar.f146u), Integer.valueOf(tVar2.f146u), a0VarA).e();
            case 9:
                return ((v) obj).f251a - ((v) obj2).f251a;
            case 10:
                return Float.compare(((v) obj).f253c, ((v) obj2).f253c);
            case 11:
                return Integer.compare(((C0374d) obj2).f5378b, ((C0374d) obj).f5378b);
            case 12:
                C0563b c0563b = (C0563b) obj;
                C0563b c0563b2 = (C0563b) obj2;
                int iCompare = Integer.compare(c0563b.f7820c, c0563b2.f7820c);
                return iCompare != 0 ? iCompare : c0563b.f7819b.compareTo(c0563b2.f7819b);
            case 13:
                return Integer.compare(((C0534d) obj).f7664a.f7667b, ((C0534d) obj2).f7664a.f7667b);
            case 14:
                return Long.compare(((C0533c) obj).f7661b, ((C0533c) obj2).f7661b);
            default:
                return C0669c.b(((C0852i) obj).f9900a.f9896c, ((C0852i) obj2).f9900a.f9896c);
        }
    }
}
