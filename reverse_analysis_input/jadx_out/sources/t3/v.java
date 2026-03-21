package t3;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public J f10117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Set f10118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map f10119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Iterator f10120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public P.d f10121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f10123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10124v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(J j5, G3.b bVar) {
        super(bVar);
        this.f10123u = j5;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f10122t = obj;
        this.f10124v |= Integer.MIN_VALUE;
        return J.j(this.f10123u, null, this);
    }
}
