package F0;

import d0.C0363p;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import x1.InterfaceC0988d;
import x1.InterfaceC0989e;

/* JADX INFO: loaded from: classes.dex */
public final class p implements InterfaceC0989e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f815m;

    public /* synthetic */ p(int i, String str, boolean z4) {
        this.f814l = i;
        this.f815m = str;
    }

    public static p e(C0363p c0363p) {
        String str;
        c0363p.I(2);
        int iV = c0363p.v();
        int i = iV >> 1;
        int iV2 = ((c0363p.v() >> 3) & 31) | ((iV & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iV2 >= 10 ? "." : ".0");
        sb.append(iV2);
        return new p(0, sb.toString(), false);
    }

    @Override // x1.InterfaceC0989e
    public String a() {
        return this.f815m;
    }

    public void c(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f815m);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public String d(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        c(sb, it);
        return sb.toString();
    }

    public String toString() {
        switch (this.f814l) {
            case 1:
                return "<" + this.f815m + '>';
            default:
                return super.toString();
        }
    }

    public p(String str, int i) {
        this.f814l = i;
        switch (i) {
            case 3:
                N3.h.e(str, "query");
                this.f815m = str;
                break;
            default:
                str.getClass();
                this.f815m = str;
                break;
        }
    }

    @Override // x1.InterfaceC0989e
    public void b(InterfaceC0988d interfaceC0988d) {
    }
}
