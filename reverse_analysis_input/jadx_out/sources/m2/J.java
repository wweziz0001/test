package m2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class J extends AbstractC0657p implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient g0 f8550o;

    public J(g0 g0Var, int i) {
        this.f8550o = g0Var;
    }

    @Override // m2.AbstractC0656o
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // m2.AbstractC0656o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g0 a() {
        return this.f8550o;
    }

    public final I d(String str) {
        I i = (I) this.f8550o.get(str);
        if (i != null) {
            return i;
        }
        C0640G c0640g = I.f8549m;
        return b0.f8583p;
    }

    public final M e() {
        return this.f8550o.keySet();
    }
}
