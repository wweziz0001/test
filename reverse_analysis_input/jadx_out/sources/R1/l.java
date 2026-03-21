package R1;

import Q1.E;
import Q1.x;
import a.AbstractC0149a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0149a {
    public static final String i = Q1.q.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f1895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1900f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Z1.c f1902h;

    public l(q qVar, String str, int i5, List list) {
        this.f1895a = qVar;
        this.f1896b = str;
        this.f1897c = i5;
        this.f1898d = list;
        this.f1899e = new ArrayList(list.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (i5 == 1 && ((E) list.get(i6)).f1792b.f3065u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((E) list.get(i6)).f1791a.toString();
            N3.h.d(string, "id.toString()");
            this.f1899e.add(string);
            this.f1900f.add(string);
        }
    }

    public static HashSet R(l lVar) {
        HashSet hashSet = new HashSet();
        lVar.getClass();
        return hashSet;
    }

    public final x Q() {
        if (this.f1901g) {
            Q1.q.d().g(i, "Already enqueued work ids (" + TextUtils.join(", ", this.f1899e) + ")");
        } else {
            Z1.c cVar = new Z1.c(5);
            this.f1895a.f1913f.h(new a2.f(this, cVar));
            this.f1902h = cVar;
        }
        return this.f1902h;
    }
}
